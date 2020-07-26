package epam;
class CompoundInterest {
	double compound;
	double compoundIn(double amount, double years, double rateOfInterest) {
		try {
			double ans = Math.pow((1+(rateOfInterest/100)), years);
			compound=ans*amount;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		return compound;
	}
}
