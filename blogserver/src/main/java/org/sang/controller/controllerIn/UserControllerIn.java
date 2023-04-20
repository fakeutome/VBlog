package org.sang.controller.controllerIn;

import org.sang.bean.RespBean;

public interface UserControllerIn {
    public String currentUserName();
    public Long currentUserId();
    public String currentUserEmail();
    public Boolean isAdmin();
    public RespBean updateUserEmail(String email);
}
