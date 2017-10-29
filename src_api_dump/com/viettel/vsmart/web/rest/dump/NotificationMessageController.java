/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.codahale.metrics.annotation.Timed;
import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;

/**
 *
 * @author DucDM1
 */
@RestController
@RequestMapping("/api/rest/notificationController")
public class NotificationMessageController {

    private Logger log = Logger.getLogger(NotificationMessageController.class);
    
    @RequestMapping(value = "/getNotification", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getNotification(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("isRead") Long isRead,
            @RequestParam("type") Long type,
            @RequestParam("token") String token) {
    	String data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_OTHER, "getNotification");
        return data;
    }

    @RequestMapping(value = "/updateReadNotification", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateReadNotification(HttpServletRequest req,
            @RequestParam("userAssignId") Long userAssignId,
            @RequestParam("noticeId") Long noticeId,
            @RequestParam("token") String token) throws JSONException {
    	JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "seen");
        return jsonObject.toString();
    }

    @RequestMapping(value = "/addCriticalPoint", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String addCriticalPoint(HttpServletRequest req,
            @RequestParam("image1") MultipartFile image1) {
    	return null;
    }
}
