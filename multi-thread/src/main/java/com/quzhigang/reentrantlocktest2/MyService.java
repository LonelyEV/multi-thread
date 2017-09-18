/**
 * Project Name:multi-thread
 * File Name:MyService.java
 * Package Name:com.quzhigang.reentrantlocktest2
 * Date:2017年9月18日下午2:38:39
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:MyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年9月18日 下午2:38:39 <br/>
 * 
 * @author 屈志刚
 * @version
 * @since JDK 1.7
 * @see
 */
public class MyService {

	private Lock lock = new ReentrantLock();

	public void methodA() {

		try {
			lock.lock();

			System.out.println("methodA begin ThreadName" + Thread.currentThread().getName() + " time"
					+ System.currentTimeMillis());

			Thread.sleep(5000);

			System.out.println(
					"methodA end ThreadName" + Thread.currentThread().getName() + " time" + System.currentTimeMillis());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}
	
	public void methodB(){
		
		try{
			lock.lock();
			
			System.out.println("methodB begin ThreadName" + Thread.currentThread().getName() + " time"
					+ System.currentTimeMillis());

			Thread.sleep(5000);

			System.out.println(
					"methodB end ThreadName" + Thread.currentThread().getName() + " time" + System.currentTimeMillis());

		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}

}
