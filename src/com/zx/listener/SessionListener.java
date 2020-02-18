package com.zx.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

/*
 * 
 * @Description: session的监听器
 * 		HttpSessionListener : session 生命周期监听器
 * 			sessionCreated : 当session创建时触发
 * 			sessionDestroyed : 当session销毁时触发
 * 		HttpSessionAttributeListener : session的属性监听器
 */

public class SessionListener implements HttpSessionListener,HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("when new session attribute is added");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("when session attribute is removed");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("when session attribute is changed");
	}

	
	// Session
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("create session.");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("destroy session");		
	}

	
	
}
