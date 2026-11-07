package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hb1 implements OnAdMetadataChangedListener, jl0, rk0, pk0, xk0, ul0, ya1, on0 {
    public final vc1 s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f5316t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f5317u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f5318v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f5319w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f5320x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f5321y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f5322z = new AtomicReference();
    public hb1 A = null;

    public hb1(vc1 vc1Var) {
        this.s = vc1Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void O() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.O();
        } else {
            bq.f(this.f5318v, new ed0(23));
        }
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void a(ya1 ya1Var) {
        this.A = (hb1) ya1Var;
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void c(zzu zzuVar) {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.c(zzuVar);
            return;
        }
        Object obj = this.f5322z.get();
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
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.e(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f5318v;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((u40) obj).D1(zzeVar);
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
            ((u40) obj2).i(zzeVar.zza);
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.k0(zzeVar);
            return;
        }
        int i6 = zzeVar.zza;
        AtomicReference atomicReference = this.f5317u;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((y40) obj).zzf(zzeVar);
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((y40) obj2).zze(i6);
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = this.f5319w.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((f40) obj3).a(i6);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.onAdMetadataChanged();
        } else {
            bq.f(this.f5316t, new me0(28));
        }
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.t();
            return;
        }
        Object obj = this.f5317u.get();
        if (obj != null) {
            try {
                ((y40) obj).zzg();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f5319w.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((f40) obj2).zzi();
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) {
        int i6 = y30Var.f10823t;
        String str3 = y30Var.s;
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.v(y30Var, str, str2);
            return;
        }
        Object obj = this.f5318v.get();
        if (obj != null) {
            try {
                ((u40) obj).e0(new h50(str3, i6));
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f5320x.get();
        if (obj2 != null) {
            try {
                z40 z40Var = (z40) obj2;
                h50 h50Var = new h50(str3, i6);
                Parcel parcelZza = z40Var.zza();
                th.e(parcelZza, h50Var);
                parcelZza.writeString(str);
                parcelZza.writeString(str2);
                z40Var.zzda(2, parcelZza);
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = this.f5319w.get();
        if (obj3 != null) {
            try {
                ((f40) obj3).e1(y30Var);
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj4 = this.f5321y.get();
        if (obj4 == null) {
            return;
        }
        try {
            a40 a40Var = (a40) obj4;
            Parcel parcelZza2 = a40Var.zza();
            th.e(parcelZza2, y30Var);
            parcelZza2.writeString(str);
            parcelZza2.writeString(str2);
            a40Var.zzda(2, parcelZza2);
        } catch (RemoteException e12) {
            zzo.zzl("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.zza();
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
        Object obj = this.f5318v.get();
        if (obj != null) {
            try {
                ((u40) obj).zzg();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f5319w.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((f40) obj2).zzf();
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.zzb();
            return;
        }
        Object obj = this.f5319w.get();
        if (obj == null) {
            return;
        }
        try {
            ((f40) obj).zzh();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.zzc();
            return;
        }
        d0 d0Var = new d0(26);
        AtomicReference atomicReference = this.f5318v;
        bq.f(atomicReference, d0Var);
        Object obj = this.f5319w.get();
        if (obj != null) {
            try {
                ((f40) obj).zzj();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        bq.f(atomicReference, new f0(29));
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.zze();
            return;
        }
        Object obj = this.f5319w.get();
        if (obj == null) {
            return;
        }
        try {
            ((f40) obj).zzk();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
        hb1 hb1Var = this.A;
        if (hb1Var != null) {
            hb1Var.zzf();
            return;
        }
        Object obj = this.f5319w.get();
        if (obj == null) {
            return;
        }
        try {
            ((f40) obj).zzl();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void zzu() {
    }
}
