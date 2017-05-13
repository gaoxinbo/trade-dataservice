#!/usr/bin/env python
# coding = UTF8


from flask import Flask
from decorator import response_decorator

app = Flask(__name__)

@response_decorator.return_json
def handler():
  return "hello"

@app.route("/hello")
def helo():  
  return handler()


