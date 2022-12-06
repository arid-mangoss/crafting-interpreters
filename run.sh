#! /bin/env bash

javac -classpath app/src/main/java/ app/src/main/java/com/craftinginterpreters/lox/Lox.java
java -classpath app/src/main/java/ com.craftinginterpreters.lox.Lox