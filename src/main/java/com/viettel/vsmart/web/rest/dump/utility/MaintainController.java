/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.utility;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 * 6005:Tạo công việc kiểm tra trạm/tuyến
 * @author hungnd40
 */
@Controller
@RequestMapping(value = "/api/rest/maintainController")
public class MaintainController {

    private Logger log = Logger.getLogger(MaintainController.class);

    @RequestMapping(value = "/onGetCatWork", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onGetCatWork(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("type") Long type,//1:tram,2:tuyen
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "maintainController_onGetCatWork");
	    	return data;
    }
    
    @RequestMapping(value = "/onInsertMaintainWork", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onInsertMaintainWork(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate,
            @RequestParam("catWorkId") Long catWorkId,
            @RequestParam("type") Long type,//1:tram,2:tuyen
            @RequestParam("lstStationId") String lstStationId,//Danh sach tram cach nhau boi dau phay
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "maintainController_onInsertMaintainWork");
	    	return data;
    }
    
    @RequestMapping(value = "/onGetStations", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onGetStations(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("fromPage") Long fromPage,
            @RequestParam("rowPage") Long rowPage,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "maintainController_onGetStations");
	    	return data;
    }
    
    @RequestMapping(value = "/onGetCableLane", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onGetCableLane(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("fromPage") Long fromPage,
            @RequestParam("rowPage") Long rowPage,
            @RequestParam("laneCode") String laneCode,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "maintainController_onGetCableLane");
	    	return data;
    }
}
