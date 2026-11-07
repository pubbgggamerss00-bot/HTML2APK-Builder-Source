package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7333a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7334b;

    public /* synthetic */ n71(int i6, Object obj) {
        this.f7333a = i6;
        this.f7334b = obj;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        switch (this.f7333a) {
            case 0:
                return 25;
            default:
                return 30;
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        switch (this.f7333a) {
            case 0:
                return bs1.m(new o71(0, (sb1) this.f7334b));
            default:
                return bs1.m(new m51((Bundle) this.f7334b, 1));
        }
    }
}
