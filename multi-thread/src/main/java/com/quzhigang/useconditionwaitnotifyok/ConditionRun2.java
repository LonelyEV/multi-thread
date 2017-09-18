/**
 * Project Name:multi-thread
 * File Name:ConditionRun2.java
 * Package Name:com.quzhigang.useconditionwaitnotifyok
 * Date:2017年9月18日下午5:16:04
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotifyok;
/**
 * ClassName:ConditionRun2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午5:16:04 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConditionRun2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyService myService = new MyService();
		
		ThreadA threadA = new ThreadA(myService);
		
		threadA.start();
		
		Thread.sleep(3000);
		
		myService.signal();
		
		
	}

}

