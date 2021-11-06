package com.macro.demo.designpatterns.observerpattern;

import com.macro.demo.designpatterns.observerpattern.impl.PodcastA;
import com.macro.demo.designpatterns.observerpattern.impl.Student;

public class Test {

    public static void main(String[] args) {
        IObserverable podcast = new PodcastA();
        IObserver student = new Student(podcast);
        podcast.add(student);

        // 預設節目是英文廣播
        podcast.notifyObservers();

        // 節目變為今年流行歌
        ((PodcastA) podcast).name = "今年流行歌";

        podcast.notifyObservers();
    }
}
