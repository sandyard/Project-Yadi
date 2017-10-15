package com.example.edsnowden.guidemanasikumrah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Asus on 15/10/2017.
 */

class WordAdapter extends ArrayAdapter<Word>{

    WordAdapter(Context context, ArrayList<Word> doa) {
        super(context, 0, doa);
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_doa_item, parent, false);
        }

        Word currentWord = getItem(position);

        //TextView doa Manasik
        TextView doaManasik = (TextView) listItemView.findViewById(R.id.doa_text_view);

        doaManasik.setText(currentWord.getmDoaManasik());

        //TextView doa Manasik 2
        TextView doaManasik2 = (TextView) listItemView.findViewById(R.id.default_text_view);

        doaManasik2.setText(currentWord.getmDoaManasik2());


        return listItemView;



    }
}