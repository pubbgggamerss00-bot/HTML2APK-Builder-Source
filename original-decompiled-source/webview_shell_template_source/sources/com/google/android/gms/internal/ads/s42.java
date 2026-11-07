package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s42 implements lo1 {

    /* renamed from: a, reason: collision with root package name */
    public final lo1 f8790a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f8791b = Uri.EMPTY;

    public s42(lo1 lo1Var) {
        this.f8790a = lo1Var;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) {
        lo1 lo1Var = this.f8790a;
        this.f8791b = os1Var.f7851a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jC = lo1Var.c(os1Var);
            Uri uriZzc = lo1Var.zzc();
            if (uriZzc != null) {
                this.f8791b = uriZzc;
            }
            lo1Var.zze();
            return jC;
        } catch (Throwable th) {
            Uri uriZzc2 = lo1Var.zzc();
            if (uriZzc2 != null) {
                this.f8791b = uriZzc2;
            }
            lo1Var.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void d(o52 o52Var) {
        o52Var.getClass();
        this.f8790a.d(o52Var);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        return this.f8790a.j(i6, i7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f8790a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        this.f8790a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        return this.f8790a.zze();
    }
}
