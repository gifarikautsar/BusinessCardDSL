import groovy.xml.MarkupBuilder

/**
 * Created by gifarikautsar on 11/30/15.
 */
class BusinessCard {
    void hello(){
        println("Hello, World")
    }

    private static doHtml(BusinessCard businessCard) {
        def writer = new StringWriter()
        def xml = new MarkupBuilder(writer)
        xml.html() {

        }
        println writer
    }
}

