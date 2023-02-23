package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Nation;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface NationMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param nId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Nation selectNationByNId(Long nId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param nation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Nation> selectNationList(Nation nation);

    /**
     * 新增【请填写功能名称】
     * 
     * @param nation 【请填写功能名称】
     * @return 结果
     */
    public int insertNation(Nation nation);

    /**
     * 修改【请填写功能名称】
     * 
     * @param nation 【请填写功能名称】
     * @return 结果
     */
    public int updateNation(Nation nation);

    /**
     * 删除【请填写功能名称】
     * 
     * @param nId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteNationByNId(Long nId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param nIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNationByNIds(Long[] nIds);
}
