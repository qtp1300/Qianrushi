package cn.qtp000.call1b;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

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
        Button lalala = (Button) findViewById(R.id.button);
        Button lalala2 = (Button) findViewById(R.id.button2);
        Button lalala3 = (Button) findViewById(R.id.button3);
        Button lalala4 = (Button) findViewById(R.id.button4);
        Button lalala5 = (Button) findViewById(R.id.button5);
        wenben = (TextView) findViewById(R.id.textView2);
        mobile = (Switch) findViewById(R.id.switch2);
        lalala.setOnClickListener(new Listener1());
        lalala2.setOnClickListener(new Listener1());
        lalala3.setOnClickListener(new Listener1());
        lalala4.setOnClickListener(new Listener1());
        lalala5.setOnClickListener(new Listener1());


    }

    class Listener1 implements android.view.View.OnClickListener {
        @Override
        public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:
                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button2:
                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button3:
                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button4:
                        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button5:
                        Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
                        break;
                }
            String number = num.getText().toString().trim();
            Toast.makeText(MainActivity.this, number, 0).show();
            aaa = aaa + 1;
            System.out.println(aaa);
            wenben.setText("变了吧" + aaa + number);
            Intent call = new Intent();
//            call.setAction(Intent.ACTION_CALL);
            call.setData(Uri.parse("tel:" + number));
//            startActivity(call);
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