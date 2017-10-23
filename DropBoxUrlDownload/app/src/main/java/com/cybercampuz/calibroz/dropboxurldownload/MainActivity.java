package com.cybercampuz.calibroz.dropboxurldownload;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mVideoView = (VideoView) findViewById(R.id.videoView);
        startDownload();
    }

    private void startDownload() {

        mVideoView.setVideoURI(Uri.parse("https://www.dropbox.com/s/1j5ku254ydovzt1/one.mp4?dl=1"));
        mVideoView.start();

//        Ion.with(this)
//                .load("https://www.dropbox.com/s/1j5ku254ydovzt1/one.mp4?dl=1")
//                .write(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "one.mp4"))
//                .setCallback(new FutureCallback<File>() {
//                    @Override
//                    public void onCompleted(Exception e, File file) {
//                        Log.d("FILE_DOWNLOAD", "onCompleted: " + file.getName());
//                    }
//                });
    }
}
