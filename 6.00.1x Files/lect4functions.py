def foo(x):
   def bar(x):
      return x + 1
   return bar(x * 2)

foo(3)
