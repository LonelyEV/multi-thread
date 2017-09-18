/**
 * Project Name:multi-thread
 * File Name:ConditionRun.java
 * Package Name:com.quzhigang.useconditionwaitnotifyerror
 * Date:2017年9月18日下午3:36:33
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotifyerror;
/**
 * ClassName:ConditionRun <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午3:36:33 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConditionRun {
	
	public static void main(String[] args) {
		
		MyService myService = new MyService();
		
		ThreadA a = new ThreadA(myService);
		a.start();
		
	}

}

