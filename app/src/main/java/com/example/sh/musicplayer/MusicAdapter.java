package com.example.sh.musicplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shabbir Hussain on 6/6/2017.
 */

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder>{
    private List<SongInfo> userInfoList;






    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name,number;

        public MyViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            number = (TextView) view.findViewById(R.id.details);
//            year = (TextView) view.findViewById(R.id.year);


        }
    }

    public MusicAdapter(List<SongInfo> movies){
        userInfoList = movies;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.music_list,parent,false);

        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return  myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SongInfo userInfo = userInfoList.get(position);
        holder.name.setText(userInfo.getSong_name());
        holder.number.setText(userInfo.getArtist_name());

    }

    @Override
    public int getItemCount() {
        return userInfoList.size();
    }


}


