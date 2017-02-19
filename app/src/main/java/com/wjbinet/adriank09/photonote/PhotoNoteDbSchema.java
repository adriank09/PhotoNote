package com.wjbinet.adriank09.photonote;

/**
 * Created by adriank09 on 2/19/2017.
 */

/*
*   PhotoNote Database Schema used by SQLite
*
*
 */

public class PhotoNoteDbSchema {
    public static final class PhotoNoteTable {
        public static final String NAME = "photonotes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATECREATED = "date_created";
            public static final String CONTENT = "content";
        }
    }
}
