package nguyenduynghia.com.model;

import android.widget.ImageView;

public class Contact {
    private int imgAvatar;
    private String name;
    private  String phone;

    public Contact() {
    }

    public Contact(int imgAvatar, String name, String phone) {
        this.imgAvatar = imgAvatar;
        this.name = name;
        this.phone = phone;
    }

    public int getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(int imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
