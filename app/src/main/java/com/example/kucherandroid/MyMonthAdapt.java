package com.example.kucherandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyMonthAdapt extends ArrayAdapter<MyMonth> {


    public MyMonthAdapt(@NonNull Context context, @NonNull List<MyMonth> list) {
        super(context, R.layout.month_item, list);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.month_item, null);
        }
        MyMonth month = getItem(position);

        TextView mtv = convertView.findViewById(R.id.mtv);
        mtv.setText(month.getM());
        TextView dtv = convertView.findViewById(R.id.dtv);
        dtv.setText(month.getM());
        TextView ttv = convertView.findViewById(R.id.ttv);
        ttv.setText(month.getM());

        return convertView;
    }
}
