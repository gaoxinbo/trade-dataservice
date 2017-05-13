#!/usr/bin/env python


import unittest
import json
from response_decorator import return_json


msg = "hello"
error_msg = "error msg"

@return_json
def f():
  return msg 


@return_json
def e():
  raise Exception(error_msg)

class TestReturnJson(unittest.TestCase):

  def test_retcode_happy_case(self):
    d = json.loads(f())
    self.assertEqual(0, d['retCode'])
    

  def test_errormsg_happy_case(self):
    d = json.loads(f())
    self.assertEqual(None, d['errorMsg'])

  def test_result_happy_case(self):
    d = json.loads(f())
    self.assertEqual(msg, d['result'])
    

  def test_retcode_exception_case(self):
    d = json.loads(e())
    self.assertEqual(1, d['retCode'])

  def test_errormsg_exception_case(self):
    d = json.loads(e())
    self.assertEqual(error_msg, d['errorMsg'])

  def test_result_exception_case(self):
    d = json.loads(e())
    self.assertEqual(None, d['result']) 
