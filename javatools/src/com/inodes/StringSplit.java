package com.inodes;

public class StringSplit {

	public static void main(String[] args) {
		String str ="我是a你好sdf";
		System.out.println(getSplitStr(str,6));
	}
	
	public static String getSplitStr(String str,int end){
		if(str.length()*2<end){
			return str;
		}
		char[] strChar = str.toCharArray();
		int length = 0;
		for (int i = 0; i < strChar.length; i++) {
			if(strChar[i]>255){
				length += 2;
			}else{
				length++;
			}
			if(length>=end){
				if(length == end){
					return str.substring(0, i+1);
				}
				return str.substring(0, i);
			}
		}
		return str;
	}
}
