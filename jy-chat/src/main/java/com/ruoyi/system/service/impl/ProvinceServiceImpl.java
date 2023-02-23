package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProvinceMapper;
import com.ruoyi.system.domain.Province;
import com.ruoyi.system.service.IProvinceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@Service
public class ProvinceServiceImpl implements IProvinceService 
{
    @Autowired
    private ProvinceMapper provinceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param pId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Province selectProvinceByPId(Long pId)
    {
        return provinceMapper.selectProvinceByPId(pId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param province 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Province> selectProvinceList(Province province)
    {
        return provinceMapper.selectProvinceList(province);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param province 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertProvince(Province province)
    {
        return provinceMapper.insertProvince(province);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param province 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateProvince(Province province)
    {
        return provinceMapper.updateProvince(province);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteProvinceByPIds(Long[] pIds)
    {
        return provinceMapper.deleteProvinceByPIds(pIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteProvinceByPId(Long pId)
    {
        return provinceMapper.deleteProvinceByPId(pId);
    }
}
