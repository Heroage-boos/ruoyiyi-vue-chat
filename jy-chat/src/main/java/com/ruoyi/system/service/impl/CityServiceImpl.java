package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CityMapper;
import com.ruoyi.system.domain.City;
import com.ruoyi.system.service.ICityService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class CityServiceImpl implements ICityService 
{
    @Autowired
    private CityMapper cityMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param cId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */

    @DataSource(value = DataSourceType.SLAVE)
    @Override
    public City selectCityByCId(Long cId)
    {
        return cityMapper.selectCityByCId(cId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param city 【请填写功能名称】
     * @return 【请填写功能名称】
     */

    @DataSource(value = DataSourceType.SLAVE)
    @Override
    public List<City> selectCityList(City city)
    {
        return cityMapper.selectCityList(city);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param city 【请填写功能名称】
     * @return 结果
     */

    @DataSource(value = DataSourceType.SLAVE)
    @Override
    public int insertCity(City city)
    {
        return cityMapper.insertCity(city);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param city 【请填写功能名称】
     * @return 结果
     */

    @DataSource(value = DataSourceType.SLAVE)
    @Override
    public int updateCity(City city)
    {
        return cityMapper.updateCity(city);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param cIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */

    @DataSource(value = DataSourceType.SLAVE)
    @Override
    public int deleteCityByCIds(Long[] cIds)
    {
        return cityMapper.deleteCityByCIds(cIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param cId 【请填写功能名称】主键
     * @return 结果
     */

    @DataSource(value = DataSourceType.SLAVE)
    @Override
    public int deleteCityByCId(Long cId)
    {
        return cityMapper.deleteCityByCId(cId);
    }
}
