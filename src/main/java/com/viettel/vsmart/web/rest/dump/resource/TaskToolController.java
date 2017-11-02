/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.resource;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 *
 * @author hungnd40
 */
@Controller
@RequestMapping(value = "/api/rest/taskToolController")
public class TaskToolController {

    private Logger log = Logger.getLogger(TaskToolController.class);

  //Lay danh sach thue bao
    @RequestMapping(value = "/onSearchAccount", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onSearchAccount(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("type") Long type,
            @RequestParam("account") String account,
            @RequestParam("accountType") Long accountType,//1:account ISDN;2//account gline
            @RequestParam("isBccs") Long isBccs,//1:su dung cho ben Bccs else con lai
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "taskToolController_onSearchAccount");
	    	return data;
    }
}
