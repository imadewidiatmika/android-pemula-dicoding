package com.dicodingsub.djmag2019;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListArtistAdapter extends RecyclerView.Adapter<ListArtistAdapter.ListViewHolder> {
    private ArrayList<Artist> listArtist;
    private Context context;

    public ArrayList<Artist> getListArtist() {return listArtist;}
    public ListArtistAdapter(Context context) { this.context = context; }
    public void setListArtist(ArrayList<Artist> listArtist) { this.listArtist = listArtist; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_artist, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        final Artist artist = getListArtist().get(position);
        Glide.with(context)
                .load(artist.getPhoto())
                .override(55,55)
                .into(holder.imgArtist);
        holder.tvName.setText(artist.getName());
        holder.tvDetail.setText(artist.getDetail());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Artist artist1 = getListArtist().get(position);
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra(DetailActivity.ARTIST_PHOTO, artist1.getPhoto());
                intent.putExtra(DetailActivity.ARTIST_NAME, artist1.getName());
                intent.putExtra(DetailActivity.ARTIST_DETAIL, artist1.getDetail());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listArtist.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgArtist;
        TextView tvName, tvDetail;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgArtist = itemView.findViewById(R.id.img_artist_photo);
            tvName = itemView.findViewById(R.id.tv_artist_name);
            tvDetail = itemView.findViewById(R.id.tv_artist_detail);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }
    }
}
