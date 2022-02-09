package com.costaff;

import java.util.List;

public class Questions {
    private int qid;
    private String name;
    private Setting setting;
    private List<String> ans;
    private List<Answers> answersList;

    @Override
    public String toString() {
        return "Questions{" +
                "qid=" + qid +
                ", name='" + name + '\'' +
                ", setting=" + setting +
                ", ans=" + ans +
                ", answersList=" + answersList +
                '}';
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public List<String> getAns() {
        return ans;
    }

    public void setAns(List<String> ans) {
        this.ans = ans;
    }

    public List<Answers> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answers> answersList) {
        this.answersList = answersList;
    }

    public Questions(int qid, String name, Setting setting, List<String> ans, List<Answers> answersList) {
        this.qid = qid;
        this.name = name;
        this.setting = setting;
        this.ans = ans;
        this.answersList = answersList;
    }
}
