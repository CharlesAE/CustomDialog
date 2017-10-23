package ltd.leotech.customdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ltd.leotech.customdialog.utils.CustomDialog;

public class MainActivity extends AppCompatActivity {

    Button button;
    CustomDialog customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog = new CustomDialog();
                customDialog.setupDialog(MainActivity.this);
            }
        });
    }



}
