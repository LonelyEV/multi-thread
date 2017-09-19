/**
 * Project Name:multi-thread
 * File Name:Service.java
 * Package Name:com.quzhigang.lockmethodtest
 * Date:2017年9月19日下午3:35:38
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.lockmethodtest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:Service <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 下午3:35:38 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Service {
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1(){
		
		try{

			lock.lock();
			System.out.println(" serviceMethod1 getHoldCount"+lock.getHoldCount());
			serviceMethod2();
			
		}finally{
			lock.unlock();
		}
		
		
	} 
	
	public void serviceMethod2(){
		
		try{
			
			lock.lock();
			System.out.println(" serviceMethod2 getHoldCount"+lock.getHoldCount());
			
		}finally{
			lock.unlock();
		}
		
		
	}
	
	

}

