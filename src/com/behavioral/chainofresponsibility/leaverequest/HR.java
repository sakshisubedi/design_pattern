package com.behavioral.chainofresponsibility.leaverequest;

/*
* Concrete Handlers contain the actual code for processing requests.
* Upon receiving a request, each handler must decide whether to process it and, additionally,
* whether to pass it along the chain.
* Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
* */
public class HR extends LeaveHandler{

    @Override
    public String applyLeave(LeaveInfo leaveInfo) {
        //HR can approve up to 21 days, otherwise it will pass to the Manager
        if (leaveInfo.getNumberOfDays() <= 21) {
            //Employee tier should be 3 or above & reason type should not be "Regular" to get approved
            if(leaveInfo.getEmpTier() <= 3 && !leaveInfo.getReasonType().equals(ReasonType.REGULAR)){
                return "Your leave days has been APPROVED by HR";
            }else{
                return "Your leave request has been DENIED by HR";
            }
        } else {
            return supervisor.applyLeave(leaveInfo);
        }
    }
}
