package com.example.demo.model;


public class User {

  private long id;
  private String accountId;
  private String name;
  private String token;
  private long gmtCreate;
  private long gmtModified;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public long getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(long gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public long getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(long gmtModified) {
    this.gmtModified = gmtModified;
  }

}
