/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.utility;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.QueryParam;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 *
 * @author ThanhPT18
 */
@Controller
@RequestMapping(value = "/api/rest/surveyAndTestController")
public class SurveyAndTestController {

	
	@RequestMapping(value = "/getListComposition", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListComposition(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("compositionName") String compositionName,
            @RequestParam("result") Long result,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "surveyAndTestController_getListComposition");
    		return data;		
	}
	
    @RequestMapping(value = "/updateResult", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateResult(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("compositionUserId") Long compositionUserId,
            @RequestParam("compositionId") Long compositionId,
            @RequestParam("compositionType") Long compositionType,
            @RequestParam("passScore") Long passScore,
            @RequestParam("resultDetail") String resultDetail,
            @RequestParam("token") String token) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "surveyAndTestController_updateResult");
		return data;		
    }

    @RequestMapping(value = "/checkHasComposition", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String checkHasComposition(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("token") String token) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "surveyAndTestController_checkHasComposition");
		return data;		
    }

    @RequestMapping(value = "/encryptImagePath", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String encryptImagePath(HttpServletRequest req,
            HttpServletResponse response,
            @RequestParam("imagePath") String imagePath) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "surveyAndTestController_encryptImagePath");
		return data;		 
    }
    
    @RequestMapping(value = "/getImageQuestion", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getImageQuestion(HttpServletRequest req,
            HttpServletResponse response,
            @QueryParam("param") String param) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "surveyAndTestController_getImageQuestion");
		return data;		
    }

}
