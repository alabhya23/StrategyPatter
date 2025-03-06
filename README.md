# Strategy Pattern - Duck Behavior

## Overview
This project demonstrates the Strategy Pattern using Duck behaviors.

## Classes & Interfaces
- `Duck.java`: Abstract class for all ducks.
- `FlyBehavior.java`: Interface for flying behavior.
- `SwimBehavior.java`: Interface for swimming behavior.
- `Fly.java`: Implements `FlyBehavior` for flying ducks.
- `NotFly.java`: Implements `FlyBehavior` for non-flying ducks.
- `Swim.java`: Implements `SwimBehavior` for ducks that swim.
- `Float.java`: Implements `SwimBehavior` for ducks that float.
- `Drown.java`: Implements `SwimBehavior` for ducks that drown.
- `MallardDuck.java`, `RedheadDuck.java`, `RubberDuck.java`, `DecoyDuck.java`: Concrete duck classes.

## How to Run
1. Clone the repository:
