# corejava-mortgage-calculator
First core java project of htoor01

Basic calculator using input from terminal by user. <br />
Input the principal, the montly interest rate, and the number of payments. <br />
Program will calculate based on these values what your mortgage payment will be.

Using following formula: <br />
mortgage = principal * (numerator/denominator) <br />
numerator = ( interestRate ( 1 + interestRate ) ) ^ numberOfPayments <br />
denominator = ( ( 1 + interestRate ) ^ numberOfPayments ) - 1

Example:
Principal: 100000
Interest Rate: 3.92
Period (Years): 30
Mortgage: $472.81
