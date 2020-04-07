package nguyenduynghia.com.hocrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import nguyenduynghia.com.adapter.ContactAdapter;
import nguyenduynghia.com.hocrecycleview.databinding.ActivityMainBinding;
import nguyenduynghia.com.model.Contact;

public class MainActivity extends AppCompatActivity {

    ContactAdapter contactAdapter;
    ActivityMainBinding binding;
    ArrayList<Contact>contactList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFakeAdapter();
        addControls();

    }

    private void addFakeAdapter() {
        contactList=new ArrayList<>();
        contactList.add(new Contact(R.drawable.h1,"Kyrie","019538593742"));
        contactList.add(new Contact(R.drawable.h2,"MidNight","019538325242"));

    }

    private void addControls() {
        contactAdapter=new ContactAdapter(contactList);
        binding.rclContact.setAdapter(contactAdapter);

    }
}
