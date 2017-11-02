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
@RequestMapping("/api/rest/changeNgn2ImsController")
public class ChangeNgn2ImsController {
	
	@RequestMapping(value = "/getListNgnTask", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListNgnTask(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("accountNgn") String accountNgn,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "changeNgn2ImsController_getListNgnTask");
    		return data;
	}
    
}
