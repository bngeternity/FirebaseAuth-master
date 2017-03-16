package info.androidhive.firebase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bengu on 16.3.2017.
 */


public class Menu extends Activity {
    Button scheduleBtn;
    Button editAccount;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Init();
        //openPickerDialog(false);
        scheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this,Schedule.class);
                startActivity(intent);
            }
        });

        editAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Init() {

        scheduleBtn = (Button)findViewById(R.id.scheduleBtn);
        editAccount = (Button)findViewById(R.id.editAccount);

    }
}
