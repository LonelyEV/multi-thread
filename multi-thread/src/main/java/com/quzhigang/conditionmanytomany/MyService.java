/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.conditionmanytomany
 * Date:2017年9月19日上午11:30:50
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.conditionmanytomany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午11:30:50 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyService {
	
	private ReentrantLock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	private boolean hasVal = false;
	
	public void set(){
		
		try{
			
			lock.lock();
			while(hasVal == true){
				System.out.println("有可能==连续");
				condition.await();
			}
			
			System.out.println("打印=");
			hasVal = true;
			//condition.signal();
			condition.signalAll();
			
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
				System.out.println("有可能--连续");
				condition.await();
			}
			
			System.out.println("打印-");
			hasVal = false;
			//condition.signal();
			condition.signalAll();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	

}

