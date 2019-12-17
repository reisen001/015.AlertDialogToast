package com.example.alertdialogtoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showtoast = (Button) findViewById(R.id.button_toast);
        Button showalert = (Button) findViewById(R.id.button_alertdialog);
        //------------------------------------------------------//

        showtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello world!", Toast.LENGTH_SHORT).show();
            }
        });

        //------------------------------------------------------//
        showalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("對話框測試")  ;                   //設定視窗標
                builder.setIcon(R.mipmap.ic_launcher_round);	        //設定對話視窗圖示
                builder.setMessage("這是一個對話視窗") ;           //設定顯示的文字
                builder.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog dialog = builder.create();
                builder.show();
            }
        });
    }
}

