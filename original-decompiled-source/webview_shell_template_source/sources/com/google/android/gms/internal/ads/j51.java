package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f5952b;

    public /* synthetic */ j51(int i6, Serializable serializable) {
        this.f5951a = i6;
        this.f5952b = serializable;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f5951a) {
            case 0:
                ((ck0) obj).f3610a.putStringArrayList("ad_types", (ArrayList) this.f5952b);
                break;
            default:
                Boolean bool = (Boolean) this.f5952b;
                ck0 ck0Var = (ck0) obj;
                if (bool != null) {
                    ck0Var.f3610a.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f5951a) {
            case 0:
                ((ck0) obj).f3611b.putStringArrayList("ad_types", (ArrayList) this.f5952b);
                break;
        }
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
