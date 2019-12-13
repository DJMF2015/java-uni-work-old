print 'hello world'
print 'I like 6.00.1x!'
name = raw_input ('Enter your name, please')
print ('Are you' + name + '?')
import dis

def sum():
   vara = 10
   varb = 20

   sum = vara + varb
   print "vara + varb = %d" % sum

# Call dis function for the function.

dis.dis(sum)

