package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.util.Date;

public class InventoryDetailDO implements Serializable {
    /**
     *
     * 主键
     * inventory_detail.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 库存id
     * inventory_detail.inventory_id
     *
     * @mbg.generated
     */
    private Long inventoryId;

    /**
     *
     * 用户编号
     * inventory_detail.member_num
     *
     * @mbg.generated
     */
    private String memberNum;

    /**
     *
     * 好友编号
     * inventory_detail.friend_num
     *
     * @mbg.generated
     */
    private String friendNum;

    /**
     *
     * 商品编号
     * inventory_detail.product_num
     *
     * @mbg.generated
     */
    private String productNum;

    /**
     *
     * 商品数量
     * inventory_detail.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * 1--购买，2--帮助好友奖励，3--签到奖励，4--自己耗损，5--帮助好友耗损
     * inventory_detail.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 1--增加，2--减少
     * inventory_detail.direction
     *
     * @mbg.generated
     */
    private Byte direction;

    /**
     *
     * 创建时间
     * inventory_detail.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table inventory_detail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.id
     *
     * @return the value of inventory_detail.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.id
     *
     * @param id the value for inventory_detail.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.inventory_id
     *
     * @return the value of inventory_detail.inventory_id
     *
     * @mbg.generated
     */
    public Long getInventoryId() {
        return inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.inventory_id
     *
     * @param inventoryId the value for inventory_detail.inventory_id
     *
     * @mbg.generated
     */
    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.member_num
     *
     * @return the value of inventory_detail.member_num
     *
     * @mbg.generated
     */
    public String getMemberNum() {
        return memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.member_num
     *
     * @param memberNum the value for inventory_detail.member_num
     *
     * @mbg.generated
     */
    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.friend_num
     *
     * @return the value of inventory_detail.friend_num
     *
     * @mbg.generated
     */
    public String getFriendNum() {
        return friendNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.friend_num
     *
     * @param friendNum the value for inventory_detail.friend_num
     *
     * @mbg.generated
     */
    public void setFriendNum(String friendNum) {
        this.friendNum = friendNum == null ? null : friendNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.product_num
     *
     * @return the value of inventory_detail.product_num
     *
     * @mbg.generated
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.product_num
     *
     * @param productNum the value for inventory_detail.product_num
     *
     * @mbg.generated
     */
    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.quantity
     *
     * @return the value of inventory_detail.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.quantity
     *
     * @param quantity the value for inventory_detail.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.type
     *
     * @return the value of inventory_detail.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.type
     *
     * @param type the value for inventory_detail.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.direction
     *
     * @return the value of inventory_detail.direction
     *
     * @mbg.generated
     */
    public Byte getDirection() {
        return direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.direction
     *
     * @param direction the value for inventory_detail.direction
     *
     * @mbg.generated
     */
    public void setDirection(Byte direction) {
        this.direction = direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_detail.gmt_create
     *
     * @return the value of inventory_detail.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_detail.gmt_create
     *
     * @param gmtCreate the value for inventory_detail.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}