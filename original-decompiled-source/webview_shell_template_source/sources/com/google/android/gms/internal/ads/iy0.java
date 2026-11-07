package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iy0 implements zr1 {
    public final /* synthetic */ td1 s;

    public iy0(td1 td1Var) {
        this.s = td1Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2a(Object obj) {
        try {
            this.s.zza((SQLiteDatabase) obj);
        } catch (Exception e6) {
            zzo.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e6.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        zzo.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }
}
