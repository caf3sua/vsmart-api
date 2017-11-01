/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.search_kpi;

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
 * @author HungHT7
 */
@Controller
@RequestMapping(value = "/api/rest/BIKTController")
public class BIKTController {

    private final Logger logger = Logger.getLogger(BIKTController.class);

    // Tra cứu thuê bao quản lý
    @RequestMapping(value = "/searchSubManagement", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchSubManagement(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("month") String month) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "BIKTController_searchSubManagement");
	    	return data;
    }
    
    // Tra cứu thuê bao triển khai mới
    @RequestMapping(value = "/searchSubDeployNew", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchSubDeployNew(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("month") String month) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "BIKTController_searchSubDeployNew");
	    	return data;
    }
    
    // Tra cứu công việc xử lý sự cố
    @RequestMapping(value = "/searchTicketWo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchTicketWo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("month") String month) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "BIKTController_searchTicketWo");
	    	return data;
    }
    
    // Tra cứu dữ liêu phạt FC
    @RequestMapping(value = "/searchPenalizeFC", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchPenalizeFC(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("month") String month) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "BIKTController_searchPenalizeFC");
	    	return data;
    }
    
//    @RequestMapping(value = "/getKpiConfig", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
//    public @ResponseBody
//    String getKpiConfig(HttpServletRequest req,
//            @RequestParam("userAssignId") Long userAssignId) {
//	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getStation");
//	    	return data;
//    }
    
    // Tổng hợp lương khoán
    @RequestMapping(value = "/getReportSalary", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getReportSalary(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("month") String month) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "BIKTController_getReportSalary");
	    	return data;
    }
    
}
