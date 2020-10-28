package com.test.tools.demo.tools.request;

import javax.annotation.sql.DataSourceDefinition;
import java.util.List;

public class RegistByClassIdReq {

    /**
     * classId : aadfff
     * searchFields : [{"name":"isPay","val":[0,1]}]
     * columns : id,classId,orgCode
     */

    private String classId;
    private String columns;
    private List<SearchFieldsBean> searchFields;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public List<SearchFieldsBean> getSearchFields() {
        return searchFields;
    }

    public void setSearchFields(List<SearchFieldsBean> searchFields) {
        this.searchFields = searchFields;
    }

    public static class SearchFieldsBean {
        /**
         * name : isPay
         * val : [0,1]
         */

        private String name;
        private List<Integer> val;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Integer> getVal() {
            return val;
        }

        public void setVal(List<Integer> val) {
            this.val = val;
        }
    }
}
