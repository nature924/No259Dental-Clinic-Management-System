package com.entity.model;

import com.entity.BingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 病例
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BingliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 病例编号
     */
    private String bingliUuidNumber;


    /**
     * 病例名称
     */
    private String bingliName;


    /**
     * 病例类型
     */
    private Integer bingliTypes;


    /**
     * 看病时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kanbingTime;


    /**
     * 病人自述
     */
    private String bingliZishuText;


    /**
     * 诊断结果
     */
    private String bingliZhenduanText;


    /**
     * 药方
     */
    private String bingliYaofangText;


    /**
     * 花费金额
     */
    private Double bingliHuafei;


    /**
     * 是否缴费
     */
    private Integer jiaofeiTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
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
	 * 获取：病例编号
	 */
    public String getBingliUuidNumber() {
        return bingliUuidNumber;
    }


    /**
	 * 设置：病例编号
	 */
    public void setBingliUuidNumber(String bingliUuidNumber) {
        this.bingliUuidNumber = bingliUuidNumber;
    }
    /**
	 * 获取：病例名称
	 */
    public String getBingliName() {
        return bingliName;
    }


    /**
	 * 设置：病例名称
	 */
    public void setBingliName(String bingliName) {
        this.bingliName = bingliName;
    }
    /**
	 * 获取：病例类型
	 */
    public Integer getBingliTypes() {
        return bingliTypes;
    }


    /**
	 * 设置：病例类型
	 */
    public void setBingliTypes(Integer bingliTypes) {
        this.bingliTypes = bingliTypes;
    }
    /**
	 * 获取：看病时间
	 */
    public Date getKanbingTime() {
        return kanbingTime;
    }


    /**
	 * 设置：看病时间
	 */
    public void setKanbingTime(Date kanbingTime) {
        this.kanbingTime = kanbingTime;
    }
    /**
	 * 获取：病人自述
	 */
    public String getBingliZishuText() {
        return bingliZishuText;
    }


    /**
	 * 设置：病人自述
	 */
    public void setBingliZishuText(String bingliZishuText) {
        this.bingliZishuText = bingliZishuText;
    }
    /**
	 * 获取：诊断结果
	 */
    public String getBingliZhenduanText() {
        return bingliZhenduanText;
    }


    /**
	 * 设置：诊断结果
	 */
    public void setBingliZhenduanText(String bingliZhenduanText) {
        this.bingliZhenduanText = bingliZhenduanText;
    }
    /**
	 * 获取：药方
	 */
    public String getBingliYaofangText() {
        return bingliYaofangText;
    }


    /**
	 * 设置：药方
	 */
    public void setBingliYaofangText(String bingliYaofangText) {
        this.bingliYaofangText = bingliYaofangText;
    }
    /**
	 * 获取：花费金额
	 */
    public Double getBingliHuafei() {
        return bingliHuafei;
    }


    /**
	 * 设置：花费金额
	 */
    public void setBingliHuafei(Double bingliHuafei) {
        this.bingliHuafei = bingliHuafei;
    }
    /**
	 * 获取：是否缴费
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 设置：是否缴费
	 */
    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
