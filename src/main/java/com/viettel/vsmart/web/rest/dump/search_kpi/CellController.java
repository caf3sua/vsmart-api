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
@RequestMapping(value = "/api/rest/cellController")
public class CellController {

    private Logger log = Logger.getLogger(CellController.class);

    // ------ Tra cứu CELL vượt target
    //lay danh sach tram theo username
    @RequestMapping(value = "/getStation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getStation(HttpServletRequest req, @RequestParam("token") String token, @RequestParam("userName") String userName) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getStation");
	    	return data;
    }
    
    @RequestMapping(value = "/getcellbadTarget2G", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getcellbadTarget2G(HttpServletRequest req, @RequestParam("token") String token,
            @RequestParam("updateTime") String arg0, @RequestParam("listStationCodeJson") String arg1) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getcellbadTarget2G");
	    	return data;
    }
    
    @RequestMapping(value = "/getcellbadTarget3G", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getcellbadTarget3G(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("updateTime") String arg0,
            @RequestParam("listStationCodeJson") String arg1) {//1:CS CDR  2:CS CSSR   3: PS CSSR
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getcellbadTarget3G");
	    	return data;
    }
    // ------ Tra cứu CELL vượt target
    
    
    // ------ Tra cứu cảnh báo CELL
    @RequestMapping(value = "/getAlarmList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getAlarmList(HttpServletRequest req, @RequestParam("token") String token,
            @RequestParam("cellType") String cellType) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getAlarmList");
	    	return data;
    }
    
    @RequestMapping(value = "/getAlarmFromStationNew", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getAlarmFromStationNew(HttpServletRequest req, @RequestParam("token") String token,
            @RequestParam("stations") String stations,
            @RequestParam("celltype") String celltype, @RequestParam("alarmId") Long alarmId) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getAlarmFromStationNew");
	    	return data;
    }
    
    // -------- Ban do tram
    @RequestMapping(value = "/getStationWithDate", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getStationWithDate(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("locationId") Long locationId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getStationWithDate");
	    	return data;
    }
    
    @RequestMapping(value = "/getListStationByGridCode", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListStationByGridCode(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("gridCode") String gridCode,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_SEARCH_KPI, "cellController_getListStationByGridCode");
	    	return data;
    }
}
