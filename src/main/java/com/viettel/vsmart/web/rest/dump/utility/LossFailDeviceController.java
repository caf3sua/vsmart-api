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
 * 6014: WO báo mất, hỏng, không sử dụng
 * @author Thanh Pham
 */
@Controller
@RequestMapping(value = "/api/rest/lossFailDeviceController")
public class LossFailDeviceController {

	@RequestMapping(value = "/getStationList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getStationList(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("fromDate") String fromDate,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "lossFailDeviceController_getStationList");
    		return data;
	}
	
	@RequestMapping(value = "/getListWarehouse", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListWarehouse(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("warehouseCode") String warehouseCode,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "lossFailDeviceController_getListWarehouse");
		return data;
	}
	
	@RequestMapping(value = "/insertWOKTTS", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String insertWOKTTS(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("woConntent") String woConntent,
            @RequestParam("woDescription") String woDescription,
            @RequestParam("woTypeCode") String woTypeCode,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("wareHouseCode") String wareHouseCode,
            @RequestParam("startDate") String startDate, // dd/MM/yyyy hh:mm:ss
            @RequestParam("endDate") String endDate,// dd/MM/yyyy hh:mm:ss
            @RequestParam("lstMerchandise") String lstMerchandise,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "lossFailDeviceController_insertWOKTTS");
    		return data;
	}
}
