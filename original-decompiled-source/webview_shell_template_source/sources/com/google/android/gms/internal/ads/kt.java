package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class kt implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6486a;

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f6486a) {
            case 0:
                Throwable th = (Throwable) obj;
                mt mtVar = xt.f10667a;
                if (!((Boolean) qp.f8437i.c()).booleanValue()) {
                    return "failure_click_attok";
                }
                zzv.zzp().h("prepareClickUrl.attestation1", th);
                return "failure_click_attok";
            case 1:
                return new yi0((List) obj);
            case 2:
                z2.b bVar = (z2.b) obj;
                return new x51(bVar.f15428a, bVar.f15429b, 0);
            case 3:
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                return x0Var.getClass().getSimpleName();
            default:
                ui2 ui2Var = ui2.f9566d;
                return Integer.valueOf(((a00) obj).f2533c);
        }
    }
}
