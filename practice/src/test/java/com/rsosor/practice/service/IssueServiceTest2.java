package com.rsosor.practice.service;

import com.rsosor.practice.exception.EntityNotFoundException;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

/**
 * Use AssertJ 編寫斷言
 *
 * @author RsosoR
 * @date 2021/12/5
 */
public class IssueServiceTest2 {

    private static final long ID = 1L;

    private IssueService issueService;

    @Before
    public void setup() {
        issueService = new IssueService();
    }

    @Test(expected = EntityNotFoundException.class)
    public void queryByIdShouldThrowException() {
        Throwable throwable = catchThrowable(() -> issueService.queryById(ID));

        assertThat(throwable)
                .isExactlyInstanceOf(EntityNotFoundException.class)
                .hasMessageContaining("找不到實體");
    }
}
