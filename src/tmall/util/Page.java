package tmall.util;

public class Page {
    private int start;//开始位置
    private int count;//每页显示的数量
    private int total;//总共有多少条数据
    private String param;

    public Page(int start, int count) {
        super();
        this.start = start;
        this.count = count;
        //param = new String("");
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public boolean isHasPreviouse() {
        if (start == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isHasNext() {
        if (start == getLast()) {
            return false;
        }
        return true;
    }

    public int getTotalPage() {
        int totalPage;
        if (0 == total % count) {
            totalPage = total / count;
        } else {
            totalPage = total / count + 1;
        }

        if (0 == totalPage) {
            totalPage = 1;
        }

        return totalPage;
    }

    public int getLast() {
        int last;
        if (0 == total % count) {
            last=total-count;
        }else {
            last = total - total % count;
        }
        last=last>0?last:0;
        return last;
    }
}
