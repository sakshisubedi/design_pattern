package com.behavioral.chainofresponsibility.leaverequest;

/*
 * Concrete Handlers contain the actual code for processing requests.
 * Upon receiving a request, each handler must decide whether to process it and, additionally,
 * whether to pass it along the chain.
 * Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
 * */
public class TeamLeader extends LeaveHandler{
    @Override
    public String applyLeave(LeaveInfo leaveInfo) {
        //"reasonType" is not going to be consider under TeamLeader & ProjectLeader
        //Team Leader can approve up to 7 days, otherwise it will pass to the Project Leader
        if(leaveInfo.getNumberOfDays() < 7) {
            if(leaveInfo.getEmpTier() <= 4) {
                return "Your leave days has been APPROVED by TeamLeader";
            } else {
                return "You employee Tier level is too low for request " + leaveInfo.getNumberOfDays() + " days";
            }
        } else {
            return supervisor.applyLeave(leaveInfo);
        }
    }
}
