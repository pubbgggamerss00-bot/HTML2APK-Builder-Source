package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gv0 implements bn0 {
    public final Bundle s = new Bundle();

    @Override // com.google.android.gms.internal.ads.bn0
    public final synchronized void a(String str, String str2) {
        this.s.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final synchronized void e(String str) {
        this.s.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final synchronized void f(String str) {
        this.s.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.bn0
    public final void zza(String str) {
    }
}
