package com.dicodingsub.djmag2019;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView imgArtist;
    TextView tvName, tvDetail;

    public static final String ARTIST_NAME   = "artist_name";
    public static final String ARTIST_DETAIL = "artist_detail";
    public static final String ARTIST_PHOTO  = "artist_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        tvName = findViewById(R.id.tv_artist_name);
        tvDetail = findViewById(R.id.tv_artist_detail);
        imgArtist = findViewById(R.id.img_artist_photo);

        String name = getIntent().getStringExtra(ARTIST_NAME);
        String detail = getIntent().getStringExtra(ARTIST_DETAIL);
        int imgPhoto = getIntent().getIntExtra(ARTIST_PHOTO,0);

        tvName.setText(name);
        tvDetail.setText(detail);

        Glide.with(DetailActivity.this).load(ContextCompat.getDrawable(this, imgPhoto)).into(imgArtist);
    }
}
