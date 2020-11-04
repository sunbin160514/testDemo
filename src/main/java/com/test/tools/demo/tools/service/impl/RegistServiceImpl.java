package com.test.tools.demo.tools.service.impl;

import com.test.tools.demo.tools.remote.RegistTradeApi;
import com.test.tools.demo.tools.request.RegistByClassIdReq;
import com.test.tools.demo.tools.response.RegistByClassIdListRes;
import com.test.tools.demo.tools.response.RegistByClassIdRes;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;


@Service
public class RegistServiceImpl implements RegistService {
    /**
     * 根据班级记录查询报名id
     *
     * @param classId
     * @param area
     * @return
     */
    @Autowired
    private RegistTradeApi registTradeApi;

    /**
     * 返回原接口所有参数
     * @param classId
     * @param area
     * @return
     */

//    public ServerResult<RegistByClassIdRes> registByClassIdWith(String classId, String area) {
//        RegistByClassIdReq req = new RegistByClassIdReq();
//        List<RegistByClassIdListRes> registByClassIdList = new ArrayList<>();
//        req.setClassId(classId);
//        String clolumns = "id,classId,studentId,isPay";
//        req.setColumns(clolumns);
//        ServerResult<RegistByClassIdRes> registByClassId = registTradeApi.getRegistByClassId(req, area, "DEV");
//        return registByClassId;
//    }

    /**
     * 仅返回registId和studentId
     * @param classId
     * @param area
     * @return
     */
    public List<RegistByClassIdListRes> registByClassId(String classId, String area) {
        List<RegistByClassIdListRes> object = new ArrayList<>();
        RegistByClassIdReq req = new RegistByClassIdReq();
        req.setClassId(classId);
        String clolumns = "id,classId,studentId,isPay";
        req.setColumns(clolumns);
        ServerResult<RegistByClassIdRes> result = registTradeApi.getRegistByClassId(req, area, "DEV");
        if (result.isRlt() && "000000".equals(result.getCode())) {
            if (!CollectionUtils.isEmpty(result.getData().getRows())) {
                for (RegistByClassIdRes.RowsBean row : result.getData().getRows()) {
                    RegistByClassIdListRes res = new RegistByClassIdListRes();
                    res.setId(row.getId());
                    res.setStudentId(row.getStudentId());
                    object.add(res);
                }
            }
        }
        return object;
    }

}
