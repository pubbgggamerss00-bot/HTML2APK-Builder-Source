package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9759b;

    public v81(int i6, int i7) {
        this.f9758a = i6;
        this.f9759b = i7;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void a(Object obj) {
        int i6;
        Bundle bundle = ((ck0) obj).f3610a;
        int i7 = this.f9758a;
        if (i7 == -1 || (i6 = this.f9759b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i7);
        bundle.putInt("crashes_without_flags", i6);
        int i8 = zzbc.zza;
        if (zzbe.zzc().f10638j) {
            bundle.putBoolean("did_reset", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
