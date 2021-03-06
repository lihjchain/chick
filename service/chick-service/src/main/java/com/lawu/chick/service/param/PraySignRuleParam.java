package com.lawu.chick.service.param;

import java.util.List;

import com.lawu.chick.service.enums.StatusEnum;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author zhangyong
 * @date 2018/6/15.
 */
public class PraySignRuleParam {

    private Long id;

    @ApiModelProperty(value = "商品编号")
    private String productNum;

    @ApiModelProperty(value = "商品数量")
    private Integer productCount;

    @ApiModelProperty(value = "是否根据小鸡数量设置")
    private Boolean isBasisChick;

    @ApiModelProperty(value = "连续天数")
    private Integer day;

    @ApiModelProperty(value = "状态")
    private StatusEnum status;

    private List<PraySignRuleExtraParam> extras;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Boolean getIsBasisChick() {
        return isBasisChick;
    }

    public void setIsBasisChick(Boolean basisChick) {
        isBasisChick = basisChick;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public List<PraySignRuleExtraParam> getExtras() {
        return extras;
    }

    public void setExtras(List<PraySignRuleExtraParam> extras) {
        this.extras = extras;
    }
}
