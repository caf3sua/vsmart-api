/*
 * To change this template, choose Tools | Templates
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
 * @author hungnd40
 */
@Controller
@RequestMapping(value = "/api/rest/qosController")
public class QosController {

	//Tra cuu thong tin thue bao
    @RequestMapping(value = "/getListAccount", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListAccount(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("account") String account,
            @RequestParam("infraType") String infraType,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "qosController_getListAccount");
	    	return data;
    }
}
