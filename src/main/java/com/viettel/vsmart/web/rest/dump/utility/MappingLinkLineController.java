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
 * @author Thanh Pham
 */
@Controller
@RequestMapping(value = "/api/rest/mappingLinkLineController")
public class MappingLinkLineController {

	@RequestMapping(value = "/searchMappingLinkAndLine", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchMappingLinkAndLine(HttpServletRequest req,
            @RequestParam("stationHouseCode") String stationHouseCode,
            @RequestParam("lineCode") String lineCode,
            @RequestParam("linkCode") String linkCode,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("start") int start,
            @RequestParam("limit") int limit,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "mappingLinkLineController_searchMappingLinkAndLine");
    		return data;
	}
	
	@RequestMapping(value = "/getLinkList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getLinkList(HttpServletRequest req,
            @RequestParam("stationHouseCode") String stationHouseCode,
            @RequestParam("status") long status,
            @RequestParam("start") int start,
            @RequestParam("limit") int limit,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "mappingLinkLineController_getLinkList");
		return data;
	}
	
	@RequestMapping(value = "/getLineList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getLineList(HttpServletRequest req,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("status") long status,
            @RequestParam("start") int start,
            @RequestParam("limit") int limit,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "mappingLinkLineController_getLineList");
		return data;
	}
	
	@RequestMapping(value = "/mappingFromLineToLink", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String mappingFromLineToLink(HttpServletRequest req,
            @RequestParam("linkId") Long linkId,
            @RequestParam("lineId") Long lineId,
            @RequestParam("type") Long type,
            @RequestParam("staffCode") String staffCode,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "mappingLinkLineController_mappingFromLineToLink");
    		return data;
	}
}
