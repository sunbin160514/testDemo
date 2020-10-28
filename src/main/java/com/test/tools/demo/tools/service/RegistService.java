package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.domain.QuerySelectedClassListDto;
import com.test.tools.demo.tools.response.ClassRegistCountRes;
import com.test.tools.demo.tools.response.SelectClassListRes;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.remote.RegistTradeApi;
import com.test.tools.demo.tools.remote.RegisterApi;
import com.test.tools.demo.tools.request.RegistByClassIdReq;
import com.test.tools.demo.tools.response.RegistByIdRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ConcurrencyThrottleSupport;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistService {
    @Autowired
    private RegistTradeApi registTradeApi;

    public ServerResult<List<ClassRegistCountRes>> classRegistCount(String area, String classIds) {
        ServerResult<List<ClassRegistCountRes>> result = registTradeApi.getClassRegistCount(area, classIds);

        return result;
    }


    @Autowired
    private RegisterApi registerApi;

//    public List<QuerySelectedClassListDto>selectedClassList(String area,String cflat,String studentId){
//        ServerResult<List<SelectClassListRes>> result = registerApi.querySelectedClassList(area,cflat,studentId);
//        List<QuerySelectedClassListDto> object = new ArrayList<>();
//        if(result.isRlt()&&"000000".equals(result.getCode())){
//            if (!CollectionUtils.isEmpty(result.getData())){
//                for (SelectClassListRes datum : result.getData()) {
//                    for (SelectClassListRes.ItemsBean item : datum.getItems()) {
//
//                    }
//                }
//            }
//        }
//        return
//    }

//    public List<QuerySelectedClassListDto> selectedClassList(String area, String cflat, String studentId) {
//        ServerResult<List<SelectClassListRes>> result = registerApi.querySelectedClassList(area, cflat, studentId);
//        List<QuerySelectedClassListDto> objects = new ArrayList<>();
//        if (result.isRlt() && "000000".equals(result.getCode())) {
//            if (!CollectionUtils.isEmpty(result.getData())) {
//                for (SelectClassListRes datum : result.getData()) {
//
//                    for (SelectClassListRes.ItemsBean item : datum.getItems()) {
//                        QuerySelectedClassListDto querySelectedClassListDto = new QuerySelectedClassListDto();
//                        querySelectedClassListDto.setClassId(item.getClassId());
//                        objects.add(querySelectedClassListDto);
//                    }
//
//                }
//                result.getData().forEach(o -> {
//
//                });
//            }
//        } else {
//
//        }
//        return objects;
//    }



    public ServerResult<RegistByIdRes> registByClassId(String classId, String area) {
        RegistByClassIdReq req = new RegistByClassIdReq();
        req.setClassId(classId);
        String clolumns = "id,classId,studentId,isPay";
        req.setColumns(clolumns);
        ServerResult<RegistByIdRes> registByClassId = registTradeApi.getRegistByClassId(req, area, "DEV");
        return registByClassId;
    }


}
