package spring.study.beanpostproessor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
@Component
public class ReferenceA {
    @Autowired
    private ReferenceB referenceB;
    public ReferenceA() { }
}
