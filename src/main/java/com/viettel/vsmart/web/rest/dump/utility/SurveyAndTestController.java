/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.utility;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
