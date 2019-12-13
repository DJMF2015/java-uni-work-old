

balance = 4213
annualRate = 0.20

monthlyPayment = 0.04
total = 0
for month in range(1,13):

    minMonthlyPayment = monthlyPayment * balance

    unpaid = balance - (balance*monthlyPayment)

    balance = unpaid + ((annualRate/12)*unpaid)

    total = total + minMonthlyPayment
    print "Month: " + str(month)
    print "Minimum monthly payment: " + str(round(minMonthlyPayment, 2))
    print "Remaining balance: " + str(round(balance, 2))
print "Total paid: " + str(round(total, 2))
print "Remaining balance: " + str(round(balance, 2))

