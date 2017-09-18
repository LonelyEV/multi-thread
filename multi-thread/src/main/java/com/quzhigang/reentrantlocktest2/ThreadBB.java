/**
 * Project Name:multi-thread
 * File Name:ThreadBB.java
 * Package Name:com.quzhigang.reentrantlocktest2
 * Date:2017年9月18日下午2:55:08
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest2;
/**
 * ClassName:ThreadBB <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午2:55:08 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ThreadBB extends Thread {
	
	private MyService myService;

	public ThreadBB(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		myService.methodB();
	}
	
	

}

