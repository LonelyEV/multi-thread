/**
 * Project Name:multi-thread
 * File Name:ReenTrantLockRun.java
 * Package Name:com.quzhigang.reentrantlocktest
 * Date:2017年9月18日下午2:26:12
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest;
/**
 * ClassName:ReenTrantLockRun <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午2:26:12 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ReenTrantLockRun {
	
	public static void main(String[] args) {
		
		MyService myService = new MyService();
		
		MyThread thread1 = new MyThread(myService);
		MyThread thread2 = new MyThread(myService);
		MyThread thread3 = new MyThread(myService);
		MyThread thread4= new MyThread(myService);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
	
}

