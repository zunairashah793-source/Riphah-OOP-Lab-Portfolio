# Lab 08 — Polymorphism

Implements the three tasks:

1. **Hospital Appointments (overloading):** the `Hospital` class has three `book()` methods with different parameter lists.
2. **Ride Fare Calculator (overriding):** `Bike`, `Car` and `Rickshaw` override `calculateFare(int km)`. A `Ride[]` array stores the objects and invokes the correct implementation for 10 km.
3. **University Fee with Scholarship (overloading + overriding):** `Fee` overloads `calculate()`. `ScholarshipFee` overrides only the one-parameter method to apply the default 20% scholarship. The two-parameter custom-discount method remains inherited.

## Expected calculations
- Bike: 10 × Rs. 20 = Rs. 200
- Car: 10 × Rs. 40 = Rs. 400
- Rickshaw: 10 × Rs. 30 = Rs. 300
- Regular tuition: Rs. 50,000
- Regular tuition with 10% discount: Rs. 45,000
- Scholarship tuition with default 20% discount: Rs. 40,000
- Scholarship tuition with custom 10% discount: Rs. 45,000

## Run
Compile each task program independently with `javac` and run its matching class name.
