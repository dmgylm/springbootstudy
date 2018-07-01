package com.example.demo.dao.dbb;

import com.example.demo.dto.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24 0024.
 */
public interface CityDao {

    public List<City> showCityList();
}
