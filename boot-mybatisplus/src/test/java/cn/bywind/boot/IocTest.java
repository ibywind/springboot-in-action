package cn.bywind.boot;

import cn.bywind.boot.ioc.BeanA;
import cn.bywind.boot.ioc.BeanB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IocTest {

    @Autowired
    BeanB beanB;

    @Test
    public void testIoc(){
        BeanA a1 = beanB.getBeanA();
        BeanA a2 = beanB.getBeanA();
        System.out.println("a1:"+a1);
        System.out.println("a2:"+a2);
        System.out.println(a1== a2);
    }
}
