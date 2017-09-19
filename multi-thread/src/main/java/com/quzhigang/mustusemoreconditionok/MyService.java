/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.mustusemoreconditionok
 * Date:2017年9月19日上午9:50:18
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.mustusemoreconditionok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午9:50:18 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	private Condition conditionA = lock.newCondition();
	
	private Condition conditionB = lock.newCondition();
	
	
	public void awaitA(){
		
		try{
			
			lock.lock();
			System.out.println(" begin awaitA 时间为："+System.currentTimeMillis()
			+" ThreadName : "+Thread.currentThread().getName());
			conditionA.await();
			System.out.println(" end awaitA 时间为："+System.currentTimeMillis()
			+" ThreadName : "+Thread.currentThread().getName());
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void awaitB(){
		
		try{
			
			lock.lock();
			System.out.println(" begin awaitB 时间为："+System.currentTimeMillis()
			+" ThreadName : "+Thread.currentThread().getName());
			conditionB.await();
			System.out.println(" end awaitB 时间为："+System.currentTimeMillis()
			+" ThreadName : "+Thread.currentThread().getName());
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void signalAll_A(){
		
		try{
			
			lock.lock();
			System.out.println("signalAll_A 时间为："+System.currentTimeMillis()
			+" ThreadName : "+Thread.currentThread().getName());
			conditionA.signalAll();
			
		}finally{
			lock.unlock();
		}
	}
	
	public void signalAll_B(){
		
		try{
			
			lock.lock();
			System.out.println("signalAll_B 时间为："+System.currentTimeMillis()
			+" ThreadName : "+Thread.currentThread().getName());
			conditionB.signalAll();
			
		}finally{
			lock.unlock();
		}
	}

}

