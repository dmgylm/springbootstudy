package com.example.demo.service;

import com.example.demo.dao.dbb.CityDao;
import com.example.demo.dto.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24 0024.
 */
@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    public List<City> showCityList(){
        return cityDao.showCityList();
    }

}
