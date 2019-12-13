# -*- coding: utf-8 -*-
"""
Created on Mon Jul 27 15:12:32 2015

@author: User
"""
import wakaridata.weather
from wakaridata.weather import Weather
weather = Weather()
# Get list of dataset keys
keys = weather.keys()
# Get IOPro text adapter
adapter = weather[keys[0]]
# Get NumPy array of all records
array = adapter[:]
print array
