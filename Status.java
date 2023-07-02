public abstract class Status
{
	private String name;

	public Status(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		return this.name;
	}
}