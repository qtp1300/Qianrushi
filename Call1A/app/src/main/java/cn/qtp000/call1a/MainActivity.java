package cn.qtp000.call1a;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import static cn.qtp000.call1a.R.id.switch2;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private int aaa;
    private TextView wenben;
    private Switch mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.editText1);
        Button lalala= (Button) findViewById(R.id.button);
        lalala.setOnClickListener(new Listener1());
        wenben = (TextView) findViewById(R.id.textView2);
        mobile = (Switch) findViewById(R.id.switch2);

    }
    class Listener1 implements android.view.View.OnClickListener
    {

        private int lengthShort;

        @Override
        public void onClick(View view) {
            String number = num.getText().toString().trim();
            lengthShort = Toast.LENGTH_SHORT;
            Toast.makeText(MainActivity.this,number, 0).show();
            aaa=aaa+1;
            System.out.println(aaa);

            wenben.setText("变了吧"+aaa+number);
            Intent call = new Intent();
//            call.setAction(Intent.ACTION_CALL);
            call.setData(Uri.parse("tel:"+number));
            startActivity(call);
//            mobile.setText("开关");

//

        }
    }
}
//    exec("su");
//            try {
//                Runtime.getRuntime().exec("su");
////                Runtime.getRuntime().exec("svc wifi disable");
//            }
//            catch(IOException e){
////                Log.e(TAG, e.getMessage());
//            }
//            try {
//                Runtime.getRuntime().exec("shell svc wifi disable");
//            }
//            catch(IOException e){
////                Log.e(TAG, e.getMessage());
//            }