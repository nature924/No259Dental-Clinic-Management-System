package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 病例
 *
 * @author 
 * @email
 */
@TableName("bingli")
public class BingliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BingliEntity() {

	}

	public BingliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 医生
     */
    @ColumnInfo(comment="医生",type="int(11)")
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 病例编号
     */
    @ColumnInfo(comment="病例编号",type="varchar(200)")
    @TableField(value = "bingli_uuid_number")

    private String bingliUuidNumber;


    /**
     * 病例名称
     */
    @ColumnInfo(comment="病例名称",type="varchar(200)")
    @TableField(value = "bingli_name")

    private String bingliName;


    /**
     * 病例类型
     */
    @ColumnInfo(comment="病例类型",type="int(11)")
    @TableField(value = "bingli_types")

    private Integer bingliTypes;


    /**
     * 看病时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="看病时间",type="timestamp")
    @TableField(value = "kanbing_time")

    private Date kanbingTime;


    /**
     * 病人自述
     */
    @ColumnInfo(comment="病人自述",type="text")
    @TableField(value = "bingli_zishu_text")

    private String bingliZishuText;


    /**
     * 诊断结果
     */
    @ColumnInfo(comment="诊断结果",type="text")
    @TableField(value = "bingli_zhenduan_text")

    private String bingliZhenduanText;


    /**
     * 药方
     */
    @ColumnInfo(comment="药方",type="text")
    @TableField(value = "bingli_yaofang_text")

    private String bingliYaofangText;


    /**
     * 花费金额
     */
    @ColumnInfo(comment="花费金额",type="decimal(10,2)")
    @TableField(value = "bingli_huafei")

    private Double bingliHuafei;


    /**
     * 是否缴费
     */
    @ColumnInfo(comment="是否缴费",type="int(11)")
    @TableField(value = "jiaofei_types")

    private Integer jiaofeiTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Bingli{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", yishengId=" + yishengId +
            ", bingliUuidNumber=" + bingliUuidNumber +
            ", bingliName=" + bingliName +
            ", bingliTypes=" + bingliTypes +
            ", kanbingTime=" + DateUtil.convertString(kanbingTime,"yyyy-MM-dd") +
            ", bingliZishuText=" + bingliZishuText +
            ", bingliZhenduanText=" + bingliZhenduanText +
            ", bingliYaofangText=" + bingliYaofangText +
            ", bingliHuafei=" + bingliHuafei +
            ", jiaofeiTypes=" + jiaofeiTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
