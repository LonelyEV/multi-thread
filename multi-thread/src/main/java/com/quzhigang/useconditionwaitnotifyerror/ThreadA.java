/**
 * Project Name:multi-thread
 * File Name:ThreadA.java
 * Package Name:com.quzhigang.useconditionwaitnotifyerror
 * Date:2017年9月18日下午3:34:57
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotifyerror;
/**
 * ClassName:ThreadA <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午3:34:57 <br/>
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

