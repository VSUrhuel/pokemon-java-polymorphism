import java.util.*;
public class PureDamageMove extends Move
{
	private int damage;
	private double hitChance;

	public PureDamageMove(String name, int maxPowerPoint, int damage, double hitChance)
	{
		super(name, maxPowerPoint);
		this.damage = damage;
		this.hitChance = hitChance;
	}
	public int getDamage()
	{
		return this.damage;
	}
	public double getHitChance()
	{
		return this.hitChance;
	}
	@Override
	public boolean executeMove(Pokemon pokemon)
	{
		if(!super.executeMove(pokemon))
			return false;
		Random r = new Random();
		if(r.nextDouble() > this.hitChance)
			return false;

		pokemon.inflictDamage(this.damage);
		super.powerPoint--;
		return true;
	}
}