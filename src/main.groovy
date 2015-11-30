/**
 * Created by gifarikautsar on 11/30/15.
 */

bc = new BusinessCard()
md = new MemoDsl()
bc.hello()
agi = "agilalala"
//mdt = new MemolDslTest()
//mdt.testDslUsage_outputHtml()
BusinessCard.make {
    namaPemilik "agi"
    jabatan "mahasiswa"
    email "a@a.com"
    noHandphone "09182"
    namaPerusahaan "ITB"
    webPerusahaan "itb.ac.id"
    facebookUsername "agilalala"
    twitterUsername "lalalaagi"
    linkedIn "agiagi"
    html
}