package com.example.sweater.db;

import com.example.sweater.model.Business;
import com.mysql.jdbc.Blob;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

@Repository
public class DataBase implements SweaterRepository{

    private static final String SELECT_BUSINESS = "SELECT * FROM Business";
    private static final String SELECT_BUSINESS_BY_ID = "SELECT * FROM Business WHERE testid = ?";

    private String value;

    private JdbcTemplate jdbcTemplate;
    private static com.mysql.jdbc.Connection connection;

    public DataBase(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public DataBase(){
//
//    }

    @Override
    public Collection<Business> getBusiness() {
        return jdbcTemplate.query(SELECT_BUSINESS, CUSTOMER_MAPPER);

    }

    @Override
    public Business getBusiness(int id) {
        Object[] arguments = new Object[]{id};
        return jdbcTemplate.queryForObject(SELECT_BUSINESS_BY_ID, arguments, CUSTOMER_MAPPER);

    }

    private RowMapper<Business> CUSTOMER_MAPPER = (resultSet, i) -> {
        Business business = new Business();
        business.setTitle(resultSet.getString("Title"));
        business.setAbout(resultSet.getString("About"));
        byte[] im = resultSet.getBytes("Image");
        business.setImage(im);

        return business;
    };

    @Override
    public Business getBusinessTest(int id) throws SQLException, ClassNotFoundException {
//        Business testImage = new Business();
//
//        connection = BasaTest.getC();
//        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BUSINESS_BY_ID);
//
//        // Для тестирования вызываем только первую стороку
//
//        preparedStatement.setInt(1, id);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while(resultSet.next()){
//            testImage.setTitle(resultSet.getString("Title"));
//            testImage.setAbout(resultSet.getString("About"));
//            testImage.setImage((Blob) resultSet.getBlob("Image"));
//
//        }
//        connection.close();
//
        return null;

    }


}
