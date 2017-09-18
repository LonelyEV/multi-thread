/**
 * Project Name:multi-thread
 * File Name:ThreadB.java
 * Package Name:com.quzhigang.reentrantlocktest2
 * Date:2017年9月18日下午2:52:51
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest2;
/**
 * ClassName:ThreadB <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午2:52:51 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ThreadB extends Thread {
	
	private MyService myService;

	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}
	
	
	@Override
	public void run() {
		
		myService.methodB();
	}
	

}

