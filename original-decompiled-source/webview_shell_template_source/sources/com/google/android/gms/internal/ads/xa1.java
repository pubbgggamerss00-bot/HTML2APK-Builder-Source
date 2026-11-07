package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xa1 {

    /* renamed from: a, reason: collision with root package name */
    public final xc1 f10451a;

    /* renamed from: b, reason: collision with root package name */
    public final gk0 f10452b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f10453c;

    /* renamed from: d, reason: collision with root package name */
    public va1 f10454d;

    public xa1(xc1 xc1Var, gk0 gk0Var, Executor executor) {
        this.f10451a = xc1Var;
        this.f10452b = gk0Var;
        this.f10453c = executor;
    }

    @Deprecated
    public final gd1 a() {
        ec1 ec1VarZzg = this.f10452b.zzg();
        zzm zzmVar = ec1VarZzg.f4209d;
        String str = ec1VarZzg.f4211f;
        zzy zzyVar = ec1VarZzg.f4214j;
        cd1 cd1Var = this.f10451a.f10495b;
        return new gd1(zzmVar, str, new u30(cd1Var.s).a().f9697j, cd1Var.f3527y, zzyVar);
    }
}
