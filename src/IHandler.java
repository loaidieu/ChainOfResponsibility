
public abstract class IHandler {
	protected IHandler nextHandler;
	
	public IHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	
	public abstract void handle(ISupportIssue issue);
}
