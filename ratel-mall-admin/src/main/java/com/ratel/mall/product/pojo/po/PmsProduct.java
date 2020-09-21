package com.ratel.mall.product.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 商品信息
    */
@ApiModel(value="com-ratel-mall-product-pojo-po-PmsProduct")
@Data
@TableName(value = "pms_product")
public class PmsProduct implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "brand_id")
    @ApiModelProperty(value="")
    private Long brandId;

    @TableField(value = "product_category_id")
    @ApiModelProperty(value="")
    private Long productCategoryId;

    @TableField(value = "feight_template_id")
    @ApiModelProperty(value="")
    private Long feightTemplateId;

    @TableField(value = "product_attribute_category_id")
    @ApiModelProperty(value="")
    private Long productAttributeCategoryId;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "pic")
    @ApiModelProperty(value="")
    private String pic;

    /**
     * 货号
     */
    @TableField(value = "product_sn")
    @ApiModelProperty(value="货号")
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @TableField(value = "delete_status")
    @ApiModelProperty(value="删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    @TableField(value = "publish_status")
    @ApiModelProperty(value="上架状态：0->下架；1->上架")
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    @TableField(value = "new_status")
    @ApiModelProperty(value="新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @TableField(value = "recommand_status")
    @ApiModelProperty(value="推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @TableField(value = "verify_status")
    @ApiModelProperty(value="审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    /**
     * 销量
     */
    @TableField(value = "sale")
    @ApiModelProperty(value="销量")
    private Integer sale;

    @TableField(value = "price")
    @ApiModelProperty(value="")
    private BigDecimal price;

    /**
     * 促销价格
     */
    @TableField(value = "promotion_price")
    @ApiModelProperty(value="促销价格")
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    @TableField(value = "gift_growth")
    @ApiModelProperty(value="赠送的成长值")
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    @TableField(value = "gift_point")
    @ApiModelProperty(value="赠送的积分")
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    @TableField(value = "use_point_limit")
    @ApiModelProperty(value="限制使用的积分数")
    private Integer usePointLimit;

    /**
     * 副标题
     */
    @TableField(value = "sub_title")
    @ApiModelProperty(value="副标题")
    private String subTitle;

    /**
     * 商品描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="商品描述")
    private String description;

    /**
     * 市场价
     */
    @TableField(value = "original_price")
    @ApiModelProperty(value="市场价")
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    @TableField(value = "stock")
    @ApiModelProperty(value="库存")
    private Integer stock;

    /**
     * 库存预警值
     */
    @TableField(value = "low_stock")
    @ApiModelProperty(value="库存预警值")
    private Integer lowStock;

    /**
     * 单位
     */
    @TableField(value = "unit")
    @ApiModelProperty(value="单位")
    private String unit;

    /**
     * 商品重量，默认为克
     */
    @TableField(value = "weight")
    @ApiModelProperty(value="商品重量，默认为克")
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    @TableField(value = "preview_status")
    @ApiModelProperty(value="是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @TableField(value = "service_ids")
    @ApiModelProperty(value="以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    @TableField(value = "keywords")
    @ApiModelProperty(value="")
    private String keywords;

    @TableField(value = "note")
    @ApiModelProperty(value="")
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @TableField(value = "album_pics")
    @ApiModelProperty(value="画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    @TableField(value = "detail_title")
    @ApiModelProperty(value="")
    private String detailTitle;

    @TableField(value = "detail_desc")
    @ApiModelProperty(value="")
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    @TableField(value = "detail_html")
    @ApiModelProperty(value="产品详情网页内容")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @TableField(value = "detail_mobile_html")
    @ApiModelProperty(value="移动端网页详情")
    private String detailMobileHtml;

    /**
     * 促销开始时间
     */
    @TableField(value = "promotion_start_time")
    @ApiModelProperty(value="促销开始时间")
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    @TableField(value = "promotion_end_time")
    @ApiModelProperty(value="促销结束时间")
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    @TableField(value = "promotion_per_limit")
    @ApiModelProperty(value="活动限购数量")
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @TableField(value = "promotion_type")
    @ApiModelProperty(value="促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    /**
     * 品牌名称
     */
    @TableField(value = "brand_name")
    @ApiModelProperty(value="品牌名称")
    private String brandName;

    /**
     * 商品分类名称
     */
    @TableField(value = "product_category_name")
    @ApiModelProperty(value="商品分类名称")
    private String productCategoryName;

    private static final long serialVersionUID = 1L;
}