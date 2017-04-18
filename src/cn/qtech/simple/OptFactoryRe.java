package cn.qtech.simple;

import java.lang.reflect.Method;

public class OptFactoryRe {
	public Opt createOpt(String methodName){
    	Class<?> opt = null;
    	try {
			opt = Class.forName("cn.qtech.simple."+methodName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Opt inst = null;
		try {
			inst = (Opt) opt.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(opt.getName());
    	return inst;
    }
}
