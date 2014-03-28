println "potato" ==~ /potatoe/
println "potato" ==~ /potato/
println "potato" ==~ /potatoe?/
println "apotato" ==~ /potatoe?/

theRegex = /taco[sS]?/

println "taco" ==~ theRegex
println "tacoS" ==~ theRegex

checkIt = {it -> it ==~ theRegex}
printIt={println it}
println "\nLet's see..."
["dog", "taco", "tacos", "tacos"].collect(checkIt).each(printIt)

println "\nBut what about extracting data from a string using regex"
data = "test:This is a test 1234 1.2.3.4"

// swap all the digits for 7's
swapRegex = /[0-9]/
swapMatcher = (data =~ swapRegex)
data = swapMatcher.replaceAll("7")

// parse out the first few text fields and print 'em
parseRegx = /([a-zA-Z]+):([a-zA-Z]*) ([a-zA-Z]*) ([a-zA-Z]*) ([a-zA-Z]*) .*/
matcher = ( data =~ parseRegx)
if(matcher.matches()) {
	println "Huh, it matched..." + matcher.getCount();
	matcher[0].each(printIt)
}

