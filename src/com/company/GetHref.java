package com.company;

import java.util.ArrayList;

public class GetHref{
    public String SourceSite="test";
    public int Count=0;
    public String site = "";
    public int hrefindex = 0;
    // dquot >> double quote
    public int dquotindex1 = 0;
    public int dquotindex2 = 0;
    public String hrefvalue="";
    ArrayList <String> SaveHref = new ArrayList<String>();

    public void Ghref(String input, String site){
        this.site=site;
        SourceSite = input;
    }

    public void SendHref() {
        boolean isCompleted=false;
        while (!isCompleted){
            hrefindex = SourceSite.indexOf("href",dquotindex2);
            if (hrefindex<0) {
                isCompleted=true;
            }else {
                dquotindex1 = SourceSite.indexOf("\"", hrefindex);
                dquotindex2 = SourceSite.indexOf("\"", dquotindex1 + 1);
                hrefvalue = SourceSite.substring(dquotindex1 + 1, dquotindex2 );
                SaveHref.add(hrefvalue);
                Count++;
            }
        }
        System.out.println((Count-1) + "href is found!");
        for (int i = 0; i < SaveHref.size(); i++){
            String startingPath = "";
            if (SaveHref.get(i).startsWith("/")) {
                startingPath=site;
            }
            System.out.println("href"+ i + "="+ startingPath + SaveHref.get(i) );
        }
    }
}
