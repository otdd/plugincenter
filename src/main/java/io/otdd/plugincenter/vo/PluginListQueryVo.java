package io.otdd.plugincenter.vo;

import lombok.Data;

@Data
public class PluginListQueryVo {
    private String otddVersion;
    private PageInfoVo pageInfo = new PageInfoVo(10);
}
