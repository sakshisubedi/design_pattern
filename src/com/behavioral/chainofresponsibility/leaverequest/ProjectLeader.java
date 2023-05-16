package com.behavioral.chainofresponsibility.leaverequest;

/*
 * Concrete Handlers contain the actual code for processing requests.
 * Upon receiving a request, each handler must decide whether to process it and, additionally,
 * whether to pass it along the chain.
 * Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
 * */
public class ProjectLeader extends LeaveHandler{
    @Override
    public String applyLeave(LeaveInfo leaveInfo) {
        //"reasonType" is not going to be consider under TeamLeader & ProjectLeader
        //Project Leader can approve up to 14 days, otherwise it will pass to the HR
        if (leaveInfo.getNumberOfDays() <= 14) {
            //Employee tier should be 3 or above to get approved
            if (leaveInfo.getEmpTier() <= 3) {
                return "Your leave days has been APPROVED by Project Leader";
            }else{
                return "You employee Tier level is too low for request " + leaveInfo.getNumberOfDays() + " days";
            }
        } else {
            return supervisor.applyLeave(leaveInfo);
        }
    }
}
