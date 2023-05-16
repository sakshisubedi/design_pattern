package com.behavioral.chainofresponsibility.leaverequest;

/*
 * Concrete Handlers contain the actual code for processing requests.
 * Upon receiving a request, each handler must decide whether to process it and, additionally,
 * whether to pass it along the chain.
 * Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
 * */
public class Manager extends LeaveHandler{
    @Override
    public String applyLeave(LeaveInfo leaveInfo) {
        //Only Manager has the authority to approve more than 21 days
        if (leaveInfo.getNumberOfDays() > 21) {
            //Employee tier should be 2 or above & reason type should be "Special" to get approved
            if (leaveInfo.getEmpTier() <= 2 && leaveInfo.getReasonType().equals(ReasonType.SPECIAL)) {
                return "Your leave days has been APPROVED by Manager";
            }
        }
        return "Your leave request has been DENIED by Manager";
    }
}
