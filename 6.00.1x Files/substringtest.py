s = 'jngksasAzkaesdasdasdafbgsdsijdhASasASggb'
dummy = final = s[0]
for i in range(1, len(s)):
    if s[i] >= dummy[-1]:
        dummy += s[i]
        if len(dummy) > len(final):
            final = dummy
    else:
        dummy = s[i]
 
print 'Longest substring in alphabetical order is:', final
 
