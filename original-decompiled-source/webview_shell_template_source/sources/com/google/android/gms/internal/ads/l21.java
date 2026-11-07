package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l21 implements zr1 {
    public final /* synthetic */ long s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vb1 f6566t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ tb1 f6567u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f6568v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ af1 f6569w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ac1 f6570x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n21 f6571y;

    public l21(n21 n21Var, long j6, vb1 vb1Var, tb1 tb1Var, String str, af1 af1Var, ac1 ac1Var) {
        this.s = j6;
        this.f6566t = vb1Var;
        this.f6567u = tb1Var;
        this.f6568v = str;
        this.f6569w = af1Var;
        this.f6570x = ac1Var;
        this.f6571y = n21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x0024, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000f, B:6:0x0015, B:10:0x0027, B:12:0x002d, B:14:0x002f, B:15:0x0031, B:18:0x003c, B:25:0x0054, B:26:0x0068, B:27:0x0075, B:23:0x0044, B:24:0x0045, B:31:0x0079, B:16:0x0032, B:20:0x003e), top: B:34:0x000f, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2a(Object obj) {
        long j6;
        long jB = this.f6571y.f7297a.b() - this.s;
        synchronized (this.f6571y) {
            try {
                n21 n21Var = this.f6571y;
                if (n21Var.f7301e) {
                    n21Var.f7298b.b(this.f6566t, this.f6567u, 0, null, jB);
                    j6 = jB;
                } else {
                    j6 = jB;
                }
                n21 n21Var2 = this.f6571y;
                if (n21Var2.f7303g) {
                    return;
                }
                tb1 tb1Var = this.f6567u;
                synchronized (n21Var2) {
                    m21 m21Var = (m21) n21Var2.f7300d.get(tb1Var);
                    if (m21Var == null) {
                        LinkedHashMap linkedHashMap = this.f6571y.f7300d;
                        tb1 tb1Var2 = this.f6567u;
                        linkedHashMap.put(tb1Var2, new m21(this.f6568v, tb1Var2.f9182f0, 0, j6, null));
                    } else if (m21Var.f6910c == 8) {
                        ((m21) this.f6571y.f7300d.get(this.f6567u)).f6911d = j6;
                    }
                }
                this.f6571y.f7302f.d(this.f6567u, j6, null, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Throwable th) {
        int i6;
        zze zzeVar;
        Integer numValueOf;
        long j6;
        int i7;
        zze zzeVar2;
        long jB = this.f6571y.f7297a.b() - this.s;
        if (th instanceof TimeoutException) {
            i6 = 2;
        } else if (th instanceof y11) {
            i6 = 3;
        } else if (th instanceof CancellationException) {
            i6 = 4;
        } else if (th instanceof gc1) {
            i6 = 5;
        } else {
            if (th instanceof gw0) {
                i6 = tc1.a(th).zza == 3 ? 1 : 6;
                if (((Boolean) zzbe.zzc().a(zn.K1)).booleanValue() && (th instanceof d01) && (zzeVar = ((d01) th).f3708t) != null) {
                    numValueOf = Integer.valueOf(zzeVar.zza);
                }
                synchronized (this.f6571y) {
                    try {
                        n21 n21Var = this.f6571y;
                        if (n21Var.f7301e) {
                            i7 = i6;
                            n21Var.f7298b.b(this.f6566t, this.f6567u, i7, th instanceof d01 ? (d01) th : null, jB);
                            j6 = jB;
                        } else {
                            j6 = jB;
                            i7 = i6;
                        }
                        if (((Boolean) zzbe.zzc().a(zn.j8)).booleanValue()) {
                            cf1 cf1Var = this.f6571y.f7299c;
                            af1 af1Var = this.f6569w;
                            ac1 ac1Var = this.f6570x;
                            tb1 tb1Var = this.f6567u;
                            cf1Var.b(af1Var.a(ac1Var, tb1Var, tb1Var.f9196n), this.f6567u.f9215x0);
                        }
                        n21 n21Var2 = this.f6571y;
                        if (n21Var2.f7303g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = n21Var2.f7300d;
                        tb1 tb1Var2 = this.f6567u;
                        linkedHashMap.put(tb1Var2, new m21(this.f6568v, tb1Var2.f9182f0, i7, j6, numValueOf));
                        zze zzeVarA = tc1.a(th);
                        int i8 = zzeVarA.zza;
                        if ((i8 == 3 || i8 == 0) && (zzeVar2 = zzeVarA.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            zzeVarA = tc1.a(new d01(13, zzeVarA.zzd));
                        }
                        this.f6571y.f7302f.d(this.f6567u, j6, zzeVarA, false);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            i6 = 6;
        }
        numValueOf = null;
        synchronized (this.f6571y) {
        }
    }
}
