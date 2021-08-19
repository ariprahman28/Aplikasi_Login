package kominfo.go.id.storage.proyek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.widget.Toolbar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.File;

public class SplashScreen extends AppCompatActivity {
    public  final static  String FILENAME = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
        if (isLogin()){
            Intent intent = new Intent(SplashScreen.this,MainActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(SplashScreen.this,LoginActivty.class);
            startActivity(intent);
        }
        finish();
            }
        } ,3000);
    }

    boolean isLogin(){
        File sdcard = getFilesDir();
        File file = new File(sdcard, FILENAME);
        if(file.exists()){
            return true;
        }else{
            return false;
        }
    }
}