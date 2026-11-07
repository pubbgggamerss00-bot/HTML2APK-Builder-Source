package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u41 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9456a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9457b;

    public /* synthetic */ u41(int i6, boolean z6) {
        this.f9456a = i6;
        this.f9457b = z6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f9456a) {
            case 0:
                ((ck0) obj).f3610a.putString("adid_p", true != this.f9457b ? "0" : "1");
                break;
            default:
                ((ck0) obj).f3610a.putBoolean("ibrr", this.f9457b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f9456a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}
