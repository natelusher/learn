
println "he said 'hi' twice"

one="ones"
println "test " + one + " two"

def aLongerOne = """\
Hello, is your NCAA bracket busted yet?
Mine isn't too bad.  I've had worse years

Best to you and yours
"""
println aLongerOne

myName = "nate"
println "This is a test $myName and this is my name in upper case ${myName.toUpperCase()}"

// don't forget that gstrings evaluate on toString
println new Date()
def dstr = "The date is ${new Date()}"
def dstr2 = "The other date is ${ writer -> writer << new Date() }"
//sleep 5000
println dstr
println dstr2

def deep = {->"deep"}
def deeper = { out -> println "run w/ ${out.class}"; out << "a test"}
println "${deep}"
println "${deeper}"