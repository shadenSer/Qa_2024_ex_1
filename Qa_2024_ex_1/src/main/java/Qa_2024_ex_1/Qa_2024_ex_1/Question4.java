package Qa_2024_ex_1.Qa_2024_ex_1;

public class Question4 {
	/**
	 * shaden serhan 212019624
	 * shada nawatha 208049585
	 */
	public static String calculate(double a, double b,String mod) {
		switch(mod) {
		
		case "regular":
			if(a<b)
				return "B";
			else
				return "A";
		case "negative":
			if(-a>=-b)
				return "A";
			else
				return "B";
			
		case "reciprocals":
			if((1/a)>=(a/b))
				return "A";
			else
				return "B";
		default:
		return "error";

	}
}

	public String Compare(int a, int b, String mod) {
		// TODO Auto-generated method stub
		return null;
	}}
