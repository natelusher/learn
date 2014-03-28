i=5
while(i-- > 0) {
	println i
}

println "-----"

for(i in 0..9) {
	println i
}

strArr = ["one", "two", "three", "four"]

println "-----"
strArr.each({item -> println "${item}"})

println "-----"
for(s in strArr) {
	println s
}

