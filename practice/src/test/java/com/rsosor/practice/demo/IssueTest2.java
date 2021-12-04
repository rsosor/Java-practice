package com.rsosor.practice.demo;

import org.junit.jupiter.api.Test;

public class IssueTest2 {

    private static final String CREATOR = "CREATOR";

    @Test
    public void testIssue1IsResolved() {
        Issue issue = new Issue();
        issue.setId(1L);
        issue.setActiveState(ActiveState.DONE);
        issue.setCreator(CREATOR);

        IssueAssert.assertThatIssue(issue).isResolved();
    }

    @Test
    public void testIssue2IsResolved() {
        Issue issue = new Issue();
        issue.setId(2L);
        issue.setActiveState(ActiveState.DONE);
        issue.setCreator(CREATOR);
        issue.setLog("everything is ok");

        IssueAssert.assertThatIssue(issue).isResolved();
    }
}
