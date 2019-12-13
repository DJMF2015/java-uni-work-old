def sharp(x):  
    if x > 2:
        return sharp(x-1)
        
def num_digits ():
    print (' 7!'), sharp (7)
    print (' 6!'), sharp (6)
    print (' 5!'), sharp (5)
    print (' 4!'), sharp (4)

num_digits()