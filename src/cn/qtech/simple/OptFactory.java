package cn.qtech.simple;

public class OptFactory {
    public Opt createOpt(char op){
    	Opt opt = null;
    	switch(op){
    		case '+':
    			opt = new AddMethod();
    			break;
    		case '-':
    			opt = new SubMethod();
    			break;
    		case '*':
    			opt = new MulMethod();
    			break;
    		case '/':
    			opt = new DivMethod();
    			break;
    	}
    	return opt;
    }
}
