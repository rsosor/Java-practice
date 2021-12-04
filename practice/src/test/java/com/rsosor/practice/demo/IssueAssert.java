package com.rsosor.practice.demo;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public final class IssueAssert extends AbstractAssert<IssueAssert, Issue> {

    private IssueAssert(Issue actual) {
        super(actual, IssueAssert.class);
    }

    public static IssueAssert assertThatIssue(Issue actual) {
        return new IssueAssert(actual);
    }

    /**
     * 使用自訂斷言會增加一個類別而增加複雜度，可能原因為：
     * ． 自訂斷言比一般斷言更容易閱讀
     * ． 移除實作細節，使測試更容易閱讀
     * ． 自訂斷言使測試案例可以移除業務邏輯，並因集中管理使我們測試更容易編寫及維護
     *
     * @return
     */
    public IssueAssert isResolved() {
        SoftAssertions assertions = new SoftAssertions();

        assertions.assertThat(actual.getActiveState())
                .overridingErrorMessage("已解決的問題的活動狀態必須為 DONE，但是為: %s",
                        actual.getActiveState())
                .isEqualTo(ActiveState.DONE);

        assertions.assertThat(actual.getLog())
                .overridingErrorMessage("已解決的問題必須要有紀錄內容，但是為: %s",
                        actual.getLog())
                .isNotNull();

        assertions.assertAll();
        return this;
    }
}
