public abstract class Move
{
	private String name;
	protected int powerPoint;
	private int maxPowerPoint;

	public Move(String name, int maxPowerPoint)
	{
		this.name = name;
		this.maxPowerPoint = maxPowerPoint;
	}
	public String getName()
	{
		return this.name;
	}
	public int getPowerPoint()
	{
		return this.powerPoint;
	}
	public int getMaxPowerPoint()
	{
		return this.maxPowerPoint;
	}
	public boolean executeMove(Pokemon pokemon)
	{
		return this.powerPoint > 0;
	}
	@Override
	public String toString()
	{
		return this.name + "[" + this.powerPoint + "/" + this.maxPowerPoint + "]";
	}
}