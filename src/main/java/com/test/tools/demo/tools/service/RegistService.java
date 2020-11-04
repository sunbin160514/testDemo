package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.response.RegistByClassIdListRes;

import java.util.List;

public interface RegistService {
  List<RegistByClassIdListRes> registByClassId(String classId, String area);
}
