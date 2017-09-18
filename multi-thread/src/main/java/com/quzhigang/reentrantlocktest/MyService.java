/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.reentrantlocktest
 * Date:2017年9月18日 下午2:12:19 <br/>
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午2:12:19 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	public void testMethod(){
		
		lock.lock();
		
		for(int i=0; i<5; i++){
			
			System.out.println("ThreadName"+Thread.currentThread().getName()+(" "+(i+1)));
		}
		
		lock.unlock();
		
	}
	
	
	
	
}

