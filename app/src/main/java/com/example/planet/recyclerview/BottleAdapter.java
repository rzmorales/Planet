package com.example.planet.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.planet.R;
import com.example.planet.model.CameraImage;

import java.util.List;

public class BottleAdapter extends RecyclerView.Adapter<BottleViewHolder> {
    List<CameraImage> cameraImageList;


    public BottleAdapter(List<CameraImage> cameraImageList) {
        this.cameraImageList = cameraImageList;
    }

    @NonNull
    @Override
    public BottleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup,false);
        return new BottleViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull BottleViewHolder bottleViewHolder, int i) {

        bottleViewHolder.onBind(cameraImageList.get(i));

    }

    @Override
    public int getItemCount() {
        return cameraImageList.size();
    }
}
