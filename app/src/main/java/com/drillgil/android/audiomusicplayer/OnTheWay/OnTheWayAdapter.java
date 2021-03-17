package com.drillgil.android.audiomusicplayer.OnTheWay;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.drillgil.android.audiomusicplayer.R;

import java.util.ArrayList;

public class OnTheWayAdapter extends BaseAdapter {


    private Context context;
    private int layout;
    private ArrayList<OnTheWay>  onTheWayList;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;


    public OnTheWayAdapter(Context context, int layout, ArrayList<OnTheWay> onTheWayList) {
        this.context = context;
        this.layout = layout;
        this.onTheWayList = onTheWayList;
    }

    @Override
    public int getCount() {
        return onTheWayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{

        TextView txtName, txtSinger;
        ImageView ivPlay, ivStop, ivImage;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout,null);
            viewHolder.txtName = (TextView)convertView.findViewById(R.id.txt_name);
            viewHolder.txtSinger = (TextView)convertView.findViewById(R.id.txt_singer);
            viewHolder.ivPlay = (ImageView)convertView.findViewById(R.id.play);
            viewHolder.ivStop = (ImageView)convertView.findViewById(R.id.stop);
            viewHolder.ivImage = (ImageView)convertView.findViewById(R.id.list_item_icon);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        OnTheWay onTheWay = onTheWayList.get(position);

        viewHolder.txtName.setText(onTheWay.getName());
        viewHolder.txtSinger.setText(onTheWay.getSinger());

        viewHolder.ivImage.setImageResource(R.drawable.mountains);


        //play music
        viewHolder.ivPlay.setOnClickListener(v -> {
            if(flag){
                mediaPlayer = MediaPlayer.create(context, onTheWay.getSong());
                flag = false;
            }
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
                viewHolder.ivPlay.setImageResource(R.drawable.play);
            }
            else {
                mediaPlayer.start();
                viewHolder.ivPlay.setImageResource(R.drawable.pause);
            }
        });

        //stop music
        viewHolder.ivStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag = true;
                }
                viewHolder.ivPlay.setImageResource(R.drawable.play);
            }
        });

        return convertView;
    }
}
