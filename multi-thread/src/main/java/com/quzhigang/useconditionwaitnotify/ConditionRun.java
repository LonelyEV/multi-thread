/**
 * Project Name:multi-thread
 * File Name:ConditionRun.java
 * Package Name:com.quzhigang.useconditionwaitnotify
 * Date:2017年9月18日下午4:31:15
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotify;
/**
 * ClassName:ConditionRun <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午4:31:15 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConditionRun {
	
	public static void main(String[] args) {
		
		MyService myService = new MyService();
		
		MyThreadA myThreadA = new MyThreadA(myService);
		
		myThreadA.start();
	}

}

