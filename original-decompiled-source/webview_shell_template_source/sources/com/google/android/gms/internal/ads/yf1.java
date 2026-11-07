package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class yf1 {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10959c;

    /* renamed from: d, reason: collision with root package name */
    public final gy f10960d;

    /* renamed from: e, reason: collision with root package name */
    public zzft f10961e;

    /* renamed from: g, reason: collision with root package name */
    public final zzcf f10963g;

    /* renamed from: i, reason: collision with root package name */
    public final gf1 f10964i;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f10966k;

    /* renamed from: n, reason: collision with root package name */
    public mf1 f10969n;

    /* renamed from: o, reason: collision with root package name */
    public final i3.a f10970o;
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f10962f = new AtomicBoolean(true);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f10965j = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f10967l = new AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f10968m = new AtomicBoolean(false);

    public yf1(ClientApi clientApi, Context context, int i6, gy gyVar, zzft zzftVar, zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, gf1 gf1Var, i3.a aVar) {
        this.f10957a = clientApi;
        this.f10958b = context;
        this.f10959c = i6;
        this.f10960d = gyVar;
        this.f10961e = zzftVar;
        this.f10963g = zzcfVar;
        this.f10966k = scheduledExecutorService;
        this.f10964i = gf1Var;
        this.f10970o = aVar;
    }

    public static void g(yf1 yf1Var, zze zzeVar) {
        synchronized (yf1Var) {
            yf1Var.f10965j.set(false);
            int i6 = zzeVar.zza;
            if (i6 != 1 && i6 != 8 && i6 != 10 && i6 != 11) {
                yf1Var.b(true);
                return;
            }
            zzft zzftVar = yf1Var.f10961e;
            zzo.zzi("Preloading " + zzftVar.zzb + ", for adUnitId:" + zzftVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:");
            yf1Var.f10962f.set(false);
        }
    }

    public final synchronized void a() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            rf1 rf1Var = (rf1) it.next();
            if (rf1Var.f8626c.a() >= rf1Var.f8625b + rf1Var.f8627d) {
                it.remove();
            }
        }
    }

    public final synchronized void b(boolean z6) {
        try {
            gf1 gf1Var = this.f10964i;
            if (gf1Var.f5028c <= Math.max(gf1Var.f5029d, ((Integer) zzbe.zzc().a(zn.f11515z)).intValue()) || gf1Var.f5030e < gf1Var.f5027b) {
                if (z6) {
                    gf1 gf1Var2 = this.f10964i;
                    double d7 = gf1Var2.f5030e;
                    gf1Var2.f5030e = Math.min((long) (d7 + d7), gf1Var2.f5027b);
                    gf1Var2.f5028c++;
                }
                ScheduledExecutorService scheduledExecutorService = this.f10966k;
                sf1 sf1Var = new sf1(this, 0);
                gf1 gf1Var3 = this.f10964i;
                double d8 = gf1Var3.f5030e;
                double d9 = 0.2d * d8;
                long j6 = (long) (d8 + d9);
                scheduledExecutorService.schedule(sf1Var, ((long) (d8 - d9)) + ((long) (gf1Var3.f5031f.nextDouble() * ((j6 - r4) + 1))), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract ps1 c();

    public abstract Optional d(Object obj);

    public final synchronized Object e() {
        gf1 gf1Var = this.f10964i;
        gf1Var.f5030e = gf1Var.f5026a;
        gf1Var.f5028c = 0L;
        rf1 rf1Var = (rf1) this.h.poll();
        this.f10968m.set(rf1Var != null);
        h();
        if (rf1Var == null) {
            return null;
        }
        return rf1Var.f8624a;
    }

    public final synchronized Optional f() {
        Object obj;
        try {
            synchronized (this) {
                rf1 rf1Var = (rf1) this.h.peek();
                obj = rf1Var == null ? null : rf1Var.f8624a;
            }
            return (obj == null ? Optional.empty() : d(obj)).filter(new tf1()).map(new vf1()).map(new wf1());
        } catch (Throwable th) {
            throw th;
        }
        return (obj == null ? Optional.empty() : d(obj)).filter(new tf1()).map(new vf1()).map(new wf1());
    }

    public final synchronized void h() {
        a();
        l();
        if (!this.f10965j.get() && this.f10962f.get() && this.h.size() < this.f10961e.zzd) {
            this.f10965j.set(true);
            ps1 ps1VarC = c();
            xj1 xj1Var = new xj1(19, this);
            ps1VarC.addListener(new as1(0, ps1VarC, xj1Var), this.f10966k);
        }
    }

    public final synchronized void i() {
        this.f10962f.set(true);
        this.f10967l.set(true);
        this.f10966k.submit(new sf1(this, 0));
    }

    public final synchronized void j(int i6) {
        try {
            com.google.android.gms.common.internal.l.b(i6 > 0);
            zzft zzftVar = this.f10961e;
            String str = zzftVar.zza;
            int i7 = zzftVar.zzb;
            zzm zzmVar = zzftVar.zzc;
            if (i6 <= 0) {
                i6 = zzftVar.zzd;
            }
            this.f10961e = new zzft(str, i7, zzmVar, i6);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(Object obj) {
        i3.a aVar = this.f10970o;
        rf1 rf1Var = new rf1(obj, aVar);
        this.h.add(rf1Var);
        i3.a aVar2 = this.f10970o;
        final Optional optionalD = d(obj);
        final long jA = aVar2.a();
        zzs.zza.post(new t(13, this));
        this.f10966k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xf1
            @Override // java.lang.Runnable
            public final void run() {
                yf1 yf1Var = this.s;
                mf1 mf1Var = yf1Var.f10969n;
                if (mf1Var != null) {
                    mf1Var.c(AdFormat.getAdFormat(yf1Var.f10961e.zzb), Optional.empty(), "pano_ts", jA, optionalD.filter(new tf1()).map(new vf1()).map(new wf1()));
                }
            }
        });
        this.f10966k.schedule(new sf1(this, 0), (rf1Var.f8627d + Math.min(Math.max(((Long) zzbe.zzc().a(zn.f11489v)).longValue(), -900000L), 10000L)) - (aVar.a() - rf1Var.f8625b), TimeUnit.MILLISECONDS);
    }

    public final synchronized void l() {
        if (this.f10968m.get() && this.h.isEmpty()) {
            this.f10968m.set(false);
            zzs.zza.post(new b(19, this));
            this.f10966k.execute(new sf1(this, 1));
        }
    }
}
