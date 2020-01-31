package io.otdd.plugincenter.entity;

import lombok.Data;

@Data
public class PluginInfo {
    String pluginName;
    String protocol;
    String pluginVersion;
    String description;
    String downloadUrl;
}
