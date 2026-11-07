package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6776a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6777b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f6778c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f6779d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f6780e;

    public /* synthetic */ lj0(w92 w92Var, ca2 ca2Var, lk0 lk0Var, w92 w92Var2, int i6) {
        this.f6776a = i6;
        this.f6777b = w92Var;
        this.f6778c = ca2Var;
        this.f6779d = lk0Var;
        this.f6780e = w92Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    @Override // com.google.android.gms.internal.ads.ga2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        c5.a aVarU;
        switch (this.f6776a) {
            case 0:
                return new kj0((i3.a) this.f6777b.zzb(), (mj0) this.f6778c.zzb(), ((lk0) this.f6779d).a(), (String) this.f6780e.zzb());
            default:
                final mf mfVar = (mf) this.f6777b.zzb();
                final Context contextA = ((oc0) this.f6778c).a();
                ec1 ec1VarA = ((lk0) this.f6779d).a();
                long jLongValue = ((Long) this.f6780e.zzb()).longValue();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                int iIntValue = ((Integer) zzbe.zzc().a(zn.O2)).intValue();
                if (iIntValue != -1) {
                    if (Integer.toString(iIntValue).equals(zzaa.zzb(zzaa.zzc(ec1VarA.f4209d)))) {
                        aVarU = zzv.zzC().a() - jLongValue < ((long) ((Integer) zzbe.zzc().a(zn.Q2)).intValue()) ? h70Var.u(new oe(mfVar, contextA, 3)) : h70Var.u(new Callable() { // from class: com.google.android.gms.internal.ads.lw0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return mfVar.f7110b.zzf(contextA);
                            }
                        });
                    }
                }
                ih1.j(aVarU);
                return aVarU;
        }
    }
}
