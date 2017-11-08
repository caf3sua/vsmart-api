/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.resource;

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
 * @author tiennv41
 */
@Controller
@RequestMapping(value = "/api/rest/lookUpResourceController")
public class LookUpResourceController {

    private Logger log = Logger.getLogger(LookUpResourceController.class);

    @RequestMapping(value = "/getWarehouseList", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getWarehouseList(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("warehouseCode") String warehouseCode,
            @RequestParam("fromDate") String fromDate,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getWarehouseList");
	    	return data;
    }
    
    @RequestMapping(value = "/lookupVTTB", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String lookupVTTB(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("merName") String merName,
            @RequestParam("merCode") String merCode,
            //R528856_hunght7_start
            @RequestParam("lstWarehouseId") String lstWarehouseId,
            //R528856_hunght7_end
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_lookupVTTB");
	    	return data;
    }
    
    @RequestMapping(value = "/getDeviceInfo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getDeviceInfo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
    		// Người dùng chọn loại tìm kiếm là thiết bị    	
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getDeviceInfo");
	    	return data;
    }
    
    @RequestMapping(value = "/getPeripheralPortInfo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getPeripheralPortInfo(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("peripheralType") Long peripheralType,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
    	    // token = 40b49e91-11be-47cf-9ba1-ca6550e00826, userAssignId = 33311, stationCode = hcm, countRows = 10, pageIndex = 0;peripheralType=[1 đến 4]
    		// "Người dùng chọn loại tìm kiếm khác thiết bị.
		//    	+ Ngoại vi đồng: 1
		//    	+ Ngoại vi đồng trục: 2
		//    	+ Ngoại vi quang: 3
		//    	+ Ngoại vi GPON: 4"
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getPeripheralPortInfo");
	    	return data;
    }
    
    @RequestMapping(value = "/getListPort", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListPort(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("id") Long id,
            @RequestParam("type") Long type,//type=1 thiet bi, 2 ngoai vi
            @RequestParam("peripheralType") Long peripheralType,//loai ngoai vi
            @RequestParam("token") String token) {
    		// "Thiết bị: id:8363;peripheralType:;token:;userAssignId:33311;type:1
    		// "Ngoại vi: id:93522;peripheralType:2;token:;userAssignId:33311;type:2"
    		if (type == 1) {
    			String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getListPort_1");
    	    		return data;
    		} else {
			//    			"peripheralType: 
			//    			+ Ngoại vi đồng: 1
			//    			+ Ngoại vi đồng trục: 2
			//    			+ Ngoại vi quang: 3
			//    			+ Ngoại vi GPON: 4"
    			String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getListPort_2");
    			return data;
    		}
    }
    
    
    @RequestMapping(value = "/lookupConnectNodeAccount", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String lookupConnectNodeAccount(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("nodeAccount") String nodeAccount,
            @RequestParam("splitterCode") String splitterCode,
            @RequestParam("searchType") Long searchType, //=1 tim kiem dung; =2 tim kiem bang
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_lookupConnectNodeAccount");
	    	return data;
    }
    
    @RequestMapping(value = "/getAssetInStation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getAssetInStation(HttpServletRequest req,
            @RequestParam("userId") Long userId,
            @RequestParam("serialNumber") String serialNumber,
            @RequestParam("merName") String merName,
            @RequestParam("stationCode") String stationCode,
            @RequestParam("countRows") Integer countRows,
            @RequestParam("pageIndex") Integer pageIndex,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "lookUpResourceController_getAssetInStation");
	    	return data;
    }
}
