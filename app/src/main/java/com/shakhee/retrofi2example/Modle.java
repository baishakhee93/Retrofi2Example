package com.shakhee.retrofi2example;

import com.google.gson.annotations.SerializedName;

public class Modle {
    @SerializedName("author")
    private String author;

    @SerializedName("en")
    private String en;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
