package com.demo.portlet.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping(value = "VIEW")
public class SpringMVCPortletDemo {

  @RenderMapping
  public String viewHomePage(RenderRequest request, RenderResponse response) {

    return "view";

  }

  @RenderMapping(params = "action=renderOne")
  public String handleRenderOneRequest(RenderRequest request, RenderResponse response) {

    return "renderOne";

  }

  @ActionMapping(params = "action=actionOne")
  public void handleActionOneRequest(ActionRequest request, ActionResponse response) {
    response.setRenderParameter("message", "Hi dr , this is ur sender...!!!");
  }
}
