package com.behavioral.chainofresponsibility.leaverequest;

public class LeaveInfo {
    private int numberOfDays;
    private int empTier;
    private ReasonType reasonType;

    public LeaveInfo(int numberOfDays, int empTier, ReasonType reasonType) {
        this.numberOfDays = numberOfDays;
        this.empTier = empTier;
        this.reasonType = reasonType;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getEmpTier() {
        return empTier;
    }

    public ReasonType getReasonType() {
        return reasonType;
    }
}
