package com.rsosor.practice.demo;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class IssueTest {

    private static final String CREATOR = "CREATOR";

    /**
     * 多軟斷言不容易閱讀與維護
     * 可以改用自訂斷言
     */
    @Test
    public void testIssue1IsResolved() {
        Issue issue = new Issue();
        issue.setId(1L);
        issue.setActiveState(ActiveState.DONE);
        issue.setCreator(CREATOR);

        SoftAssertions assertions = new SoftAssertions();

        assertions.assertThat(issue.getActiveState())
                .overridingErrorMessage("已解決的問題的活動狀態必須為 DONE，但是為: %s",
                        issue.getActiveState())
                .isEqualTo(ActiveState.DONE);

        assertions.assertThat(issue.getLog())
                .overridingErrorMessage("已解決的問題必須要有紀錄內容，但是為: %s",
                        issue.getLog())
                .isNotNull();

        assertions.assertAll();
    }

}
