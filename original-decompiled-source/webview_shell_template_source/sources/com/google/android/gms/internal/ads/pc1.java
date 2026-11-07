package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaz;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pc1 implements zzab {

    /* renamed from: d, reason: collision with root package name */
    public static pc1 f8026d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8027a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8028b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8029c;

    public pc1(zzg zzgVar, zzf zzfVar) {
        this.f8027a = zzgVar;
        this.f8028b = zzfVar;
    }

    public static pc1 a(Context context) {
        synchronized (pc1.class) {
            try {
                pc1 pc1Var = f8026d;
                if (pc1Var != null) {
                    return pc1Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) sp.f8986b.c()).longValue();
                zzcw zzcwVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 244410203) {
                    try {
                        zzcwVarAsInterface = zzcv.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                        zzo.zzh("Failed to retrieve lite SDK info.", e6);
                    }
                }
                pc1 pc1Var2 = new pc1(applicationContext, zzcwVarAsInterface);
                f8026d = pc1Var2;
                return pc1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(gy gyVar) {
        gy adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.f8029c;
        if (!((Boolean) sp.f8985a.c()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, gyVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return;
                }
            }
            return;
        }
        zzcw zzcwVar = (zzcw) this.f8028b;
        if (zzcwVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcwVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        if (adapterCreator == null) {
            adapterCreator = gyVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public /* bridge */ /* synthetic */ zzab zza(jk0 jk0Var) {
        this.f8028b = jk0Var;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public /* bridge */ /* synthetic */ zzab zzb(zzaz zzazVar) {
        this.f8029c = zzazVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public zzac zzc() {
        ih1.k((jk0) this.f8028b, jk0.class);
        ih1.k((zzaz) this.f8029c, zzaz.class);
        return new be0((kd0) this.f8027a, (zzaz) this.f8029c, (jk0) this.f8028b);
    }

    public pc1(Context context, zzcw zzcwVar) {
        this.f8029c = new AtomicReference();
        this.f8027a = context;
        this.f8028b = zzcwVar;
    }
}
