package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6956a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f6957b;

    public /* synthetic */ m71(Bundle bundle, int i6) {
        this.f6956a = i6;
        this.f6957b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f6956a) {
            case 0:
                Bundle bundle = ((ck0) obj).f3610a;
                Bundle bundleA = lc1.a("device", bundle);
                bundleA.putBundle("android_mem_info", this.f6957b);
                bundle.putBundle("device", bundleA);
                break;
            default:
                ck0 ck0Var = (ck0) obj;
                Bundle bundle2 = this.f6957b;
                if (!bundle2.isEmpty()) {
                    ck0Var.f3610a.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f6956a) {
            case 0:
                break;
            default:
                ck0 ck0Var = (ck0) obj;
                Bundle bundle = this.f6957b;
                if (!bundle.isEmpty()) {
                    ck0Var.f3611b.putBundle("shared_pref", bundle);
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
