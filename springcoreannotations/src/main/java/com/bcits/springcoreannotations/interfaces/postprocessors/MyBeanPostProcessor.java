package com.bcits.springcoreannotations.interfaces.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bcits.springcoreannotations.beans.MessageBean;

public class MyBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before init phase..!");
		MessageBean bean2 = (MessageBean) bean;
		System.out.println(bean2.getMessage());
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After init phase..!");
		return bean;	
	}

}
