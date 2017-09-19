/**
 * Project Name:multi-thread
 * File Name:MyThreadB.java
 * Package Name:com.quzhigang.mustusemoreconditionok
 * Date:2017年9月19日上午10:00:41
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionok;
/**
 * ClassName:MyThreadB <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午10:00:41 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyThreadB extends Thread {
	
	private MyService myService;

	public MyThreadB(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		
		myService.awaitB();
		
	}
	
	
	
	

}

