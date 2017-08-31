package com.example.dell.btap1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Lấy về các thành phần trong main.xml thông qua id
final EditText edit = (EditText)
findViewById(R.id.edit_text); final TextView text = (TextView)
  findViewById(R.id.text_view);
// Thiết lập xử lý cho sự kiện nhấn enter
 edit.setOnKeyListener(new View.OnKeyListener() {
 @Override
 public boolean onKey(View v, int keyCode,
                       KeyEvent event) {
   if (event.getAction() ==
    KeyEvent.ACTION_DOWN
    && keyCode ==
  KeyEvent.KEYCODE_ENTER) {
   text.setText(edit.getText().toString());
     edit.setText("");             return true;         }
      else {             return false;         }     } });
    }
}


