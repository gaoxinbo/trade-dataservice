#!/bin/bash


VIRTUAL_ENV_BASE="venv_dataprovider"


if [ ! -d $VIRTUAL_ENV_BASE ]; then 
  virtualenv $VIRTUAL_ENV_BASE 
  . $VIRTUAL_ENV_BASE/bin/activate
fi


pip install Flask
pip install gunicorn
