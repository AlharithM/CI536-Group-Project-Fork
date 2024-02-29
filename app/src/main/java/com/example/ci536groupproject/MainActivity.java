package com.example.ci536groupproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drop_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                return true;
            case R.id.contactUs:
                Intent intent = new Intent(MainActivity.this, ContactUsActivity.class);
                startActivity(intent);
                return true;
            case R.id.accessability:
                Intent intent = new Intent(MainActivity.this, AccessabilityActivity.class);
                startActivity(intent);
                return true;
            case R.id.settings:
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void uploadImage(View view){
        Intent intent = new Intent(MainActivity.this, UploadImageActivity.class);
        startActivity(intent);
    }
    public void takePhoto(View view){
        Intent intent = new Intent(MainActivity.this, TakeImageActivity.class);
        startActivity(intent);
    }
}