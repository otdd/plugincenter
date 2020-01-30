package io.otdd.plugincenter.service;

import io.otdd.plugincenter.entity.PageBean;
import io.otdd.plugincenter.entity.PluginInfo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class PluginService {

    public PageBean<PluginInfo> getPluginList(int curPage, int pageSize) {
        PageBean<PluginInfo> ret = new PageBean<PluginInfo>();
        ret.setPageSize(pageSize);
        ret.setCurPage(pageSize);
        PluginInfo info = new PluginInfo();
        info.setDescription("hehe");
        info.setPluginName("grpc plugin");
        info.setPluginVersion("1.1.0");
        info.setProtocol("grpc");
        ret.getData().add(info);

        info = new PluginInfo();
        info.setDescription("haha");
        info.setPluginName("dubbo plugin");
        info.setPluginVersion("1.2.0");
        info.setProtocol("dubbo");
        ret.getData().add(info);

        return ret;
    }

}
