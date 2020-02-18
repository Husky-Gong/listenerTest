package com.zx.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/*
 * RequestListener
 * @Description: HttpServletRequest的生命周期和属性监听器
 * 				ServletRequestListener    生命周期监听器
 * 				requestInitialized : 当有request对象被实例化时会调用
 * 				requestDestroyed : 当有request 对象被销毁时调用
 * 
 * 			现在RequestListener  实现了接口  就是遵循监听器的规范。RequestListener此时
 * 			只是一个符合监听器规范的程序。还需要配置  监听器才能真正生效
 */

public class RequestListener implements ServletRequestListener,ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("One attribute is added.");
		String name = srae.getName();
		Object value = srae.getValue();
		System.out.println("new attribute name:"+ name);
		System.out.println("new attribute value:"+ value);
		System.out.println(srae.getServletRequest());
		
		if(name.equals("sex")) {
			String sex = value.equals("1")?"male":"female";
			// set value
			srae.getServletRequest().setAttribute(name, sex);
		}
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("when attribute is deleted");
		String name = srae.getName();
		Object value = srae.getValue();
		System.out.println(name+":"+value);
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("when request attribute is changed");
		String name = srae.getName();
		Object value = srae.getValue();
		
		System.out.println(srae.getServletRequest().getAttribute(name));
		System.out.println("attributeReplace name: "+name);
		System.out.println("attributeReplace value: "+ value);
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request object is destroyed");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request object is initialized....");
		// get exist request object
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		
	}
	
}
