package io.otdd.plugincenter.config;

import io.otdd.plugincenter.entity.PluginInfo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties(prefix = "plugin")
@Configuration
@Data
public class PluginConfig {
    List<PluginInfo> pluginList;

}
