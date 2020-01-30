package io.otdd.plugincenter.entity;

import lombok.Data;

@Data
public class PluginInfo {
    String pluginName;
    String pluginVersion;
    String description;
    String protocol;
}
