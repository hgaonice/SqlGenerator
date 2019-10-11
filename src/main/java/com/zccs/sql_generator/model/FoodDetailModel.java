package com.zccs.sql_generator.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/10/11 11:06
 */
@Data
@Table(name = "food_detail")
@Entity
public class FoodDetailModel {
    @Id
    @GeneratedValue
    private Long id;

    private Long parentId;

    private String actionBatchNo;//String	操作批次号
    private Long cardNO;//Long	记录修改时间(改价、赠菜时间），格式：yyyyMMddHHmmss，默认值0
    private String allFoodRemark;//String	单注
    private String areaName;//String	区域名称
    private Long brandID;//Long	品牌ID（无意义，返回值为0）
    private String cancelBy;//String	退菜操作人员empCode|empName
    private String cancelReason;//String	退菜原因
    private Long cancelTime;//Long	退菜时间，格式：yyyyMMddHHmmss，默认值0
    private String categoryDiscountRate;//String	分类折扣率（当执行分类折扣方案时，此值表示此菜品在分类折扣中的折扣率）
    private String clientType;//String	客户端类型
    private Long createTime;//Long	记录创建时间（点菜时间、退菜时间）
    private String departmentKeyLst;//String	会员卡状态名称
    private String departmentKeyOne;//String	第一出品部门
    private String deviceName;//String	点菜设备名称
    private String foodCancelNumber;//String	退菜数量
    private String foodCategoryKey;//String	分类编号，对应基本档-获取店铺菜品返回的foodCategoryKey
    private String foodCategoryName;//String	分类名称，对应基本档-获取店铺菜品返回的foodCategoryName
    private String foodCategorySortIndex;//Integer	分类排序值
    private String foodCode;//String	菜品编码，对应基本档-获取店铺菜品返回的foodCode
    private String foodDiscountRate;//String	单菜品折扣信息
    private String foodEstimateCost;//String	菜品预估成本
    private String foodKey;//String	菜品Key，对应基本档-获取店铺菜品返回的foodKey
    private String foodLastCancelNumber;//String	最后一次退菜数量
    private String foodName;//String	菜品名称，对应基本档-获取店铺菜品返回的foodName
    private String foodNumber;//String	点菜数量
    private String foodPayPrice;//String	菜品实收价格，根据折扣科目均摊计算之后的结果
    private String foodPayPriceReal;//String	菜品成交价，优惠类别按照此价格为计数进行
    private String foodPractice;//String	菜品做法
    private String foodPriceAmount;//String	菜品折前金额(套餐名字的折前金额为0，套餐明细摊后的折前金额=套餐折前总金额*（套餐明细单点金额/套餐明细单点折前金额合计）)
    private String foodProPrice;//String	菜品特价时段特殊价格、区域特殊价格等等
    private String foodRealAmount;//String	菜品除去优惠后均摊实收金额
    private String foodRealPrice;//String	菜品的实收价格(除去均摊后的菜品单价)
    private String foodRemark;//String	点菜要求
    private String foodSendNumber;//String	赠菜数量
    private String foodSubjectCode;//String//对应收入科目编号
    private String foodSubjectKey;//String对应收入科目Key
    //    private String ;//，对应基本档-获取店铺科目列表返回的subjectKey
    private String foodSubjectName;//String	对应收入科目名称，对应基本档-获取店铺科目列表返回的subjectName
    private String foodSubType;//String	菜品的子类型
    private String foodTaste;//String	菜品口味
    private String foodVipPrice;//String	菜品会员价
    private Long groupID;//Long	所属集团ID
    private Integer isBatching;//Integer	是否配菜
    private Integer isDiscount;//Integer	是否参与打折
    private Integer isDiscountDefault;//Integer	是否参与打折（默认菜品是否参与打折）
    private Integer isNeedConfirmFoodNumber;//Integer	数量待确认 0：无需确认 1：需确认
    private Integer isSetFood;//Integer	是否套餐（套餐及套餐明细此标记均为1）
    private Integer isSFDetail;//Integer	是否是套餐明细
    private Integer isTempFood;//Integer	是否临时菜
    private String itemKey;//String	明细记录Key
    private String makeBy;//String	制作人
    private Integer makeCallCount;//Integer	制作取餐叫号次数
    private String makeEndfoodNumber;//String	已制作数量
    private String makeEndNumber;//String	制作完成时间（上菜时间）
    private Long makeEndTime;//Long	制作完成数量，格式：yyyyMMddHHmmss，默认值0
    private Long makeStartTime;//Long	制作开始时间，格式：yyyyMMddHHmmss，默认值0
    private Integer makeStatus;//Integer	制作状态 0：等叫 1：即起 2：加急 20：制作中 25：请取餐 29：挂起 3：已上菜（已完成）
    private String modifyBy;//String	改价操作人员empCode|empName
    private String modifyReason;//String	改价原因
    private Long modifyTime;//Long	改价时间，格式：yyyyMMddHHmmss，默认值0
    private String orderBy;//String	点菜人员
    private Integer orderStatus;//Integer	30：作废 40：已结账
    private Integer orderSubType;//Integer	订单类型（0：堂食 20：外卖 21：自提）
    private String parentFoodFromItemKey;//String	配菜、退菜、作法加价对应的点菜记录ItemKey
    private Integer printStatus;//Integer	打印状态 0：待打印 1：不打印 2：已打印
    private String promotionIDLst;//String	菜品使用的营销ID列表
    private String readyNumber;//String	已配菜数量
    private Long reportDate;//Long	报表统计日期
    private String saasOrderKey;//String	餐饮系统订单Key
    private String salesCommission;//String	菜品销售提成点值
    private String sendBy;//String	赠菜操作人员empCode|empName
    private String sendReason;//String	赠菜原因
    private Long sendTime;//Long	赠菜时间，格式：yyyyMMddHHmmss，默认值0
    private String serveConfirmBy;//String	上菜划单人员
    private Long serveConfirmTime;//Long	上菜划单时间，格式：yyyyMMddHHmmss，默认值0
    private String serverMAC;//String	服务器MAC地址
    private String setFoodCategoryName;//String	套餐明细所属的套餐分类名字
    private String setFoodName;//String	套餐名
    private String setFoodRemark;//String	套餐备注
    private Long shopID;//Long	店铺ID
    private String shopName;//String	店铺名称
    private String tableName;//String	桌台名称
    private String taxRate;//String	菜品税率
    private String transmitNumber;//String	已传菜数量
    private String unit;//String	菜品规格
    private String unitAdjuvant;//String	辅助规格
    private String unitAdjuvantNumber;//String	辅助规格数量
    private String unitKey;//String	菜品规格Key 目前对应的是规格ID
}
