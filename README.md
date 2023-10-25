[![Java CI with Gradle](https://github.com/4rr0wx/Schiffswert-Tycoon/actions/workflows/gradle.yml/badge.svg)](https://github.com/4rr0wx/Schiffswert-Tycoon/actions/workflows/gradle.yml)

Shipyard Strategy Game (German Language)

This is a text-based strategy game in Java where you manage a shipyard and aim to maximize your cash balance by building, operating, and maintaining ships.


> [!WARNING]
> Please note: This game is in the German language.

# Game Description

You are the manager of a ship company with your own shipyard. In your company, you own ships that generate profits as long as they are in good condition. Your task is to build ships, operate them, and perform maintenance to avoid losses.
## Types of Ships and Costs

    Cargo ships cost 30 million EUR to build.
    Tankers cost 70 million EUR.
    Passenger ships cost 150 million EUR.

## Monthly Income

    Cargo ships bring in 0.2 million EUR per month.
    Tankers bring in 0.5 million EUR per month.
    Passenger ships bring in 1 million EUR per month.

## Ship Maintenance

Each ship rusts during operation. The rust factor is 0.92 per month. A ship sinks when less than 25% of the hull is intact. Salvage costs for a sinking ship are five times the ship's original price.

To avoid losses, you can:

    Scrap the ship (costs 10% of the ship's price).
    Repaint the ship (cost varies by ship type and the number of repaints).

## Game Rules

The game begins with 500 million EUR in the shipyard's cash. Every month, operational ships generate profits for the cash. If a ship sinks, salvage costs are deducted.

Each month, you can decide whether to:

    Build a cargo ship.
    Build a tanker.
    Build a passenger ship.
    Repaint a specific ship.
    Scrap a ship.
    Do nothing.

The game ends when the cash balance becomes negative.

Your goal is to maximize the cash balance.
