package com.largetraffic.boardserver.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration //메타정보를 설정할 수 있도롣 해줌
@MapperScan(basePackages="com.largetraffic.boardserver.mapper") //특정 경로의 리소스들을 업로드 할 수 있게 함
public class MysqlConfig {



    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{

        final SqlSessionFactoryBean sessionFactory=new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mappers/*.xml"));

        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");
        sessionFactory.setConfigLocation(myBatisConfig);


        return sessionFactory.getObject();
    }





}
