package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8550b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8551c;

    public /* synthetic */ r51(Object obj, boolean z6, int i6) {
        this.f8549a = i6;
        this.f8551c = obj;
        this.f8550b = z6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f8549a) {
            case 0:
                Bundle bundle = ((ck0) obj).f3610a;
                if (((Boolean) zzbe.zzc().a(zn.f11458p5)).booleanValue()) {
                    bundle.putBoolean("app_switched", this.f8550b);
                }
                zzy zzyVar = (zzy) this.f8551c;
                if (zzyVar != null) {
                    int i6 = zzyVar.zza;
                    if (i6 != 1) {
                        if (i6 == 2) {
                            bundle.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle.putString("avo", "p");
                        break;
                    }
                }
                break;
            default:
                Bundle bundle2 = ((ck0) obj).f3610a;
                bundle2.putString("gct", (String) this.f8551c);
                if (this.f8550b) {
                    bundle2.putString("de", "1");
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f8549a) {
            case 0:
                break;
            default:
                ((ck0) obj).f3611b.putString("gct", (String) this.f8551c);
                break;
        }
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
