
public class TechnicalHandler extends IHandler{

	public TechnicalHandler(IHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handle(ISupportIssue issue) {
		if(issue.getDifficultLevel() <= 2)
		{
			System.out.println("Technical issue: " + issue.getDescription() + " is resolved");
		}
		else
		{
			System.out.println("the issue is not resolved.");
		}
	}

}
