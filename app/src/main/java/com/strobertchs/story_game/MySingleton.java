package com.strobertchs.story_game;

public class MySingleton {

    private static MySingleton instance;

    public static MySingleton getInstance() {
        if (instance == null)
            instance = new MySingleton();
        return instance;
    }

    private MySingleton() {
    }

    private String strEnableLoad;

    public String getStrEnableLoad() {
        return strEnableLoad;
    }

    public void setStrEnableLoad(String strEnableLoad) {
        this.strEnableLoad = strEnableLoad;
    }

    private String strEnableRoman;

    public String getStrEnableRoman() {
        return strEnableRoman;
    }

    public void setStrEnableRoman(String strEnableRoman) {
        this.strEnableRoman = strEnableRoman;
    }

    private String strEnableAshley;

    public String getStrEnableAshley() {
        return strEnableAshley;
    }

    public void setStrEnableAshley(String strEnableAshley) {
        this.strEnableAshley = strEnableAshley;
    }

}

