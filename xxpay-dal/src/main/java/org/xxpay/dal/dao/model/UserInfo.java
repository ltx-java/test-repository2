package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /*
     * 用户名Id
     * */
    private String id;
    /*
     * 用户名
     * */
    private String name;
    /*
     * 年龄
     * */
    private int age;
    /*
     * 地址
     * */
    private String address;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     *
     */
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
