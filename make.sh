#!/bin/bash
# Simple make script for the MyBooz project
# copyright SJ Hindmarch 2015

CLASSPATH=/usr/share/java/junit.jar:test:src
export CLASSPATH

javac src/com/github/hindmasj/mybooz/BoozDose.java && \
javac test/com/github/hindmasj/mybooz/TestBoozDose.java && \
javac test/com/github/hindmasj/mybooz/TestSuite.java && \
java org.junit.runner.JUnitCore com.github.hindmasj.mybooz.TestSuite
