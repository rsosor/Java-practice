package com.rsosor.javase.innerclass;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerClassTest {

    @Test
    public void memberInnerClass() {
        MemberInnerClass out = new MemberInnerClass();
        MemberInnerClass.Inner in = out.new Inner();
        in.seeOuter();
    }

    @Test
    public void localInnerClass() {
        new LocalInnerClass().doSomething();
    }

    /**
     * 繼承式的匿名內部類
     */
    @Test
    public void anonymousInnerClass() {
        Car car = new Car() {
            public void drive() {
                System.out.println("Driving another car!");
                System.out.println();
            }
        };
        car.drive();
    }

    /**
     * 介面式的匿名內部類
     */
    @Test
    public void anonymousInnerClass2() {
        IVehicle vehicle = new IVehicle() {
            @Override
            public void drive() {
                System.out.println("Driving a car!");
                System.out.println();
            }
        };
        vehicle.drive();
    }

    /**
     * 介面式的匿名內部類
     */
    @Test
    public void threadDemo() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).start();
    }

    /**
     * 介面式的匿名內部類
     */
    @Test
    public void swingTest() {
        JFrame frame = new JFrame("JFrame");
        JButton button = new JButton("JButton");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
                System.exit(0);
            }
        });

        frame.setVisible(true);

    }

    /**
     * 參數式的匿名內部類
     */
    @Test
    public void anonymousInnerClass3() {
        static void go() {
            Bar b = new Bar();
            b.doStuff(new IFoo() {
                @Override
                public void foo() {
                    System.out.println("foo");
                }
            });
        }
    }

    @Test
    public void staticInnerClass() {

    }

    @Test
    public void case1() {
        MemberInnerClass.makeInner2();
        new MemberInnerClass().new Inner().seeOuter();
        MemberInnerClass.Inner.print();
        System.out.println(MemberInnerClass.Inner.i);
        System.out.println();
    }
}
