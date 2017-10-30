/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * Tra cứu KPI GNOC
 * @author pm2-vdi-02
 */
@RestController
@RequestMapping(value = "/api/rest/GNOCController")
public class GNOCController {

    private Logger log = Logger.getLogger(GNOCController.class);

    @RequestMapping(value = "/getListKpiGnoc", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListKpiGnoc(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("startTime") String startTime,
            @RequestParam("endTime") String endTime,
            @RequestParam("token") String token) {
        
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "GNOCController_getListKpiGnoc");
	    	return data;
    }

    //R483169_HungHT7_start
    @RequestMapping(value = "/getListKpiGnocPGD", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListKpiGnocPGD(HttpServletRequest req, @RequestParam("departmentId") Long departmentId,
            @RequestParam("userName") String userName,
            @RequestParam("month") String month,
            @RequestParam("year") String year,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "GNOCController_getListKpiGnocPGD");
	    	return data;
    }
}
