package com.cagdasalagoz.securitytestapp;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("CAGDAS", "sdk version: " + android.os.Build.VERSION.SDK);
        Log.e("CAGDAS", "device: " + android.os.Build.DEVICE);
        Log.e("CAGDAS", "model: " + android.os.Build.MODEL);
        Log.e("CAGDAS", "product: " + android.os.Build.PRODUCT);

        PackageManager pm = getPackageManager();
        List<ApplicationInfo> packages = pm
                .getInstalledApplications(PackageManager.GET_META_DATA);
        Log.e("CAGDAS", "packages: " + packages.toString());

        TextView textField = findViewById(R.id.textField);
        textField.setText(packages.toString());
        TextView appCount = findViewById(R.id.AppCount);
        appCount.setText("Installed app count:" + packages.size());
    }

}
