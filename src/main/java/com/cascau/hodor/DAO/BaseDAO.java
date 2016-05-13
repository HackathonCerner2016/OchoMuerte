/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cascau.hodor.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

/**
 * @author MI043912
 */
public abstract class BaseDAO {

    protected CallableStatement callableStatement;
    protected static Connection connection;
    protected static SingleConnectionDataSource singleConnectionDataSource;

    static {
        initConnection();
    }

    private static void initConnection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        singleConnectionDataSource = (SingleConnectionDataSource) applicationContext.getBean("dataSource", SingleConnectionDataSource.class);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(singleConnectionDataSource);
        try {
            connection = jdbcTemplate.getDataSource().getConnection();
        } catch (Exception e) {

        }
        
        //test stuff - to be removed
        if(connection != null){
            System.out.println("Connected!");
            
        }else{
            System.out.println("Terribly failed :( !");
        }
        //end of end stuff
    }
}
