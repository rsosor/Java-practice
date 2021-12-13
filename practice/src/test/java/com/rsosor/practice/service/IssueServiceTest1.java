package com.rsosor.practice.service;

import com.rsosor.practice.exception.EntityNotFoundException;
import org.junit.Before;
import org.junit.Test;

/**
 * Use @Test 編寫斷言
 *
 * @author RsosoR
 * @date 2021/12/5
 */
public class IssueServiceTest1 {

    private static final Long ID = 1L;

    private IssueService issueService;

    @Before
    public void setup() {
        issueService = new IssueService();
    }

    @Test(expected = EntityNotFoundException.class)
    public void queryByIdShouldThrowException() {
        issueService.queryById(ID);
    }
}
