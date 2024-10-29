package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YishengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 医生
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yisheng")
public class YishengView extends YishengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 性别的值
	*/
	@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 职位的值
	*/
	@ColumnInfo(comment="职位的字典表值",type="varchar(200)")
	private String zhiweiValue;




	public YishengView() {

	}

	public YishengView(YishengEntity yishengEntity) {
		try {
			BeanUtils.copyProperties(this, yishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 职位的值
	*/
	public String getZhiweiValue() {
		return zhiweiValue;
	}
	/**
	* 设置： 职位的值
	*/
	public void setZhiweiValue(String zhiweiValue) {
		this.zhiweiValue = zhiweiValue;
	}




	@Override
	public String toString() {
		return "YishengView{" +
			", sexValue=" + sexValue +
			", zhiweiValue=" + zhiweiValue +
			"} " + super.toString();
	}
}
