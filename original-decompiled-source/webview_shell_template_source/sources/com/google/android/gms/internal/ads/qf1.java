package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qf1 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8369a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8370b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final zf1 f8371c;

    /* renamed from: d, reason: collision with root package name */
    public final mf1 f8372d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8373e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f8374f;

    /* renamed from: g, reason: collision with root package name */
    public final i3.a f8375g;
    public AtomicInteger h;

    public qf1(zf1 zf1Var, mf1 mf1Var, Context context, i3.a aVar) {
        this.f8371c = zf1Var;
        this.f8372d = mf1Var;
        this.f8373e = context;
        this.f8375g = aVar;
    }

    public static String a(String str, AdFormat adFormat) {
        return androidx.activity.m.d(str, "#", adFormat == null ? "NULL" : adFormat.name());
    }

    public static void b(qf1 qf1Var, boolean z6) {
        synchronized (qf1Var) {
            if (((Boolean) zzbe.zzc().a(zn.f11476t)).booleanValue()) {
                qf1Var.f(z6);
            }
        }
    }

    public final synchronized yf1 c(String str, AdFormat adFormat) {
        return (yf1) this.f8369a.get(a(str, adFormat));
    }

    public final synchronized ArrayList d(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzft zzftVar = (zzft) it.next();
                String strA = a(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
                hashSet.add(strA);
                yf1 yf1Var = (yf1) this.f8369a.get(strA);
                if (yf1Var != null) {
                    if (yf1Var.f10961e.equals(zzftVar)) {
                        yf1Var.j(zzftVar.zzd);
                    } else {
                        this.f8370b.put(strA, yf1Var);
                        this.f8369a.remove(strA);
                    }
                } else if (this.f8370b.containsKey(strA)) {
                    yf1 yf1Var2 = (yf1) this.f8370b.get(strA);
                    if (yf1Var2.f10961e.equals(zzftVar)) {
                        yf1Var2.j(zzftVar.zzd);
                        yf1Var2.i();
                        this.f8369a.put(strA, yf1Var2);
                        this.f8370b.remove(strA);
                    }
                } else {
                    arrayList.add(zzftVar);
                }
            }
            Iterator it2 = this.f8369a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f8370b.put((String) entry.getKey(), (yf1) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f8370b.entrySet().iterator();
            while (it3.hasNext()) {
                yf1 yf1Var3 = (yf1) ((Map.Entry) it3.next()).getValue();
                boolean z6 = false;
                yf1Var3.f10962f.set(false);
                yf1Var3.f10967l.set(false);
                synchronized (yf1Var3) {
                    yf1Var3.a();
                    if (!yf1Var3.h.isEmpty()) {
                        z6 = true;
                    }
                }
                if (!z6) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized Optional e(final Class cls, String str, final AdFormat adFormat) {
        long jA = this.f8375g.a();
        mf1 mf1Var = this.f8372d;
        mf1Var.getClass();
        mf1Var.c(adFormat, Optional.of("poll_ad"), "ppac_ts", jA, Optional.empty());
        yf1 yf1VarC = c(str, adFormat);
        if (yf1VarC == null) {
            return Optional.empty();
        }
        try {
            final Optional optionalF = yf1VarC.f();
            Optional map = Optional.ofNullable(yf1VarC.e()).map(new Function() { // from class: com.google.android.gms.internal.ads.nf1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
            map.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.of1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    qf1 qf1Var = this.f7743a;
                    long jA2 = qf1Var.f8375g.a();
                    mf1 mf1Var2 = qf1Var.f8372d;
                    mf1Var2.getClass();
                    mf1Var2.c(adFormat, Optional.of("poll_ad"), "ppla_ts", jA2, optionalF);
                }
            });
            return map;
        } catch (ClassCastException e6) {
            zzv.zzp().h("PreloadAdManager.pollAd", e6);
            zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e6);
            return Optional.empty();
        }
    }

    public final synchronized void f(boolean z6) {
        try {
            if (z6) {
                Iterator it = this.f8369a.values().iterator();
                while (it.hasNext()) {
                    ((yf1) it.next()).i();
                }
            } else {
                Iterator it2 = this.f8369a.values().iterator();
                while (it2.hasNext()) {
                    ((yf1) it2.next()).f10962f.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(String str, AdFormat adFormat) {
        boolean z6;
        boolean z7;
        try {
            long jA = this.f8375g.a();
            yf1 yf1VarC = c(str, adFormat);
            z6 = false;
            if (yf1VarC != null) {
                synchronized (yf1VarC) {
                    yf1VarC.a();
                    z7 = !yf1VarC.h.isEmpty();
                }
                if (z7) {
                    z6 = true;
                }
            }
            this.f8372d.a(adFormat, jA, z6 ? Optional.of(Long.valueOf(this.f8375g.a())) : Optional.empty(), yf1VarC == null ? Optional.empty() : yf1VarC.f());
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }
}
