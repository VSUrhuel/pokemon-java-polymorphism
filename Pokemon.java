import java.util.*;
public class Pokemon
{
	private LearnedMoveRooster movelist;
	private Move[] currentMoves;
	private ArrayList<Status> statuses;
	private String name;
	private int maxHP;
	private int hp;
	private int level;

	public Pokemon(String name, int maxHP, Move defaultMove1, Move defaultMove2, Move defaultMove3, Move defaultMove4, LearnedMoveRooster rooster)
	{
		this.name = name;
		this.maxHP = this.maxHP = (maxHP < 0)? 0 : maxHP;
		this.level = 1;
		this.statuses = new ArrayList<>();
		this.currentMoves = new Move[4];
		this.currentMoves[0] = defaultMove1;
		this.currentMoves[1] = defaultMove2;
		this.currentMoves[2] = defaultMove3;
		this.currentMoves[3] = defaultMove4;
		this.movelist = rooster;
	}
	public String getName()
	{
		return this.name;
	}
	public int getMaxHP()
	{
		return this.maxHP;
	}
	public int getHP()
	{
		return this.hp;
	}
	public Move[] getCurrentMoves()
	{
		return this.currentMoves;
	}
	public void inflictDamage(int damage)
	{
		if(damage < 0)
			return;
		this.hp = (damage >= this.hp) ? 0 : this.hp - damage;
	}
	public boolean isFainted()
	{
		if(this.hp <= 0)
			return true;
		return false;
	}
	public void addStatus(Status status)
	{
		this.statuses.add(status);
	}
	public void levelUp(int moveNumberToReplace, boolean replace)
	{
		this.level++;
		if(moveNumberToReplace < 1 || moveNumberToReplace > 4 || !replace)
			return;
		Move m = this.movelist.getMove(this.level);
		if(m != null)
			this.currentMoves[moveNumberToReplace-1] = m;
	}
	@Override
	public String toString()
	{
		String result = "";

		result += this.name + "[" + this.hp + "/" +this.maxHP+ "] Lv. " +this.level+ "\n";
		result += "Moves:\n";
		for(Move m : this.currentMoves)
		{
			if(m != null)
			{
				result += m + "\n";
			}
		}
		if(this.statuses.size() > 0)
		{
			for(Status s : statuses)
			{
				result += s + "\n";
			}
		}
		return result;
	} 
}
