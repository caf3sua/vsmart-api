/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author HungHT7
 */
@Controller
@RequestMapping(value = "/api/rest/CoDien2Controller")
public class CoDien2Controller {
    
    private final Logger logger = Logger.getLogger(CoDien2Controller.class);
    
    @RequestMapping(value = "/searchStationVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchStationVSmart(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_searchStationVSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/getItemLevel1VSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getItemLevel1VSmart(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationId") Long stationId,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_getItemLevel1VSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/getSelectViewAttribute", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getSelectViewAttribute(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("attributeId") Long attributeId,
            @RequestParam("selectViewValue") String selectViewValue,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_getSelectViewAttribute");
	    	return data;
    }
    
    @RequestMapping(value = "/insertInstanceVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String insertInstanceVSmart(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationId") Long stationId,
            @RequestParam("itemId") Long itemId,
            @RequestParam("instanceName") String instanceName,
            @RequestParam("listAttributeData") String listAttributeData,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_insertInstanceVSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/updateInstanceVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateInstanceVSmart(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationId") Long stationId,
            @RequestParam("itemId") Long itemId,
            @RequestParam("instanceId") Long instanceId,
            @RequestParam("instanceName") String instanceName,
            @RequestParam("listAttributeData") String listAttributeData,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_updateInstanceVSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/deleteInstanceVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String deleteInstanceVSmart(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("itemId") Long itemId,
            @RequestParam("instanceId") Long instanceId,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_deleteInstanceVSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/getInstanceVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getInstanceVSmart(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationId") Long stationId,
            @RequestParam("instanceId") Long instanceId,
            @RequestParam("itemId") Long itemId,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "CoDien2Controller_getInstanceVSmart");
	    	return data;
    }
    	
}
