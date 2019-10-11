package com.zccs.sql_generator.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/10/10 17:28
 * 订单详情
 */
@Entity
@Data
@Table(name = "bill_detail")
public class BillDetailModel {
    //订单Id
    @Id
    @GeneratedValue
    private Long id;

    private Long actionTime;//Long	记录修改时间，格式：yyyyMMddHHmmss，默认值0
    private String alertFlagLst;//String	账单异常操作标识
    private String areaName;//String	所属区域名称
    @Column(name = "brand_id")
    private Long brandID;//Long	品牌ID（无意义，返回值为0）
    private String cardKey;//String	会员卡Key
    private String cardNo;//String	会员卡号
    private String cardTransAfterRemark;//String	会员卡交易后资金信息
    @Column(name = "card_trans_id")
    private String cardTransID;//String	会员卡交易ID
    private String channelKey;//String	渠道Key
    private String channelName;//String	订单来源渠道名称
    private String channelOrderKey;//String	渠道订单Key
    @Column(name = "channel_order_key_tp")
    private String channelOrderKeyTP;//String	第三方订单号
    private String channelOrderNo;//String	渠道订单号
    private String channelOrderTime;//String	渠道订单时间，格式：yyyyMMddHHmm，默认值空字符串
    @Column(name = "channel_user_id")
    private String channelUserID;//String	渠道用户ID
    private String channelUserImage;//String	渠道用户头像路径
    private String channelUserKey;//String	渠道用户Key
    private String checkoutBy;//String	结账人员
    private Long checkoutTime;//Long	结账时间，格式：yyyyMMddHHssnn，默认值0
    private String createBy;//String	创建人员（开台人员）
    private Long createTime;//Long	记录创建时间，yyyyMMddHHmmss，默认值0
    private String customerName;//String	会员姓名
    private String deviceCode;//String	设备编号
    @Column(name = "device_group_id")
    private String deviceGroupID;//String	设备所属的站点分组(档口)ID
    private String deviceGroupName;//String	设备所属的站点分组(档口)名称
    private String deviceKey;//String	设备Key
    private String deviceName;//String	设备名称
    private String discountBy;//String	账单打折人员
    private Integer discountRange;//Integer	打折范围 0：部分打折 1：全单打折 2：分类折扣
    private String discountRate;//String	折扣率。原始数据为Decimal，为保证数据精度，以String传输。
    private String discountWayKey;//String	折扣方案Key
    private String discountWayName;//String	账单折扣优惠方案名
    @Column(name = "fjz_count")
    private Integer FJZCount;//Integer	反结账次数
    private String foodAlert;//String	账单菜品明细警惕
    private String foodAmount;//String	菜品金额合计。原始数据为Decimal，为保证数据精度，以String传输
    private Integer foodCount;//Integer	菜品条目数
    private String foodNameDetail;//String	账单对应菜品名称，多个间用空格隔开
    @Column(name = "group_id")
    private Long groupID;//Long	店铺所属集团ID
    private String invoiceAmount;//String	开票金额
    private String invoiceBy;//String	开票人
    private String invoiceTaxAmount;//String	税额
    @Column(name = "invoice_taxpayer_ident_code")
    private String invoiceTaxpayerIdentCode;//String	纳税人识别码（税务登记证上15或者18或者29位的数字）
    private String invoiceTaxRate;//String	税率 通常为 0.03 或者 0.06 或者 0.17
    private String invoiceTitle;//String	发票抬头
    @Column(name = "is_created_by_login_user")
    private Integer isCreatedByLoginUser;//Integer	是否由登录者创建的订单
    private Integer isTestOrder;//Integer	是否是测试账单 0：不是（默认） 1：是
    private Integer isVipPrice;//Integer	是否执行会员价 0：非会员价 1：会员价
    private String lockedFlag;//String	单已锁（如果此字段为空，则没有锁定，如果不为空表示帐单为锁定，通常这里是锁定的人员工号和姓名），锁定的账单不能除锁定人外，别人不能进行菜品及结账相关操作。
    private String modifyOrderLog;//String	修改订单日志
    @Column(name = "money_wipe_zero_type")
    private Integer moneyWipeZeroType;//Integer	抹零规则 0：不抹零 1：四舍五入到角 2：向上抹零到角 3：向下抹零到角 4：四舍五入到元 5：向上抹零到元 6：向下抹零到元
    @Column(name = "net_order_type_code")
    private String netOrderTypeCode;//String	账单数据签名字符串订单类型标识 WS_YD：网上预订 WS_SC：网上闪吃 WS_WM：网上外卖 WS_ZT：网上自提 WS_DN：堂食自助
    @Column(name = "order_mD5")
    private String orderMD5;//String	账单数据签名字符串
    private Integer orderStatus;//Integer	订单状态 40：已结账 30：废单,废单的相关菜品及结算明细不会出现在统计报表中。另外单独提供废单列表、存单列表，可以查看详情
    private Integer orderSubType;//Integer	订单类型（0：堂食 20：外卖 21：自提）
    private String paidAmount;//String	订单实收金额
    private String payAlert;//String	账单支付科目明细
    private Integer person;//Integer	消费人数
    private String promotionAmount;//String	优惠金额
    private String promotionDesc;//String	优惠描述
    private Long reportDate;//Long	报表统计日期，门店增加数据清机结转时间设定，该时间为次日小时数（1~12），默认为1，即次日凌晨1点，格式：yyyyMMdd，默认值0
    private String reviewBy;//String	账单审核人
    private Long reviewTime;//Long	账单审核时间，格式：yyyyMMddHHmmss，默认值0
    @Column(name = "saas_device_order_no")
    private String saasDeviceOrderNo;//String	按站点设备的单号DeviceCode+设备流水号
    private String saasOrderKey;//String	餐饮系统订单Key，格式：YYYYMMDD-ID-日流水号
    private String saasOrderNo;//String	日流水号
    private String saasOrderRemark;//String	账单备注（通常在开台时输入）
    private String sendCouponAmount;//String	赠券金额
    private String sendCouponRemark;//String	赠券说明
    private String sendFoodAmount;//String	赠菜金额合计
    @Column(name = "server_MAC")
    private String serverMAC;//String	服务器MAC地址
    private String shiftName;//String	收银班次
    @Column(name = "shop_ID")
    private Long shopID;//Long	店铺ID
    private String shopName;//String	店铺名称
    private String specialStatAmount;//String	特别统计分类菜品的折后金额
    private Long startTime;//Long	开台时间，格式：yyyyMMddHHssnn
    private String tableName;//String	桌台名称
    private String timeNameCheckout;//String	初次结账时的餐段名称(早餐，午餐，下午茶，晚餐，夜宵)
    private String timeNameStart;//String	开台时的餐段名称(早餐，午餐，下午茶，晚餐，夜宵)
    private String userAddress;//String	用户地址
    private String userMobile;//String	用户电话
    private String userName;//String	顾客姓名
    private Long userSex;//Long	0：女士 1：先生 2：未知
    private String waiterBy;//String	服务员
    private Integer YJZCount;//Integer	预结账次数
    private String userPayFlag;//String	支付宝user_id 微信openid 微信appid 微信sub_openid 微信sub_appid

    @Transient
    private List<FoodDetailModel> foodDetail;//List<FoodDetail>	账单中菜品信息详情
    @Transient
    private List<PayDetailModel> payDetail;//List<PayDetail >	账单中支付信息详情
}
