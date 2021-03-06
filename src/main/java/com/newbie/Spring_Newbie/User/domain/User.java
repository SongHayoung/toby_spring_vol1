package com.newbie.Spring_Newbie.User.domain;

public class User {
    String id;
    String name;
    String password;
    String email;

    Level level;
    int login;
    int recommend;
    public User(String id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public User(String id, String name, String password, String email, Level level, int login, int recommend){
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.level = level;
        this.login = login;
        this.recommend = recommend;
    }
    public User() {}
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Level getLevel() {return level;}
    public void setLevel(Level level) {this.level = level;}
    public int getLogin() { return login; }
    public void setLogin(int login) {this.login = login;}
    public int getRecommend() {return recommend;}
    public void setRecommend(int recommend) {this.recommend = recommend;}
    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

    public void upgradeLevel(){
        Level nextLevel = this.level.nextLevel();
        if(nextLevel==null){
            throw new IllegalStateException(this.level + "is can not upgrade.");
        }
        else{
            this.level = nextLevel;
        }
    }
}
