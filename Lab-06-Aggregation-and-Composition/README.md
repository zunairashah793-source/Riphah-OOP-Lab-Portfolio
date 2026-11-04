# Lab 06 — Aggregation and Composition

## Task 1 — Team and Player (Aggregation)
Players are created in `main()` and then passed into a Team. The Player objects are retained in separate variables outside the Team, demonstrating that they can exist independently. The Team stores references in an `ArrayList<Player>`.

## Task 2 — Car and Engine (Composition)
The Car creates its own Engine inside its constructor. The Engine is private to the Car and is used by `drive()`.

## Key difference
- **Aggregation:** weak has-a relationship; the part is created outside the whole and can exist independently.
- **Composition:** strong has-a relationship; the whole creates and owns the part internally.

Java uses garbage collection; setting `team = null` removes that one reference, not the Player objects that are still referenced by `player1`, `player2` and `player3`. The exercise demonstrates independent object lifetime conceptually, not a manual destructor.

## Run
Compile and run each task's Java source separately.
