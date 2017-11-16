/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.search_kpi;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 *
 * @author DucDM1
 */
@RestController
@RequestMapping(value = "/api/rest/stationKpiController")
public class StationKpiController {

    private Logger log = Logger.getLogger(StationKpiController.class);

    // tra cứu trạng thái
    @RequestMapping(value = "/getState/online", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getStateOnline(HttpServletRequest req, @RequestParam(value = "userService", required=false) String userService
    		, @RequestParam(value = "passService", required=false) String passService, @RequestParam("keyword") String keyword) {
    		if (!keyword.contains("eBE")) {
    			return "";
    		}
    	
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "stationKpiController_getStateOnline");
	    	return data;
    }
    
    // ping mme
    @RequestMapping(value = "/source", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String source(HttpServletRequest req, @RequestParam(value = "userService", required=false) String userService
    		, @RequestParam(value = "passService", required=false) String passService, @RequestParam("keyword") String keyword) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "stationKpiController_source");
	    	return data;
    }
    
    // kiểm tra interface
    @RequestMapping(value = "/getConfigInterface", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getConfigInterface(HttpServletRequest req, @RequestParam(value = "userService", required=false) String userService
    		, @RequestParam(value = "passService", required=false) String passService, @RequestParam("keyword") String keyword) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "stationKpiController_getConfigInterface");
	    	return data;
    }
    
    // kiểm tra tích hợp
    @RequestMapping(value = "/getCheckList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getCheckList(HttpServletRequest req, @RequestParam(value = "userService", required=false) String userService
    		, @RequestParam(value = "passService", required=false) String passService, @RequestParam("keyword") String keyword) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "stationKpiController_getCheckList");
	    	return data;
    }
    
}
