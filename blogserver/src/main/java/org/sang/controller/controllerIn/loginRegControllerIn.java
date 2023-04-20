package org.sang.controller.controllerIn;

import org.sang.bean.RespBean;
import org.sang.bean.User;

public interface loginRegControllerIn {
    public RespBean loginError();
    public RespBean loginSuccess();
    public RespBean loginPage();
    public RespBean reg(User user);
}
