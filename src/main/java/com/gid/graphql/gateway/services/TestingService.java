package com.gid.graphql.gateway.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gid.graphql.gateway.dao.TestingDAO;
import com.gid.graphql.gateway.models.TestingModel;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class TestingService {

    @Autowired
    TestingDAO testingDao;

    @GraphQLQuery(name = "getAllData")
    public List<TestingModel> getAllData(){
        return this.testingDao.fetchDataTesting();
    }
    
}
