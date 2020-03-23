package com.dicodingsub.djmag2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvArtist;
    private ArrayList<Artist> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvArtist = findViewById(R.id.rv_artist);
        rvArtist.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ArtistData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvArtist.setLayoutManager(new LinearLayoutManager(this));
        ListArtistAdapter listArtistAdapter = new ListArtistAdapter(this);
        listArtistAdapter.setListArtist(list);
        rvArtist.setAdapter(listArtistAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int profile = item.getItemId();
        if (profile == R.id.about){
            Intent moveprofile = new Intent(MainActivity.this, About.class);
            startActivity(moveprofile);
        }
        return super.onOptionsItemSelected(item);
    }
}
