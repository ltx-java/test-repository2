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
import org.xxpay.dal.dao.model.BranchMag;
import org.xxpay.dal.dao.model.MchInfo;
import org.xxpay.dal.dao.plugin.PageModel;
import org.xxpay.mgr.service.BranchMagService;

import java.util.List;

@Controller
@RequestMapping("/branch_mag")
public class BranchMagController {

    private final static MyLog _log = MyLog.getLog(BranchMagController.class);

    @Autowired
    private BranchMagService branchMagService;

    @RequestMapping("/list.html")
    public String listInput(ModelMap model) {
        return "branch_mag/list";
    }

    @RequestMapping("/edit.html")
    public String editInput(String branchId, ModelMap model) {
        BranchMag item = null;
        if(StringUtils.isNotBlank(branchId)) {
            item = branchMagService.selectBranchMag(branchId);
        }
        if(item == null) item = new BranchMag();
        model.put("item", item);
        return "branch_mag/edit";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(@ModelAttribute BranchMag branchMag, Integer pageIndex, Integer pageSize) {
        PageModel pageModel = new PageModel();
        int count = branchMagService.count(branchMag);
        if(count <= 0) return JSON.toJSONString(pageModel);
        List<BranchMag> branchMagList = branchMagService.getBranchMagList((pageIndex-1)*pageSize, pageSize, branchMag);
        if(!CollectionUtils.isEmpty(branchMagList)) {
            JSONArray array = new JSONArray();
            for(BranchMag mi : branchMagList) {
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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestParam String params) {
        JSONObject po = JSONObject.parseObject(params);
        BranchMag branchMag = new BranchMag();
        String branchId = po.getString("branchId");
        branchMag.setName(po.getString("name"));
        branchMag.setState((byte) ("on".equalsIgnoreCase(po.getString("state")) ? 1 : 0));
        int result;
        if(StringUtils.isBlank(branchId)) {
            // 添加
            result = branchMagService.addBranchMag(branchMag);
        }else {
            // 修改
            branchMag.setBranchId(branchId);
            result = branchMagService.updateBranchMag(branchMag);
        }
        _log.info("保存商户记录,返回:{}", result);
        return result+"";
    }

    @RequestMapping("/view.html")
    public String viewInput(String branchId, ModelMap model) {
        BranchMag item = null;
        if(StringUtils.isNotBlank(branchId)) {
            item = branchMagService.selectBranchMag(branchId);
        }
        if(item == null) item = new BranchMag();
        model.put("item", item);
        return "branch_mag/view";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteInput(String branchId) {
        String result = "删除失败";
        int item = 0;
        if(StringUtils.isNotBlank(branchId)) {
            item = branchMagService.deleteBranchMag(branchId);
        }
        if(item > 0){
            result = "删除成功";
        }
        return result;
    }
}
