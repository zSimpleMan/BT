package com.example.nhathan.bt_tuan4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<ThongTin> list;

    public Adapter(Context context, int layout, List<ThongTin> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View V, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        V = inflater.inflate(layout,null);

        TextView Ten = (TextView) V.findViewById(R.id.txtten);
        TextView SDT = (TextView) V.findViewById(R.id.txtsdt);
        ImageView img1 = (ImageView) V.findViewById(R.id.avatar);
        ImageView img2 = (ImageView) V.findViewById(R.id.img2);

        ThongTin thongTin = list.get(position);
        Ten.setText(thongTin.getTEN());
        SDT.setText(thongTin.getSDT());
        img1.setImageResource(thongTin.getHINH1());
        img2.setImageResource(thongTin.getHINH2());


        return V;
    }
}
