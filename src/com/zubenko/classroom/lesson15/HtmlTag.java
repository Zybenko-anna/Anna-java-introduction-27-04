package com.zubenko.classroom.lesson15;

public class HtmlTag {

    String name;
    String text;
    HtmlTag child;

    public HtmlTag(String name, HtmlTag child) {
        this.name = name;
        this.child = child;
    }
}
