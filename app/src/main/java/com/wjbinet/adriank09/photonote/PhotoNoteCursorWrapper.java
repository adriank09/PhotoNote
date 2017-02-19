package com.wjbinet.adriank09.photonote;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.wjbinet.adriank09.photonote.PhotoNoteDbSchema.PhotoNoteTable;

import java.util.Date;
import java.util.UUID;

/**
 * Created by adriank09 on 2/19/2017.
 */

/*
*
* CursorWrapper to traverse through the DB records
*
 */

public class PhotoNoteCursorWrapper extends CursorWrapper {

    public PhotoNoteCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public PhotoNote getPhotoNote() {
        String uuidString = getString(getColumnIndex(PhotoNoteTable.Cols.UUID));
        String title = getString(getColumnIndex(PhotoNoteTable.Cols.TITLE));
        String content = getString(getColumnIndex(PhotoNoteTable.Cols.CONTENT));
        long date = getLong(getColumnIndex(PhotoNoteTable.Cols.DATECREATED));

        PhotoNote photoNote = new PhotoNote(UUID.fromString(uuidString));
        photoNote.setTitle(title);
        photoNote.setContent(content);
        photoNote.setDateCreated(new Date());

        return photoNote;
    }
}
