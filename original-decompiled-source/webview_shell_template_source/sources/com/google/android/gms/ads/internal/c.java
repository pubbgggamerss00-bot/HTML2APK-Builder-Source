package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.mf;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzu f2267a;

    public c(zzu zzuVar) {
        this.f2267a = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzu zzuVar = this.f2267a;
        return new mf(kf.m(zzuVar.zzd, new hf(zzuVar.zza.afmaVersion)));
    }
}
