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
 * @author DucDM1
 */
@Controller
@RequestMapping(value = "/api/rest/connectorController")
public class ConnectorController {
	
	@RequestMapping(value = "/loadAllStaffByWorkType", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String loadAllStaffByWorkType(HttpServletRequest req, @RequestParam("token") String token,
            @RequestParam("catWorkType") String catWorkType) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "connectorController_loadAllStaffByWorkType");
    		return data;
	}
	
	@RequestMapping(value = "/loadTechnology", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String loadTechnology(HttpServletRequest req, @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "connectorController_loadTechnology");
    		return data;
	}
	
	@RequestMapping(value = "/getListConnector", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListConnector(HttpServletRequest req, @RequestParam("token") String token,
            @RequestParam("connectorCode") String connectorCode,
            @RequestParam("staffLv3Id") Long staffLv3Id,
            @RequestParam("staffLv2Id") Long staffLv2Id,
            @RequestParam("technology") Long technology,
            @RequestParam("userId") Long userId) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "connectorController_getListConnector");
    		return data;
	}
}
