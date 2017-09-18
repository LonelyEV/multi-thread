/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.useconditionwaitnotifyerror
 * Date:2017年9月18日下午3:29:33
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotifyerror;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午3:29:33 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void await (){
		
		try{
			condition.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}

