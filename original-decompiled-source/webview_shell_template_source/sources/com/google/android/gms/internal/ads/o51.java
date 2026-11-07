package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7614a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f7615b;

    public o51(Context context, hs1 hs1Var) {
        this.f7615b = hs1Var;
        this.f7614a = context;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        if (!((Boolean) zzbe.zzc().a(zn.Jc)).booleanValue()) {
            return bs1.m(new p51(null, false));
        }
        ContentResolver contentResolver = this.f7614a.getContentResolver();
        if (contentResolver == null) {
            return bs1.m(new p51(null, false));
        }
        return this.f7615b.u(new of(1, contentResolver));
    }
}
