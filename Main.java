import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Move[] charMoves = new Move[5];
		
		charMoves[0] = new PureDamageMove("Scratch", 35, 40, 1);
		charMoves[1] = new PureDamageMove("Dragon Claw", 15, 80, 1);
		charMoves[2] = new InflictStatusMove("Thunder Wave", 20, new Paralyze(2), 0.9);
		charMoves[3] = new PureDamageMove("Inferno", 5, 100, 0.5);x
		charMoves[4] = new InflictStatusMove("Poison Powder", 35, new Poison(1), 0.75);

		LearnedMoveRooster rooster = new LearnedMoveRooster();
		rooster.addMove(charMoves[4], 5);
		rooster.addMove(charMoves[2], 10);
		rooster.addMove(charMoves[3], 75);

		Pokemon charizard = new Pokemon("Charizard", 360, charMoves[0], charMoves[1], charMoves[2], null, rooster);
		System.out.println(charizard);
		(charizard.getCurrentMoves()[0]).executeMove(charizard);
		System.out.println(charizard);
	}
}