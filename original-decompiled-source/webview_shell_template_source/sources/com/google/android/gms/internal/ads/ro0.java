package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ro0 implements CustomEventNativeListener, l0, MediationAdLoadCallback, zb0, zr1, uj2 {
    public Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f8673t;

    public ro0(int i6) {
        switch (i6) {
            case 8:
                this.s = new HashMap();
                break;
            default:
                bh1 bh1Var = new bh1();
                this.s = bh1Var;
                this.f8673t = new v31(15, bh1Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2a(Object obj) {
        synchronized (((md1) this.f8673t)) {
            try {
                md1 md1Var = (md1) this.f8673t;
                md1Var.f7095d = null;
                md1Var.f7094c.addFirst((ld1) this.s);
                md1 md1Var2 = (md1) this.f8673t;
                if (md1Var2.f7096e == 1) {
                    md1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[EDGE_INSN: B:67:0x011b->B:51:0x011b BREAK  A[LOOP:1: B:39:0x00e4->B:50:0x010a], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0 b(y0 y0Var, long j6) {
        long jZzf = y0Var.zzf();
        int iMin = (int) Math.min(20000L, y0Var.zzd() - jZzf);
        ex0 ex0Var = (ex0) this.f8673t;
        ex0Var.g(iMin);
        y0Var.h(0, iMin, ex0Var.f4416a);
        int i6 = -1;
        int i7 = -1;
        long j7 = -9223372036854775807L;
        while (ex0Var.o() >= 4) {
            if (r9.d(ex0Var.f4417b, ex0Var.f4416a) != 442) {
                ex0Var.k(1);
            } else {
                ex0Var.k(4);
                long jA = s9.a(ex0Var);
                if (jA != -9223372036854775807L) {
                    long jB = ((m11) this.s).b(jA);
                    if (jB > j6) {
                        return j7 == -9223372036854775807L ? new k0(-1, jB, jZzf) : new k0(0, -9223372036854775807L, jZzf + i7);
                    }
                    if (jB + 100000 > j6) {
                        return new k0(0, -9223372036854775807L, jZzf + ex0Var.f4417b);
                    }
                    j7 = jB;
                    i7 = ex0Var.f4417b;
                }
                int i8 = ex0Var.f4418c;
                if (ex0Var.o() < 10) {
                    ex0Var.j(i8);
                } else {
                    ex0Var.k(9);
                    int iV = ex0Var.v() & 7;
                    if (ex0Var.o() < iV) {
                        ex0Var.j(i8);
                    } else {
                        ex0Var.k(iV);
                        if (ex0Var.o() < 4) {
                            ex0Var.j(i8);
                        } else {
                            if (r9.d(ex0Var.f4417b, ex0Var.f4416a) != 443) {
                                while (true) {
                                    if (ex0Var.o() >= 4) {
                                        break;
                                    }
                                    int iD = r9.d(ex0Var.f4417b, ex0Var.f4416a);
                                    if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                        break;
                                    }
                                    ex0Var.k(4);
                                    if (ex0Var.o() < 2) {
                                        ex0Var.j(i8);
                                        break;
                                    }
                                    ex0Var.j(Math.min(ex0Var.f4418c, ex0Var.f4417b + ex0Var.z()));
                                }
                            } else {
                                ex0Var.k(4);
                                int iZ = ex0Var.z();
                                if (ex0Var.o() < iZ) {
                                    ex0Var.j(i8);
                                } else {
                                    ex0Var.k(iZ);
                                    while (true) {
                                        if (ex0Var.o() >= 4) {
                                        }
                                        ex0Var.j(Math.min(ex0Var.f4418c, ex0Var.f4417b + ex0Var.z()));
                                    }
                                }
                            }
                        }
                    }
                }
                i6 = ex0Var.f4417b;
            }
        }
        return j7 != -9223372036854775807L ? new k0(-2, j7, jZzf + i6) : k0.f6197d;
    }

    @Override // com.google.android.gms.internal.ads.uj2
    public cp1 c(int i6, a00 a00Var, int[] iArr) {
        pn1 pn1Var = yj2.f11011j;
        yn1 yn1Var = new yn1();
        for (int i7 = 0; i7 < a00Var.f2531a; i7++) {
            yn1Var.q(new tj2(i6, a00Var, i7, (jj2) this.s, iArr[i7], (String) this.f8673t));
        }
        return yn1Var.t();
    }

    public synchronized Map d() {
        try {
            if (((Map) this.f8673t) == null) {
                this.f8673t = Collections.unmodifiableMap(new HashMap((HashMap) this.s));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f8673t;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        synchronized (((md1) this.f8673t)) {
            ((md1) this.f8673t).f7095d = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        ((MediationNativeListener) this.f8673t).onAdClicked((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        ((MediationNativeListener) this.f8673t).onAdClosed((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdFailedToLoad(int i6) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationNativeListener) this.f8673t).onAdFailedToLoad((CustomEventAdapter) this.s, i6);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public void onAdImpression() {
        zzo.zze("Custom event adapter called onAdImpression.");
        ((MediationNativeListener) this.f8673t).onAdImpression((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationNativeListener) this.f8673t).onAdLeftApplication((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzo.zze("Custom event adapter called onAdLoaded.");
        ((MediationNativeListener) this.f8673t).onAdLoaded((CustomEventAdapter) this.s, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        ((MediationNativeListener) this.f8673t).onAdOpened((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((xz) this.s).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        xz xzVar = (xz) this.s;
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        if (nativeAdMapper != null) {
            try {
                xzVar.q0(new jz(nativeAdMapper));
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f8673t);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            xzVar.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        bq0 bq0Var = (bq0) this.s;
        Map map = (Map) this.f8673t;
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        bq0Var.f3252b.b(map2);
    }

    @Override // com.google.android.gms.internal.ads.l0
    public void zzb() {
        byte[] bArr = j31.f5919f;
        int length = bArr.length;
        ((ex0) this.f8673t).h(0, bArr);
    }

    public /* synthetic */ ro0(Object obj, Object obj2) {
        this.s = obj;
        this.f8673t = obj2;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationNativeListener) this.f8673t).onAdFailedToLoad((CustomEventAdapter) this.s, adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
