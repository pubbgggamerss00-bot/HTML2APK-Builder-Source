package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ty0 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i6) {
        int i7 = 0;
        if (i6 == 2) {
            return 0;
        }
        Cursor cursorC = c(sQLiteDatabase, i6);
        if (cursorC.getCount() > 0) {
            cursorC.moveToNext();
            i7 = cursorC.getInt(cursorC.getColumnIndexOrThrow("value"));
        }
        cursorC.close();
        return i7;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, long j6, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j6));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j6)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static Cursor c(SQLiteDatabase sQLiteDatabase, int i6) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i6 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i6 == 1) {
            strArr2[0] = "total_requests";
        } else if (i6 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void e(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
