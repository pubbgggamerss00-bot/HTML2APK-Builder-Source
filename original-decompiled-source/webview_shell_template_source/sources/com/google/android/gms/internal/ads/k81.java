package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k81 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f6281a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6282b;

    /* renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f6283c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6284d;

    public k81(hs1 hs1Var, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.f6281a = hs1Var;
        this.f6282b = context;
        this.f6283c = versionInfoParcel;
        this.f6284d = str;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return this.f6281a.u(new i90(4, this));
    }
}
