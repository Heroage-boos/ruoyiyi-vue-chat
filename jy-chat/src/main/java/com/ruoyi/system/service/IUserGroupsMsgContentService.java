package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserGroupsMsgContent;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface IUserGroupsMsgContentService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserGroupsMsgContent selectUserGroupsMsgContentByGmId(Long gmId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userGroupsMsgContent 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserGroupsMsgContent> selectUserGroupsMsgContentList(UserGroupsMsgContent userGroupsMsgContent);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userGroupsMsgContent 【请填写功能名称】
     * @return 结果
     */
    public int insertUserGroupsMsgContent(UserGroupsMsgContent userGroupsMsgContent);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userGroupsMsgContent 【请填写功能名称】
     * @return 结果
     */
    public int updateUserGroupsMsgContent(UserGroupsMsgContent userGroupsMsgContent);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param gm Ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteUserGroupsMsgContentByGmIds(Long[] gmIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param gmId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserGroupsMsgContentByGmId(Long gmId);
}
