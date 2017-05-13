import os
import sys


path = ["decorator"]

for p in path:
  sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '..', p)))


import response_decorator 
