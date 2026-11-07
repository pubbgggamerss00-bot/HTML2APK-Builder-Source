package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jf1 extends zzch {
    public final qf1 s;

    public jf1(qf1 qf1Var) {
        this.s = qf1Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final hj zze(String str) {
        hj hjVar;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            hjVar = (hj) qf1Var.e(hj.class, str, AdFormat.APP_OPEN_AD).orElse(null);
        }
        return hjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) {
        zzby zzbyVar;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            zzbyVar = (zzby) qf1Var.e(zzby.class, str, AdFormat.INTERSTITIAL).orElse(null);
        }
        return zzbyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final r40 zzg(String str) {
        r40 r40Var;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            r40Var = (r40) qf1Var.e(r40.class, str, AdFormat.REWARDED).orElse(null);
        }
        return r40Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(gy gyVar) {
        qf1 qf1Var = this.s;
        qf1Var.f8371c.f11280e = gyVar;
        if (qf1Var.f8374f == null) {
            synchronized (qf1Var) {
                if (qf1Var.f8374f == null) {
                    try {
                        qf1Var.f8374f = (ConnectivityManager) qf1Var.f8373e.getSystemService("connectivity");
                    } catch (ClassCastException e6) {
                        zzo.zzk("Failed to get connectivity manager", e6);
                    }
                }
            }
        }
        if (!i3.g.a() || qf1Var.f8374f == null) {
            qf1Var.h = new AtomicInteger(((Integer) zzbe.zzc().a(zn.f11509y)).intValue());
            return;
        }
        try {
            qf1Var.f8374f.registerDefaultNetworkCallback(new pf1(qf1Var));
        } catch (RuntimeException e7) {
            zzo.zzk("Failed to register network callback", e7);
            qf1Var.h = new AtomicInteger(((Integer) zzbe.zzc().a(zn.f11509y)).intValue());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) {
        EnumMap enumMap;
        AdFormat adFormat;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            try {
                ArrayList arrayListD = qf1Var.d(list);
                enumMap = new EnumMap(AdFormat.class);
                int size = arrayListD.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayListD.get(i6);
                    i6++;
                    zzft zzftVar = (zzft) obj;
                    String str = zzftVar.zza;
                    adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                    yf1 yf1VarA = qf1Var.f8371c.a(zzftVar, zzcfVar);
                    if (adFormat != null && yf1VarA != null) {
                        AtomicInteger atomicInteger = qf1Var.h;
                        if (atomicInteger != null) {
                            int i7 = atomicInteger.get();
                            synchronized (yf1VarA) {
                                com.google.android.gms.common.internal.l.b(i7 >= 5);
                                gf1 gf1Var = yf1VarA.f10964i;
                                synchronized (gf1Var) {
                                    com.google.android.gms.common.internal.l.b(i7 > 0);
                                    gf1Var.f5029d = i7;
                                }
                            }
                        }
                        yf1VarA.f10969n = qf1Var.f8372d;
                        String strA = qf1.a(str, adFormat);
                        synchronized (qf1Var) {
                            synchronized (yf1VarA) {
                                yf1VarA.f10966k.submit(new sf1(yf1VarA, 0));
                            }
                            qf1Var.f8369a.put(strA, yf1VarA);
                        }
                    }
                }
                qf1Var.f8372d.b(enumMap, qf1Var.f8375g.a());
                zzv.zzb().b(new qj(1, qf1Var));
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) enumMap.getOrDefault(adFormat, 0)).intValue() + 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) {
        boolean zG;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            zG = qf1Var.g(str, AdFormat.APP_OPEN_AD);
        }
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) {
        boolean zG;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            zG = qf1Var.g(str, AdFormat.INTERSTITIAL);
        }
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) {
        boolean zG;
        qf1 qf1Var = this.s;
        synchronized (qf1Var) {
            zG = qf1Var.g(str, AdFormat.REWARDED);
        }
        return zG;
    }
}
