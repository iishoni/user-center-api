package com.iishoni.usercenterapi.api;

public interface Urls {

    /**
     * 后台用户
     */
    interface Admin {
        String ROOT = "/admin";
        String GET_ADMIN_LIST = "/list";
        String GET_ADMIN_BY_ID = "/{adminId}";
        String GET_ADMIN_BY_PROFILE = "";
        String SAVE_ADMIN = "";
        String UPDATE_ADMIN = "/{adminId}";
        String DELETE_ADMIN = "/{adminId}";
    }

}
