package cn.qtp000.layout;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.linelayout);
        switch1 = (Switch) findViewById(R.id.switch1);
//        switch1.setOnCheckedChangeListener(change());
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if (isChecked) {
                    WifiManager wifimanager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifimanager.setWifiEnabled(true);
                } else {
                    WifiManager wifimanager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifimanager.setWifiEnabled(false);
                }
            }
        });
//        switch1.setOnCheckedChangeListener(change());

    }


//    }

    public void call(View view) {
        Toast.makeText(this, "你好啊", Toast.LENGTH_SHORT).show();
    }

    public void wifikai(View view) {
        WifiManager wifimanager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiinfo = wifimanager.getConnectionInfo();
        wifimanager.setWifiEnabled(true);
        System.out.println("芝麻开门");
        wifimanager.getConfiguredNetworks();
        Log.d("日志前面的文字", wifiinfo.toString());
        Log.d("SSID", wifiinfo.getBSSID());
        Log.d("????", wifimanager.getConfiguredNetworks().toString());
        Toast.makeText(this, "aha", Toast.LENGTH_SHORT);

    }

    public void wifiguan(View view) {
        WifiManager wifimanager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifimanager.setWifiEnabled(false);
        System.out.println("关WIFI");
    }

    public void wifikaiguan(View view) {
        WifiManager wifimanager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifimanager.setWifiEnabled(true);
        System.out.println("aaaaaaaaaaaaaaaa");
        Toast.makeText(this, "aha", Toast.LENGTH_SHORT);

    }


}
//    private void toggleWiFi(Context context, boolean enabled) {
//        WifiManager wm = (WifiManager) context
//                .getSystemService(Context.WIFI_SERVICE);
//        wm.setWifiEnabled(enabled);
//    }
//}
