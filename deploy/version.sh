#!/bin/bash

CURRENT=`dirname $0`

cd $CURRENT

CURRENT=`pwd`

cd $CURRENT


HOST=`hostname`
TIMESTAMPE=`date +%s`
DATE=`date +%Y-%m-%d`


PROPERTIES="../dataservice/src/main/resources/build.properties"

>$PROPERTIES


echo "build_version=$TIMESTAMPE" >> $PROPERTIES
echo "build_date=$DATE"  >> $PROPERTIES
echo "build_host=$HOST" >> $PROPERTIES
