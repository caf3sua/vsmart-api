/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.viettel.vsmart.web.rest.dump.util.LoadJsonDumpData;


/**
 *
 * @author hungnd40
 */
@RestController
@RequestMapping("/api/rest/authen")
public class AuthenController {

    private static Logger log = Logger.getLogger(AuthenController.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    @Timed
    public @ResponseBody
    String onLogin(HttpServletRequest req,
            @RequestParam("username") String username,
            @RequestParam("password") String pwd,
            @RequestParam("imeiMoblie") String imeiMoblie) {
        String data = "";
        if("tms_caugiay".equals(username)){
            data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_LOGIN, "login_tms_caugiay");
        }else if("thaoltk".equals(username)) {
            data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_LOGIN, "login_thaoltk");
        }else if("thanhlv12".equals(username)) {
            data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_LOGIN, "login_thanhlv12");
        }else if("qlctkt_kv1".equals(username)) {
            data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_LOGIN, "login_qlctkt_kv1");
        }else if("namdh4".equals(username)){
            data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_LOGIN, "login_tms_caugiay");
        }else{
            data = LoadJsonDumpData.getGetJsonData(LoadJsonDumpData.MODULE_LOGIN, "login_namdh4");
        }
        return data;
    }

    //Kiem tra version tren server
    @RequestMapping(value = "/checkVersionUpdate", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String checkVersionUpdate(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }


    //hungnd40_Rcodien_start
    @RequestMapping(value = "/checkVsaCodien", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String checkVsaCodien(HttpServletRequest req,
            @RequestParam("username") String username,
            @RequestParam("password") String pwd) {
    	JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }
    //hungnd40_Rcodien_end

    //R13212_thuytv3_start
    @RequestMapping(value = "/changePassword", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String changePassword(HttpServletRequest req,
            @RequestParam("username") String username,
            @RequestParam("oldPass") String oldPwd,
            @RequestParam("newPass") String newPwd,
            @RequestParam("repeatPass") String repeatPwd) {
    	JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }

    @RequestMapping(value = "/resetForgetPassword", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String resetForgetPassword(HttpServletRequest req,
            @RequestParam("username") String username,
            @RequestParam("secretPassword") String secretPassword,
            @RequestParam("newPass") String newPwd,
            @RequestParam("repeatPass") String repeatPwd,
            @RequestParam("isConfirmSecretPassword") Long isConfirmSecretPassword) //1: lay ma bi mat, con lai la reset mk
    {
    	JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }
    //R13212_thuytv3_end

    //Phucng_OTP_02032017_start
    @RequestMapping(value = "/checkOtpCode", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String checkOtpCode(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("otpCode") String otpCode,
            @RequestParam("userId") String userId,
            @RequestParam(value = "imeiMobile", required = false) String imeiMobile) throws JSONException {
    	JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "success");
        return jsonObject.toString();

    }

    @RequestMapping(value = "/checkAuthen", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String checkAuthen(HttpServletRequest req,
            @RequestParam("token") String token,
            @RequestParam("userName") String userName,
            @RequestParam("password") String password) {
    	JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("result", "success");
        } catch (Exception ex) {
            log.error("Error:", ex);
        }

        return jsonObject.toString();
    }

    @RequestMapping(value = "/generateOtp", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String generateOtp(HttpServletRequest req,
            @RequestParam("userName") String userName,
            @RequestParam("password") String password,
            @RequestParam("imeiMoblie") String imeiMoblie) {
    	JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }

    //Phucng_OTP_02032017_end
    //phucng_ham IOS
    @RequestMapping(value = "/changePasswordIOS", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String changePasswordIOS(HttpServletRequest req,
            @RequestParam("username") String username,
            @RequestParam("oldPass") String oldPass,
            @RequestParam("newPass") String newPass,
            @RequestParam("repeatPass") String repeatPass) {
    	JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }

    @RequestMapping(value = "/resetForgetPasswordIOS", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String resetForgetPasswordIOS(HttpServletRequest req,
            @RequestParam("username") String username,
            @RequestParam("secretPassword") String secretPassword,
            @RequestParam("newPass") String newPass,
            @RequestParam("repeatPass") String repeatPass,
            @RequestParam("isConfirmSecretPassword") Long isConfirmSecretPassword) //1: lay ma bi mat, con lai la reset mk
    {
    	JSONObject jsonObject = new JSONObject();
        return jsonObject.toString();
    }
}
