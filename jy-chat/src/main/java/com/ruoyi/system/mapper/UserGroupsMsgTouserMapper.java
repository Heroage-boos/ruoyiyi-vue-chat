package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserGroupsMsgTouser;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface UserGroupsMsgTouserMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserGroupsMsgTouser selectUserGroupsMsgTouserByGmId(Long gmId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsMsgTouser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserGroupsMsgTouser> selectUserGroupsMsgTouserList(UserGroupsMsgTouser userGroupsMsgTouser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsMsgTouser 【请填写功能名称】
     * @return 结果
     */
    public int insertUserGroupsMsgTouser(UserGroupsMsgTouser userGroupsMsgTouser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsMsgTouser 【请填写功能名称】
     * @return 结果
     */
    public int updateUserGroupsMsgTouser(UserGroupsMsgTouser userGroupsMsgTouser);

    /**
     * 删除【请填写功能名称】
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserGroupsMsgTouserByGmId(Long gmId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param gmIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserGroupsMsgTouserByGmIds(Long[] gmIds);
}
