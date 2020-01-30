package io.otdd.plugincenter.vo;

import io.otdd.plugincenter.entity.PageBean;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageBeanVo<T> {

    public PageBeanVo(){

    }

    public PageBeanVo(PageBean p){
        this.pageInfo.setCurrent(p.getCurPage());
        this.pageInfo.setPageSize(p.getPageSize());
        this.pageInfo.setTotal(p.getTotalNum());
        this.data = p.getData();
    }
    private PageInfoVo pageInfo = new PageInfoVo(20);
    List<T> data = new ArrayList<T>();

}
