package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_friendship_policy
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserFriendshipPolicy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 策略ID    主键 */
    private Long uFpId;

    /** 好友添加方式     */
    @Excel(name = "好友添加方式    ")
    private String uFriendshippolicy;

    public void setuFpId(Long uFpId) 
    {
        this.uFpId = uFpId;
    }

    public Long getuFpId() 
    {
        return uFpId;
    }
    public void setuFriendshippolicy(String uFriendshippolicy) 
    {
        this.uFriendshippolicy = uFriendshippolicy;
    }

    public String getuFriendshippolicy() 
    {
        return uFriendshippolicy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uFpId", getuFpId())
            .append("uFriendshippolicy", getuFriendshippolicy())
            .toString();
    }
}
