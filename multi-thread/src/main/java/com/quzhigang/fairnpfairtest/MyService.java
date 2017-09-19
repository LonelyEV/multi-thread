/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.fairnpfairtest
 * Date:2017年9月19日下午3:14:33
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.fairnpfairtest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 下午3:14:33 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private ReentrantLock lock;

	public MyService(boolean isFair) {
		super();
		lock = new ReentrantLock();
	}
	
	public void serviceMethod(){
		
		try{
			
			lock.lock();
			System.out.println("ThreadName = "+Thread.currentThread().getName()+"获得锁定");
			
		}finally{
			lock.unlock();
		}
		
	}
	
	
	
	

}

