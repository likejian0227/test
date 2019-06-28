package com.likejian.test.entity;

import java.io.Serializable;
import java.util.Date;

public class Dorm implements Serializable {
    private Integer dormId;

    private String dormCode;

    private Integer dormSex;

    private Integer dormType;

    private Integer dormLivedNum;

    private Boolean dormStaffChangeFlag;

    private Integer dormLeaderId;

    private String dormLeaderName;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getDormId() {
        return dormId;
    }

    public void setDormId(Integer dormId) {
        this.dormId = dormId;
    }

    public String getDormCode() {
        return dormCode;
    }

    public void setDormCode(String dormCode) {
        this.dormCode = dormCode == null ? null : dormCode.trim();
    }

    public Integer getDormSex() {
        return dormSex;
    }

    public void setDormSex(Integer dormSex) {
        this.dormSex = dormSex;
    }

    public Integer getDormType() {
        return dormType;
    }

    public void setDormType(Integer dormType) {
        this.dormType = dormType;
    }

    public Integer getDormLivedNum() {
        return dormLivedNum;
    }

    public void setDormLivedNum(Integer dormLivedNum) {
        this.dormLivedNum = dormLivedNum;
    }

    public Boolean getDormStaffChangeFlag() {
        return dormStaffChangeFlag;
    }

    public void setDormStaffChangeFlag(Boolean dormStaffChangeFlag) {
        this.dormStaffChangeFlag = dormStaffChangeFlag;
    }

    public Integer getDormLeaderId() {
        return dormLeaderId;
    }

    public void setDormLeaderId(Integer dormLeaderId) {
        this.dormLeaderId = dormLeaderId;
    }

    public String getDormLeaderName() {
        return dormLeaderName;
    }

    public void setDormLeaderName(String dormLeaderName) {
        this.dormLeaderName = dormLeaderName == null ? null : dormLeaderName.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dormId=").append(dormId);
        sb.append(", dormCode=").append(dormCode);
        sb.append(", dormSex=").append(dormSex);
        sb.append(", dormType=").append(dormType);
        sb.append(", dormLivedNum=").append(dormLivedNum);
        sb.append(", dormStaffChangeFlag=").append(dormStaffChangeFlag);
        sb.append(", dormLeaderId=").append(dormLeaderId);
        sb.append(", dormLeaderName=").append(dormLeaderName);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}