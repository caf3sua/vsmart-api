/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.utility;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 *
 * @author HungHT7
 */
@Controller
@RequestMapping(value = "/api/rest/SOCController")
public class SOCController {
	@RequestMapping(value = "/getInfoAccountFromBccs", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getInfoAccountFromBccs(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("serviceType") String serviceType,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "SOCController_getInfoAccountFromBccs");
    		return data;
	}
	
	@RequestMapping(value = "/getSubscriptionInfoNims", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSubscriptionInfoNims(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "SOCController_getSubscriptionInfoNims");
		return data;
	}
	
	@RequestMapping(value = "/getPowerInfo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPowerInfo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "SOCController_getPowerInfo");
    		return data;
	}
	
	@RequestMapping(value = "/getBrasInfo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getBrasInfo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "SOCController_getBrasInfo");
		return data;
	}
}
