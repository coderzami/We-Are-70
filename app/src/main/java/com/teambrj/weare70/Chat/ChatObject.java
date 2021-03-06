package com.teambrj.weare70.Chat;

import com.teambrj.weare70.User.UserObject;

import java.io.Serializable;
import java.util.ArrayList;

public class ChatObject implements Serializable {
    private String chatId;

    private ArrayList<UserObject> userObjectArrayList = new ArrayList<>();

    public ChatObject(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public ArrayList<UserObject> getUserObjectArrayList() {
        return userObjectArrayList;
    }

    public void addToUserObjectArrayList(UserObject mUser){
        userObjectArrayList.add(mUser);
    }
}
