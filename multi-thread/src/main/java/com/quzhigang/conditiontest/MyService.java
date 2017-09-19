/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.conditiontest
 * Date:2017年9月19日上午10:13:03
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.conditiontest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午10:13:03 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private ReentrantLock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	private boolean hasVal = false;
	
	
	
	public void privider(){
		
		try{
			lock.lock();
			while(hasVal == true){
				condition.await();  //指定线程处于等待状态
			}
			
			System.out.println("打印 "+"生产者");
			hasVal = true;
			condition.signal();  //唤醒当前线程
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void get(){
		
		try{
			
			lock.lock();
			
			if(hasVal == false){
				condition.await();
			}
			
			System.out.println("打印 "+"消费者");
			hasVal = false;
			condition.signal();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	

}

