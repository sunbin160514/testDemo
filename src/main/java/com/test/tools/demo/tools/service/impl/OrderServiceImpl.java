package com.test.tools.demo.tools.service.impl;

import com.test.tools.demo.tools.domain.RegistStages;
import com.test.tools.demo.tools.remote.OrderTradeApi;
import com.test.tools.demo.tools.request.CreateOrderReqs;
import com.test.tools.demo.tools.request.OrderReq;
import com.test.tools.demo.tools.response.CreateOrderResp;
import com.test.tools.demo.tools.response.DoSaveOrderResp;
import com.test.tools.demo.tools.response.OrderRes;
import com.test.tools.demo.tools.response.ServerResult;
import com.test.tools.demo.tools.service.OrderService;
import com.test.tools.demo.tools.service.RegistStagesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    /**
     * 只想传ClassPromotionsBean下的registId，其余参数通过registId查库返回
     *
     * @param
     * @return
     */
    @Autowired
    private OrderTradeApi orderTradeApi;

    @Autowired
    private RegistStagesService registStagesService;
    @Override
    public DoSaveOrderResp createOrder(String area, List<CreateOrderReqs> reqs) {
        DoSaveOrderResp doSaveOrderResp =new DoSaveOrderResp();
        if (!CollectionUtils.isEmpty(reqs)){
            CreateOrderResp params = toCreateOrder(area, reqs);
            ServerResult<OrderRes> result =orderTradeApi.doSaveOrder(area,"3","4.0",buildCreateOrderReq(reqs,params));
            if (result.isRlt()&&"000000".equals(result.getCode())){
                doSaveOrderResp.setOrderNo(result.getData().getOrderNo());
                doSaveOrderResp.setStudentId(result.getData().getStudentId());
                doSaveOrderResp.setLastPrice(result.getData().getPriceInfo().getLastPrice());
                doSaveOrderResp.setStudentUid(buildCreateOrderReq(reqs,params).getStudentUid());
            }
        }
        return doSaveOrderResp;
    }
    @Override
    public CreateOrderResp toCreateOrder(String area, List<CreateOrderReqs> reqs) {
        CreateOrderResp createOrderResps = new CreateOrderResp();
        if (!CollectionUtils.isEmpty(reqs)) {
            ServerResult<OrderRes> result = orderTradeApi.createOrder(area, "3", "4.0", buildCreateOrderReq(reqs));
            if (result.isRlt() && "000000".equals(result.getCode())) {
                createOrderResps.setOrderNo(result.getData().getOrderNo());
                createOrderResps.setOrderToken(result.getData().getOrderToken());
            }
        }
        return createOrderResps;
    }

    /**
     * 构建createorder入参
     *
     * @param reqs
     * @return
     */
    private OrderReq buildCreateOrderReq(List<CreateOrderReqs> reqs) {
        return buildCreateOrderReq(reqs, null);
    }

    private OrderReq buildCreateOrderReq(List<CreateOrderReqs> reqs, CreateOrderResp resp) {
        OrderReq req = new OrderReq();
        if (!CollectionUtils.isEmpty(reqs)) {
            List<String> registerIds = reqs.stream().map(CreateOrderReqs::getRegistId).collect(Collectors.toList());//将reqs中registId单独提取
            List<RegistStages> scockIdByRegistIds = registStagesService.getScockIdByRegistIds(registerIds);
            //将scockIdByRegistIds集合按照registId分组
            Map<String, List<RegistStages>> groupById = scockIdByRegistIds.stream().collect(Collectors.groupingBy(RegistStages::getRegistId));
            req.setBusinessNo("01");
            if (null == resp) {
                req.setOrderNo("");
            }else {
                req.setOrderNo(resp.getOrderNo());
                req.setOrderToken(resp.getOrderToken());
            }
            req.setClientType("1");
            req.setFusionOrderAddressDto(bulidAddress());//收货地址
            for (CreateOrderReqs params : reqs) {
                if (groupById.containsKey(params.getRegistId())) {
                    List<RegistStages> bodyReq = groupById.get(params.getRegistId());
                    req.setStudentId(bodyReq.get(0).getStudentId());//根据报名id查询
                    req.setStudentUid(bodyReq.get(0).getStudentUid());//根据报名id查询
                    List<OrderReq.ClassPromotionsBean> classPromotions;
                    if (StringUtils.isEmpty(params.getCouponNum())) {
                        classPromotions = buildClassPromotionsReq(bodyReq);
                    } else {
                        classPromotions = buildClassPromotionsReq(bodyReq, params.getCouponNum());
                    }
                    if (!CollectionUtils.isEmpty(req.getClassPromotions())) {
                        classPromotions.addAll(req.getClassPromotions());
                    }
                    req.setClassPromotions(classPromotions);
                } else {
                    log.info("报名id：{}无效，请重新输入！", params.getRegistId());
                }
            }
        }
        System.out.println(req);
        return req;
    }

    /**
     * 封装classPromotion
     *
     * @param bodyReqs
     * @param
     * @return
     */

    private List<OrderReq.ClassPromotionsBean> buildClassPromotionsReq(List<RegistStages> bodyReqs) {
        return buildClassPromotionsReq(bodyReqs, "");
    }

    private List<OrderReq.ClassPromotionsBean> buildClassPromotionsReq(List<RegistStages> bodyReqs, String couponNum) {
        List<OrderReq.ClassPromotionsBean> classPromotions = new ArrayList<>();
        if (!CollectionUtils.isEmpty(bodyReqs)) {
            for (RegistStages param : bodyReqs) {
                OrderReq.ClassPromotionsBean req = new OrderReq.ClassPromotionsBean();
                req.setRegisterId(param.getRegistId());
                req.setClassId(param.getClassId());
                req.setStockId(param.getId());
                req.setDoBundCoupons("");
                req.setStockType("2");
                req.setGoodsType("");
                req.setPlusCourseTimes("");
                OrderReq.ClassPromotionsBean.CouponsBean coupon = new OrderReq.ClassPromotionsBean.CouponsBean();
                List<OrderReq.ClassPromotionsBean.CouponsBean> couponsBeans = new ArrayList<>();
                coupon.setCouponNum(couponNum);//
                couponsBeans.add(coupon);
                req.setCoupons(couponsBeans);
                classPromotions.add(req);
            }
        }
        return classPromotions;
    }

    /**
     * 封装fusionOrderAddressDto收货地址
     */
    private OrderReq.FusionOrderAddressDtoBean bulidAddress() {
        OrderReq.FusionOrderAddressDtoBean address = new OrderReq.FusionOrderAddressDtoBean();
        address.setProvinceId("110000");
        address.setProvinceName("北京市");
        address.setCityId("110100");
        address.setCityName("北京市");
        address.setCountyId("110101");
        address.setCountyName("东城区");
        address.setDetailAddress("丹棱大厦8866层");
        address.setPostcode("100000");
        address.setMobilephoneNumber("18300000000");
        address.setPhoneNumber("");
        address.setRecipientName("testing学员");
        address.setStudentAddressId("");
        address.setOrderAddrAvailable("true");
        return address;
    }


}
