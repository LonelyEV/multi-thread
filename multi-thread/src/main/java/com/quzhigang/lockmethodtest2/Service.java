/**
 * Project Name:multi-thread
 * File Name:Service.java
 * Package Name:com.quzhigang.lockmethodtest2
 * Date:2017年9月19日下午9:00:53
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.lockmethodtest2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:Service <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 下午9:00:53 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Service {
	
	public ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod(){
		
		try{
			
			lock.lock();
			System.out.println("ThreadName="+Thread.currentThread().getName()+"进入方法！");
			Thread.sleep(Integer.MAX_VALUE);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}

}

