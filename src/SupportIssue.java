
public class SupportIssue implements ISupportIssue{
	private String description;
	private int difficultLevel;
	
	public SupportIssue(String desc, int lvl)
	{
		this.description = desc;
		this.difficultLevel = lvl;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public int getDifficultLevel() {
		return this.difficultLevel;
	}

}
