package epam;

class SimpleInterest {
	double simpleI(double year, double roi , double principle) {
		double si=0;
		try {
		si = (year* roi* principle )/100;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return si+principle;
	}
}
