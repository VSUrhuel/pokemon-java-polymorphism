public class LearnedMoveRooster
{
	private Move[] moves;

	public LearnedMoveRooster()
	{
		this.moves = new Move[100];
	}
	public void addMove(Move move, int level)
	{
		if(level < 1 || level > this.moves.length)
			return;
		this.moves[level-1] = move;
	}
	public void removeMove(int level)
	{
		if(level < 1 || level > this.moves.length)
			return;
		this.moves[level-1] = null;
	}
	public Move getMove(int level)
	{
		if(level < 1 || level > this.moves.length)
			return null;
		return this.moves[level-1];
	}
}