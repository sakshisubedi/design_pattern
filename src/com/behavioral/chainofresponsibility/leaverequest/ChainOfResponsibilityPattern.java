package com.behavioral.chainofresponsibility.leaverequest;

/*
* The Client may compose chains just once or compose them dynamically, depending on the application’s logic.
* Note that a request can be sent to any handler in the chain—it doesn’t have to be the first one.
* */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        HR hr = new HR();
        Manager manager = new Manager();

        teamLeader.setSupervisor(projectLeader);
        projectLeader.setSupervisor(hr);
        hr.setSupervisor(manager);

        LeaveInfo leave1 = new LeaveInfo(5,4, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave1) + "\n");

        LeaveInfo leave2 = new LeaveInfo(5,5, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave2) + "\n");

        LeaveInfo leave3 = new LeaveInfo(12,3, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave3) + "\n");

        LeaveInfo leave4 = new LeaveInfo(18,2, ReasonType.CRITICAL);
        System.out.println(teamLeader.applyLeave(leave4) + "\n");

        LeaveInfo leave5 = new LeaveInfo(18,2, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave5) + "\n");

        LeaveInfo leave6 = new LeaveInfo(30,2, ReasonType.SPECIAL);
        System.out.println(teamLeader.applyLeave(leave6) + "\n");
    }
}
