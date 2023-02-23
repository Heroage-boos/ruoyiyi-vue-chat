package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 messages
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class Messages extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** (消息ID)    主键，自增 */
    private Long mId;

    /**  (消息内容)    */
    @Excel(name = " (消息内容)   ")
    private String mPostmessages;

    /** 接收状态 */
    @Excel(name = "接收状态")
    private Integer mStatus;

    /**  (发送时间)    默认值 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = " (发送时间)    默认值", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mTime;

    /**  (消息类型ID)    外键 */
    @Excel(name = " (消息类型ID)    外键")
    private Long mMessagestypeid;

    /** (发送者ID)指向用户表    外键
 */
    @Excel(name = "(发送者ID)指向用户表  外键 ")
    private Long mFromuserid;

    /** (接收者ID)指向用户表    外键 */
    @Excel(name = "(接收者ID)指向用户表    外键")
    private Long mTouserid;

    public void setmId(Long mId) 
    {
        this.mId = mId;
    }

    public Long getmId() 
    {
        return mId;
    }
    public void setmPostmessages(String mPostmessages) 
    {
        this.mPostmessages = mPostmessages;
    }

    public String getmPostmessages() 
    {
        return mPostmessages;
    }
    public void setmStatus(Integer mStatus)
    {
        this.mStatus= mStatus;
    }

    public Integer getmStatus()
    {
        return mStatus;
    }
    public void setmTime(Date mTime) 
    {
        this.mTime = mTime;
    }

    public Date getmTime() 
    {
        return mTime;
    }
    public void setmMessagestypeid(Long mMessagestypeid) 
    {
        this.mMessagestypeid = mMessagestypeid;
    }

    public Long getmMessagestypeid() 
    {
        return mMessagestypeid;
    }
    public void setmFromuserid(Long mFromuserid)
    {
        this.mFromuserid = mFromuserid;
    }

    public Long getmFromuserid()
    {
        return mFromuserid;
    }
    public void setmTouserid(Long mTouserid) 
    {
        this.mTouserid = mTouserid;
    }

    public Long getmTouserid() 
    {
        return mTouserid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mId", getmId())
            .append("mPostmessages", getmPostmessages())
            .append("mStatus", getmStatus())
            .append("mTime", getmTime())
            .append("mMessagestypeid", getmMessagestypeid())
            .append("mFromuserid", getmFromuserid())
            .append("mTouserid", getmTouserid())
            .toString();
    }
}
