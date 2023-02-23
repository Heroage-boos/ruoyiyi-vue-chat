package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserFriendshipPolicy;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public interface UserFriendshipPolicyMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param uFpId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserFriendshipPolicy selectUserFriendshipPolicyByUFpId(Long uFpId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userFriendshipPolicy 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UserFriendshipPolicy> selectUserFriendshipPolicyList(UserFriendshipPolicy userFriendshipPolicy);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userFriendshipPolicy 【请填写功能名称】
     * @return 结果
     */
    public int insertUserFriendshipPolicy(UserFriendshipPolicy userFriendshipPolicy);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userFriendshipPolicy 【请填写功能名称】
     * @return 结果
     */
    public int updateUserFriendshipPolicy(UserFriendshipPolicy userFriendshipPolicy);

    /**
     * 删除【请填写功能名称】
     * 
     * @param uFpId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserFriendshipPolicyByUFpId(Long uFpId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param uFpIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserFriendshipPolicyByUFpIds(Long[] uFpIds);
}
