/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;
/**
 *
 * @author VTN-PTPM-NV19
 */
@Controller
@RequestMapping(value = "/api/rest/stationInOutRegController")
public class StationInOutRegController{
    private static final Logger logger = Logger.getLogger(StationInOutRegController.class);
    
    /**
     * Get list reason assign station
     * @param req
     * @return 
     */
    @RequestMapping(value = "/getListReasonComeStation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getListReasonComeStation(HttpServletRequest req) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "stationInOutRegController_getListReasonComeStation");
        return data;
    }
    
    /**
     * Get List WO
     * @param req
     * @return 
     */
    @RequestMapping(value = "/getListWOBySelf", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getListWOBySelf(HttpServletRequest req) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "stationInOutRegController_getListWOBySelf");
        return data;
    }
    
    /**
     * Register come in station
     * @param req
     * @return 
     * @throws JSONException 
     */
    @RequestMapping(value = "/registerComeIn", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String registerComeIn(HttpServletRequest req,
            @RequestParam("stationIdStr") String stationIdStr,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("assignStationReasonId") String assignStationReasonId,
            @RequestParam("reason") String reason,
            @RequestParam("woCode") String woCode,
            @RequestParam("woSystem") String woSystem,
            @RequestParam("woSystemId") String woSystemId) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("responseCode", 0);
        jsonObject.put("responseMessage", "USER_COME_IN_STATION");
        return jsonObject.toString();
    }
    
    /**
     * Register come out
     * @param req
     * @param stationComeInOutId
     * @return 
     * @throws JSONException 
     */
    @RequestMapping(value = "/registerComeOut", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String registerComeOut(HttpServletRequest req,
            @RequestParam("stationComeInOutId") String stationComeInOutId,
            @RequestParam("woCode") String woCode,
            @RequestParam("reasonOut") String reasonOut) throws JSONException {
    	JSONObject jsonObject = new JSONObject();
        jsonObject.put("responseCode", 0);
        jsonObject.put("responseMessage", "USER_COME_OUT_STATION");
        return jsonObject.toString();
    }
    
    @RequestMapping(value = "/getListStationComeInOut", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getListStationComeInOut(HttpServletRequest req,
             @RequestParam("fromDate") String fromDate,
             @RequestParam("toDate") String toDate,
             @RequestParam("stationCode") String stationCode) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "stationInOutRegController_getListStationComeInOut");
        return data;
    }
    @RequestMapping(value = "/getListStationByUser", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getListStationByUser(HttpServletRequest req) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "stationInOutRegController_getListStationByUser");
        return data;
    }
    
    @RequestMapping(value = "/getDetailStationByCode", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDetailStationByCode(HttpServletRequest req,
        @RequestParam("stationCode") String stationCode) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "stationInOutRegController_getDetailStationByCode");
        return data;
    }
    
    
    @RequestMapping(value = "/getDistanceAllowComeInStation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDistanceAllowComeInStation(HttpServletRequest req) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "stationInOutRegController_getDistanceAllowComeInStation");
        return data;
    }
    
}
