package com.example.dictionary.utils;


import android.net.http.HttpResponseCache;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Text {
//    public String getReturnData(String urlString) {
//        StringBuilder res = new StringBuilder();
//        try {
//            URL url = new URL(urlString);
//            java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url
//                    .openConnection();
//            conn.setDoOutput(true);
//            conn.setRequestMethod("POST");
//            java.io.BufferedReader in = new java.io.BufferedReader(
//                    new java.io.InputStreamReader(conn.getInputStream(),
//                            StandardCharsets.UTF_8));
//            String line;
//            while ((line = in.readLine()) != null) {
//                res.append(line).append(" ");
//            }
//            in.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return res.toString();
//    }
    private void  send(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    String path="https://github.com/007rf/dingfan/blob/master/%E9%AB%98%E8%80%83%E8%AF%8D%E6%B1%87%E2%80%94%E2%80%94%E5%8F%AA%E6%9C%89%E5%8D%95%E8%AF%8D.txt";
                    URL url = new URL(path);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.connect();
                    int responseCode=connection.getResponseCode();
                    if(responseCode == HttpURLConnection.HTTP_OK){
                        //得到响应流
                        InputStream inputStream = connection.getInputStream();
                        //将响应流转换成字符串
                        BufferedReader reader =new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder response = new StringBuilder();
                        String line;
                        while((line=reader.readLine())!=null){
                            response.append(line).append(" ");
                        }
                       System.out.println(response);
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e ) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args){
        Text text=new Text();
        text.send();
    }

}
