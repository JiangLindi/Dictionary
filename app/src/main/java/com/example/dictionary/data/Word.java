package com.example.dictionary.data;

public class Word {
    private int IamgeId;
    private String Title;
/*
    public Word(int IamgeId, String Title) {
        this.IamgeId=IamgeId;
        this.Title=Title;
    }

    public int getIamgeId() {
        return IamgeId;
    }

    public void setIamgeId(int iamgeId) {
        IamgeId = iamgeId;
    }
*/
public Word( String Title) {
    this.Title=Title;
}
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}