/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump;

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
 * @author thuytv3
 */
@RestController
@RequestMapping(value = "/api/rest/nocProController")
public class NocProController {

    private Logger log = Logger.getLogger(NocProController.class);

    @RequestMapping(value = "/onExecuteMapQuery", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onExecuteMapQuery(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("woCode") String woCode,
            @RequestParam("dateTimeValue") String dateTimeValue,
            @RequestParam("alarmType") String alarmType,
            @RequestParam("locate") String locate,
            @RequestParam("woId") Long woId,
            @RequestParam("token") String token) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_WO, "nocProController_onExecuteMapQuery");
        return data;
    }
    
    @RequestMapping(value = "/onSearchPowerViba", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String onSearchPowerViba(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("requestId") long requestId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("userAssignId") Long userAssignId) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_WO, "nocProController_onSearchPowerViba");
        return data;
    }
}
