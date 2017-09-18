/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.useconditionwaitnotify
 * Date:2017年9月18日下午4:18:57
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.useconditionwaitnotify; 

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午4:18:57 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private ReentrantLock lock = new ReentrantLock();	
	
	private Condition condition = lock.newCondition();
	
	public void waitMedhot(){
		
		try{
			
			lock.lock();
			System.out.println("A");
			condition.await();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	

}

