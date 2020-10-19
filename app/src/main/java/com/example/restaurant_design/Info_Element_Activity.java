package com.example.restaurant_design;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Info_Element_Activity extends AppCompatActivity {
ImageView img;
TextView name_Element;
TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__element_);
        img = findViewById(R.id.imageView);
        name_Element= findViewById(R.id.name_element);
        description=findViewById(R.id.des);
        Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        String nameitem = this.getIntent().getStringExtra("Nameitem");
        String DES = this.getIntent().getStringExtra("DES");
        ImageView viewBitmap = (ImageView)findViewById(R.id.imageView);
        viewBitmap.setImageBitmap(bitmap);
        name_Element.setText(nameitem);
        description.setText(DES);

    }
}