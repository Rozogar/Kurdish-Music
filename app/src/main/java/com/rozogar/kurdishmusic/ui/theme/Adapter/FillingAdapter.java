package com.rozogar.kurdishmusic.ui.theme.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rozogar.kurdishmusic.R;
import com.rozogar.kurdishmusic.ui.theme.Activities.AyatActivity;
import com.rozogar.kurdishmusic.ui.theme.Activities.AzizActivity;
import com.rozogar.kurdishmusic.ui.theme.Activities.FariborzActivity;
import com.rozogar.kurdishmusic.ui.theme.Activities.NavidActivity;
import com.rozogar.kurdishmusic.ui.theme.Model.MusicModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FillingAdapter extends RecyclerView.Adapter<FillingAdapter.MyViewHolder> {

    private ArrayList<MusicModel> musicModelList;
    private Context context;

    public FillingAdapter(ArrayList<MusicModel> musicModelList, Context context) {
        this.musicModelList = musicModelList;
        this.context = context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView text;
        ImageView picture;
        Context context;
        ArrayList<MusicModel> musicModelList;

        public MyViewHolder(View view, Context context, ArrayList<MusicModel> musicModelList) {

            super(view);
            this.context = context;
            this.musicModelList = musicModelList;
            text = view.findViewById(R.id.text);
            picture = view.findViewById(R.id.picture);
            picture.setOnClickListener(this);
            text.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            MusicModel thisMusicModel = musicModelList.get(getBindingAdapterPosition());
            if (context instanceof AzizActivity) {
                ((AzizActivity) context).transmit(thisMusicModel);
            }

            if  (context instanceof NavidActivity)
            {
                ((NavidActivity) context).convey(thisMusicModel);
            }
            if (context instanceof FariborzActivity)
            {
                ((FariborzActivity) context).trans(thisMusicModel);
            }
            if (context instanceof AyatActivity){
                ((AyatActivity) context).go(thisMusicModel);
            }
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view, context, musicModelList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MusicModel musicModell = musicModelList.get(position);
        holder.text.setText(musicModell.getName());
        holder.picture.setImageResource(musicModell.getImg());
    }

    @Override
    public int getItemCount() {
        return musicModelList.size();
    }
}

