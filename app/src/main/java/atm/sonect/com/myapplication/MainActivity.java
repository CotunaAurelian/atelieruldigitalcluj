package atm.sonect.com.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private   Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.web_view_layout);
        final OnDataLoadedListener listener = new OnDataLoadedListener() {
            @Override
            public void onDataLoaded() {
                Toast.makeText(MainActivity.this, "Worked", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onIntDataLoaded(int value) {
                Toast.makeText(MainActivity.this, "Worked " + value, Toast.LENGTH_SHORT).show();

            }
        };

        myButton = findViewById(R.id.my_button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLoadingData(listener);
             //   startLoadingDataWithOnPostExecute(listener);
            }
        });

    }

    /**
     *  /**
     * Starts executing the long time consuming task and notify the main thread using a callback
     * and a handler in the main thread
     */
    private void startLoadingData(final OnDataLoadedListener listener) {
        @SuppressLint("StaticFieldLeak")
        AsyncTask task = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
                //Stuff
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        listener.onDataLoaded();
                    }
                });

                return null;
            }
        };
        task.execute();


    }

    /**
     * Starts executing the long time consuming task and notify the main thread using onPostExecute
     */
    private void startLoadingDataWithOnPostExecute(final OnDataLoadedListener listener){
        @SuppressLint("StaticFieldLeak")

        AsyncTask task = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
                //Stuff
                for (int iterator = 0; iterator< 100; iterator++){
                    //Nothibng here
                }

                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);
                listener.onDataLoaded();
            }
        };
        task.execute();
    }

    /**
     * Interface used to act as a listener for the background execution tasks
     */
    private interface OnDataLoadedListener {
        void onDataLoaded();

        void onIntDataLoaded(int value);
    }

}
