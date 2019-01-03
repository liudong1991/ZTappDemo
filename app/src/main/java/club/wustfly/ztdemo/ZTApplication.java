package club.wustfly.ztdemo;

import android.app.Application;
import android.util.DisplayMetrics;

import club.wustfly.ztdemo.conf.Constants;

public class ZTApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        getScreenSize();

    }


    private void getScreenSize() {
        DisplayMetrics dm = this.getResources().getDisplayMetrics();
        Constants.SCREEN_WIDTH = dm.widthPixels;
        Constants.SCREEN_HEIGHT = dm.heightPixels;
    }
}
