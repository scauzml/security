package com.boot.baseTest;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 张明亮
 * @date 2018/10/9 15:43
 * 测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringTestCase {
    Logger logger = LoggerFactory.getLogger(this.getClass());
}
