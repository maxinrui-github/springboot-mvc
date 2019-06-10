/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/srtc/platform">platform</a> All rights reserved.
 */
package com.master.util;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.UUID;

import org.apache.catalina.Session;
import org.apache.catalina.SessionIdGenerator;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;

/**
 * 封装各种生成唯一性ID算法的工具类.
 * @author maxinrui
 * @version 2019-06-15
 */
@Service
@Lazy(false)
public class IdGen implements IdGenerator, SessionIdGenerator {

	private static SecureRandom random = new SecureRandom();
	
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 使用SecureRandom随机生成Long. 
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}

	/**
	 * 基于Base62编码的SecureRandom随机生成bytes.
	 */
	public static String randomBase62(int length) {
		byte[] randomBytes = new byte[length];
		random.nextBytes(randomBytes);
		return Encodes.encodeBase62(randomBytes);
	}

	public String getNextId() {
		return IdGen.uuid();
	}

	public Serializable generateId(Session session) {
		return IdGen.uuid();
	}
	
	public static void main(String[] args) {
		System.out.println(IdGen.uuid());
		System.out.println(IdGen.uuid().length());
		System.out.println(new IdGen().getNextId());
		for (int i=0; i<1000; i++){
			System.out.println(IdGen.randomLong() + "  " + IdGen.randomBase62(5));
		}
	}

	@Override
	public String getJvmRoute() {
		return null;
	}

	@Override
	public void setJvmRoute(String s) {

	}

	@Override
	public int getSessionIdLength() {
		return 0;
	}

	@Override
	public void setSessionIdLength(int i) {

	}

	@Override
	public String generateSessionId() {
		return null;
	}

	@Override
	public String generateSessionId(String s) {
		return null;
	}

	@Override
	public UUID generateId() {
		return null;
	}
}
