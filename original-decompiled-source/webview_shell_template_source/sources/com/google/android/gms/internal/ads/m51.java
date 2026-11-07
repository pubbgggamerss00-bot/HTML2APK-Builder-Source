package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f6942b;

    public /* synthetic */ m51(Bundle bundle, int i6) {
        this.f6941a = i6;
        this.f6942b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f6941a) {
            case 0:
                ck0 ck0Var = (ck0) obj;
                Bundle bundle = this.f6942b;
                if (!bundle.isEmpty()) {
                    ck0Var.f3610a.putBundle("installed_adapter_data", bundle);
                    break;
                }
                break;
            default:
                ck0 ck0Var2 = (ck0) obj;
                Bundle bundle2 = this.f6942b;
                if (bundle2 != null) {
                    ck0Var2.f3610a.putAll(bundle2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f6941a) {
            case 0:
                break;
            default:
                ck0 ck0Var = (ck0) obj;
                Bundle bundle = this.f6942b;
                if (bundle != null) {
                    ck0Var.f3611b.putAll(bundle);
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
