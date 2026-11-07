package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k00 implements MediationAdLoadCallback, td1, jm0, uj2 {
    public Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f6201t;

    /* renamed from: u, reason: collision with root package name */
    public Object f6202u;

    public /* synthetic */ k00(Object obj, Object obj2, Object obj3) {
        this.s = obj;
        this.f6201t = obj2;
        this.f6202u = obj3;
    }

    @Override // com.google.android.gms.internal.ads.uj2
    public cp1 c(int i6, a00 a00Var, int[] iArr) {
        int i7;
        int i8;
        int i9;
        int i10;
        Point point;
        a00 a00Var2 = a00Var;
        pn1 pn1Var = yj2.f11011j;
        jj2 jj2Var = (jj2) this.s;
        int i11 = ((int[]) this.f6202u)[i6];
        int i12 = jj2Var.f3749a;
        int i13 = jj2Var.f3750b;
        if (i12 == Integer.MAX_VALUE || i13 == Integer.MAX_VALUE) {
            i7 = Integer.MAX_VALUE;
        } else {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < a00Var2.f2531a; i15++) {
                w wVar = a00Var2.f2534d[i15];
                int i16 = wVar.f9984t;
                int i17 = wVar.f9985u;
                if (i16 > 0 && i17 > 0) {
                    if ((i16 > i17) != (i12 > i13)) {
                        i10 = i12;
                        i9 = i13;
                    } else {
                        i9 = i12;
                        i10 = i13;
                    }
                    if (i16 * i10 >= i17 * i9) {
                        int i18 = j31.f5914a;
                        point = new Point(i9, ((r11 + i16) - 1) / i16);
                    } else {
                        int i19 = j31.f5914a;
                        point = new Point(((r10 + i17) - 1) / i17, i10);
                    }
                    int i20 = wVar.f9984t;
                    int i21 = i20 * i17;
                    if (i20 >= ((int) (point.x * 0.98f)) && i17 >= ((int) (point.y * 0.98f)) && i21 < i14) {
                        i14 = i21;
                    }
                }
            }
            i7 = i14;
        }
        yn1 yn1Var = new yn1();
        int i22 = 0;
        while (i22 < a00Var2.f2531a) {
            w wVar2 = a00Var2.f2534d[i22];
            int i23 = wVar2.f9984t;
            int i24 = (i23 == -1 || (i8 = wVar2.f9985u) == -1) ? -1 : i23 * i8;
            yn1Var.q(new xj2(i6, a00Var2, i22, jj2Var, iArr[i22], (String) this.f6201t, i7 == Integer.MAX_VALUE || (i24 != -1 && i24 <= i7)));
            i22++;
            a00Var2 = a00Var;
        }
        return yn1Var.t();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((oz) this.s).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        oz ozVar = (oz) this.s;
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd != null) {
            try {
                ((l00) this.f6202u).f6544w = mediationAppOpenAd;
                ozVar.zzg();
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f6201t);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            ozVar.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        dz0 dz0Var = (dz0) this.s;
        zzu zzuVar = (zzu) this.f6201t;
        String str = (String) this.f6202u;
        dz0Var.getClass();
        dz0Var.f4062t.execute(new kb0(1, (SQLiteDatabase) obj, zzuVar, str));
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        ((th2) obj).a(0, ((sh2) this.s).f8938a, (fh2) this.f6201t, (lh2) this.f6202u);
    }
}
