package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r71 implements q81 {

    /* renamed from: c, reason: collision with root package name */
    public static String f8569c;

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f8570a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8571b;

    public r71(hs1 hs1Var, Context context, Set set) {
        this.f8570a = hs1Var;
        this.f8571b = set;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return this.f8570a.u(new i90(3, this));
    }
}
