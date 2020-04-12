package com.bstek.bdf4.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public List<Map<String,Object>> loadReportData(String dsName,String datasetName,Map<String,Object> parameters){
        List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
        Map<String, Object> p1 = new HashMap<String, Object>();
        p1.put("no", "001");
        p1.put("name", "张三");
        p1.put("result", "L");
       List<Map<String, Object>> children = new ArrayList<Map<String, Object>>();
       Map<String, Object> p2 = new HashMap<String, Object>();
       p2.put("no", "002");
       p2.put("name", "李四");
       p2.put("result", "L");
       Map<String, Object> p3 = new HashMap<String, Object>();
       p3.put("no", "003");
       p3.put("name", "王五");
       p3.put("result", "M");
       p3.put("birthday", new Date());
       children.add(p2);
       children.add(p3);
       p1.put("children", children);
       dataList.add(p1);
       //        Map<String, Object> p2 = new HashMap<String, Object>();
//        p2.put("no", "002");
//        p2.put("name", "李四");
//        p2.put("result", "L");
//        dataList.add(p2);
//        Map<String, Object> p3 = new HashMap<String, Object>();
//        p3.put("no", "003");
//        p3.put("name", "王五");
//        p3.put("result", "M");
//        p3.put("birthday", new Date());
//        dataList.add(p3);
        
    	return dataList;
    }
    public List<Map<String,Object>> buildReport(String dsName,String datasetName,Map<String,Object> parameters){
    	List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
    	Map<String, Object> p1 = new HashMap<String, Object>();
        p1.put("no", "001");
        p1.put("name", "张三");
        p1.put("result", "L");
        dataList.add(p1);
        Map<String, Object> p2 = new HashMap<String, Object>();
        p2.put("no", "002");
        p2.put("name", "李四");
        p2.put("result", "L");
        dataList.add(p2);
        Map<String, Object> p3 = new HashMap<String, Object>();
        p3.put("no", "003");
        p3.put("name", "王五");
        p3.put("result", "M");
        p3.put("birthday", new Date());
        dataList.add(p3);
    	return dataList;
    }
}