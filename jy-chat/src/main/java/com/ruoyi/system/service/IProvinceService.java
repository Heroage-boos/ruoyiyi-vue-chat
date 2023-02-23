package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Province;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IProvinceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param pId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Province selectProvinceByPId(Long pId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param province 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Province> selectProvinceList(Province province);

    /**
     * 新增【请填写功能名称】
     * 
     * @param province 【请填写功能名称】
     * @return 结果
     */
    public int insertProvince(Province province);

    /**
     * 修改【请填写功能名称】
     * 
     * @param province 【请填写功能名称】
     * @return 结果
     */
    public int updateProvince(Province province);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteProvinceByPIds(Long[] pIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteProvinceByPId(Long pId);
}
