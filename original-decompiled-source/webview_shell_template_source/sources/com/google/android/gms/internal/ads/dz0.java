package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dz0 extends nj1 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final hs1 f4062t;

    /* JADX WARN: Illegal instructions before constructor call */
    public dz0(Context context, hs1 hs1Var) {
        int iIntValue = ((Integer) zzbe.zzc().a(zn.k8)).intValue();
        int i6 = pj1.f8098a;
        super(context, "AdMobOfflineBufferedPings.db", iIntValue);
        this.s = context;
        this.f4062t = hs1Var;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr = new String[count];
                int i6 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j6 = cursorQuery.getLong(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        if (string == null) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        } else {
                            Uri uri = Uri.parse(string);
                            long jA = zzv.zzC().a() - j6;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jA));
                            str = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
                        }
                        strArr[i6] = str;
                    }
                    i6++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i7 = 0; i7 < count; i7++) {
                    zzuVar.zza(strArr[i7]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void a(String str) {
        b(new tu1(str, 2));
    }

    public final void b(td1 td1Var) {
        bz0 bz0Var = new bz0(0, this);
        hs1 hs1Var = this.f4062t;
        c5.a aVarU = hs1Var.u(bz0Var);
        aVarU.addListener(new as1(0, aVarU, new cz0(td1Var)), hs1Var);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
