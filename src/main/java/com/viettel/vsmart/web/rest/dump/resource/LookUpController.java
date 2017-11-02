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
@RequestMapping(value = "/api/rest/lookUpController")
public class LookUpController {

    private Logger log = Logger.getLogger(LookUpController.class);

    // 5005: Tra cứu thông tin hạ tầng thuê bao
    @RequestMapping(value = "/getSubcriptionInfo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSubcriptionInfo(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("technology") Long technology,//1:AON+CCN;4:GPON
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpController_getSubcriptionInfo");
	    	return data;
    }

    // 5004: Tra cứu thông tin nhà trạm
    // Lấy danh sach tram
    @RequestMapping(value = "/getListStation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListStation(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpController_getListStation");
	    	return data;
    }
}
