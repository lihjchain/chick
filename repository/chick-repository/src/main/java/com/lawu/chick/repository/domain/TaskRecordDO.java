package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.util.Date;

public class TaskRecordDO implements Serializable {
    /**
     *
     * 
     * task_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * task_record.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 类型，1关注,2邀请
     * task_record.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 
     * task_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * 
     * task_record.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_record.id
     *
     * @return the value of task_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_record.id
     *
     * @param id the value for task_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_record.user_num
     *
     * @return the value of task_record.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_record.user_num
     *
     * @param userNum the value for task_record.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_record.type
     *
     * @return the value of task_record.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_record.type
     *
     * @param type the value for task_record.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_record.gmt_create
     *
     * @return the value of task_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_record.gmt_create
     *
     * @param gmtCreate the value for task_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_record.gmt_modified
     *
     * @return the value of task_record.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_record.gmt_modified
     *
     * @param gmtModified the value for task_record.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}