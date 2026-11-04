# Lab 05 — Operators, Control Structures and `toString()`

Three tasks transcribed from pages 69–70 of the manual.

## Tasks

1. **Cinema Ticket Counter:** `CinemaHall` uses `++` to book and `--` to cancel seats, with checks to keep bookings between zero and capacity. The main method books five and cancels two.
2. **Utility Bill Category:** `UtilityBill` classifies consumption into Lifeline (<100), Slab-1 (100–200), Slab-2 (201–300), Slab-3 (301–700) and Slab-4 (>700), then prints an approximate bill. Five objects cover all five categories.
3. **Bank Account Summary:** `BankAccount` overrides `toString()` and two objects are printed directly with `System.out.println()`.

## Rate assumption for Task 2
The manual explicitly permits choosing reasonable rates and does not prescribe exact amounts. This implementation uses illustrative rates: Lifeline Rs. 5/unit, Slab-1 Rs. 10/unit, Slab-2 Rs. 15/unit, Slab-3 Rs. 20/unit and Slab-4 Rs. 25/unit. The approximate bill is units multiplied by the selected slab's rate; these are demonstration values, not an official tariff.

## Run
Compile and run each Java file separately. Example: `javac CinemaTicketCounter.java` then `java CinemaTicketCounter`.
