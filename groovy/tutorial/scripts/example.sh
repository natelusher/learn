#!/usr/bin/env groovy

line = System.console().readLine "What is your line? "
println "Hello World. Your line is $line"

printIt = {println "$it"}

this.args.each(printIt);

