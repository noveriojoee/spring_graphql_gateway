package com.gid.graphql.gateway.models;

import java.util.Date;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

// @Entity
// @Table(name = "tbl_testing_mt",schema = "dbo_user_mgmt")
@Getter @Setter
public class TestingModel {
    
    // @Id @GeneratedValue
    @GraphQLQuery(name = "id", description = "a user id")
    private Long id;

    @GraphQLQuery(name = "name", description = "a user name")
    private String name;

    @GraphQLQuery(name = "age", description = "a user age")
    private int age;

    @GraphQLQuery(name = "name", description = "when was the last time user active")
    private Date recentActive;

    public TestingModel(String name, int age, Date recentActive) {
        super();
        this.name = name;
        this.age = age;
        this.recentActive = recentActive;
    }
}
