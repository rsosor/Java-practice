package com.example.rsosor.generics;

public enum LogType implements IValueEnum<Integer> {

    BLOG_INITIALIZED(0),

    POST_PUBLISHED(5),

    POST_EDITED(15),

    POST_DELETED(20),

    LOGGED_IN(25),

    LOGGED_OUT(30),

    LOGIN_FAILED(35),

    PASSWORD_UPDATE(40),

    PROFILE_UPDATED(45),

    SHEET_PUBLISHED(50),

    SHEET_EDITED(55),

    SHEET_DELETED(60),

    MFA_UPDATED(65),

    LOGGED_PRE_CHECK(70);

    private final Integer value;

    LogType(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
