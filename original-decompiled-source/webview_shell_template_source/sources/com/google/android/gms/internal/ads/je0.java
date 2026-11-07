package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class je0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6040a;

    /* renamed from: b, reason: collision with root package name */
    public final oc0 f6041b;

    public /* synthetic */ je0(oc0 oc0Var, int i6) {
        this.f6040a = i6;
        this.f6041b = oc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f6040a) {
            case 0:
                return new di1(this.f6041b.a(), zzv.zzu().zzb());
            case 1:
                return new iv0(this.f6041b.a());
            default:
                Context contextA = this.f6041b.a();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new u81(contextA, h70Var);
        }
    }
}
