package com.test.tools.demo.tools.domain;

import com.alibaba.fastjson.JSONObject;

public class QuerySelectedClassListDto {
    private String registId;
    private String registStagesId;
    private String classId;
    private String stagesNum;
    private String stagesCount;
    private String stagesName;
    private String price;

    public String getRegistId() {
        return registId;
    }

    public void setRegistId(String registId) {
        this.registId = registId;
    }

    public String getRegistStagesId() {
        return registStagesId;
    }

    public void setRegistStagesId(String registStagesId) {
        this.registStagesId = registStagesId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStagesNum() {
        return stagesNum;
    }

    public void setStagesNum(String stagesNum) {
        this.stagesNum = stagesNum;
    }

    public String getStagesCount() {
        return stagesCount;
    }

    public void setStagesCount(String stagesCount) {
        this.stagesCount = stagesCount;
    }

    public String getStagesName() {
        return stagesName;
    }

    public void setStagesName(String stagesName) {
        this.stagesName = stagesName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public JSONObject toJSONObject(){
        JSONObject object = new JSONObject();
        object.put("registId",registId);
        return object;
    }

}
