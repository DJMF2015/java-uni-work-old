# -*- coding: utf-8 -*-
"""
Created on Tue Jul 28 17:58:54 2015

@author: User
"""
count = 0
while count < 99:
    count = count +1
    print count
    
   
colors = { "blue": (0x30,0x30,0xff), "green": (0x30,0xff,0x97),
"red": (0xff,0x30,0x97), "yellow": (0xff,0xff,0x30) }
for c in colors:
   print c, colors[c]