package com.spring.druid.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @ClassName DruidInfoShowInit
 * @Description
 * @Author wangss
 * @date 2020.03.18 23:35
 * @Version 1.0
 */
@Slf4j
@Component
public class DruidInfoShowInit implements CommandLineRunner {

    /**
     * 这里说明一下，因为我们引入了jdbc jar，所以springboot会为我们自动生成这些bean的实例
     */
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        log.info("数据库信息：{}", dataSource.toString());
    }
}
