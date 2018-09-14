package thanhcoder.customlistview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import thanhcoder.customlistview.R;
import thanhcoder.customlistview.model.Contact;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;
    //thu
    private final String TAG =getClass().getSimpleName();
    //
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrContact=objects;

    }
//lop trung giang
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.contact_hihi,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.tv_color=convertView.findViewById(R.id.tv_color);
            viewHolder.tv_name=convertView.findViewById(R.id.tv_name);
            viewHolder.tv_number=convertView.findViewById(R.id.tv_number);
            //thu
            Log.d(TAG,"getView: "+position);
            //
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }

        Contact contact=arrContact.get(position);//mang arrContact tai vi tri position

        viewHolder.tv_color.setBackgroundColor(contact.getmColor());
        viewHolder. tv_color.setText((position+1)+"");
        viewHolder . tv_name.setText(contact.getmHoten());
        viewHolder.tv_number.setText(contact.getmNumber());


        return convertView;
    }
   public class ViewHolder{
        TextView tv_color;
        TextView tv_name;
        TextView tv_number;
    }
}
