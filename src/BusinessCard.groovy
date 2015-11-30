import groovy.xml.MarkupBuilder

/**
 * Created by gifarikautsar on 11/30/15.
 */
class BusinessCard {
    String namaPemilik
    String jabatan
    String email
    String noHandphone
    String namaPerusahaan
    String webPerusahaan
    String facebookUsername
    String twitterUsername
    String linkedIn

    def static make(closure) {
        BusinessCard businessCard = new BusinessCard()
        // any method called in closure will be delegated to the memoDsl class
        closure.delegate = businessCard
        closure()
    }

    void hello(){
        println("Hello, World")
    }

    def namaPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik
    }
    def jabatan(String jabatan){
        this.jabatan = jabatan
    }
    def email(String email){
        this.email = email
    }
    def noHandphone(String noHandphone){
        this.noHandphone = noHandphone
    }
    def namaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan
    }
    def webPerusahaan(String webPerusahaan){
        this.webPerusahaan = webPerusahaan
    }
    def facebookUsername(String facebookUsername){
        this.facebookUsername = facebookUsername
    }
    def twitterUsername(String twitterUsername){
        this.twitterUsername = twitterUsername
    }
    def linkedIn(String linkedIn){
        this.linkedIn = linkedIn
    }

    def getHtml() {
        doHtml(this)
    }

    private static doHtml(BusinessCard businessCard) {
        def writer = new StringWriter()
        def xml = new MarkupBuilder(writer)
        xml.html(lang:"en") {
            head{
                meta (charset:"utf-8")
                meta (name:" viewport; content: width= device-width; initial-scale: 1.0")
            }
            p("Nama: ${businessCard.namaPemilik}")
            p("Jabatan: ${businessCard.jabatan}")
            p("Email: ${businessCard.email}")
            p("No. Handphone: ${businessCard.noHandphone}")
            p("Nama Perusahaan: ${businessCard.namaPerusahaan}")
            p("Web Perusahaan: ${businessCard.webPerusahaan}")
            p("Facebook: ${businessCard.facebookUsername}")
            p("Twitter: ${businessCard.twitterUsername}")
            p("LinkedIn: ${businessCard.linkedIn}")

        }
        println writer
    }
}

