package com.mostbet.promosti.mostbet;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


public class dsmdsjhdsjsss extends Service {
    MediaPlayer sdhkjdssss;
    @Override
    public IBinder onBind(Intent dsjdskss) {
        return null;
    }
    public void onCreate() {

        sdhkjdssss = MediaPlayer.create(this, R.raw.dsjhdsjhdsss); //select music file
        sdhkjdssss.setLooping(true); //set looping
    }
    public int onStartCommand(Intent dsjhdjsss, int kdsljdssss, int dshdssss) {
        sdhkjdssss.start();
        return Service.START_NOT_STICKY;
    }
    public void onDestroy() {
        sdhkjdssss.stop();
        sdhkjdssss.release();
        stopSelf();
        super.onDestroy();
    }
}
