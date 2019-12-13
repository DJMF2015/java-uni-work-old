fixed = 10
balance = 3329
annual = 0.2
lower = balance / 12.0
upper = balance * (1 + annual / 12.0) ** 12 / 12
fixed = (lower + upper) / 2.0
 
while True:
    remain = balance
    for i in range(1, 13):
        remain = (remain - fixed) * (1 + annual / 12.0)
    if remain > 0:
        lower = fixed
    elif remain <= 0 and remain >= -0.01:
        break
    else:
        upper = fixed
    fixed = (lower + upper) / 2.0
    
print 'Lowest Payment:', round(fixed, 2)
 
