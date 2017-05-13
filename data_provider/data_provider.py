#!/usr/bin/env python
# coding = UTF8


from flask import Flask


app = Flask(__name__)


@app.route("/hello")
def helo():  
  return "hello"


