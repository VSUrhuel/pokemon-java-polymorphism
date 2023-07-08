# Pokemon Game Repository

This repository contains a Java implementation of a Pokemon game. The game includes various classes that represent different aspects of the game, such as moves, statuses, and Pokemon.

Here is the *UMl Diagram* for a **Pokemon Game** provided by Sir Barera.

![Pokemon Game UML Diagram](https://photos.app.goo.gl/nWP8YuR65dCX2BHq6)


## Classes

### InflictStatusMove

**Description:** This class represents a move that can inflict a status on a Pokemon. It extends the `Move` class and adds an additional attribute for the status and probability of inflicting the status.

**Implementation Guide:** To use the `InflictStatusMove` class, create an instance of the class by providing the move's name, maximum power points, status, and probability of inflicting the status. The `executeMove()` method can be called to execute the move on a Pokemon. The `getProbability()` method can be used to retrieve the probability of inflicting the status.

**Override Snippet:**
```java
@Override
public boolean executeMove(Pokemon pokemon)
	{
		if (!super.executeMove(pokemon))
			return false;

		Random r = new Random();
		if (r.nextDouble() > this.probability)
			return false;

		pokemon.addStatus(this.status);
		super.powerPoint--;
		return true;
	}
```

### LearnedMoveRooster

**Description:** This class represents a collection of moves that a Pokemon can learn at different levels. It maintains an array of moves and provides methods to add, remove, and retrieve moves based on the level.

**Implementation Guide:** To use the `LearnedMoveRooster` class, create an instance of the class. You can then add moves to the rooster using the `addMove()` method by providing the move and the level at which the Pokemon learns the move. Use the `removeMove()` method to remove a move at a specific level. The `getMove()` method can be used to retrieve a move at a specific level.

### Move

**Description:** This abstract class represents a generic move that a Pokemon can perform. It includes attributes such as name, power points, and maximum power points. It also provides a method to execute the move and a `toString()` method for string representation.

**Implementation Guide:** To use the `Move` class, create a subclass that extends this class to define a specific move. In the subclass, implement the `executeMove()` method to define the behavior of the move. The `toString()` method can be overridden to provide a custom string representation of the move.

**Override Snippet:**
```java
@Override
public String toString()
	{
		return this.name + "[" + this.powerPoint + "/" + this.maxPowerPoint + "]";
	}
```

### Paralyze

**Description:** This class represents the "Paralyze" status that can be inflicted on a Pokemon. It extends the `Status` class and adds an additional attribute for the number of turns the status lasts.

**Implementation Guide:** To use the `Paralyze` class, create an instance of the class by providing the number of turns the status lasts. The `getName()` method can be used to retrieve the name of the status, and the `getNumberOfTurns()` method can be used to retrieve the number of turns the status lasts.

### Poison

**Description:** This class represents the "Poison" status that can be inflicted on a Pokemon. It extends the `Status` class and adds an additional attribute for the damage over time.

**Implementation Guide:** To use the `Poison` class, create an instance of the class by providing the damage over time. The `getName()` method can be used to retrieve the name of the status, and the `getDamageOverTime()` method can be used to retrieve the damage over time.

### Pokemon

**Description:** This class represents a Pokemon in the game. It includes attributes such as name, maximum HP, current HP, level, current moves, and statuses. It provides methods for various operations on a Pokemon, such as inflicting damage, checking if it is fainted, adding a status, and leveling up. It also overrides the `toString()` method for string representation.

**Implementation Guide:** To use the `Pokemon` class, create an instance of the class by providing the name, maximum HP, and default moves for the Pokemon. You can then use various methods to interact with the Pokemon, such as `inflictDamage()` to reduce its HP, `isFainted()` to check if it is fainted, `addStatus()` to add a status, and `levelUp()` to level up the Pokemon and potentially replace moves. The `toString()` method can be used to obtain a string representation of the Pokemon's details.

**Override Snippet:**
```java
@Override
public String toString() {
   	String result = "";

		result += this.name + "[" + this.hp + "/" + this.maxHP + "] Lv. " + this.level + "\n";
		result += "Moves:\n";
		for (Move m : this.currentMoves)
		{
			if (m != null)
			{
				result += m + "\n";
			}
		}
		if (this.statuses.size() > 0)
		{
			for (Status s : statuses)
			{
				result += s + "\n";
			}
		}
		return result;
}
```

### PureDamageMove

**Description:** This class represents a move that inflicts pure damage on a Pokemon. It extends the `Move` class and adds additional attributes for damage and hit chance.

**Implementation Guide:** To use the `PureDamageMove` class, create an instance of the class by providing the move's name, maximum power points, damage, and hit chance. The `executeMove()` method can be called to execute the move on a Pokemon. The `getDamage()` and `getHitChance()` methods can be used to retrieve the damage and hit chance of the move, respectively.

**Override Snippet:**
```java
@Override
public boolean executeMove(Pokemon pokemon)
	{
		if (!super.executeMove(pokemon))
			return false;

		Random r = new Random();
		if (r.nextDouble() > this.hitChance)
			return false;

		pokemon.inflictDamage(this.damage);
		super.powerPoint--;
		return true;
	}
```

### Status

**Description:** This abstract class represents a generic status that can affect a Pokemon. It includes an attribute for the status name and provides a `toString()` method for string representation.

**Implementation Guide:** To use the `Status` class, create a subclass that extends this class to define a specific status. In the subclass, you can provide additional attributes and methods as needed. The `toString()` method can be overridden to provide a custom string representation of the status.

## Credits

This Pokemon game repository is a Java implementation of a Pokemon game that demonstrates polymorphism in object-oriented programming. It was created by Sir Jomari Joseph Barera, an instructor at VSU, as an activity exercise.
