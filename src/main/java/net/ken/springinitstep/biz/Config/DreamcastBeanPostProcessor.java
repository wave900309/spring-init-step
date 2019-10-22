package net.ken.springinitstep.biz.Config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;

/**
 * Created by Yang, Haiqiang on 2019/10/16.
 */
@Component
public class DreamcastBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Annotation[] annotations = bean.getClass().getAnnotations();
        for (Annotation a: annotations){
            if (a.annotationType().equals(RestController.class)) {
                System.out.println(beanName + " postProcessBeforeInitialization..........");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Annotation[] annotations = bean.getClass().getAnnotations();
        for (Annotation a: annotations){
            if (a.annotationType().equals(RestController.class)) {
                System.out.println(beanName + " postProcessAfterInitialization..........");
            }
        }
        return bean;
    }
}
