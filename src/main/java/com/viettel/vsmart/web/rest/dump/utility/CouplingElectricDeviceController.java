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
@RequestMapping(value = "/api/rest/couplingElectricDeviceController")
public class CouplingElectricDeviceController {

	@RequestMapping(value = "/getListCatMerConfig", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListCatMerConfig(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "couplingElectricDeviceController_getListCatMerConfig");
    		return data;
	}
	
	@RequestMapping(value = "/getComboInStationHouse", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getComboInStationHouse(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationHouseCode") String stationHouseCode,
            @RequestParam("comboId") Long comboId,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "couplingElectricDeviceController_getComboInStationHouse");
    		return data;
	}
	
	@RequestMapping(value = "/getAssetComboInStationHouse", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getAssetComboInStationHouse(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationHouseCode") String stationHouseCode,
            @RequestParam("comboId") Long comboId,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "couplingElectricDeviceController_getAssetComboInStationHouse");
		return data;
	}
	
	@RequestMapping(value = "/updateCombo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateCombo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("comboCode") String comboCode,
            @RequestParam("description") String description,
            @RequestParam("listSerial") String listSerial,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "couplingElectricDeviceController_updateCombo");
		return data;
	}
	
	@RequestMapping(value = "/insertCombo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String insertCombo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("description") String description,
            @RequestParam("listSerial") String listSerial,
            @RequestParam("merConfigId") Long merConfigId,
            @RequestParam("stationHouseCode") String stationHouseCode,
            @RequestParam("employeeCode") String employeeCode,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "couplingElectricDeviceController_insertCombo");
		return data;
	}
	
	@RequestMapping(value = "/deleteCombo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String deleteCombo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("comboCode") String comboCode,
            @RequestParam("token") String token) {
		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_UTILITY, "couplingElectricDeviceController_deleteCombo");
		return data;
	}
}
