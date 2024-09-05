
public class Driver {

	public static void main(String[] args) {
		ISupportIssue issue = new SupportIssue("Cpu not turned on", 1);
		
		IHandler basic = new BasicHandler(new TechnicalHandler(null));
		
		basic.handle(issue);
		
	}

}
