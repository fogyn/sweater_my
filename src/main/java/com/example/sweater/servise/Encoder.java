package com.example.sweater.servise;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.omg.CORBA.Request;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class Encoder {

    public void getEncoder() throws SQLException {
        Request request = null;
        ResultSet resultSet = null;
        while(resultSet.next){
            Blob img = resultSet.getBlob("Image");


            byte[] imgData = img.getBytes(1, (int) img.length());
            String encoder = Base64.getEncoder().encodeToString(imgData);
            request.setAttribute("imgBase", encoder);
        }
    }
}
