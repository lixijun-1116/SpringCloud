package com.springboot.entity;

import java.math.BigInteger;

/**
 * @version v1.0
 * @ProjectName: zyt
 * @ClassName: InterviewPlan
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 李茜骏
 * @Date: 2020/10/28 9:50
 */
public class InterviewPlan {

    // 规划面谈id
    private BigInteger id;

    //规划考核月份
    private int apprMonth;

    //规划面谈状态IF：有效，TR：失效（默认值IF）
    private String planState;

    //操作时间
    private String operateTime;

    //外勤是否确认0：未确认，1：已确认（默认值0）
    private int isAgentConfirm;

    private String agentCode;

    private String userCode;

    private String apprType;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public int getApprMonth() {
        return apprMonth;
    }

    public void setApprMonth(int apprMonth) {
        this.apprMonth = apprMonth;
    }

    public String getPlanState() {
        return planState;
    }

    public void setPlanState(String planState) {
        this.planState = planState;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public int getIsAgentConfirm() {
        return isAgentConfirm;
    }

    public void setIsAgentConfirm(int isAgentConfirm) {
        this.isAgentConfirm = isAgentConfirm;
    }

    @Override
    public String toString() {
        return "InterviewPlan{" +
                "id=" + id +
                ", apprMonth=" + apprMonth +
                ", planState='" + planState + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", isAgentConfirm=" + isAgentConfirm +
                ", agentCode='" + agentCode + '\'' +
                ", userCode='" + userCode + '\'' +
                ", apprType='" + apprType + '\'' +
                '}';
    }

    public InterviewPlan(){
    }

    public InterviewPlan(BigInteger id, int apprMonth, String planState, String operateTime, int isAgentConfirm, String agentCode, String userCode, String apprType) {
        this.id = id;
        this.apprMonth = apprMonth;
        this.planState = planState;
        this.operateTime = operateTime;
        this.isAgentConfirm = isAgentConfirm;
        this.agentCode = agentCode;
        this.userCode = userCode;
        this.apprType = apprType;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getApprType() {
        return apprType;
    }

    public void setApprType(String apprType) {
        this.apprType = apprType;
    }
}
