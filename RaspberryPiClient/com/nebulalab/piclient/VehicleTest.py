'''
Created on Oct 24, 2013

@author: Sam
'''
import json

def add(a,b):
    return a+b

def addFixedValue(a):
    y = 5
    return y +a
 
print(add(1,2))

print(addFixedValue(1)) 

gpsDict = {}

gpsDict["time"] = "2013-10-24T04:03:24.000Z"
gpsDict["lat"] = 1.315025
gpsDict["lon"] = 103.866586667
gpsDict["alt"] = 8.9
gpsDict["speed"] = 0.622

jsonArray = json.dumps(gpsDict)

print(jsonArray)