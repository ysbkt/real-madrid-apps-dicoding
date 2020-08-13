package com.dicoding.realmadridcf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dicoding.realmadridcf.Adapter.PlayerAdapter;
import com.dicoding.realmadridcf.Model.Player;
import com.dicoding.realmadridcf.Model.PlayerData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    PlayerData playerData = new PlayerData();

    private RecyclerView rvPlayer;
    private ArrayList<Player> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profile = findViewById(R.id.profile_button);
        profile.setOnClickListener(this);

        rvPlayer = findViewById(R.id.rv_player);
        rvPlayer.setHasFixedSize(true);

        list.addAll(PlayerData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        final PlayerAdapter playerAdapter = new PlayerAdapter(list);
        rvPlayer.setAdapter(playerAdapter);

        playerAdapter.setOnItemClickCallback(new PlayerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Player data) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("player", data);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent profile = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(profile);
    }
}
