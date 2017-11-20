package kadai;

import kadai.kadai_lib;

public class kadai_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0, 0.3, 0.6, 0.9, 1.2, 1.5, 1.8};
		double y[] = { 1.0, 2.3, 3.5, 4.8, 5.9, 7.4, 8.7 };
		double theta[] = new double[2];

		kadai_lib slib = new kadai_lib(x, y);
		for(int i = 0; i < 100; i++){
		theta = slib.getDx();
		System.out.println(" : rironnti theta[0] = 0.975");
		System.out.println(i+" : theta[0] = "+theta[0]);
		System.out.println(" : rironnti theta[1] = 4.25");
		System.out.println(i+" : theta[1] = "+theta[1]);
		System.out.println(i+" : rironnti Objective function = 0.02125");
		System.out.println(i+" : Objective function = "+slib.getRx());

	}

}
}
