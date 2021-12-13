package com.rsosor.practice.service;

import com.rsosor.practice.exception.EntityNotFoundException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Use ExpectedException Rule 編寫斷言
 *
 * JUnit Rule
 * 可以實現 @Before、@After 的功能
 * Rule 允許彈性地加入或重新定義測是類別中每個測試方法的行為
 * @Rule 必須標註在測試類別的 public field，其 field 類必須實作 TestRule 介面
 *
 * @author RsosoR
 * @date 2021/12/5
 */
public class IssueServiceTest3 {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private static final Long ID = 1L;

    private IssueService issueService;

    @Before
    public void setup() {
        issueService = new IssueService();
    }

    @Test
    public void queryById_ShouldThrowException() {
        thrown.expect(EntityNotFoundException.class);
        issueService.queryById(ID);
    }

    // 如果想驗證異常物件是否包含正確的 ID
    // org.hamcrest:hamcrest-library
    // @Test
    // public void queryById_ShouldThrowException() {
    //  throw.expect(hasProperty("id", is(ID)));
    //  issueService.queryById(ID);
}
