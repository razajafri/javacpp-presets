#!/bin/bash
export LD_LIBRARY_PATH=../cppbuild/linux-x86_64/lib
mvn clean compile exec:java
