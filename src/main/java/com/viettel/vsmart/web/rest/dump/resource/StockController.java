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
 * @author DucDM1
 */
@Controller
@RequestMapping(value = "/api/rest/stockController")
public class StockController {

    private Logger log = Logger.getLogger(StockController.class);

    // 5002:Hàng hóa tổ đội
    @RequestMapping(value = "/getListStock", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListStock(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("stockName") String stockName,
            @RequestParam("userAssignId") Long userAssignId) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "stockController_getListStock");
	    	return data;
    }
    
    // 5002:Hàng hóa tổ đội
    @RequestMapping(value = "/updateReclaimStock", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateReclaimStock(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("stockModelForm") String stockModelForm,
            @RequestParam("userAssignId") Long userAssignId) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "stockController_updateReclaimStock");
	    	return data;
    }
    
    // 5001: Tra cứu kho cá nhân
    @RequestMapping(value = "/getStockTotalStaffByIdNo", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getStockTotalStaffByIdNo(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("userId") Long userId,
            @RequestParam("type") Long type,
            @RequestParam("stockModelName") String stockModelName) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "stockController_getStockTotalStaffByIdNo");
	    	return data;
    }
    
    // 5011: Tra cứu kho huyện
    @RequestMapping(value = "/getListLocation", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListLocation(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "stockController_getListLocation");
	    	return data;
    }
    
    // 5011: Tra cứu kho huyện
    @RequestMapping(value = "/getListSearchProductByArea", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getListSearchProductByArea(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("areaCode") String areaCode,
            @RequestParam("productType") String productType,//1: vat tu, 2: hang hoa
            @RequestParam("inputSearch") String inputSearch, //ten mat hang
            @RequestParam("token") String token) {
	    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_RESOURCE, "stockController_getListSearchProductByArea");
	    	return data;
    }
}
