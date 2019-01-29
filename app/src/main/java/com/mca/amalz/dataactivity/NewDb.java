package com.mca.amalz.dataactivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NewDb extends SQLiteOpenHelper {
    public static final String Datab="Stude.db";
    public static final String tablename="Studentdb";
    public static final String col1="id";
    public static  final String col2="ecode";
    public static  final String col3="ename";
    public static  final String col4="mobnum";
    public static  final String col5="email";
    public static  final String col6="designation";
    public static  final String col7="salary";
    public static  final String col8="cname";

    public NewDb(Context context) {
        super(context, Datab, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String Query="create table "+tablename+"("+col1+" integer primary key autoincrement,"+col2+" text,"+col3+" text, "+col4+" text,"+col5+" text, "+col6+" text, "+col7+" text, "+col8+" text)";
        db.execSQL(Query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String Query="drop table if exists "+tablename;
        db.execSQL(Query);
        onCreate(db);

    }
    public boolean insertdata(String ecode,String ename,String mobnum,String email,String desig,String salary,String cname){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col2,ecode);
        contentValues.put(col3,ename);
        contentValues.put(col4,mobnum);
        contentValues.put(col5,email);
        contentValues.put(col6,desig);
        contentValues.put(col7,salary);
        contentValues.put(col8,cname);
        long result=db.insert(tablename,null,contentValues);
        if(result==-1)
        {
            return false;

        }
        else
        {
            return true;
        }
    }
}
