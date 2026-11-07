package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ij0 implements zza {
    public final mj0 s;

    /* renamed from: t, reason: collision with root package name */
    public final ec1 f5782t;

    public ij0(mj0 mj0Var, ec1 ec1Var) {
        this.s = mj0Var;
        this.f5782t = ec1Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        ec1 ec1Var = this.f5782t;
        mj0 mj0Var = this.s;
        String str = ec1Var.f4211f;
        synchronized (mj0Var.f7163a) {
            try {
                Integer num = (Integer) mj0Var.f7164b.get(str);
                mj0Var.f7164b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
