package com.test.tools.demo.tools.service;

import com.test.tools.demo.tools.domain.RegistStages;

import java.util.List;

public interface RegistStagesService {

    List<RegistStages> getScockIdByRegistIds(List<String> registIds);

}
