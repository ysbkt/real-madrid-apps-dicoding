package com.dicoding.realmadridcf.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dicoding.realmadridcf.Model.Player;
import com.dicoding.realmadridcf.R;

import java.util.ArrayList;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ListViewHolder> {

    private ArrayList<Player> listPlayer;

    public PlayerAdapter(ArrayList<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_player, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Player player = listPlayer.get(position);

        Glide.with(holder.itemView.getContext())
            .load(player.getImage())
            .into(holder.image);

        holder.name.setText(player.getName());
        holder.national.setText(player.getNational());
        holder.position.setText(player.getPosition());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listPlayer.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, national, position;

        public ListViewHolder(View itemView) {
            super(itemView);
            image   = itemView.findViewById(R.id.img_item_photo);
            name    = itemView.findViewById(R.id.name);
            national = itemView.findViewById(R.id.national);
            position    = itemView.findViewById(R.id.position);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Player data);
    }
}
