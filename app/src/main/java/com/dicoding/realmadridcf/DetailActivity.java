package com.dicoding.realmadridcf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.realmadridcf.Adapter.GalleryAdapter;
import com.dicoding.realmadridcf.Adapter.PlayerAdapter;
import com.dicoding.realmadridcf.Model.Player;
import com.dicoding.realmadridcf.Model.PlayerData;

public class DetailActivity extends AppCompatActivity {

    PlayerData playerData = new PlayerData();

    private RecyclerView rvGallery;
    private TextView tvName, tvBorn, tvNation, tvPosition, tvDesc;
    private ImageView imageView;
    private String[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        rvGallery = findViewById(R.id.rv_gallery);
        rvGallery.setHasFixedSize(true);

        tvName = findViewById(R.id.detail_fullname);
        tvBorn = findViewById(R.id.detail_born);
        tvNation = findViewById(R.id.detail_national);
        tvPosition = findViewById(R.id.detail_position);
        tvDesc = findViewById(R.id.description);
        imageView = findViewById(R.id.img_detail);

        Player player = getIntent().getParcelableExtra("player");
        if (player != null) {
            Glide.with(this)
                .load(player.getImage())
                .into(imageView);
            tvName.setText(player.getName());
            tvBorn.setText(player.getBorn());
            tvNation.setText(player.getNational());
            tvPosition.setText(player.getNational());
            tvDesc.setText(player.getDescription());
            images = player.getImages();
            showRecyclerView();
        }

        ImageView back = findViewById(R.id.detail_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showRecyclerView() {
        rvGallery.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        final GalleryAdapter galleryAdapter = new GalleryAdapter(images);
        rvGallery.setAdapter(galleryAdapter);


    }

}
