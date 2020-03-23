package com.dicodingsub.djmag2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Artist> listArtist;
    public DetailAdapter(Context context) {this.context = context;}

    ArrayList<Artist> getListArtist() {return listArtist;}

    public void setListArtist(ArrayList<Artist> listArtist) { this.listArtist = listArtist;}


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_detail,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Artist artist = getListArtist().get(position);
        Glide.with(context)
                .load(artist.getPhoto())
                .override(250,250)
                .into(holder.imgArtist);
        holder.tvName.setText(artist.getName());
        holder.tvDetail.setText(artist.getDetail());
    }

    @Override
    public int getItemCount() {
        return getListArtist().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgArtist;
        TextView tvName , tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgArtist = itemView.findViewById(R.id.img_artist_photo);
            tvDetail = itemView.findViewById(R.id.tv_artist_detail);
            tvName = itemView.findViewById(R.id.tv_artist_name);
        }
    }
}
