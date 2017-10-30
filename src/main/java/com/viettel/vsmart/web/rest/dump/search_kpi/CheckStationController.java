/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.search_kpi;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 *
 * @author sonvt19 R796940
 */
@RestController
@RequestMapping(value = "/api/rest/checkStationController")
public class CheckStationController {

	private Logger log = Logger.getLogger(CheckStationController.class);

	@RequestMapping(value = "/getLKInfos", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public @ResponseBody String getListStationNotQualified(HttpServletRequest req,
			@RequestParam("userName") String userName, @RequestParam("month") String month,
			@RequestParam("year") String year) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "checkStationController_getLKInfos");
		return data;
	}

	@RequestMapping(value = "/getListStaffLK", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public @ResponseBody String getListStaffLK(HttpServletRequest req, @RequestParam("deptId") String deptId) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "checkStationController_getListStaffLK");
    		return data;
	}

}
