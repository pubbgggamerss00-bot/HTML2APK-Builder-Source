package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3780a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3781b;

    public /* synthetic */ d71(int i6, boolean z6) {
        this.f3780a = i6;
        this.f3781b = z6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f3780a) {
            case 0:
                ((ck0) obj).f3610a.putBoolean("is_gbid", this.f3781b);
                break;
            default:
                ck0 ck0Var = (ck0) obj;
                if (this.f3781b) {
                    ck0Var.f3610a.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f3780a) {
            case 0:
                ((ck0) obj).f3611b.putBoolean("is_gbid", this.f3781b);
                break;
        }
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
