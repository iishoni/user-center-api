package com.iishoni.usercenterapi.api;

import com.iishoni.usercenterapi.model.Admin;
import com.iishoni.web.view.Page;
import com.iishoni.web.view.ResponseVo;
import org.springframework.web.bind.annotation.*;

@RequestMapping(Urls.Admin.ROOT)
public interface AdminApi {

    @GetMapping(Urls.Admin.GET_ADMIN_LIST)
    ResponseVo<Page<Admin>> getAdminList(@RequestParam Integer pageNum, @RequestParam Integer pageSize);

    @GetMapping(Urls.Admin.GET_ADMIN_BY_ID)
    ResponseVo<Admin> getAdminById(@PathVariable Long adminId);

    @GetMapping(Urls.Admin.GET_ADMIN_BY_PROFILE)
    ResponseVo<Admin> getAdminByProfile(@RequestParam String uname, @RequestParam String pwd);

    @PostMapping(Urls.Admin.SAVE_ADMIN)
    ResponseVo saveAdmin(@RequestBody Admin admin);

    @PutMapping(Urls.Admin.UPDATE_ADMIN)
    ResponseVo updateAdmin(@PathVariable Long adminId, @RequestBody Admin admin);

    @DeleteMapping(Urls.Admin.DELETE_ADMIN)
    ResponseVo deleteAdmin(@PathVariable Long adminId);

}
