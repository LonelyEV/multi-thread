/**
 * Project Name:multi-thread
 * File Name:Run.java
 * Package Name:com.quzhigang.lockmethodtest
 * Date:2017年9月19日下午8:53:14
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.lockmethodtest;
/**
 * ClassName:Run <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 下午8:53:14 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Run {
	
	public static void main(String[] args) {
		
		Service service = new Service();
		
		service.serviceMethod1();
		
		
	}

}

