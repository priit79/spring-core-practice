package org.sda.beans;

import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * @author Priit Enno
 * @Date 20.02.2023
 */
@Setter
@Service("myBean")
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello! " + name;
    }
}