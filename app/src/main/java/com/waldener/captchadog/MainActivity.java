package com.waldener.captchadog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.waldener.captcha.Captcha;

public class MainActivity extends AppCompatActivity {
    private Captcha captcha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captcha = findViewById(R.id.captCha);

//        captcha.setBitmap("https://tse2-mm.cn.bing.net/th/id/OIP.gY_Umtnvx6nZQqwNnkVdcAHaE8?pid=Api&rs=1");

        captcha.setCaptchaListener(new Captcha.CaptchaListener() {
            @Override
            public String onAccess(long time) {
                Log.i("MainActivity", "onAccess " + time);
                return null;
            }

            @Override
            public String onFailed() {
                Log.i("MainActivity", "onFailed ");
                return null;
            }
        });
    }
}