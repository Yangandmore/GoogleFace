package com.google.demo;

import android.Manifest;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.weyye.hipermission.HiPermission;
import me.weyye.hipermission.PermissionCallback;
import me.weyye.hipermission.PermissionItem;

public class MainActivity extends Activity implements PermissionCallback {

    List<PermissionItem> permissionItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        permissionItems.add(new PermissionItem(Manifest.permission.CAMERA, "照相机", R.drawable.permission_ic_camera));
        HiPermission.create(this).permissions(permissionItems).checkMutiPermission(this);

    }

    private void init() {

    }


    @Override
    public void onClose() {
        this.finish();
    }

    @Override
    public void onFinish() {
        init();
    }

    @Override
    public void onDeny(String permission, int position) {

    }

    @Override
    public void onGuarantee(String permission, int position) {

    }
}
