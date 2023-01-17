package com.bitc.security03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sample/")
@Controller
public class SampleController {

  @RequestMapping("/all")
  public String exAll() throws Exception {
    return "sample/all";
  }

  @RequestMapping("/member")
  public String exMember() {
    return "sample/member";
  }

  @RequestMapping("/admin")
  public String exAdmin() {
    return "sample/admin";
  }
}
