package com.example.jsouporiginal;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AsyncWork extends AsyncTask<Void, Void, String> {
    private String webValues;

    @Override
    protected String doInBackground(Void... params) {
        //webValues ="";
        Document doc;
        try {
            doc = Jsoup.connect("https://2chmm.com/").get();
            //Element title = doc.getElementById("href");
            //Elements title = doc.getElementsByClass("entry");
            Elements titleurl = doc.getElementsByAttribute("herf");
            webValues = titleurl.text();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return webValues;
    }
    @Override
    protected void onPostExecute(String result) {
        MainActivity.setValues(webValues);
    }
}