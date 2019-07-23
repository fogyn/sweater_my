package com.example.sweater.controller.web;

import com.example.sweater.db.DataBase;
import com.example.sweater.model.Business;
import com.example.sweater.servise.BusinessService;
import org.omg.CORBA.Request;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping
public class JspController {
    private BusinessService businessService;

    public JspController(BusinessService businessService) {

        this.businessService = businessService;
    }


    @GetMapping(value = {"/welcome"})
    public String getIndex(Map<String, Object> model) throws SQLException, ClassNotFoundException {

        model.put("name", "You get on page Notebook!!!");
        return "index";
    }

    @GetMapping(value = {"/sbor", "/pagination"})
    public String getPagination(Map<String, Object> model, @RequestParam("pageId") int id) throws SQLException, ClassNotFoundException {
        //int id = Integer.parseInt(idd);
        Collection<Business> collection = businessService.getBusiness();
        ArrayList<Business> bis = new ArrayList<>();

        Iterator<Business> iter = collection.iterator();
        while(iter.hasNext()){

            bis.add(iter.next());
        }


        int element = collection.size();
        ArrayList<Business> list = new ArrayList<>();
        if(10*id<element){
            for(int i = 10*id-10; i<id*10; i++){
                list.add(bis.get(i));
            }
        }
        else{
            for(int i = 10*id-10; i<collection.size(); i++){
                list.add(bis.get(i));
                }
        }

        int page;
        if(element % 10 == 0){
            page = element/10;
        }
        else{
            page = element/10+1;
        }
        ArrayList<Integer> pageAll = new ArrayList<Integer>();
        for(int i = 0; i < page; i++){
            pageAll.add(i+1);
        }


        model.put("page", pageAll);
        model.put("numberpage", id);
        model.put("list", list);

        return "/jsp/sbor2";
    }

}
