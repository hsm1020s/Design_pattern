package Facade;

import Facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
        PageMaker.makeWelcomePage("dojun@example.com=dojun", "welcome1.html");
    }
}
