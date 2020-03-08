package com.tale.utils;

import java.util.ResourceBundle;

/**
 * 读取properties文件工具类
 * <p>
 * Created by biezhi on 2017/2/21.
 */
public class ConfFileReader {

	public static Object getProperty(String file, String key){
		ResourceBundle bundle = ResourceBundle.getBundle(file);
		Object value = bundle.getObject(key);  
		return value;
	}
	
	public static String getPropertybyString(String file, String key){
		ResourceBundle bundle = ResourceBundle.getBundle(file);
		String value = bundle.getString(key);  
		return value;
	}
	
	public static String[] getPropertybyStrArray(String file, String key){
		ResourceBundle bundle = ResourceBundle.getBundle(file);
		String[] value = bundle.getStringArray(key);
		return value;
	}
}
