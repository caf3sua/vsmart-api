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
@RequestMapping(value = "/api/rest/dvcdController")
public class DVCDController {

    private Logger log = Logger.getLogger(DVCDController.class);

    @RequestMapping(value = "/getInfoAccountFromBccs", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getInfoAccountFromBccs(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("serviceType") String serviceType,
            @RequestParam("isGetCust") Long isGetCust,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "dvcdController_getInfoAccountFromBccs");
	    	return data;
    }
    
    //Lay danh sach cong viec cua nhan vien
    // 6001:Báo cáo công việc
    @RequestMapping(value = "/getListTaskStaff", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListTaskStaff(HttpServletRequest req, @RequestParam("userId") Long userId,
            @RequestParam("staffName") String staffName,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "dvcdController_getListTaskStaff");
	    	return data;
    }
}
