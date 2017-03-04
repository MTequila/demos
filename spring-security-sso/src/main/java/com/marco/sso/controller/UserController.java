package com.marco.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

/**
 * Created by marco on 2017/3/5.
 */
@RolesAllowed("ROLE_ADMIN")
@Controller
@RequestMapping("/user")
public class UserController {
}
