/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Session;
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
@RequestMapping(value = "/api/rest/codienController")
public class CodienController {

    private Logger log = Logger.getLogger(CodienController.class);

    
    @RequestMapping(value = "/searchStationVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchStationVSmart(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("vsmartPassword") String vsmartPassword,
            @RequestParam("listRoles") String listRoles,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "codienController_searchStationVSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/getItemLevel1VSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getItemLevel1VSmart(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") Long stationCode,
            @RequestParam("vsmartPassword") String vsmartPassword,
            @RequestParam("listRoles") String listRoles,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "codienController_getItemLevel1VSmart");
	    	return data;
    }
    
    @RequestMapping(value = "/getInstanceVSmart", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getInstanceVSmart(HttpServletRequest req, @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationId") Long stationId,
            @RequestParam("itemId") Long itemId,
            @RequestParam("instanceId") Long instanceId,
            @RequestParam("listRoles") String listRoles,
            @RequestParam("vsmartPassword") String vsmartPassword,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "codienController_getInstanceVSmart");
	    	return data;
    }
    
}
