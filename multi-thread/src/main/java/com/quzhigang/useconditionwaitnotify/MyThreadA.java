/**
 * Project Name:multi-thread
 * File Name:MyThreadA.java
 * Package Name:com.quzhigang.useconditionwaitnotify
 * Date:2017年9月18日下午4:27:34
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotify;
/**
 * ClassName:MyThreadA <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午4:27:34 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyThreadA extends Thread {
	
	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		
		myService.waitMedhot();
	}
	
	
	
	

}

