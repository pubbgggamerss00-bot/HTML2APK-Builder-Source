package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class t21 implements jo0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b01 f9084t;

    public /* synthetic */ t21(b01 b01Var, int i6) {
        this.s = i6;
        this.f9084t = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final void c(boolean z6, Context context, vk0 vk0Var) throws io0 {
        gc1 gc1Var;
        switch (this.s) {
            case 0:
                Object obj = this.f9084t.f2884b;
                try {
                    ((rc1) obj).b(z6);
                    try {
                        ((rc1) obj).f8609a.t1(new k3.b(context));
                        return;
                    } finally {
                    }
                } catch (gc1 e6) {
                    throw new io0(e6.getCause());
                }
            default:
                Object obj2 = this.f9084t.f2884b;
                try {
                    ((rc1) obj2).b(z6);
                    try {
                        ((rc1) obj2).f8609a.zzL();
                        return;
                    } finally {
                    }
                } catch (gc1 e7) {
                    zzo.zzk("Cannot show rewarded video.", e7);
                    throw new io0(e7.getCause());
                }
        }
    }
}
