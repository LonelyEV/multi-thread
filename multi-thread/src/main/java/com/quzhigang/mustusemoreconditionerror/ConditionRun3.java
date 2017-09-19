/**
 * Project Name:multi-thread
 * File Name:ConditionRun3.java
 * Package Name:com.quzhigang.mustusemoreconditionerror
 * Date:2017年9月18日下午5:45:01
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionerror;

/**
 * ClassName:ConditionRun3 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午5:45:01 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConditionRun3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyService myService = new MyService();
		
		MyThreadA myThreadA = new MyThreadA(myService);
		myThreadA.start();
		
		
		MyThreadB myThreadB = new MyThreadB(myService);
		myThreadB.start();
		
		Thread.sleep(3000);
		
		myService.signalAll();
		
		
		
	}
	
}

