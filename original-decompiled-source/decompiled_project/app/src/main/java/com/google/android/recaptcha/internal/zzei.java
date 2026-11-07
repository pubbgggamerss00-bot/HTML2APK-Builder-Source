package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import c0.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import qg.x;
import qg.z;

/* loaded from: classes2.dex */
public final class zzei extends SQLiteOpenHelper {
    public static final zzeg zza = new zzeg(null);
    private static final int zzb = zzeg.zzc("18.6.1");
    private static final String zzc = zzeg.zzd("18.6.1");
    private static zzei zzd;

    public /* synthetic */ zzei(Context context, j jVar) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(x.I(list, ", ", "(", ")", zzeh.zza, 24))), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i10 = -1;
        try {
            if (cursorRawQuery.moveToNext()) {
                i10 = cursorRawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
        cursorRawQuery.close();
        return i10;
    }

    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        List arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
                    r.b(string);
                    arrayList.add(new zzej(string, j10, i10));
                } catch (Exception unused) {
                    arrayList = z.f22752a;
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzej zzejVar) {
        return zza(g0.c(zzejVar)) == 1;
    }
}
