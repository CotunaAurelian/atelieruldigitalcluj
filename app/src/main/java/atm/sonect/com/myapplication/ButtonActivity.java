package atm.sonect.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aurelian Cotuna on 07/12/2018.
 */
public class ButtonActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_activity_layout);

        Button startingButton = findViewById(R.id.starting_button);

        startingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
