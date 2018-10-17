package com.vonzhou.example.config;

import com.vonzhou.example.abst.AbstractDao;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

    @Primary
    @Bean(name = "mapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer() {
        // 该Mapper是TK的实现，而不是Mybatis
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBeanName("1");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        // 扫描Mapper接口子类
        mapperScannerConfigurer.setBasePackage("com.vonzhou.example.domain");
        Properties properties = new Properties();
        // 这里要特别注意，不要把MyMapper（AbstractDao）放到 basePackage 中，也就是不能同其他Mapper(Dao)一样被扫描到。
        properties.setProperty("mappers", AbstractDao.class.getName());
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
