/**
 * Project Name:multi-thread
 * File Name:Run.java
 * Package Name:com.quzhigang.conditiontest
 * Date:2017年9月19日上午10:55:32
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.conditiontest;

/**
 * ClassName:Run <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午10:55:32 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Run {
	
	public static void main(String[] args) {
		
		MyService myService = new MyService();
		
		MyThreadA myThreadA = new MyThreadA(myService);
		myThreadA.start();
		
		MyThreadB myThreadB = new MyThreadB(myService);
		myThreadB.start();
		
	}
	

}

