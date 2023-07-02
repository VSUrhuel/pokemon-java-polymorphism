public class Poison extends Status
{
	private int damageOverTime;

	public Poison(int damageOverTime)
	{
		super("Poison");
		this.damageOverTime = damageOverTime;
	}
	public int getDamageOverTime()
	{
		return this.damageOverTime;
	}
}