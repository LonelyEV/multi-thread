/**
 * Project Name:multi-thread
 * File Name:Run.java
 * Package Name:com.quzhigang.mustusemoreconditionok
 * Date:2017年9月19日上午10:03:21
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionok;
/**
 * ClassName:Run <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午10:03:21 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyService myService = new MyService();
		
		MyThreadA myThreadA = new MyThreadA(myService);
		myThreadA.start();
		
		MyThreadB myThreadB = new MyThreadB(myService);
		myThreadB.start();
		
		Thread.sleep(3000);
		
		myService.signalAll_A();
		
	}

}

