package io.otdd.plugincenter.controller;

import com.google.gson.Gson;
import io.otdd.plugincenter.entity.PageBean;
import io.otdd.plugincenter.entity.PluginInfo;
import io.otdd.plugincenter.service.PluginService;
import io.otdd.plugincenter.vo.PageBeanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Set;

@Controller
@EnableAutoConfiguration
@RequestMapping("/plugincenter/plugin")
public class PluginController extends BaseController{

    @Autowired
    PluginService pluginService;

    @RequestMapping(value = "/getPluginList")
    @ResponseBody
    public Map<String, Object> getPluginList(@RequestBody String body) {
        Gson gson = new Gson();
        PageBeanVo vo = gson.fromJson(body, PageBeanVo.class);
        PageBean<PluginInfo> plugins = pluginService.getPluginList(vo.getPageInfo().getCurrent(),vo.getPageInfo().getPageSize());
        PageBeanVo ret = new PageBeanVo(plugins);

        return success(ret);
    }

}
