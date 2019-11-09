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
import org.xxpay.dal.dao.model.AgentInfo;
import org.xxpay.dal.dao.plugin.PageModel;
import org.xxpay.dal.dao.mapper.AgentInfoMapper;
import org.xxpay.mgr.service.AgentInfoService;
import java.util.List;

@Controller
@RequestMapping("/agent_info")
public class AgentInfoController {

    private final static MyLog _log = MyLog.getLog(AgentInfoController.class);

    @Autowired
    private AgentInfoService agentInfoService;

    @RequestMapping("/list.html")
    public String listInput(ModelMap model) {
        return "agent_info/list";
    }

    @RequestMapping("/edit.html")
    public String editInput(String agentId, ModelMap model) {
        AgentInfo item = null;
        if(StringUtils.isNotBlank(agentId)) {
            item = agentInfoService.selectAgentInfo(agentId);
        }
        if(item == null) item = new AgentInfo();
        model.put("item", item);
        return "agent_info/edit";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(@ModelAttribute AgentInfo agentInfo, Integer pageIndex, Integer pageSize) {
        PageModel pageModel = new PageModel();
        int count = agentInfoService.count(agentInfo);
        if(count <= 0) return JSON.toJSONString(pageModel);
        List<AgentInfo> agentInfoList = agentInfoService.getAgentInfoList((pageIndex-1)*pageSize, pageSize, agentInfo);
        if(!CollectionUtils.isEmpty(agentInfoList)) {
            JSONArray array = new JSONArray();
            for(AgentInfo mi : agentInfoList) {
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
        AgentInfo agentInfo = new AgentInfo();
        String agentId = po.getString("agentId");
        agentInfo.setAgentName(po.getString("agentName"));
        //mchInfo.setType(po.getString("type"));
        //mchInfo.setState((byte) ("on".equalsIgnoreCase(po.getString("state")) ? 1 : 0));
        //mchInfo.setReqKey(po.getString("reqKey"));
        //mchInfo.setResKey(po.getString("resKey"));
        int result;
        if(StringUtils.isBlank(agentId)) {
            // 添加
            result = agentInfoService.addAgentInfo(agentInfo);
        }else {
            // 修改
            agentInfo.setAgentId(agentId);
            result = agentInfoService.updateAgentInfo(agentInfo);
        }
        _log.info("保存商户记录,返回:{}", result);
        return result+"";
    }



    //根据商户id删除商户信息
    @RequestMapping("/remove")
    public String delete(String agentId){
        String res = agentInfoService.delect(agentId);
        return res;
    }



    @RequestMapping("/view.html")
    public String viewInput(String agentId, ModelMap model) {
        AgentInfo item = null;
        if(StringUtils.isNotBlank(agentId)) {
            item = agentInfoService.selectAgentInfo(agentId);
        }
        if(item == null) item = new AgentInfo();
        model.put("item", item);
        return "agent_info/view";
    }





}
