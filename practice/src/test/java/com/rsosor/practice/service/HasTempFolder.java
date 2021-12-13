package com.rsosor.practice.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TemporaryFolder Rule
 *
 * 幫我們建立暫時的資料夾或檔案，並在執行結束後刪除
 *
 * @author RsosoR
 * @date 2021/12/5
 */
public class HasTempFolder {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {
        File createFile = temporaryFolder.newFolder("testFolder");
        assertThat(createFile).isFile();
    }
}
