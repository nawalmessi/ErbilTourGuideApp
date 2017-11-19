package com.example.android.erbiltourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by High Spec on 10/16/2017.
 */


public class PlaceAdapter extends ArrayAdapter<Place> {
    private Context context;
    private int layoutId;
    private List<Place> place;

    public PlaceAdapter(@NonNull Context context, @LayoutRes int layoutId, @NonNull List<Place> place) {
        super(context, layoutId, place);
        this.context = context;
        this.layoutId = layoutId;
        this.place = place;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(layoutId, null);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView address = (TextView) convertView.findViewById(R.id.address);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        Place placePosition = place.get(position);

        name.setText(placePosition.getName());
        address.setText(placePosition.getAddress());
        image.setImageResource(placePosition.getImage());

        return convertView;
    }
}
