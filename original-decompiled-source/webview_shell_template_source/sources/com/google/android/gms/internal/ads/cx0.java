package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cx0 extends bx0 {

    /* renamed from: g, reason: collision with root package name */
    public final Context f3684g;
    public final Executor h;

    public cx0(Context context, h70 h70Var) {
        this.f3684g = context;
        this.h = h70Var;
        this.f3322f = new x20(context, zzv.zzu().zzb(), this, this);
    }

    public final c5.a c(r30 r30Var) {
        synchronized (this.f3318b) {
            try {
                if (this.f3319c) {
                    return this.f3317a;
                }
                this.f3319c = true;
                this.f3321e = r30Var;
                this.f3322f.checkAvailabilityAndConnect();
                o70 o70Var = this.f3317a;
                o70Var.s.addListener(new p(12, this), i70.f5592g);
                bx0.b(this.f3684g, this.f3317a, this.h);
                return this.f3317a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        synchronized (this.f3318b) {
            try {
                if (!this.f3320d) {
                    this.f3320d = true;
                    try {
                        ((g30) this.f3322f.getService()).E0(this.f3321e, ((Boolean) zzbe.zzc().a(zn.Mc)).booleanValue() ? new ax0(this.f3317a, this.f3321e) : new zw0(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f3317a.b(new ix0(1));
                    } catch (Throwable th) {
                        zzv.zzp().h("RemoteSignalsClientTask.onConnected", th);
                        this.f3317a.b(new ix0(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
