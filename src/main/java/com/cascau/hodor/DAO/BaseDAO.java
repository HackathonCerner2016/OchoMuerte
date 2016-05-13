/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cascau.hodor.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

/**
 * @author MI043912
 */
public class BaseDAO {

    protected CallableStatement callableStatement;
    protected Connection connection;
    protected SingleConnectionDataSource singleConnectionDataSource;


    public BaseDAO() {
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        try {
            connection = jdbcTemplate.getDataSource().getConnection();
        } catch (Exception e) {

        }
        
        //test stuff - to be removed
        if(connection != null){
            System.out.println("Connected Mircea mrr!");
            
        }else{
            System.out.println("Terribly failed :( !");
        }
        //end of end stuff
    }
    
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
}
