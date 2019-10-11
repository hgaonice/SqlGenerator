package com.zccs.sql_generator.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/10/10 17:35
 * <p>
 * 账单支付信息
 */
@Data
@Entity
@Table(name = "pay_detail")
public class PayDetailModel {
    @Id
    @GeneratedValue
    private Long id;

    private Long parentId;

    private Long actionTime;//Long	记录修改时间，格式：yyyyMMddHHmmss，默认值0
    private Long brandID;//Long	品牌ID（无意义，返回值为0）
    private String checkoutBy;//String	结账人员
    private String createBy;//String	创建人员
    private Long createTime;//Long	记录创建时间，格式：yyyyMMddHHmmss，默认值0
    private String creditAmount;//String	贷方发生额，例如海鲜收入、酒水收入
    private String debitAmount;//String	券支付面值金额。原始数据为Decimal
    private String debitAmountGiftTotal;//String	借方发生额，账单结算支付，例如人民币、支票
    private String deviceName;//String	设备名称
    private String giftItemNoLst;//String	代金券券号列表，多个间用逗号隔开
    private Long groupID;//Long	所属集团ID
    private String isFeeJoinReceived;//Integer	费用是否计入实收
    private Integer isIncludeScore;//Integer	是否参与积分计算
    private Integer isJoinReceived;//Integer	是否记入实收
    private Integer isPhysicalEvidence;//Integer	是否实物凭证
    private String memberCardID;//String	涉及到会员相关的科目，记录会员卡ID
    private Integer orderStatus;//Integer	30：作废 40：已完成
    private String payRemark;//String	备注
    private String paySubjectAllDiscountAmount;//String	总的优惠: paySubjectDiscountAmount + paySubjectFeeAmount(如果费用计入优惠)
    private String paySubjectCode;//String	支付科目编码，对应基本档-获取店铺科目列表返回的subjectCode
    private String paySubjectDiscountAmount;//String	支付折扣对应金额
    private String paySubjectFeeAmount;//String	支付费用对应金额
    private String paySubjectGroupName;//String	支付科目分组名称，未定义分组名称，则此处为科目名称
    private String paySubjectKey;//String	支付科目Key，对应基本档-获取店铺科目列表返回的subjectKey
    private String paySubjectName;//String	支付科目名，对应基本档-获取店铺科目列表返回的subjectName
    private String paySubjectRate;//String	支付科目费率百分比，支持银联POS、O2O支付费率、团购佣金等使用情况
    private String paySubjectRealAmount;//String	借贷方发生的实收金额，从相关菜品实收金额进行汇总
    private String paySubjectReceivedAmount;//String	支付实得对应金额
    private String payTransNo;//String	支付交易关联单号
    private Integer programType;//Integer	营销类型：10基础营销，20会员，30券信息
    private String promotionID;//String	设计营销活动的科目，记录营销活动ID
    private Long reportDate;//Long	报表统计日期
    private String saasOrderKey;//String	餐饮系统订单Key
    private String serverMAC;//String	服务器MAC地址
    private Long shopID;//Long	店铺ID
    private String shopName;//String	店铺名称
    private String promotionCode;//String	营销编码
    private String subjectnumber;//String	用户自定义科目编码
}
