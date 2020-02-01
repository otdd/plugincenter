package io.otdd.plugincenter.service;

import io.otdd.plugincenter.config.PluginConfig;
import io.otdd.plugincenter.entity.PageBean;
import io.otdd.plugincenter.entity.PluginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class PluginService {

    @Autowired
    PluginConfig pluginConfig;

    public PageBean<PluginInfo> getPluginList(String otddVersion,int curPage, int pageSize) {
        PageBean<PluginInfo> ret = new PageBean<PluginInfo>();
        ret.setPageSize(pageSize);
        ret.setCurPage(curPage);
        int len = pluginConfig.getPluginList().size();
        ret.setTotalNum(len);
        int start = (curPage-1)*pageSize;
        if(start>=len){
            return ret;
        }
        int end = start+pageSize;
        ret.getData().addAll(pluginConfig.getPluginList().subList(start,end<=len?end:len));
        return ret;
    }

}
