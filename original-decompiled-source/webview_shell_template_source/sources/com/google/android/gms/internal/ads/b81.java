package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b81 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2981b;

    public b81(String str, int i6) {
        this.f2980a = str;
        this.f2981b = i6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ck0 ck0Var = (ck0) obj;
        ck0Var.f3610a.putString("request_id", this.f2980a);
        if (this.f2981b == 2) {
            ck0Var.f3610a.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((ck0) obj).f3611b.putString("request_id", this.f2980a);
    }
}
