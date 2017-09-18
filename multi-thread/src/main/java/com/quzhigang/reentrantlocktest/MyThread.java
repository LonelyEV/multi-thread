/**
 * Project Name:multi-thread
 * File Name:MyThread.java
 * Package Name:com.quzhigang.reentrantlocktest
 * Date:2017年9月18日下午2:18:43
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest;
/**
 * ClassName:MyThread <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午2:18:43 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyThread extends Thread {
	
	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		
		myService.testMethod();
	}
	
	
	
	

}

