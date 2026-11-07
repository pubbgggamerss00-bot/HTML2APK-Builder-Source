package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nf0 implements bl0 {
    public final rc1 s;

    public nf0(rc1 rc1Var) {
        this.s = rc1Var;
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void a(Context context) {
        gc1 gc1Var;
        try {
            try {
                this.s.f8609a.zzo();
            } finally {
            }
        } catch (gc1 e6) {
            zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void e(Context context) {
        gc1 gc1Var;
        try {
            try {
                this.s.f8609a.zzE();
            } finally {
            }
        } catch (gc1 e6) {
            zzo.zzk("Cannot invoke onPause for the mediation adapter.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void i(Context context) throws gc1 {
        jy jyVar = this.s.f8609a;
        try {
            try {
                jyVar.zzF();
                if (context != null) {
                    try {
                        jyVar.A1(new k3.b(context));
                    } catch (Throwable th) {
                        throw new gc1(th);
                    }
                }
            } finally {
                gc1 gc1Var = new gc1(th);
            }
        } catch (gc1 e6) {
            zzo.zzk("Cannot invoke onResume for the mediation adapter.", e6);
        }
    }
}
