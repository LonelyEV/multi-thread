/**
 * Project Name:multi-thread
 * File Name:ThreadB.java
 * Package Name:com.quzhigang.conditiontest
 * Date:2017年9月19日上午10:54:13
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.conditiontest;
/**
 * ClassName:ThreadB <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午10:54:13 <br/>
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
		
		for(int i=0; i< Integer.MAX_VALUE; i++){
			myService.get();
		}
	}
	
	

}

