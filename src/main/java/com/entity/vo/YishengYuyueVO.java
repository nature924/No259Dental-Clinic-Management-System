package com.entity.vo;

import com.entity.YishengYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 医生预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yisheng_yuyue")
public class YishengYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 预约唯一编号
     */

    @TableField(value = "yisheng_yuyue_uuid_number")
    private String yishengYuyueUuidNumber;


    /**
     * 医生
     */

    @TableField(value = "yisheng_id")
    private Integer yishengId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 预约理由
     */

    @TableField(value = "yisheng_yuyue_text")
    private String yishengYuyueText;


    /**
     * 申请预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yisheng_yuyue_time")
    private Date yishengYuyueTime;


    /**
     * 预约状态
     */

    @TableField(value = "yisheng_yuyue_yesno_types")
    private Integer yishengYuyueYesnoTypes;


    /**
     * 预约回复
     */

    @TableField(value = "yisheng_yuyue_yesno_text")
    private String yishengYuyueYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yisheng_yuyue_shenhe_time")
    private Date yishengYuyueShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：预约唯一编号
	 */
    public String getYishengYuyueUuidNumber() {
        return yishengYuyueUuidNumber;
    }


    /**
	 * 获取：预约唯一编号
	 */

    public void setYishengYuyueUuidNumber(String yishengYuyueUuidNumber) {
        this.yishengYuyueUuidNumber = yishengYuyueUuidNumber;
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
	 * 设置：预约理由
	 */
    public String getYishengYuyueText() {
        return yishengYuyueText;
    }


    /**
	 * 获取：预约理由
	 */

    public void setYishengYuyueText(String yishengYuyueText) {
        this.yishengYuyueText = yishengYuyueText;
    }
    /**
	 * 设置：申请预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请预约时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYishengYuyueTime() {
        return yishengYuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYishengYuyueTime(Date yishengYuyueTime) {
        this.yishengYuyueTime = yishengYuyueTime;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getYishengYuyueYesnoTypes() {
        return yishengYuyueYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setYishengYuyueYesnoTypes(Integer yishengYuyueYesnoTypes) {
        this.yishengYuyueYesnoTypes = yishengYuyueYesnoTypes;
    }
    /**
	 * 设置：预约回复
	 */
    public String getYishengYuyueYesnoText() {
        return yishengYuyueYesnoText;
    }


    /**
	 * 获取：预约回复
	 */

    public void setYishengYuyueYesnoText(String yishengYuyueYesnoText) {
        this.yishengYuyueYesnoText = yishengYuyueYesnoText;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getYishengYuyueShenheTime() {
        return yishengYuyueShenheTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setYishengYuyueShenheTime(Date yishengYuyueShenheTime) {
        this.yishengYuyueShenheTime = yishengYuyueShenheTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
