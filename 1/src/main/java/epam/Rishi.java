package epam;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Formatter;
import org.apache.log4j.Logger;

public class Rishi extends Formatter {
	private static final Logger logger = Logger.getLogger(Rishi.class.getName());
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		logger.info("Enter the principle amount");
		double p = scan.nextDouble();
		logger.info("Enter the No of years");
		double n = scan.nextDouble();
		logger.info("Enter the rate of interest");
		double r = scan.nextDouble();
		SimpleInterest s = new SimpleInterest();
		double ans=s.simpleI(n,r,p);
		CompoundInterest ci = new CompoundInterest();
		double ans1 =ci.compoundIn(p,n,r);
		logger.info("Simple interest is:"+ans);
		logger.info("Compound interest is"+ans1);
	}
	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return null;
	}
}
