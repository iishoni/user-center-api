package com.iishoni.usercenterapi.api;

public interface Urls {

    /**
     * 后台用户
     */
    interface Admin {
        String ROOT = "/admin";
        String GET_ADMIN_LIST = "";
        String GET_ADMIN_INFO = "/{adminId}";
        String SAVE_ADMIN = "";
        String UPDATE_ADMIN = "/{adminId}";
        String DELETE_ADMIN = "/{adminId}";
    }

}
