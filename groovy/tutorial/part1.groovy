x="me"
println x

x=123*8
println x

x=new java.util.Date()
println x 

x=false
println x


myList = [1,2,3,4,5,6]
println myList[3]

myList2=[]
myList2 << "4"
myList2 << "5"
myList2 << [6,7,8]
println myList2[1]
println myList2[2]
println myList2[2][0]

myMap = ["one":1, "two":2, "three":3]
println myMap.one
println myMap["two"]

myMap << ["seven":7]
println myMap["seven"]

i=9
if(i==9) {
	println "It is nine"
} else {
	println "It is not nine"
}