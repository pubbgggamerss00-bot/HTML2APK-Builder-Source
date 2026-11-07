package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class nj1 extends SQLiteOpenHelper {
    public nj1(Context context, String str, int i6) {
        super(context, true == str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) ? null : str, (SQLiteDatabase.CursorFactory) null, i6);
    }
}
