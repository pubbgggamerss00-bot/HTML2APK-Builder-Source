package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f4147a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f4148b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4149c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4150d;

    public e71(hs1 hs1Var, ViewGroup viewGroup, Context context, Set set) {
        this.f4147a = hs1Var;
        this.f4150d = set;
        this.f4148b = viewGroup;
        this.f4149c = context;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        return this.f4147a.u(new mw0(1, this));
    }
}
