package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j41 implements AppEventListener, yl0, jl0, rk0, al0, zza, pk0, ul0, xk0, on0 {
    public final cu0 A;
    public final AtomicReference s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f5929t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f5930u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f5931v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f5932w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f5933x = new AtomicBoolean(true);

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f5934y = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f5935z = new AtomicBoolean(false);
    public final ArrayBlockingQueue B = new ArrayBlockingQueue(((Integer) zzbe.zzc().a(zn.K8)).intValue());

    public j41(cu0 cu0Var) {
        this.A = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void O() {
        Object obj;
        if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue() && (obj = this.s.get()) != null) {
            try {
                ((zzbl) obj).zzc();
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f5932w.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzct) obj2).zzb();
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public final synchronized zzbl a() {
        return (zzbl) this.s.get();
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
        this.f5933x.set(true);
        this.f5935z.set(false);
    }

    @Override // com.google.android.gms.internal.ads.ul0
    public final void c(zzu zzuVar) {
        Object obj = this.f5930u.get();
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
        Object obj = this.f5932w.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzct) obj).zzd(zzeVar);
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public final void f(zzcm zzcmVar) {
        this.f5929t.set(zzcmVar);
        this.f5934y.set(true);
        i();
    }

    public final void i() {
        if (this.f5934y.get() && this.f5935z.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.B;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f5929t.get();
                if (obj != null) {
                    try {
                        ((zzcm) obj).zzc((String) pair.first, (String) pair.second);
                    } catch (RemoteException e6) {
                        zzo.zzl("#007 Could not call remote method.", e6);
                    } catch (NullPointerException e7) {
                        zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f5933x.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) {
        AtomicReference atomicReference = this.s;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzbl) obj).zzf(zzeVar);
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzbl) obj2).zze(zzeVar.zza);
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj3 = this.f5931v.get();
        if (obj3 != null) {
            try {
                ((zzbo) obj3).zzb(zzeVar);
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        this.f5933x.set(false);
        this.B.clear();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue() || (obj = this.s.get()) == null) {
            return;
        }
        try {
            ((zzbl) obj).zzc();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.f5933x.get()) {
            Object obj = this.f5929t.get();
            if (obj != null) {
                try {
                    ((zzcm) obj).zzc(str, str2);
                } catch (RemoteException e6) {
                    zzo.zzl("#007 Could not call remote method.", e6);
                } catch (NullPointerException e7) {
                    zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                }
            }
            return;
        }
        if (!this.B.offer(new Pair(str, str2))) {
            zzo.zze("The queue for app events is full, dropping the new event.");
            cu0 cu0Var = this.A;
            if (cu0Var != null) {
                bu0 bu0VarA = cu0Var.a();
                bu0VarA.a("action", "dae_action");
                bu0VarA.a("dae_name", str);
                bu0VarA.a("dae_data", str2);
                bu0VarA.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:6:0x000a, B:14:0x001f, B:17:0x0028, B:25:0x003d, B:23:0x0032, B:24:0x0038, B:12:0x0014, B:13:0x001a), top: B:31:0x0001, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.jl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void t() {
        Object obj;
        Object obj2 = this.s.get();
        if (obj2 == null) {
            obj = this.f5931v.get();
            if (obj != null) {
                this.f5935z.set(true);
                i();
            } else {
                try {
                    ((zzbo) obj).zzc();
                } catch (RemoteException e6) {
                    zzo.zzl("#007 Could not call remote method.", e6);
                } catch (NullPointerException e7) {
                    zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
                }
                this.f5935z.set(true);
                i();
            }
        } else {
            try {
                ((zzbl) obj2).zzi();
            } catch (RemoteException e8) {
                zzo.zzl("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
            obj = this.f5931v.get();
            if (obj != null) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() {
        bq.f(this.s, new bq(26, (byte) 0));
        Object obj = this.f5932w.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzct) obj).zzc();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() {
        Object obj = this.s.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbl) obj).zzh();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() {
        bq.f(this.s, new d0(25));
        AtomicReference atomicReference = this.f5932w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzct) obj).zzf();
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
            ((zzct) obj2).zze();
        } catch (RemoteException e8) {
            zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        Object obj = this.s.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbl) obj).zzg();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void zzu() {
        Object obj = this.s.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbl) obj).zzk();
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) {
    }
}
