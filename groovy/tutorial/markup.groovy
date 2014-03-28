def sb = new StringWriter()
def html = new groovy.xml.MarkupBuilder(sb)
 
html.doubleQuotes = true
html.expandEmptyElements = true
html.omitEmptyAttributes = false
html.omitNullAttributes = false
html.html {
    head {
        title ('Heading')
        script (src: 'test.js', type: 'text/javascript')
    }
    body {
        mkp.yieldUnescaped('<!--')
        mkp.yield('<test>')
        mkp.yieldUnescaped('-->')
 
        ul {
            for (i in 1..10) {
                li (i)
            }
        }
    }
}
println sb