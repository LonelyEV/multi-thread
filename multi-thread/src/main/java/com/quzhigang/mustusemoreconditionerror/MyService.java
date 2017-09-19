/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.mustusemoreconditionerror
 * Date:2017年9月18日下午5:28:32
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionerror;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午5:28:32 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void awaitA(){
		
		try{
			
			lock.lock();
			System.out.println(" begin awaitA 时间是："+System.currentTimeMillis()+" ThreadName"
					+Thread.currentThread().getName());
			
			condition.await();
			
			System.out.println(" end awaitA 时间是："+System.currentTimeMillis()+" ThreadName"
					+Thread.currentThread().getName());
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void awaitB(){
		
		try{
			
			lock.lock();
			System.out.println(" begin awaitB 时间是："+System.currentTimeMillis()+" ThreadName"
					+Thread.currentThread().getName());
			
			condition.await();
			
			System.out.println(" end awaitB 时间是："+System.currentTimeMillis()+" ThreadName"
					+Thread.currentThread().getName());
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void signalAll(){
		
		try{
			
			lock.lock();
			
			System.out.println(" begin signalAll 时间是："+System.currentTimeMillis()+" ThreadName"
					+Thread.currentThread().getName());
			
			condition.signalAll();
			
		}finally{
			lock.unlock();
		}
		
		
	}

}

