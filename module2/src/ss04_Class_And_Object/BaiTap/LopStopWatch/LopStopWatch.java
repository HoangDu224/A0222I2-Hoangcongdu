package ss04_Class_And_Object.BaiTap.LopStopWatch;

import java.util.Date;

public class LopStopWatch {
    private Date startime;
    private Date endtime;

    public LopStopWatch(Date startime, Date endtime) {
        this.startime = startime;
        this.endtime = endtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public Date getStarttime() {
        return startime;
    }

    public LopStopWatch() {
    }

    public Date getStartime() {
        return this.startime = new Date();
    }

    public Date start() {
        return this.startime = new Date();
    }

    public Date stop() {
        return this.endtime = new Date();
    }

    public double getElapsedTime() {
        return this.endtime.getTime() - this.startime.getTime();
    }

}
