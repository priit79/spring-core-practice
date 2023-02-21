package org.sda;

import org.sda.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Priit Enno
 * @Date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.sayHello());

        myBean.setName("Enno");
        System.out.println(myBean.sayHello());
    }
}