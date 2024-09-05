
public class BasicHandler extends IHandler{
	
	public BasicHandler(IHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handle(ISupportIssue issue) {
		if(issue.getDifficultLevel() <= 1)
		{
			System.out.println("Basic issue: " + issue.getDescription());
		}
		else
		{
			if(nextHandler != null)
			{
				nextHandler.handle(issue);
			}
		}
		
	}
}
