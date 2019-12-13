balance = 4473
annualInterestRate = 0.2

monthlyInterestRate = annualInterestRate / 12

minimum = balance / 12
maximum = (balance * (1 + monthlyInterestRate)**12) / 12.0

guessMinimum = (minimum + maximum)/2

remain = balance #if you payed nothin, the remain is the balance!!!!

precision = 0.05 #you choose....

while (remain >= precision):

    guessMinimum = (minimum + maximum)/2


    for i in range (1,13):

        newBalance = remain - guessMinimum
        monthInterest = annualInterestRate/12*newBalance
        remain = newBalance+monthInterest

    # after one month, the CODE need to check about the remain

    if (remain < 0): #paying too much.... need to decrease the value

        maximum = guessMinimum      #remember my beautiful draw above!!
        remain = balance  # reset the remain to start again!!

    elif (remain > precision): #paying less .... need to increase the value
        minimum = guessMinimum
        remain = balance  # reset the remain to start again!!   

print "Lowest Payment: %.2f" %(guessMinimum)