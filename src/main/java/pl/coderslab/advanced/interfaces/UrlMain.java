package pl.coderslab.advanced.interfaces;

public class UrlMain {
    public static void main(String[] args) {
        Url url = new StandardUrl();

        String paramValue = url.getParam("_from","https://www.ebay.com/sch/i.html?_nkw=winter+clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313");
        System.out.println(paramValue);

        url = new ExtendedUrl();
        paramValue = url.getParam("param1","url_example/param1.55/param2.byte");
        System.out.println(paramValue);

    }
}
