package com.dbq.principle.lawOfDemeter;

/**
 * @author dabaoqiang
 */
public class TeamLeaderTow {

    public void commandCheckNumber(EmployeeTow employeeTow) {
        employeeTow.checkNumberOfCourses();
    }

    public static void main(String[] args) {
        /**
         * 这些修改以后，就是符合迪米特法则，我是leader我只需要知道，
         * 我的小弟，在干啥，至于，我小弟在具体干什么，我不需要知道
         * 最少知道原则
         *
         */
        TeamLeaderTow teamLeader = new TeamLeaderTow();
        teamLeader.commandCheckNumber(new EmployeeTow());

    }
}
