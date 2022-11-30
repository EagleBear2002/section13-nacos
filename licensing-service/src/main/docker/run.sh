#!/bin/sh
echo "********************************************************"
echo "Waiting for the database server to start on port $DATABASESERVER_PORT"
echo "********************************************************"
while ! `nc -z database $DATABASESERVER_PORT`; do sleep 3; done
echo "******** Database Server has started "

echo "********************************************************"
echo "Starting License Server";
echo "********************************************************"
java -Dspring.profiles.active=$PROFILE -jar /usr/local/licensingservice/@project.build.finalName@.jar
