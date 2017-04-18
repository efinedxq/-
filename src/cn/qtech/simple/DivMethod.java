package cn.qtech.simple;

public class DivMethod extends Opt {

	@Override
	public double GetResult() {
		// TODO Auto-generated method stub
		if(this.NumberB==0) return 0;
		return this.NumberA/this.NumberB;
	}

}
