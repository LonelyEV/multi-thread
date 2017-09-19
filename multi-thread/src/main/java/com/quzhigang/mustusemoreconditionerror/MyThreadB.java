/**
 * Project Name:multi-thread
 * File Name:MyThreadB.java
 * Package Name:com.quzhigang.mustusemoreconditionerror
 * Date:2017年9月18日下午5:42:52
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionerror;
/**
 * ClassName:MyThreadB <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午5:42:52 <br/>
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

