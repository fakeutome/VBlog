package org.sang.controller.controllerIn;

import org.sang.bean.RespBean;
import org.sang.bean.Role;
import org.sang.bean.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserManaControllerIn {
    public List<User> getUserByNickname(String nickname);
    public User getUserById(@PathVariable Long id);
    public List<Role> getAllRole();
    public RespBean updateUserEnabled(Boolean enabled, Long uid);
    public RespBean deleteUserById(@PathVariable Long uid);
    public RespBean updateUserRoles(Long[] rids, Long id);
}
