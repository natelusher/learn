class TheClass {
	void goodbye() {
		println "goodbye"
	}
	TheClass hello() {
		println "Hello world"
		return this
	}
}

class TheExtendedClass extends TheClass {
	TheClass hello() {
		println "Hello cruel world"
		return this
	}
}

new TheClass().hello().goodbye()

new TheExtendedClass().hello().goodbye()

// a function + closure to print a list (just to show both)
printIt = {println "$it"}
def theFunction(toPrint) {
	toPrint.each(printIt)
}
//print args passed in
theFunction(this.args)