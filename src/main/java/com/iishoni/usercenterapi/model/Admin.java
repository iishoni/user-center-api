package com.iishoni.usercenterapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {

    private static final long serialVersionUID = 1675934544413749317L;

    private Long id;
    private String uname;
    private String pwd;
    private String nick;
    private String avatar;
    private String role;
    private String state;
    private Date lastLoginTime;
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;

}