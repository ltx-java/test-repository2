package org.xxpay.mgr.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.xxpay.common.util.DateUtil;
import org.xxpay.common.util.MyLog;
import org.xxpay.dal.dao.model.MchInfo;
import org.xxpay.dal.dao.model.UserInfo;
import org.xxpay.dal.dao.plugin.PageModel;
import org.xxpay.mgr.service.UserInfoService;

import java.util.List;

@Controller
@RequestMapping("/user_info")
public class UserInfoController {
    private final static MyLog _log = MyLog.getLog(UserInfoController.class);

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/list.html")
    public String listInput(ModelMap model) {

        return "user_info/list";
    }
    @RequestMapping("/edit.html")
    public String editInput(String id, ModelMap model) {
        UserInfo item = null;
        if(StringUtils.isNotBlank(id)) {
            item = userInfoService.selectUserInfo(id);
        }
        if(item == null) item = new UserInfo();
        model.put("item", item);
        return "user_info/edit";
    }

    @RequestMapping("/view.html")
    public String viewInput(String id, ModelMap model) {
        UserInfo item = null;
        if(StringUtils.isNotBlank(id)) {
            item = userInfoService.selectUserInfo(id);
        }
        if(item == null) item = new UserInfo();
        model.put("item", item);
        return "user_info/view";
    }

    //删除操作
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    @ResponseBody
    public int del(@RequestParam String id){
        int i = userInfoService.delUserInfo(id);
        return i;
    }

    //保存操作
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestParam String params) {
        JSONObject po = JSONObject.parseObject(params);
        UserInfo userInfo = new UserInfo();
        String id = po.getString("id");
        userInfo.setName(po.getString("name"));
        userInfo.setAge(po.getInteger("age"));
        userInfo.setAddress(po.getString("address"));
        int result;
        if(StringUtils.isBlank(id)) {
            // 添加
            result = userInfoService.addUserInfo(userInfo);
        }else {
            // 修改
            userInfo.setId(id);
            result = userInfoService.updateUserInfo(userInfo);
        }
        _log.info("保存用户记录,返回:{}", result);
        return result+"";
    }





    @RequestMapping("/list")
    @ResponseBody
    public String list(@ModelAttribute UserInfo userInfo, Integer pageIndex, Integer pageSize) {
        PageModel pageModel = new PageModel();
       int count = userInfoService.count(userInfo);
        if(count <= 0) return JSON.toJSONString(pageModel);
        List<UserInfo> userInfoList = userInfoService.getUserInfoList((pageIndex-1)*pageSize, pageSize, userInfo);
        if(!CollectionUtils.isEmpty(userInfoList)) {
            JSONArray array = new JSONArray();
            for(UserInfo mi : userInfoList) {
                JSONObject object = (JSONObject) JSONObject.toJSON(mi);
                object.put("createTime", DateUtil.date2Str(mi.getCreateTime()));
                array.add(object);
            }
            pageModel.setList(array);
        }
        pageModel.setCount(count);
        pageModel.setMsg("ok");
        pageModel.setRel(true);
        return JSON.toJSONString(pageModel);
    }


}
