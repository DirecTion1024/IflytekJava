package com.homework.randomnumber;

import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class randomNumberTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRandomNumber() {
        for(int i=0;i<100;i++){  //循环测试100次
        	double result = randomNumber.RandomNumber(600, 800);
            if (result<600||result>800) {
            	System.out.println(result); //失败时打印失败的数值并结束单元测试
                fail("fail");
            } 
        }
        System.out.println("pass");  //通过测试后打印pass
    }

}
