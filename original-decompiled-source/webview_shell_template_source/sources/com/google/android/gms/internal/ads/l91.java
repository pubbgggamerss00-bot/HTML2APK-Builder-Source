package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f6630a;

    public l91(Context context) {
        this.f6630a = n30.r(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return ((Boolean) zzbe.zzc().a(zn.Ob)).booleanValue() ? bs1.m(new k91()) : bs1.m(new o71(1, this));
    }
}
