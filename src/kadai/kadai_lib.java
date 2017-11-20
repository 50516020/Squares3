package kadai;

import kadai.kadai_if;

public class kadai_lib implements kadai_if{
	double x[],y[];
	double theta[] =new double[2];
	double eta=0.1;

	public kadai_lib(double[] x, double[] y) {
		
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		double object=0;
		for(int i=0;i<x.length;i++){
			object += Math.pow(y[i] - ( theta[0] + theta[1] * x[i]), 2);
			
		}
		return object/2;
	}

	@Override
	public double[] getDx() {
		// TODO Auto-generated method stub
		double object[] = new double[2];
		for(int i = 0; i < x.length; i++){
	    object[0] += theta[0] + theta[1] * x[i] - y[i];
		object[1] += (theta[0] + theta[1] * x[i] - y[i])*x[i];
		
	}
		theta[0] -= eta * object[0];
		theta[1] -= eta * object[1];
		return theta;

}
}
