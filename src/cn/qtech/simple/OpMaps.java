package cn.qtech.simple;

import java.util.ResourceBundle;

public class OpMaps {
   public static String getMethod(String ch){
	   ResourceBundle info = ResourceBundle.getBundle("operate");
	   return info.getString(ch);
   }
}
