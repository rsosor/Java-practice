package com.macro.demo.designpatterns.bridgepattern;

import com.macro.demo.designpatterns.bridgepattern.impl.Bag;
import com.macro.demo.designpatterns.bridgepattern.impl.Book;
import com.macro.demo.designpatterns.bridgepattern.sub.FewView;
import com.macro.demo.designpatterns.bridgepattern.sub.FullView;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    public void test() {
        FewView fewView = new FewView();
        System.out.println("----- 簡單包包說明 -----");
        fewView.setResources(new Bag());
        fewView.show();
        System.out.println("----- 簡單書本說明 -----");
        fewView.setResources(new Book());
        fewView.show();

        FullView fullView = new FullView();
        System.out.println("----- 詳細包包說明 -----");
        fullView.setResources(new Bag());
        fullView.show();
        System.out.println("----- 詳細書本說明 -----");
        fullView.setResources(new Book());
        fullView.show();
    }
}
