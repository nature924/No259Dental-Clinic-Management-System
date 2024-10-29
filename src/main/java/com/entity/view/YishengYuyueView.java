package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YishengYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 医生预约
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yisheng_yuyue")
public class YishengYuyueView extends YishengYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 预约状态的值
	*/
	@ColumnInfo(comment="预约状态的字典表值",type="varchar(200)")
	private String yishengYuyueYesnoValue;

	//级联表 医生
		/**
		* 医生编号
		*/

		@ColumnInfo(comment="医生编号",type="varchar(200)")
		private String yishengUuidNumber;
		/**
		* 医生姓名
		*/

		@ColumnInfo(comment="医生姓名",type="varchar(200)")
		private String yishengName;
		/**
		* 医生手机号
		*/

		@ColumnInfo(comment="医生手机号",type="varchar(200)")
		private String yishengPhone;
		/**
		* 医生身份证号
		*/

		@ColumnInfo(comment="医生身份证号",type="varchar(200)")
		private String yishengIdNumber;
		/**
		* 医生头像
		*/

		@ColumnInfo(comment="医生头像",type="varchar(200)")
		private String yishengPhoto;
		/**
		* 医生邮箱
		*/

		@ColumnInfo(comment="医生邮箱",type="varchar(200)")
		private String yishengEmail;
		/**
		* 职位
		*/
		@ColumnInfo(comment="职位",type="int(11)")
		private Integer zhiweiTypes;
			/**
			* 职位的值
			*/
			@ColumnInfo(comment="职位的字典表值",type="varchar(200)")
			private String zhiweiValue;
		/**
		* 医生介绍
		*/

		@ColumnInfo(comment="医生介绍",type="text")
		private String yishengContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 职业
		*/
		@ColumnInfo(comment="职业",type="int(11)")
		private Integer zhiyeTypes;
			/**
			* 职业的值
			*/
			@ColumnInfo(comment="职业的字典表值",type="varchar(200)")
			private String zhiyeValue;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public YishengYuyueView() {

	}

	public YishengYuyueView(YishengYuyueEntity yishengYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, yishengYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 预约状态的值
	*/
	public String getYishengYuyueYesnoValue() {
		return yishengYuyueYesnoValue;
	}
	/**
	* 设置： 预约状态的值
	*/
	public void setYishengYuyueYesnoValue(String yishengYuyueYesnoValue) {
		this.yishengYuyueYesnoValue = yishengYuyueYesnoValue;
	}


	//级联表的get和set 医生

		/**
		* 获取： 医生编号
		*/
		public String getYishengUuidNumber() {
			return yishengUuidNumber;
		}
		/**
		* 设置： 医生编号
		*/
		public void setYishengUuidNumber(String yishengUuidNumber) {
			this.yishengUuidNumber = yishengUuidNumber;
		}

		/**
		* 获取： 医生姓名
		*/
		public String getYishengName() {
			return yishengName;
		}
		/**
		* 设置： 医生姓名
		*/
		public void setYishengName(String yishengName) {
			this.yishengName = yishengName;
		}

		/**
		* 获取： 医生手机号
		*/
		public String getYishengPhone() {
			return yishengPhone;
		}
		/**
		* 设置： 医生手机号
		*/
		public void setYishengPhone(String yishengPhone) {
			this.yishengPhone = yishengPhone;
		}

		/**
		* 获取： 医生身份证号
		*/
		public String getYishengIdNumber() {
			return yishengIdNumber;
		}
		/**
		* 设置： 医生身份证号
		*/
		public void setYishengIdNumber(String yishengIdNumber) {
			this.yishengIdNumber = yishengIdNumber;
		}

		/**
		* 获取： 医生头像
		*/
		public String getYishengPhoto() {
			return yishengPhoto;
		}
		/**
		* 设置： 医生头像
		*/
		public void setYishengPhoto(String yishengPhoto) {
			this.yishengPhoto = yishengPhoto;
		}

		/**
		* 获取： 医生邮箱
		*/
		public String getYishengEmail() {
			return yishengEmail;
		}
		/**
		* 设置： 医生邮箱
		*/
		public void setYishengEmail(String yishengEmail) {
			this.yishengEmail = yishengEmail;
		}
		/**
		* 获取： 职位
		*/
		public Integer getZhiweiTypes() {
			return zhiweiTypes;
		}
		/**
		* 设置： 职位
		*/
		public void setZhiweiTypes(Integer zhiweiTypes) {
			this.zhiweiTypes = zhiweiTypes;
		}


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

		/**
		* 获取： 医生介绍
		*/
		public String getYishengContent() {
			return yishengContent;
		}
		/**
		* 设置： 医生介绍
		*/
		public void setYishengContent(String yishengContent) {
			this.yishengContent = yishengContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 职业
		*/
		public Integer getZhiyeTypes() {
			return zhiyeTypes;
		}
		/**
		* 设置： 职业
		*/
		public void setZhiyeTypes(Integer zhiyeTypes) {
			this.zhiyeTypes = zhiyeTypes;
		}


			/**
			* 获取： 职业的值
			*/
			public String getZhiyeValue() {
				return zhiyeValue;
			}
			/**
			* 设置： 职业的值
			*/
			public void setZhiyeValue(String zhiyeValue) {
				this.zhiyeValue = zhiyeValue;
			}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "YishengYuyueView{" +
			", yishengYuyueYesnoValue=" + yishengYuyueYesnoValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", yishengUuidNumber=" + yishengUuidNumber +
			", yishengName=" + yishengName +
			", yishengPhone=" + yishengPhone +
			", yishengIdNumber=" + yishengIdNumber +
			", yishengPhoto=" + yishengPhoto +
			", yishengEmail=" + yishengEmail +
			", yishengContent=" + yishengContent +
			"} " + super.toString();
	}
}
