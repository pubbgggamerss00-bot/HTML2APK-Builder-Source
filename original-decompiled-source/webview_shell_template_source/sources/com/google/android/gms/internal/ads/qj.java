package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qj implements li {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8399b;

    public /* synthetic */ qj(int i6, Object obj) {
        this.f8398a = i6;
        this.f8399b = obj;
    }

    @Override // com.google.android.gms.internal.ads.li
    public final void zza(boolean z6) {
        switch (this.f8398a) {
            case 0:
                tj tjVar = (tj) this.f8399b;
                if (!z6) {
                    tj.b(tjVar);
                    break;
                } else {
                    tjVar.d();
                    break;
                }
            default:
                if (((Boolean) zzbe.zzc().a(zn.f11483u)).booleanValue()) {
                    ((qf1) this.f8399b).f(z6);
                    break;
                }
                break;
        }
    }
}
