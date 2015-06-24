package com.auto.monitoring;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;

public class Hello {
    public static void main(String[] args) throws IOException {
         WebClient webClient = new WebClient();
        webClient.setCssEnabled(false);
        webClient.setJavaScriptEnabled(false);
            final HtmlPage page = webClient.getPage("http://rst.ua/oldcars/mazda/");
        System.out.println(page.getHtmlElementById("rst-ocid-4449245").getId());
        page.getElementsByName("rst-ocb-i rst-ocb-i-premium rst-uix-radius");
        }


    }
