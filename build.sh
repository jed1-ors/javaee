#!/bin/bash

TOMEE_HOME=/home/user/Downloads/apache-tomee-plume-9.0.0-M7

$TOMEE_HOME/bin/shutdown.sh || true
rm $TOMEE_HOME/webapps/j2ee-pdp-1.0.* || true
rm -rf $TOMEE_HOME/webapps/j2ee-pdp-1.0 || true

rm -rf $TOMEE_HOME/logs/*.* || true

cp /home/user/IdeaProjects/j2ee-pdp/target/j2ee-pdp.jar $TOMEE_HOME/webapps/ || true
cp /home/user/IdeaProjects/j2ee-pdp/target/j2ee-pdp.war $TOMEE_HOME/webapps/ || true

$TOMEE_HOME/bin/startup.sh || true
ls -l $TOMEE_HOME/webapps
tail -f $TOMEE_HOME/logs/catalina.out
