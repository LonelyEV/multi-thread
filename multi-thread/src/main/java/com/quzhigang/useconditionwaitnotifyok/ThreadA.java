/**
 * Project Name:multi-thread
 * File Name:ThreadA.java
 * Package Name:com.quzhigang.useconditionwaitnotifyok
 * Date:2017年9月18日下午5:14:34
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotifyok;
/**
 * ClassName:ThreadA <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午5:14:34 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ThreadA extends Thread {
	
	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		
		myService.await();
		
	}
	
	
	
	

}

