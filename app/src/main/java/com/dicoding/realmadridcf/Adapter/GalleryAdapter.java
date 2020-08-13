package com.dicoding.realmadridcf.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dicoding.realmadridcf.R;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ListViewHolder> {

    private String[] listImages;

    public GalleryAdapter(String[] listImages) {
        this.listImages = listImages;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        String image = listImages[position];

        Glide.with(holder.itemView.getContext())
            .load(image)
            .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return listImages.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.gallery);
        }
    }
}
