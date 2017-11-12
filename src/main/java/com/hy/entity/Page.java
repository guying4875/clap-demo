package com.hy.entity;


import java.util.List;
import java.util.Map;

/**
 * @author zhanghengyu
 * @description page对象
 * @class com.hy.entity
 * @time 17-11-12 上午11:16
 */
public class Page<T> {
    /**当前页码*/
    private int currentIndex;
    /**每页显示行数*/
    private int pageSize;
    /**总行数*/
    private int totail;
    /**每页显示的列表数据*/
    private List<T> dataList;
    /**总页数*/
    private int totailPageNum;
    /**开始行号*/
    private int startRowNum;
    /**结束行号*/
    private int endRowNum;
    /**查询所用的参数*/
    private Map<String,Object> params;

    /**获取总页数*/
    public int getTotailPageNum(){
        return (totail+pageSize-1)/pageSize;
    }

    public int getStartRowNum() {
        return (currentIndex-1)*pageSize+1;
    }

    public int getEndRowNum() {
        return currentIndex*pageSize;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotail() {
        return this.totail;
    }

    public void setTotail(int totail) {
        this.totail = totail;
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public static void main(String args[]){
        System.out.print((19+10-1)/10);
    }
}
