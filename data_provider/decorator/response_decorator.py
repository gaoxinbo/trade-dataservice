#!/usr/bin/env python

import json

def return_json(func):
  def wrapper(*args, **kw):
    result = {}
    result['errorMsg'] = None 
    result['retCode'] = 0 
    result['result'] = None 

    try:
      ret = func(*args, **kw)
      result['result'] = ret
    except BaseException, e:
      result['retCode'] = 1
      result['errorMsg'] = str(e)
    return json.dumps(result) 
  return wrapper



@return_json
def f():
  raise IOError("test")


if __name__ == '__main__':
  print f()
