package com.drillgil.android.audiomusicplayer.GoodVibes;

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

public class GoodVibesAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<GoodVibes> goodVibesList;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;

    /**
     *
     * @param context to the GoodVibesPlayer.java
     * @param layout list_item.xml
     * @param goodVibesList the array list from GoodVibes.java
     */
    public GoodVibesAdapter(Context context, int layout, ArrayList<GoodVibes> goodVibesList) {
        this.context = context;
        this.layout = layout;
        this.goodVibesList = goodVibesList;
    }


    @Override
    public int getCount() {
        return goodVibesList.size();
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

        TextView txtName, txtAbout;
        ImageView ivPlay, ivStop, ivImage;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        GoodVibesAdapter.ViewHolder viewHolder;
        // Check if an existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            viewHolder = new GoodVibesAdapter.ViewHolder();
            LayoutInflater layoutInflater;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout,null);

            // Find the TextView in the list_item.xml layout with the ID.
            viewHolder.txtName = (TextView)convertView.findViewById(R.id.txt_name);
            viewHolder.txtAbout = (TextView)convertView.findViewById(R.id.txt_singer);

            // Find the ImageView in the list_item.xml layout with the ID.
            viewHolder.ivPlay = (ImageView)convertView.findViewById(R.id.play);
            viewHolder.ivStop = (ImageView)convertView.findViewById(R.id.stop);
            viewHolder.ivImage = (ImageView)convertView.findViewById(R.id.list_item_icon);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (GoodVibesAdapter.ViewHolder) convertView.getTag();
        }
        // Get the {@link GoodVibes} object located at this position in the list
        GoodVibes goodVibes = goodVibesList.get(position);
        // Get the the name from the goodVibes object and set this text on
        // the SoundTracker TextView.
        viewHolder.txtName.setText(goodVibes.getName());
        viewHolder.txtAbout.setText(goodVibes.getAbout());
        // If an image is available, display the provided image based on the resource ID
        viewHolder.ivImage.setImageResource(R.drawable.mountains);


        //play music
        viewHolder.ivPlay.setOnClickListener(v -> {
            if(flag){
                mediaPlayer = MediaPlayer.create(context, goodVibes.getSong());
                flag = false;
            }
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
                viewHolder.ivPlay.setImageResource(R.drawable.play);
            }
            else
            {
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