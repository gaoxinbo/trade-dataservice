#!/bin/bash


VIRTUAL_ENV_BASE="venv"


if [ ! -d $VIRTUAL_ENV_BASE ]; then 
  virtualenv $VIRTUAL_ENV_BASE 
  . $VIRTUAL_ENV_BASE/bin/activate
  pip install Flask
fi

#virtualenv venv

