#!/bin/bash


build() {
  echo "update && build"
  git pull && mvn clean package
  echo "build success"
}

stop_tomcat() {
  echo "stop tomcat"
  $TOMCAT_DIR/bin/shutdown.sh
}

backup() {

  echo "backup war"
  day=`date +"%Y-%m-%d"`
  timestamp=`date +%s`
  backup="$TOMCAT_DIR/backup/$day/$timestamp"
  mkdir -p $backup

  mv $TOMCAT_DIR/webapps/dataservice.war $backup/
  rm -rf $TOMCAT_DIR/webapps/dataservice

}

copy() {
  echo "copy war"
  cp dataservice/target/dataservice.war $TOMCAT_DIR/webapps/
}

start_tomcat() {
  echo "restart tomcat"
  $TOMCAT_DIR/bin/startup.sh
}



CURRENT=$0


cd `dirname $CURRENT`
CURRENT=`pwd`
echo "current dir : $CURRENT"

. $CURRENT/env.sh

cd $CODE_DIR

build && stop_tomcat && backup && copy && start_tomcat



