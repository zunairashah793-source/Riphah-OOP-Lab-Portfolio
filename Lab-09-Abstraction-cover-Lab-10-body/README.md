# Abstraction — Lab 9

## Task 1 — Transport abstract class
- Abstract class `Transport` declares abstract `move()`.
- Concrete `fuelType()` prints the exact message required by the manual.
- `Train` and `Airplane` extend Transport and implement `move()`.
- Main uses Transport references for both objects to demonstrate runtime polymorphism.

## Task 2 — PaymentGateway interface
- Interface declares `makePayment(double amount)`.
- `CreditCardPayment`, `PayPalPayment` and `UPIPayment` implement the interface.
- Main stores all three in `PaymentGateway[]` and calls the method polymorphically.

## Run
Compile and run each task separately. These are demonstration programs only; they do not process real payments.
