/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 * 6015: Quản lý công việc phát sinh
 * @author ThanhPT18
 */
@RestController
@RequestMapping(value = "/api/rest/workOutsourceController")
public class WorkOutsourceController {
    
    private final Logger log = Logger.getLogger(WorkOutsourceController.class);

    @RequestMapping(value = "/getArisingObject", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getArisingObject(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("objectCode") String objectCode,
            @RequestParam("objectType") Long objectType,//1 - tram, 2 - tuyen
            @RequestParam("pageNumber") Long pageNumber,
            @RequestParam("rowPerPage") Long rowPerPage,
            @RequestParam("token") String token) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_WO, "workOutsourceController_getArisingObject");
        return data;
    }

    @RequestMapping(value = "/createOrUpdateArising", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String createOrUpdateArising(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("workTitle") String workTitle,
            @RequestParam("workContent") String workContent,
            @RequestParam("workObject") String workObject, // doi tuong phat sinh
            @RequestParam("workObjectType") Long workObjectType,//1 - tram, 2 - tuyen
            @RequestParam("workLoad") String workLoad, // khoi luong cong viec
            @RequestParam("workPrice") Long workPrice, // chi phi phat sinh
            @RequestParam("urlFileAttach") MultipartFile urlFileAttach,
            @RequestParam("startTime") String startTime,
            @RequestParam("finishTime") String finishTime,
            @RequestParam("workNote") String workNote,
            @RequestParam("workOutsourceId") Long workOutsourceId,
            @RequestParam("urlUpdate") String urlUpdate,
            @RequestParam("fileName") String fileName,
            @RequestParam("token") String token) {
        
        
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_WO, "workOutsourceController_createOrUpdateArising");
        return data;
    }

    @RequestMapping(value = "/destroyArising", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String destroyArising(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("workOutsourceId") Long workOutsourceId,
            @RequestParam("token") String token) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_WO, "workOutsourceController_destroyArising");
        return data;
    }

    @RequestMapping(value = "/searchArising", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String searchArising(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("workTitle") String workTitle,
            @RequestParam("workStatus") Long workStatus,// 0 - huy, 1 - cho phe duyet, 2 - dong y, 3 - tu choi
            @RequestParam("start") Long start,
            @RequestParam("limit") Long limit,
            @RequestParam("workOutsourceId") Long workOutsourceId,
            @RequestParam("token") String token) {
    		String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_WO, "workOutsourceController_searchArising");
        return data;
    }
}
