package com.example.sweater.db;

import com.example.sweater.model.Business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface SweaterRepository {

    Collection<Business> getBusiness();

    Business getBusiness(int id);
    Business getBusinessTest(int id) throws SQLException, ClassNotFoundException;
}
