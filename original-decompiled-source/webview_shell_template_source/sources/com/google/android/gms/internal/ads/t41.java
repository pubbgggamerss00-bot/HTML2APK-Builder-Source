package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t41 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9100a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9101b;

    public /* synthetic */ t41(int i6, Object obj) {
        this.f9100a = i6;
        this.f9101b = obj;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        switch (this.f9100a) {
            case 0:
                return 2;
            case 1:
                return 58;
            default:
                return 15;
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        int i6 = this.f9100a;
        Object obj = this.f9101b;
        switch (i6) {
            case 0:
                return bs1.m(new u41(0, k0.a.a((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                return bs1.m(new u41(1, ((ec1) obj).f4220p));
            default:
                oa1 oa1Var = (oa1) obj;
                if (oa1Var == null) {
                    return bs1.m(new u51(1, null));
                }
                String str = oa1Var.f7663a;
                int i7 = i3.i.f13372a;
                return (str == null || str.trim().isEmpty()) ? bs1.m(new u51(1, null)) : bs1.m(new u51(1, str));
        }
    }
}
