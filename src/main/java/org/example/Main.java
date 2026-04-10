package org.example;



public class Main {
    static void main() {
        new App().run();

        Rq rq = new Rq("목록?searchKeywordType=content&searchKeyword=자바&page=2&id=9");
        System.out.println("actionName : " + rq.getActionName());
        System.out.println("params searchKeywordType : " + rq.getParam("searchKeywordType", ""));
        System.out.println("params searchKeyword : " + rq.getParam("searchKeyword", ""));

        System.out.println("params page : " + rq.getParamAsInt("page", -1));
        System.out.println("params page : " + rq.getParamAsInt("id", -1));
        System.out.println("params page : " + rq.getParamAsInt("sort", -1));

    }
}