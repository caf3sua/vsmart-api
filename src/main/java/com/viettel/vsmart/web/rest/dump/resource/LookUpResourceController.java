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
 * @author tiennv41
 */
@Controller
@RequestMapping(value = "/api/rest/lookUpResourceController")
public class LookUpResourceController {

    private Logger log = Logger.getLogger(LookUpResourceController.class);

    @RequestMapping(value = "/getWarehouseList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getWarehouseList(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("warehouseCode") String warehouseCode,
            @RequestParam("fromDate") String fromDate,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getWarehouseList");
	    	return data;
    }
    
    @RequestMapping(value = "/lookupVTTB", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String lookupVTTB(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("merName") String merName,
            @RequestParam("merCode") String merCode,
            //R528856_hunght7_start
            @RequestParam("lstWarehouseId") String lstWarehouseId,
            //R528856_hunght7_end
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_lookupVTTB");
	    	return data;
    }
    
    @RequestMapping(value = "/getDeviceInfo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDeviceInfo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getDeviceInfo");
	    	return data;
    }
    
    
    @RequestMapping(value = "/lookupConnectNodeAccount", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String lookupConnectNodeAccount(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("nodeAccount") String nodeAccount,
            @RequestParam("splitterCode") String splitterCode,
            @RequestParam("searchType") Long searchType, //=1 tim kiem dung; =2 tim kiem bang
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_lookupConnectNodeAccount");
	    	return data;
    }
    
    @RequestMapping(value = "/getAssetInStation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getAssetInStation(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("serialNumber") String serialNumber,
            @RequestParam("merName") String merName,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getAssetInStation");
	    	return data;
    }
}
