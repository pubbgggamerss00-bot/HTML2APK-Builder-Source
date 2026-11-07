package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tu1 implements td1 {

    /* renamed from: u, reason: collision with root package name */
    public static final tu1 f9375u;

    /* renamed from: v, reason: collision with root package name */
    public static final tu1 f9376v;

    /* renamed from: w, reason: collision with root package name */
    public static final tu1 f9377w;

    /* renamed from: x, reason: collision with root package name */
    public static final tu1 f9378x;

    /* renamed from: y, reason: collision with root package name */
    public static final tu1 f9379y;

    /* renamed from: z, reason: collision with root package name */
    public static final tu1 f9380z;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f9381t;

    static {
        int i6 = 0;
        f9375u = new tu1("TINK", i6);
        f9376v = new tu1("CRUNCHY", i6);
        f9377w = new tu1("NO_PREFIX", i6);
        int i7 = 1;
        f9378x = new tu1("TINK", i7);
        f9379y = new tu1("CRUNCHY", i7);
        f9380z = new tu1("NO_PREFIX", i7);
    }

    public /* synthetic */ tu1(String str, int i6) {
        this.s = i6;
        this.f9381t = str;
    }

    public String toString() {
        switch (this.s) {
            case 0:
                return this.f9381t;
            case 1:
                return this.f9381t;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f9381t, Integer.toString(0)});
        return null;
    }
}
