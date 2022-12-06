#!/bin/env bash

javac -classpath app/src/main/java/ app/src/main/java/com/craftinginterpreters/tool/GenerateAst.java
java -classpath app/src/main/java/ com.craftinginterpreters.tool.GenerateAst app/src/main/java/com/craftinginterpreters/lox/