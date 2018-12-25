package com.derrick.springbootTEST;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Test
	public void findFirstAnother(){

		String str="abbaccdeff";
		String c="";
		for(int i=0;i<str.length();i++){
			String temp=str.substring(0, i)+str.substring(i+1);
			int idx=temp.indexOf(str.charAt(i));
			if(idx==-1){//剩下的字符串中没有，就是唯一的
				c=String.valueOf(str.charAt(i));
				//System.out.println(c);
				break;
			}

		}
		System.out.println(c);

	}

	@Test
	public void findFirst() {
		String str = "abcdabffklod";

		if(str == null) {
			return;
		}

		int i = 0;
		char[] arr = str.toCharArray();

		int[] hashTable = new int[256];
		for(i = 0; i < 256; i++) {
			hashTable[i] = 0;
		}

		char[] hashKey = arr;
		for(i = 0; i < hashKey.length; i++) {
			int tmp = hashKey[i];// 将char 转为 int,即转为其对应的ASCAII码
			hashTable[tmp]++;
		}

		for(i = 0; i < hashKey.length; i++) {
			if(hashTable[hashKey[i]] == 1) {
				System.out.println((char)hashKey[i]);
				return; // 找出只出现一次的字符后就退出，若要都找出的话不退出就行
			}
		}
	}

	@Test
	public void findFirst() {
		
	}
}
