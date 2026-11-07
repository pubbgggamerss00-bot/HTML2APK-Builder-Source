package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ba1 implements rk0, pl0, ya1, zzr, ul0, xk0, on0 {
    public final vc1 s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f3018t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f3019u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f3020v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f3021w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f3022x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f3023y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public ba1 f3024z = null;

    public ba1(vc1 vc1Var) {
        this.s = vc1Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void O() {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.O();
            return;
        }
        Object obj = this.f3020v.get();
        if (obj == null) {
            return;
        }
        try {
            ((oj) obj).zzb();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void a(ya1 ya1Var) {
        this.f3024z = (ba1) ya1Var;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void c(zzu zzuVar) {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.c(zzuVar);
            return;
        }
        Object obj = this.f3023y.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdr) obj).zze(zzuVar);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.xk0
    public final void e(zze zzeVar) {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.e(zzeVar);
            return;
        }
        Object obj = this.f3020v.get();
        if (obj == null) {
            return;
        }
        try {
            ((oj) obj).zzd(zzeVar);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void f() {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.f();
            return;
        }
        ck1 ck1Var = this.s.f9808a;
        if (ck1Var != null) {
            md1 md1Var = (md1) ck1Var.f3613t;
            synchronized (md1Var) {
                md1Var.f7096e = 1;
                md1Var.a();
            }
        }
        Object obj = this.f3019u.get();
        if (obj != null) {
            try {
                ((lj) obj).zza();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f3020v.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((oj) obj2).zzc();
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public final void i(ch0 ch0Var) {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.i(ch0Var);
            return;
        }
        Object obj = this.f3018t.get();
        if (obj == null) {
            return;
        }
        try {
            ((kj) obj).z(ch0Var);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.k0(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f3018t;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((kj) obj).p1(zzeVar);
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((kj) obj2).zzb(zzeVar.zza);
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.zzdo();
        } else {
            bq.f(this.f3022x, new f0(28));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.zzdp();
            return;
        }
        bq.f(this.f3022x, new aa1(0));
        fo foVar = new fo(20);
        AtomicReference atomicReference = this.f3020v;
        bq.f(atomicReference, foVar);
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            ((oj) obj).zze();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.zzdr();
        } else {
            bq.f(this.f3022x, new ed0(22));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.zzds(i6);
            return;
        }
        Object obj = this.f3022x.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzr) obj).zzds(i6);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.pl0
    public final void zzg() {
        ba1 ba1Var = this.f3024z;
        if (ba1Var != null) {
            ba1Var.zzg();
        } else {
            bq.f(this.f3021w, new me0(27));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void zzu() {
    }
}
