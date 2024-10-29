package com.entity.model;

import com.entity.YishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医生
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 医生编号
     */
    private String yishengUuidNumber;


    /**
     * 医生姓名
     */
    private String yishengName;


    /**
     * 医生手机号
     */
    private String yishengPhone;


    /**
     * 医生身份证号
     */
    private String yishengIdNumber;


    /**
     * 医生头像
     */
    private String yishengPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 医生邮箱
     */
    private String yishengEmail;


    /**
     * 职位
     */
    private Integer zhiweiTypes;


    /**
     * 医生介绍
     */
    private String yishengContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：医生编号
	 */
    public String getYishengUuidNumber() {
        return yishengUuidNumber;
    }


    /**
	 * 设置：医生编号
	 */
    public void setYishengUuidNumber(String yishengUuidNumber) {
        this.yishengUuidNumber = yishengUuidNumber;
    }
    /**
	 * 获取：医生姓名
	 */
    public String getYishengName() {
        return yishengName;
    }


    /**
	 * 设置：医生姓名
	 */
    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 获取：医生手机号
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }


    /**
	 * 设置：医生手机号
	 */
    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 获取：医生身份证号
	 */
    public String getYishengIdNumber() {
        return yishengIdNumber;
    }


    /**
	 * 设置：医生身份证号
	 */
    public void setYishengIdNumber(String yishengIdNumber) {
        this.yishengIdNumber = yishengIdNumber;
    }
    /**
	 * 获取：医生头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }


    /**
	 * 设置：医生头像
	 */
    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：医生邮箱
	 */
    public String getYishengEmail() {
        return yishengEmail;
    }


    /**
	 * 设置：医生邮箱
	 */
    public void setYishengEmail(String yishengEmail) {
        this.yishengEmail = yishengEmail;
    }
    /**
	 * 获取：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 设置：职位
	 */
    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 获取：医生介绍
	 */
    public String getYishengContent() {
        return yishengContent;
    }


    /**
	 * 设置：医生介绍
	 */
    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
