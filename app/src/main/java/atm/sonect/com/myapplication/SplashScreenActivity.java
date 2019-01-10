package atm.sonect.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * Created by Aurelian Cotuna on 07/12/2018.
 */
public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);

        startTimer();
    }

    /**
     * Starts a timer that will end in 3 s and when done, this activity will go to the first
     * screen of the application, closing itself
     */
    private void startTimer(){
        Handler handler = new Handler();
        // Define the code block to be executed
        Runnable runnableCode = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        };
        handler.postDelayed(runnableCode, 3000);
    }
}
