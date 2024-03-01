package com.example.ci536groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TakeImageActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_image);
        
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.takeImage);

        if(ContextCompat.checkSelfPermission(TakeImageActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActvivityCompat.requestPermissions(TakeImageActivity.this, new Sting[]{
                Manifest.permission.CAMERA
            }, 100);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 100);
            }
        });https://www.youtube.com/watch?v=XRD-lVwlSjU
    }
}
