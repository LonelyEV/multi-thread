/**
 * Project Name:multi-thread
 * File Name:Run.java
 * Package Name:com.quzhigang.fairnpfairtest
 * Date:2017年9月19日下午3:19:47
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.fairnpfairtest;
/**
 * ClassName:Run <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 下午3:19:47 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Run {
	
	public static void main(String[] args) {
		
		//runFair(); //公平锁测试
		System.out.println("=========================================");
		runNotFair(); //非公平锁测试
		
	}
	
	
	public static void runFair(){
		final MyService myService = new MyService(true);
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("==线程"+Thread.currentThread().getName()+"运行了");
				
				myService.serviceMethod();
			}
		};
		
		Thread[] threadArray = new Thread[10];
		
		for(int i=0; i<10; i++){
			threadArray[i] = new Thread(runnable);
		}
		
		for(int i=0; i<10; i++){
			threadArray[i].start();
		}
	}
	
	public static void runNotFair(){
		
		final MyService myService = new MyService(false);
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("==线程"+Thread.currentThread().getName()+"运行了");
				
				myService.serviceMethod();
				
			}
		};
		
		Thread[] threadArray = new Thread[10];
		
		for(int i=0; i<10; i++){
			threadArray[i] = new Thread(runnable);
		}
		
		for(int i=0; i<10; i++){
			threadArray[i].start();
		}
		
		
	}

}

