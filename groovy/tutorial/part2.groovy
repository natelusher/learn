square = {it * it}

println square(9)

squares = [1,2,3,4,5].collect(square)
println squares[4]

printItem = {println "$it"}

printMapClosure = { key, value -> println key + "=" + value }
[ "Yue" : "Wu", "Mark" : "Williams", "sudha" : "Kumari" ].each(printMapClosure)

//read a file - note this only works if run from the same dir as the script
baseDir = new File(".").getCanonicalPath()
//this is better, but still seems kind of... nuts.  shouldn't this be more...baked in?
scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
myFile = new File(scriptDir, "resources/text.txt");
myFile.eachLine(printItem)


"05-21-2016".split("-").each(printItem)




