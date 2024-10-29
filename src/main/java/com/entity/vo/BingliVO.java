package com.entity.vo;

import com.entity.BingliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 病例
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bingli")
public class BingliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 医生
     */

    @TableField(value = "yisheng_id")
    private Integer yishengId;


    /**
     * 病例编号
     */

    @TableField(value = "bingli_uuid_number")
    private String bingliUuidNumber;


    /**
     * 病例名称
     */

    @TableField(value = "bingli_name")
    private String bingliName;


    /**
     * 病例类型
     */

    @TableField(value = "bingli_types")
    private Integer bingliTypes;


    /**
     * 看病时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kanbing_time")
    private Date kanbingTime;


    /**
     * 病人自述
     */

    @TableField(value = "bingli_zishu_text")
    private String bingliZishuText;


    /**
     * 诊断结果
     */

    @TableField(value = "bingli_zhenduan_text")
    private String bingliZhenduanText;


    /**
     * 药方
     */

    @TableField(value = "bingli_yaofang_text")
    private String bingliYaofangText;


    /**
     * 花费金额
     */

    @TableField(value = "bingli_huafei")
    private Double bingliHuafei;


    /**
     * 是否缴费
     */

    @TableField(value = "jiaofei_types")
    private Integer jiaofeiTypes;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：病例编号
	 */
    public String getBingliUuidNumber() {
        return bingliUuidNumber;
    }


    /**
	 * 获取：病例编号
	 */

    public void setBingliUuidNumber(String bingliUuidNumber) {
        this.bingliUuidNumber = bingliUuidNumber;
    }
    /**
	 * 设置：病例名称
	 */
    public String getBingliName() {
        return bingliName;
    }


    /**
	 * 获取：病例名称
	 */

    public void setBingliName(String bingliName) {
        this.bingliName = bingliName;
    }
    /**
	 * 设置：病例类型
	 */
    public Integer getBingliTypes() {
        return bingliTypes;
    }


    /**
	 * 获取：病例类型
	 */

    public void setBingliTypes(Integer bingliTypes) {
        this.bingliTypes = bingliTypes;
    }
    /**
	 * 设置：看病时间
	 */
    public Date getKanbingTime() {
        return kanbingTime;
    }


    /**
	 * 获取：看病时间
	 */

    public void setKanbingTime(Date kanbingTime) {
        this.kanbingTime = kanbingTime;
    }
    /**
	 * 设置：病人自述
	 */
    public String getBingliZishuText() {
        return bingliZishuText;
    }


    /**
	 * 获取：病人自述
	 */

    public void setBingliZishuText(String bingliZishuText) {
        this.bingliZishuText = bingliZishuText;
    }
    /**
	 * 设置：诊断结果
	 */
    public String getBingliZhenduanText() {
        return bingliZhenduanText;
    }


    /**
	 * 获取：诊断结果
	 */

    public void setBingliZhenduanText(String bingliZhenduanText) {
        this.bingliZhenduanText = bingliZhenduanText;
    }
    /**
	 * 设置：药方
	 */
    public String getBingliYaofangText() {
        return bingliYaofangText;
    }


    /**
	 * 获取：药方
	 */

    public void setBingliYaofangText(String bingliYaofangText) {
        this.bingliYaofangText = bingliYaofangText;
    }
    /**
	 * 设置：花费金额
	 */
    public Double getBingliHuafei() {
        return bingliHuafei;
    }


    /**
	 * 获取：花费金额
	 */

    public void setBingliHuafei(Double bingliHuafei) {
        this.bingliHuafei = bingliHuafei;
    }
    /**
	 * 设置：是否缴费
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 获取：是否缴费
	 */

    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
