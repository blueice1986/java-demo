/*
 * ProjectName: springboot-parent
 * Author: tree.yu
 * Description:
 * Version: 1.0
 * Date: 18-5-17 下午9:07
 * LastModified: 18-5-9 上午10:09
 */

package com.ejyi.demo.springboot.server.dao.po;

import java.util.Date;

public class ActiveInfoPO {
    private Long id;

    private String code;

    private Integer size;

    private Double score;

    private Integer type;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public ActiveInfoPO() {
    }

    public ActiveInfoPO(Long id, String code, Integer size, Double score, Integer type, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.code = code;
        this.size = size;
        this.score = score;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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