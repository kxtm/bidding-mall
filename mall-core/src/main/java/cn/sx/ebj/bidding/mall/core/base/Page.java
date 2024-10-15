package cn.sx.ebj.bidding.mall.core.base;

import java.util.List;

public class Page<T> {

    private int pageSize = 15;

    private int totalPages;

    private int currentPage = 1;

    private int totalCount;


    private List<T> list;

    public int getTotalPages() {
        if (totalCount > 0) {
            totalPages = (totalCount + pageSize - 1) / pageSize;
        }
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
