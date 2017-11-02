/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.vsmart.web.rest.dump.wo;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * REST Web Service
 *
 * @author dungnv50
 */
@Controller
@RequestMapping(value = "/api/rest/gnocWOController")
public class GnocWOController {

    private static final Logger logger = Logger.getLogger(GnocWOController.class);
    
//    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
//    public @ResponseBody
//    String updateStatus(HttpServletRequest req, @RequestParam("username") String username,
//            @RequestParam("woId") String woId,
//            @RequestParam("status") String status,
//            @RequestParam("comment") String comment,
//            @RequestParam("woTypecode") String woTypecode,
//            @RequestParam("ccResult") String ccResult,
//            @RequestParam("qrCode") String qrCode,
//            @RequestParam("listMaterial") String listMaterial,
//            //451996 hainm24 start: add 2 parameters
//            @RequestParam("reasonIdLV1") Long reasonIdLV1,
//            @RequestParam("reasonIdLV2") Long reasonIdLV2,
//            //451996 hainm24 end
//            //514640_hunght7_start
//            @RequestParam("partnerId") Long partnerId,
//            //514640_hunght7_end
//            //546878_hunght7_start
//            @RequestParam("actionKTTS") Long actionKTTS,
//            @RequestParam("lstSerialKTTS") String lstSerialKTTS,
//            @RequestParam("reasonKtts") String reasonKtts,
//            @RequestParam("handoverUser") String handoverUser,
//            //546878_hunght7_end
//            //R498430_hunght7_start
//            @RequestParam("isFt") Boolean isFt,
//            //R498430_hunght7_end
//            //R528867_hunght7_start
//            @RequestParam("image1") MultipartFile image1,
//            @RequestParam("image2") MultipartFile image2,
//            @RequestParam("image3") MultipartFile image3,
//            @RequestParam("image4") MultipartFile image4,
//            @RequestParam("image5") MultipartFile image5,
//            //R528867_hunght7_end
//            //R585625_thanhpt18_start
//            @RequestParam("reasonTroubleId") String reasonTroubleId,
//            @RequestParam("reasonTroubleName") String reasonTroubleName,
//            @RequestParam("solution") String solution,
//            @RequestParam("solutionGroupId") Long solutionGroupId,
//            @RequestParam("solutionGroupName") String solutionGroupName,
//            @RequestParam("scriptId") Long scriptId,
//            @RequestParam("scriptName") String scriptName,
//            @RequestParam("polesDistance") Double polesDistance,
//            //R585625_thanhpt18_end
//            //609417_phucng_start
//            @RequestParam(required = false, value = "closuresReplace") String closuresReplace,
//            @RequestParam(required = false, value = "lineCutCode") String lineCutCode,
//            @RequestParam(required = false, value = "codeSnippetOff") String codeSnippetOff,
//            @RequestParam(required = false, value = "stationCodeNims") String stationCodeNims,
//            //            @RequestParam("closuresReplace") String closuresReplace,
//            //            @RequestParam("lineCutCode") String lineCutCode,
//            //            @RequestParam("codeSnippetOff") String codeSnippetOff,
//            //609417_phucng_end
//            //sonvt19 moi truong nha tram
//            @RequestParam(required = false, value = "stationEnvironment") String stationEnvironment,
//            //sonvt19 moi truong nha tram
//            //R616891 longlt6 start
//            @RequestParam(value = "lstObjectKeyData", required = false) String lstObjectKeyData,
//            @RequestParam("token") String token) {
//        JSONObject jsonObject = new JSONObject();
//        Session session = getSession();
//        try {
//            logger.info(" -- updateStatus | "
//                    + " , woId: " + woId
//                    + " , username: " + username
//                    + " , status: " + status
//                    + " , comment: " + comment
//                    + " , ccResult: " + ccResult
//                    + " , qrCode: " + qrCode
//                    + " , listMaterial: " + listMaterial
//                    //R546878_hunght7_start
//                    + " , reasonIdLV1: " + reasonIdLV1
//                    + " , reasonIdLV2: " + reasonIdLV2
//                    + " , partnerId: " + partnerId
//                    + " , actionKTTS: " + actionKTTS
//                    + " , lstSerialKTTS: " + lstSerialKTTS
//                    + " , reasonKtts: " + reasonKtts
//                    + " , handoverUser: " + handoverUser
//                    //R546878_hunght7_end
//                    //R498430_hunght7_start
//                    + " , isFt: " + isFt
//                    + " lstObjectKeyData: " + lstObjectKeyData
//                    //R498430_hunght7_end
//                    + " , token: " + token
//            );
//            java.lang.reflect.Type listTypeStock = new TypeToken<List<WoMaterialDeducteDTO>>() {
//            }.getType();
//            //lay danh sach vat tu 
//            List<WoMaterialDeducteDTO> listMaterials = gson.fromJson(listMaterial, listTypeStock);
//
//            GNOCWoWS woWS = new GNOCWoWS();
//            session.beginTransaction();
//            //R585625_ThanhPT18_TTTC_start
//            if (STATUS_FINISH.equals(status)) {
//                if (WO_TYPE_BDNT.equalsIgnoreCase(woTypecode)
//                        || WO_TYPE_CHECK_STATION.equals(woTypecode)
//                        || WO_TYPE_CHECK_LANE.equals(woTypecode)
//                        //R514640_hunght7_start
//                        || WO_TYPE_BDNTDH.equals(woTypecode)) {
//                    //R514640_hunght7_end
//                    MnWorkBO mnWorkBO = getMnWorkByWoId(Long.valueOf(woId));
//                    Criteria cri = session.createCriteria(MnWorkTaskCurrentBO.class);
//                    cri.add(Restrictions.eq("workId", mnWorkBO.getWorkId()));
//                    cri.add(Restrictions.or(Restrictions.isNull("result"), Restrictions.eq("result", -1L)));
//                    List<MnWorkTaskCurrentBO> lstMnWorkTask = cri.list();
//                    if (lstMnWorkTask != null && !lstMnWorkTask.isEmpty()) {
//                        throw new AppException(LanguageBundleUtils.getStringVsmart("checklistNotFinished"));
//                    }
//                } else if (WO_TYPE_TTTC.equals(woTypecode)) {
//                    MnWorkCableCurrentBO checkFinishObj = (MnWorkCableCurrentBO) session
//                            .createCriteria(MnWorkCableCurrentBO.class)
//                            .add(Restrictions.eq("woId", Long.parseLong(woId)))
//                            .list().get(0);
//                    if (checkFinishObj != null && checkFinishObj.getStatus() != 4l) {
//                        throw new AppException("Bạn có công việc tuần tra tuyến cáp chưa hoàn thành.");
//                    }
//                } else if (WO_TYPE_XLDTTTC.equals(woTypecode)) {
//                    MnCriticalPointBO checkFinishObj = (MnCriticalPointBO) session
//                            .createCriteria(MnCriticalPointBO.class)
//                            .add(Restrictions.like("woCode", "%" + woId + "%").ignoreCase())
//                            .list().get(0);
//                    if (checkFinishObj != null && checkFinishObj.getStatus() != 1l) {
//                        throw new AppException("Bạn có điểm xung yếu chưa được xử lý.");
//                    }
//                }
//            }
//
//            //R585625_ThanhPT18_TTTC_end
//            //R546878_hunght7_start
//            java.lang.reflect.Type listTypeSerial = new TypeToken<List<MerchandiseOrderBO>>() {
//            }.getType();
//            //lay danh sach serial
//            List<MerchandiseOrderBO> lstClent = gson.fromJson(lstSerialKTTS, listTypeSerial);
//            List<WoMerchandiseDTO> lstSerialKTTSs = new ArrayList();
//            if (lstClent != null) {
//                for (MerchandiseOrderBO mbo : lstClent) {
//                    WoMerchandiseDTO dTO = new WoMerchandiseDTO();
//                    dTO.setMerchandiseCode(mbo.getMerCode());
//                    if (mbo.getAmount() != null) {
//                        dTO.setQuantity(mbo.getAmount().toString());
//                    } else {
//                        dTO.setQuantity(null);
//                    }
//                    dTO.setSerial(mbo.getSerial());
//                    lstSerialKTTSs.add(dTO);
//                }
//            }
//            boolean complete = true;
//            if (STATUS_FINISH.equals(status) && (WO_TYPE_TS_NANG_CAP_TRAM.equals(woTypecode)
//                    || WO_TYPE_TS_NANG_CAP_TRAM_UCTT.equals(woTypecode)
//                    || WO_TYPE_TS_NANG_CAP_TRAM_THUE_DOI_TAC.equals(woTypecode)
//                    || WO_TYPE_TS_NANG_CAP_TRAM_UCTT_THUE_DOI_TAC.equals(woTypecode))) {
//                KTTSWS kttsWs = new KTTSWS();
//                Kttsbo kttsbo = kttsWs.getWareExpNote(Long.parseLong(woId));
//                if (kttsbo == null || kttsbo.getWareExpNoteBO() == null || kttsbo.getWareExpNoteBO().getStatus() == null) {
//                    jsonObject.put("errorMsg", LanguageBundleUtils.getStringVsmart("EXP_NOTE_NOT_REGIS"));
//                    logger.info("errorMsg  " + LanguageBundleUtils.getStringVsmart("EXP_NOTE_NOT_REGIS"));
//                    complete = false;
//                }
//            }
//            if (complete) {
//                //R528867_hunght7_start
//                logger.info("image1" + image1 == null ? "NULL" : image1.getSize() + "_" + image1.getName() + "_" + image1.getBytes().length);
//                logger.info("image2" + image2 == null ? "NULL" : image2.getSize() + "_" + image2.getName() + "_" + image2.getBytes().length);
//                logger.info("image3" + image3 == null ? "NULL" : image3.getSize() + "_" + image3.getName() + "_" + image3.getBytes().length);
//                logger.info("image4" + image4 == null ? "NULL" : image4.getSize() + "_" + image4.getName() + "_" + image4.getBytes().length);
//                logger.info("image5" + image5 == null ? "NULL" : image5.getSize() + "_" + image5.getName() + "_" + image5.getBytes().length);
//                List<String> listFileName = new ArrayList<String>();
//                List<byte[]> fileArr = new ArrayList<byte[]>();
//                if (null != image1 && !image1.isEmpty() && image1.getBytes().length > 0) {
//                    String file = getFileName(image1, username);
//                    if (file != null) {
//                        listFileName.add(file);
//                        fileArr.add(image1.getBytes());
//                    }
//                }
//                if (null != image2 && !image2.isEmpty() && image2.getBytes().length > 0) {
//                    String file = getFileName(image2, username);
//                    if (file != null) {
//                        listFileName.add(file);
//                        fileArr.add(image2.getBytes());
//                    }
//                }
//                if (null != image3 && !image3.isEmpty() && image3.getBytes().length > 0) {
//                    String file = getFileName(image3, username);
//                    if (file != null) {
//                        listFileName.add(file);
//                        fileArr.add(image3.getBytes());
//                    }
//                }
//                if (null != image4 && !image4.isEmpty() && image4.getBytes().length > 0) {
//                    String file = getFileName(image4, username);
//                    if (file != null) {
//                        listFileName.add(file);
//                        fileArr.add(image4.getBytes());
//                    }
//                }
//                if (null != image5 && !image5.isEmpty() && image5.getBytes().length > 0) {
//                    String file = getFileName(image5, username);
//                    if (file != null) {
//                        listFileName.add(file);
//                        fileArr.add(image5.getBytes());
//                    }
//                }
//                Long startAction = System.currentTimeMillis();
//                //R528867_hunght7_end
//                //R585625_thanhpt18_start
//                logger.info("set value to vsmartUpdateForm");
//                VsmartUpdateForm vsmartUpdateForm = new VsmartUpdateForm();
//                vsmartUpdateForm.setReasonTroubleId(reasonTroubleId);
//                vsmartUpdateForm.setReasonTroubleName(reasonTroubleName);
//                vsmartUpdateForm.setSolution(solution);
//                vsmartUpdateForm.setSolutionGroupId(solutionGroupId);
//                vsmartUpdateForm.setSolutionGroupName(solutionGroupName);
//                vsmartUpdateForm.setScriptId(scriptId);
//                vsmartUpdateForm.setScriptName(scriptName);
//                vsmartUpdateForm.setPolesDistance(polesDistance);
//                //sonvt19 yeu cau luong khoan
//                vsmartUpdateForm.setStationCodeNims(stationCodeNims);
//                //sonvt19 yeu cau luong khoan - end
//                //sonvt19 moi truong nha tram - start
//                vsmartUpdateForm.setStationEnvironment(stationEnvironment);
//                //sonvt19 moi truong nha tram - end
//                //R585625_thanhpt18_end
//                ////609417_phucng_start
//                vsmartUpdateForm.setClosuresReplace(closuresReplace);
//                vsmartUpdateForm.setLineCutCode(lineCutCode);
//                vsmartUpdateForm.setCodeSnippetOff(codeSnippetOff);
//                //R616891 longlt6 start 
//                if (lstObjectKeyData != null && !lstObjectKeyData.trim().isEmpty()) {
//                    logger.info("lstObjectKeyData set object ");
//                    try {
//
//                        java.lang.reflect.Type listTypeObjKeyValue = new TypeToken<List<ObjKeyValue>>() {
//                        }.getType();
//                        List<ObjKeyValue> listObjKeyVal = vsmartUpdateForm.getLstDataKeyValue();
//
//                        List<ObjKeyValue> listObjKeyVal1 = gson.fromJson(lstObjectKeyData, listTypeObjKeyValue);
//                        listObjKeyVal.addAll(listObjKeyVal1);
////                      vsmartUpdateForm.setLstDataKeyValue(listObjKeyVal);
//                    } catch (Exception e) {
//                        logger.error("ERROR", e);
//                        ResultDTO result = new ResultDTO();
//                        result.setKey("FAIL");
//                        result.setMessage("Can not parse lstDataKeyData to Json Obj ");
//                        jsonObject.put("result", result);
//                    }
//                }
//                //R616891 longlt6 start 
//                ////609417_phucng_end
//                logger.info("call webservice wo.WS");
//                ResultDTO result = woWS.updateStatus(req,
//                        vsmartUpdateForm,
//                        username,
//                        woId,
//                        status,
//                        comment,
//                        ccResult,
//                        qrCode,
//                        listMaterials,
//                        reasonIdLV1,
//                        reasonIdLV2,
//                        actionKTTS,
//                        lstSerialKTTSs,
//                        reasonKtts,
//                        handoverUser,
//                        //R498430_hunght7_start
//                        isFt,
//                        //R498430_hunght7_end
//                        //R528867_hunght7_start
//                        listFileName,
//                        fileArr);
//                //R528867_hunght7_end
//                //514640_hunght7_start
//                if (partnerId != null && woId != null) {
//                    String sql = "update mn_work a set a.partner_id =:partnerId where a.wo_id =:woId";
//                    Query queryUpdate = session.createSQLQuery(sql);
//                    queryUpdate.setParameter("partnerId", partnerId);
//                    queryUpdate.setParameter("woId", woId);
//                    queryUpdate.executeUpdate();
//                }
//                session.getTransaction().commit();
//                //514640_hunght7_end
//                //hunght7_them ghi log_start
//                CommonLogger.log(req, username, "updateStatus", System.currentTimeMillis() - startAction,
//                        "woId::" + woId + "status::" + status + "OUTPUT::" + result);
//                //hunght7_them ghi log_end
//                jsonObject.put("result", result);
//            }
//            //R546878_hunght7_end
//        } catch (AppException ae) {
//            jsonObject.put("errMsg", ae.getMessage());
//            logger.error("ERROR", ae);
//            try {
//                //R492826_HungHT7_start
//                req.getSession().setAttribute("errorMsg", ae.getMessage());
//                //R492826_HungHT7_end
//                if (session != null && session.isOpen() && session.getTransaction().isActive()) {
//                    session.getTransaction().rollback();
//                }
//            } catch (Exception exx) {
//                logger.error("ERROR", exx);
//            }
//
//        } catch (Exception ex) {
//            logger.error("ERROR", ex);
//            try {
//                //R492826_HungHT7_start
//                req.getSession().setAttribute("errorMsg", LanguageBundleUtils.getStringVsmart("notUpdateError"));
//                //R492826_HungHT7_end
//                if (session != null && session.isOpen() && session.getTransaction().isActive()) {
//                    session.getTransaction().rollback();
//                }
//            } catch (Exception exx) {
//                logger.error("ERROR", exx);
//            }
//            logger.error("error updateStatus", ex);
//            jsonObject.put("errMsg", LanguageBundleUtils.getStringVsmart("notUpdateError"));
//        } finally {
//            if (session != null && session.isOpen()) {
//                session.close();
//            }
//        }
//        return jsonObject.toString();
//
//    }
    
    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String updateStatus(HttpServletRequest req, @RequestParam("username") String username,
            @RequestParam("isFt") Boolean isFt,
            //R498430_hunght7_end
            //R528867_hunght7_start
            @RequestParam("image1") MultipartFile image1,
            @RequestParam("token") String token) throws IOException {
    	
            		//R528867_hunght7_start
            		logger.info("image1" + image1 == null ? "NULL" : image1.getSize() + "_" + image1.getName() + "_" + image1.getBytes().length);
            		return null;
    }
}
