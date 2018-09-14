package thanhcoder.customlistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import thanhcoder.customlistview.adapter.CustomAdapter;
import thanhcoder.customlistview.model.Contact;

public class MainActivity extends AppCompatActivity {
private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact=findViewById(R.id.lvContact);

        ArrayList<Contact>arrayList=new ArrayList<>();
        //tao nam so dien thoai
        Contact contact1=new Contact(Color.BLUE,"Chi Dang","3333333");
        Contact contact2=new Contact(Color.WHITE,"Nghia Dang","333333333");
        Contact contact3=new Contact(Color.YELLOW,"Minh Dang","3333333");
        Contact contact4=new Contact(Color.RED,"Ha Dang","333334433");
        Contact contact5=new Contact(Color.DKGRAY,"Dung Dang","333333333");
        Contact contact6=new Contact(Color.BLACK,"Lam Dang","3333333");
        Contact contact7=new Contact(Color.YELLOW,"Tien Dang","333663333");
        Contact contact8=new Contact(Color.WHITE,"Thao Dang","333773333");
        Contact contact9=new Contact(Color.DKGRAY,"Thu0 Dang","333993333");
        Contact contact10=new Contact(Color.GREEN,"Vien Dang","333883333");

        arrayList.add(contact1 );
        arrayList.add(contact2 );
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        arrayList.add(contact9);
        arrayList.add(contact10);






        CustomAdapter customAdapter=new CustomAdapter(this,R.layout.contact_hihi,arrayList);
        lvContact.setAdapter(customAdapter);
    }
}
