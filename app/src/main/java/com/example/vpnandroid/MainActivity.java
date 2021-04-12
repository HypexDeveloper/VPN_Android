package com.example.vpnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.net.VpnService;
import android.net.VpnService.Builder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

public class MainActivity extends AppCompatActivity {

    VpnService.Builder builder = new VpnService.Builder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        VpnService.Builder builder = new VpnService.Builder();


        ParcelFileDescriptor localTunnel = builder
                .addAddress("192.168.2.2", 24)
                .addRoute("0.0.0.0", 0)
                .addDnsServer("192.168.1.1")
                .establish();

    }
}