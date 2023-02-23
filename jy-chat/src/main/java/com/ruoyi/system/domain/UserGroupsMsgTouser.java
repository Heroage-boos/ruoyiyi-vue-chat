package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user_groups_msg_touser
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class UserGroupsMsgTouser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long gmId;

    /**  接收者ID    */
    @Excel(name = " 接收者ID   ")
    private Long gmUserid;

    /** 群消息ID    外键 */
    @Excel(name = "群消息ID    外键")
    private Long gmGroupmessageid;

    /** 接收状态  */
    @Excel(name = "接收状态 ")
    private Integer gmState;

    /** 发送时间     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发送时间    ", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gmCreatetime;

    public void setGmId(Long gmId) 
    {
        this.gmId = gmId;
    }

    public Long getGmId() 
    {
        return gmId;
    }
    public void setGmUserid(Long gmUerid)
    {
        this.gmUserid = gmUserid;
    }

    public Long getGmUserid()
    {
        return gmUserid;
    }
    public void setGmGroupmessageid(Long gmGroupmessageid)
    {
        this.gmGroupmessageid = gmGroupmessageid;
    }

    public Long getGmGroupmessageid()
    {
        return gmGroupmessageid;
    }
    public void setGmState(Integer gmState)
    {
        this.gmState = gmState;
    }

    public Integer getGmState()
    {
        return gmState;
    }
    public void setGmCreatetime(Date gmCreatetime)
    {
        this.gmCreatetime = gmCreatetime;
    }

    public Date getGmCreatetime()
    {
        return gmCreatetime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("gmId", getGmId())
            .append("gmUserid", getGmUserid())
            .append("gmGroupmessageid", getGmGroupmessageid())
            .append("gmState", getGmState())
            .append("gmCreatetime", getGmCreatetime())
            .toString();
    }
}
