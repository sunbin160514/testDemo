package com.test.tools.demo.tools.service;



import com.test.tools.demo.tools.request.CreateOrderReqs;
import com.test.tools.demo.tools.response.CreateOrderResp;
import com.test.tools.demo.tools.response.DoSaveOrderResp;

import java.util.List;

public interface OrderService {
   CreateOrderResp toCreateOrder(String area,List<CreateOrderReqs> registerId);

   DoSaveOrderResp createOrder(String area,List<CreateOrderReqs> registerId);





}
