package com.gid.graphql.gateway.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gid.graphql.gateway.models.TestingModel;

@Component
public class TestingDAO {

    public List<TestingModel> fetchDataTesting(){
        List<TestingModel> listData = new ArrayList<TestingModel>();
        listData.add(new TestingModel("alex", 22, new Date()));
        listData.add(new TestingModel("john", 23, new Date()));
        listData.add(new TestingModel("doe", 24, new Date()));
        listData.add(new TestingModel("mikael", 25, new Date()));

        return listData;
    }


    

}
