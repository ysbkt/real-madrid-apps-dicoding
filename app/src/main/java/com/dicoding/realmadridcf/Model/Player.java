package com.dicoding.realmadridcf.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    private String name;
    private String national;
    private String position;
    private String born;
    private String description;
    private String image;
    private String[] images;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Player{" +
            "name='" + name + '\'' +
            ", national='" + national + '\'' +
            ", position='" + position + '\'' +
            ", born='" + born + '\'' +
            ", description='" + description + '\'' +
            ", images=" + images +
            '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.national);
        dest.writeString(this.position);
        dest.writeString(this.born);
        dest.writeString(this.description);
        dest.writeString(this.image);
        dest.writeStringArray(this.images);
    }

    public Player() {
    }

    protected Player(Parcel in) {
        this.name = in.readString();
        this.national = in.readString();
        this.position = in.readString();
        this.born = in.readString();
        this.description = in.readString();
        this.image = in.readString();
        this.images = in.createStringArray();
    }

    public static final Parcelable.Creator<Player> CREATOR = new Parcelable.Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel source) {
            return new Player(source);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
