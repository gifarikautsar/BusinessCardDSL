import groovy.xml.MarkupBuilder

/**
 * Created by gifarikautsar on 11/30/15.
 */
class BusinessCard {
    // attributes
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
                meta (name:" viewport", content:"width= device-width; initial-scale: 1.0")
                meta(name:"description", content:"")
                meta(name:"author", content:"")
                link (rel:"shortcut icon", href:"assets/ico/favicon.png")

                title("${businessCard.namaPemilik}")
                link(href:"assets/css/bootstrap.css", rel:"stylesheet")
                link(href:"assets/css/font-awesome.min.css", rel:"stylesheet")
                link(href:"assets/css/main.css", rel:"stylesheet")
                link(href:"http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic", rel:"stylesheet", type:"text/css")
                link(href:'http://fonts.googleapis.com/css?family=Raleway:400,300,700', rel:'stylesheet', type:'text/css')
            }
            body{
                div (class:"container"){
                    div (class:"col-lg-6 col-lg-offset-3"){
                        // Navigation
                        div (class:"row w"){
                            // Tab
                            div (class:"col-md-4"){
                                img class:"img-responsive", src:"assets/img/avatar.jpg", alt:""
                                ul (class:"nav nav-tabs nav-stacked", id:"myTab"){
                                    li (class:"active"){
                                        a href:"#about", "About"
                                    }
                                    li{
                                        a href:"#contact", "Contact"
                                    }
                                }
                            }
                            // Content
                            div (class:"col-md-8"){
                                div (class:"tab-content"){
                                    // First Tab
                                    div class:"tab-pane active", id:"about"
                                    h3 "Teresa Nirmala"
                                    h5 "Aero Engineer Wanna Be"
                                    hr{}
                                    br{}
                                    h2{
                                        center "Because Simplicity is The Ultimate Sophistication"
                                    }
                                    p (class:"pull-right red"){
                                        i class:"icon-heart"
                                    }
                                    // Fourth Tab
                                    div class:"tab-pane", id:"contact"
                                    h3 "Teresa Nirmala"
                                    h5 "Aero Engineer Wanna Be"
                                    hr{}
                                    br{}
                                    h2{
                                        center "Because Simplicity is The Ultimate Sophistication"
                                    }
                                    p (class:"pull-right red"){
                                        i class:"icon-heart"
                                    }
                                }
                            }
                        }
                    }
                }
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

