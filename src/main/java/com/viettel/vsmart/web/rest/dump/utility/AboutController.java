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
 *
 * @author thuytv3
 */
@Controller
@RequestMapping(value = "/api/rest/aboutController")
public class AboutController {

    private Logger log = Logger.getLogger(AboutController.class);

    @RequestMapping(value = "/getInfoAbout", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getInfoAbout(HttpServletRequest req,
            @RequestParam("version") String version,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "aboutController_getInfoAbout");
	    	return data;
    }

    @RequestMapping(value = "/getListVersion", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListVersion(HttpServletRequest req,
            @RequestParam("version") String version,
            @RequestParam("startTime") String startTime,
            @RequestParam("endTime") String endTime,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "aboutController_getListVersion");
	    	return data;
    }

}
