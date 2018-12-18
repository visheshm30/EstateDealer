package com.example.harin.estatedealer;

public class Upload {

    private String mName;
    private String mImageUrl;

    public Upload()
    {}

    public Upload(String name, String imageUrl){

        if (name.trim().equals(""))
        {
                name = "No name";
        }


        mName = name;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;

    }

    public void setName (String name) {
        mName = name;
    }

    public String getImageUrl() {

        return mImageUrl;
    }

    public void setmImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }


}
