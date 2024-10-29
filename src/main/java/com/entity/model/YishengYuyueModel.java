package com.entity.model;

import com.entity.YishengYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医生预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishengYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约唯一编号
     */
    private String yishengYuyueUuidNumber;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约理由
     */
    private String yishengYuyueText;


    /**
     * 申请预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yishengYuyueTime;


    /**
     * 预约状态
     */
    private Integer yishengYuyueYesnoTypes;


    /**
     * 预约回复
     */
    private String yishengYuyueYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yishengYuyueShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：预约唯一编号
	 */
    public String getYishengYuyueUuidNumber() {
        return yishengYuyueUuidNumber;
    }


    /**
	 * 设置：预约唯一编号
	 */
    public void setYishengYuyueUuidNumber(String yishengYuyueUuidNumber) {
        this.yishengYuyueUuidNumber = yishengYuyueUuidNumber;
    }
    /**
	 * 获取：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约理由
	 */
    public String getYishengYuyueText() {
        return yishengYuyueText;
    }


    /**
	 * 设置：预约理由
	 */
    public void setYishengYuyueText(String yishengYuyueText) {
        this.yishengYuyueText = yishengYuyueText;
    }
    /**
	 * 获取：申请预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请预约时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYishengYuyueTime() {
        return yishengYuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYishengYuyueTime(Date yishengYuyueTime) {
        this.yishengYuyueTime = yishengYuyueTime;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getYishengYuyueYesnoTypes() {
        return yishengYuyueYesnoTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setYishengYuyueYesnoTypes(Integer yishengYuyueYesnoTypes) {
        this.yishengYuyueYesnoTypes = yishengYuyueYesnoTypes;
    }
    /**
	 * 获取：预约回复
	 */
    public String getYishengYuyueYesnoText() {
        return yishengYuyueYesnoText;
    }


    /**
	 * 设置：预约回复
	 */
    public void setYishengYuyueYesnoText(String yishengYuyueYesnoText) {
        this.yishengYuyueYesnoText = yishengYuyueYesnoText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getYishengYuyueShenheTime() {
        return yishengYuyueShenheTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setYishengYuyueShenheTime(Date yishengYuyueShenheTime) {
        this.yishengYuyueShenheTime = yishengYuyueShenheTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
