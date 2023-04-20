package org.sang.service.serviceInterface;

import org.sang.bean.Role;
import org.sang.bean.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserServiceIn {
    public UserDetails loadUserByUsername(String s);
    public int reg(User user);
    public int updateUserEmail(String email);
    public List<User> getUserByNickname(String nickname);
    public List<Role> getAllRole();
    public int updateUserEnabled(Boolean enabled, Long uid);
    public int deleteUserById(Long uid);
    public int updateUserRoles(Long[] rids, Long id);
    public User getUserById(Long id);
}
