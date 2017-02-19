package com.wjbinet.adriank09.photonote;

import java.util.Date;
import java.util.UUID;

/**
 * Created by adriank09 on 2/19/2017.
 */

/*
*   Model class for PhotoNote
*
 */
public class PhotoNote {

    private UUID mUUID;
    private String mTitle;
    private String mContent;
    private Date mDateCreated;

    public PhotoNote() {
        this(UUID.randomUUID());
    }

    public PhotoNote(UUID uuid) {
        mUUID = uuid;
        mDateCreated = new Date();
    }

    public UUID getUUID() {
        return mUUID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        mDateCreated = dateCreated;
    }
}
