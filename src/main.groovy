/**
 * Created by gifarikautsar on 11/30/15.
 */

bc = new BusinessCard()
md = new MemoDsl()

//mdt = new MemolDslTest()
//mdt.testDslUsage_outputHtml()
MemoDsl.make {
    to "Nirav Assar"
    from "Barack Obama"
    body "How are things? We are doing well. Take care"
    idea "The economy is key"
    request "Please vote for me"
    html
}