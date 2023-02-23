package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 user
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键、自增 */
    private Long uId;

    /**  登陆账号) */
    @Excel(name = " 登陆账号)")
    private String uLoginid;

    /** 昵称 */
    @Excel(name = "昵称")
    private String uNickname;

    /** 密码 */
    @Excel(name = "密码")
    private String uPassword;

    /** 个性签名 */
    @Excel(name = "个性签名")
    private String uSignature;

    /** 性别 */
    @Excel(name = "性别")
    private Integer uSex;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date uBirthday;

    /** 电话 */
    @Excel(name = "电话")
    private String uTelephone;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String uName;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String uEmail;

    /** 简介 */
    @Excel(name = "简介")
    private String uIntro;

    /** 头像 */
    @Excel(name = "头像")
    private String uHeadportrait;

    /** 生肖     */
    @Excel(name = "生肖    ")
    private String uShengxiao;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long uAge;

    /** 星座     */
    @Excel(name = "星座    ")
    private String uConstellation;

    /** 血型     */
    @Excel(name = "血型    ")
    private String uBloodtype;

    /** 毕业学校 */
    @Excel(name = "毕业学校")
    private String uSchooltag;

    /** 职业 */
    @Excel(name = "职业")
    private String uVocation;

    /**  (国家ID)    外键 */
    @Excel(name = " (国家ID)    外键")
    private Long uNationid;

    /** 省份ID  外键 */
    @Excel(name = "省份ID  外键")
    private Long uProvinceid;

    /** 城市ID  外键 */
    @Excel(name = "城市ID  外键")
    private Long uCityid;

    /**  好友策略ID  外键 */
    @Excel(name = " 好友策略ID  外键")
    private Long uFriendshippolicyid;

    /** 用户状态ID 外键 */
    @Excel(name = "用户状态ID 外键")
    private Long uUserstateid;

    /** 好友策略问题 */
    @Excel(name = "好友策略问题")
    private String uFriendpolicyquestion;

    /** 好友策略答案 */
    @Excel(name = "好友策略答案")
    private String uFriendpolicyanswer;

    /** 好友策略密码 */
    @Excel(name = "好友策略密码")
    private String uFriendpolicypassword;

    public void setuId(Long uId) 
    {
        this.uId = uId;
    }

    public Long getuId() 
    {
        return uId;
    }
    public void setuLoginid(String uLoginid) 
    {
        this.uLoginid = uLoginid;
    }

    public String getuLoginid() 
    {
        return uLoginid;
    }
    public void setuNickname(String uNickname) 
    {
        this.uNickname = uNickname;
    }

    public String getuNickname() 
    {
        return uNickname;
    }
    public void setuPassword(String uPassword) 
    {
        this.uPassword = uPassword;
    }

    public String getuPassword() 
    {
        return uPassword;
    }
    public void setuSignature(String uSignature) 
    {
        this.uSignature = uSignature;
    }

    public String getuSignature() 
    {
        return uSignature;
    }
    public void setuSex(Integer uSex) 
    {
        this.uSex = uSex;
    }

    public Integer getuSex() 
    {
        return uSex;
    }
    public void setuBirthday(Date uBirthday) 
    {
        this.uBirthday = uBirthday;
    }

    public Date getuBirthday() 
    {
        return uBirthday;
    }
    public void setuTelephone(String uTelephone) 
    {
        this.uTelephone = uTelephone;
    }

    public String getuTelephone() 
    {
        return uTelephone;
    }
    public void setuName(String uName) 
    {
        this.uName = uName;
    }

    public String getuName() 
    {
        return uName;
    }
    public void setuEmail(String uEmail) 
    {
        this.uEmail = uEmail;
    }

    public String getuEmail() 
    {
        return uEmail;
    }
    public void setuIntro(String uIntro) 
    {
        this.uIntro = uIntro;
    }

    public String getuIntro() 
    {
        return uIntro;
    }
    public void setuHeadportrait(String uHeadportrait) 
    {
        this.uHeadportrait = uHeadportrait;
    }

    public String getuHeadportrait() 
    {
        return uHeadportrait;
    }
    public void setuShengxiao(String uShengxiao) 
    {
        this.uShengxiao = uShengxiao;
    }

    public String getuShengxiao() 
    {
        return uShengxiao;
    }
    public void setuAge(Long uAge) 
    {
        this.uAge = uAge;
    }

    public Long getuAge() 
    {
        return uAge;
    }
    public void setuConstellation(String uConstellation) 
    {
        this.uConstellation = uConstellation;
    }

    public String getuConstellation() 
    {
        return uConstellation;
    }
    public void setuBloodtype(String uBloodtype) 
    {
        this.uBloodtype = uBloodtype;
    }

    public String getuBloodtype() 
    {
        return uBloodtype;
    }
    public void setuSchooltag(String uSchooltag) 
    {
        this.uSchooltag = uSchooltag;
    }

    public String getuSchooltag() 
    {
        return uSchooltag;
    }
    public void setuVocation(String uVocation) 
    {
        this.uVocation = uVocation;
    }

    public String getuVocation() 
    {
        return uVocation;
    }
    public void setuNationid(Long uNationid) 
    {
        this.uNationid = uNationid;
    }

    public Long getuNationid() 
    {
        return uNationid;
    }
    public void setuProvinceid(Long uProvinceid) 
    {
        this.uProvinceid = uProvinceid;
    }

    public Long getuProvinceid() 
    {
        return uProvinceid;
    }
    public void setuCityid(Long uCityid) 
    {
        this.uCityid = uCityid;
    }

    public Long getuCityid() 
    {
        return uCityid;
    }
    public void setuFriendshippolicyid(Long uFriendshippolicyid) 
    {
        this.uFriendshippolicyid = uFriendshippolicyid;
    }

    public Long getuFriendshippolicyid() 
    {
        return uFriendshippolicyid;
    }
    public void setuUserstateid(Long uUserstateid) 
    {
        this.uUserstateid = uUserstateid;
    }

    public Long getuUserstateid() 
    {
        return uUserstateid;
    }
    public void setuFriendpolicyquestion(String uFriendpolicyquestion) 
    {
        this.uFriendpolicyquestion = uFriendpolicyquestion;
    }

    public String getuFriendpolicyquestion() 
    {
        return uFriendpolicyquestion;
    }
    public void setuFriendpolicyanswer(String uFriendpolicyanswer) 
    {
        this.uFriendpolicyanswer = uFriendpolicyanswer;
    }

    public String getuFriendpolicyanswer() 
    {
        return uFriendpolicyanswer;
    }
    public void setuFriendpolicypassword(String uFriendpolicypassword) 
    {
        this.uFriendpolicypassword = uFriendpolicypassword;
    }

    public String getuFriendpolicypassword() 
    {
        return uFriendpolicypassword;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uId", getuId())
            .append("uLoginid", getuLoginid())
            .append("uNickname", getuNickname())
            .append("uPassword", getuPassword())
            .append("uSignature", getuSignature())
            .append("uSex", getuSex())
            .append("uBirthday", getuBirthday())
            .append("uTelephone", getuTelephone())
            .append("uName", getuName())
            .append("uEmail", getuEmail())
            .append("uIntro", getuIntro())
            .append("uHeadportrait", getuHeadportrait())
            .append("uShengxiao", getuShengxiao())
            .append("uAge", getuAge())
            .append("uConstellation", getuConstellation())
            .append("uBloodtype", getuBloodtype())
            .append("uSchooltag", getuSchooltag())
            .append("uVocation", getuVocation())
            .append("uNationid", getuNationid())
            .append("uProvinceid", getuProvinceid())
            .append("uCityid", getuCityid())
            .append("uFriendshippolicyid", getuFriendshippolicyid())
            .append("uUserstateid", getuUserstateid())
            .append("uFriendpolicyquestion", getuFriendpolicyquestion())
            .append("uFriendpolicyanswer", getuFriendpolicyanswer())
            .append("uFriendpolicypassword", getuFriendpolicypassword())
            .toString();
    }
}
