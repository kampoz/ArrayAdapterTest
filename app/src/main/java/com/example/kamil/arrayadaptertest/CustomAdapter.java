package com.example.kamil.arrayadaptertest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import javax.sql.DataSource;

/**
 * Created by Kamil on 10.08.2017.
 */

public class CustomAdapter extends ArrayAdapter<RowBean> {

  Context context;
  int layoutResourceId;
  RowBean data[] = null;

  public CustomAdapter(Context context, int layoutResourceId, RowBean[] data) {
    super(context, layoutResourceId, data);
    this.layoutResourceId = layoutResourceId;
    this.context = context;
    this.data = data;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View row = convertView;
    RowBeanHolder holder = null;

    if(row == null)
    {
      LayoutInflater inflater = ((Activity)context).getLayoutInflater();
      row = inflater.inflate(layoutResourceId, parent, false);

      holder = new RowBeanHolder();
      holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
      holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

      row.setTag(holder);
    }
    else
    {
      holder = (RowBeanHolder)row.getTag();
    }

    RowBean object = data[position];
    holder.txtTitle.setText(object.title);
    holder.imgIcon.setImageResource(object.icon);

    return row;
  }

  static class RowBeanHolder
  {
    ImageView imgIcon;
    TextView txtTitle;
  }

  /*
  public Bitmap getListByName(String name) {
    try {
      DataSource.open();
      List<DatosImage> datos = DataSource.obtenerRegistros(name);
      for (DatosImage dato : datos) {
        Bitmap bmp = BitmapFactory.decodeByteArray(dato.getValue(), 0, dato.getValue().length);
        if (bmp != null) {
          DataSource.close();
          return bmp;
        }
      }
      DataSource.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }*/

}

