package nguyenduynghia.com.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import nguyenduynghia.com.hocrecycleview.R;
import nguyenduynghia.com.model.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.RecyclerViewHolder> {
    private Context context;
    private List<Contact>contactList;

    public ContactAdapter( List<Contact> contactList) {

        this.contactList = contactList;
    }

    @Override
    public ContactAdapter.RecyclerViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.contact_item,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ContactAdapter.RecyclerViewHolder holder, int position) {
        Contact contact=contactList.get(position);
        holder.txtPhone.setText(contact.getPhone());
        holder.txtName.setText(contact.getName());
        holder.imgAvatar.setImageResource(contact.getImgAvatar());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public  class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imgAvatar;
        TextView txtName,txtPhone;
        public RecyclerViewHolder( View itemView) {
            super(itemView);
            imgAvatar=itemView.findViewById(R.id.imgAvatar);
            txtName=itemView.findViewById(R.id.txtName);
            txtPhone=itemView.findViewById(R.id.txtPhone);
        }
    }
}
