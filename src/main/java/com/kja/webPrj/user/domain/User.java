package com.kja.webPrj.user.domain;


import java.time.LocalDateTime;


public class User {
    public long id;
    public LocalDateTime regDate;
    public LocalDateTime updateDate;
    public String email;
    public String password;
    public String name;
}
