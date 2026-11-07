package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3993b;

    public /* synthetic */ dr0(int i6, Object obj) {
        this.f3992a = i6;
        this.f3993b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        switch (this.f3992a) {
            case 0:
                return obj != null ? (hr1) this.f3993b : bs1.l(new p21(1, "Retrieve required value in native ad response failed."));
            default:
                return bs1.m(((td1) this.f3993b).zza(obj));
        }
    }
}
