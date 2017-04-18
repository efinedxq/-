package cn.qtech.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainF {
	
	public static void main(String[] args) {
		OptFactory optF = new OptFactory();
		Opt opt;
		double a;
		double b;
		double result;
		String op;
		Scanner input = new Scanner(System.in);
		OptFactoryRe re = new OptFactoryRe();
		while (true) {
			System.out.println("请输入运算符：+ 、-、*、/。输入-1结束！");
			op = input.next();
			if(op.contains("-1")) break;
			System.out.println("请输入数字：");
			a = input.nextDouble();
			System.out.println("请输入数字：");
			b = input.nextDouble();
			
//            opt = optF.createOpt(op.charAt(0));//非反射方法
			
			opt = re.createOpt(OpMaps.getMethod(op));//反射方法
			
			opt.NumberA = a;
			opt.NumberB = b;
			result = opt.GetResult();
			System.out.println("结果是：" + result);
		}
	}
}
