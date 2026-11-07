package com.google.android.gms.ads.mediation.customevent;

import android.database.Cursor;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.ea;
import com.google.android.gms.internal.ads.ex0;
import com.google.android.gms.internal.ads.fh2;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.jm0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.lh2;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.m11;
import com.google.android.gms.internal.ads.my;
import com.google.android.gms.internal.ads.n70;
import com.google.android.gms.internal.ads.p21;
import com.google.android.gms.internal.ads.qr0;
import com.google.android.gms.internal.ads.s1;
import com.google.android.gms.internal.ads.sh2;
import com.google.android.gms.internal.ads.th2;
import com.google.android.gms.internal.ads.tk2;
import com.google.android.gms.internal.ads.uz;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.xa0;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.z0;
import com.google.android.gms.internal.ads.zb0;
import r2.e;
import r2.f;
import r2.g;
import v1.i;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements CustomEventInterstitialListener, v9, MediationAdLoadCallback, zb0, jm0 {
    public Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f2374t;

    /* renamed from: u, reason: collision with root package name */
    public Object f2375u;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.s = obj;
        this.f2374t = obj2;
        this.f2375u = obj3;
    }

    public e a(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.s;
        i iVarA = i.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            iVarA.e(1);
        } else {
            iVarA.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(iVarA);
        try {
            return cursorG.moveToFirst() ? new e(cursorG.getString(b0.c(cursorG, "work_spec_id")), cursorG.getInt(b0.c(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            iVarA.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public void b(m11 m11Var, z0 z0Var, ea eaVar) {
        this.f2374t = m11Var;
        eaVar.a();
        eaVar.b();
        s1 s1VarG = z0Var.g(eaVar.f4181d, 5);
        this.f2375u = s1VarG;
        s1VarG.b((w) this.s);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public void c(ex0 ex0Var) {
        long jD;
        long j6;
        y5.k((m11) this.f2374t);
        int i6 = j31.f5914a;
        m11 m11Var = (m11) this.f2374t;
        synchronized (m11Var) {
            try {
                long j7 = m11Var.f6903c;
                jD = j7 != -9223372036854775807L ? j7 + m11Var.f6902b : m11Var.d();
            } finally {
            }
        }
        m11 m11Var2 = (m11) this.f2374t;
        synchronized (m11Var2) {
            j6 = m11Var2.f6902b;
        }
        if (jD == -9223372036854775807L || j6 == -9223372036854775807L) {
            return;
        }
        w wVar = (w) this.s;
        if (j6 != wVar.f9983r) {
            tk2 tk2Var = new tk2(wVar);
            tk2Var.f9335q = j6;
            w wVar2 = new w(tk2Var);
            this.s = wVar2;
            ((s1) this.f2375u).b(wVar2);
        }
        int iO = ex0Var.o();
        ((s1) this.f2375u).e(iO, ex0Var);
        ((s1) this.f2375u).a(jD, 1, iO, 0, null);
    }

    public void d(e eVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.s;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((f) this.f2374t).e(eVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.s;
        workDatabase_Impl.b();
        g gVar = (g) this.f2375u;
        a2.e eVarA = gVar.a();
        if (str == null) {
            eVarA.c(1);
        } else {
            eVarA.d(1, str);
        }
        workDatabase_Impl.c();
        try {
            eVarA.e();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            gVar.c(eVarA);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        ((MediationInterstitialListener) this.f2375u).onAdClicked((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        ((MediationInterstitialListener) this.f2375u).onAdClosed((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdFailedToLoad(int i6) {
        zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        ((MediationInterstitialListener) this.f2375u).onAdFailedToLoad((CustomEventAdapter) this.s, i6);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationInterstitialListener) this.f2375u).onAdLeftApplication((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public void onAdLoaded() {
        zzo.zze("Custom event adapter called onReceivedAd.");
        ((MediationInterstitialListener) this.f2375u).onAdLoaded((CustomEventAdapter) this.f2374t);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        ((MediationInterstitialListener) this.f2375u).onAdOpened((CustomEventAdapter) this.s);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((uz) this.s).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        uz uzVar = (uz) this.s;
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd != null) {
            try {
                ((l00) this.f2375u).f6542u = mediationInterstitialAd;
                uzVar.zzg();
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f2374t);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            uzVar.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        ((th2) obj).d(0, ((sh2) this.s).f8938a, (fh2) this.f2374t, (lh2) this.f2375u);
    }

    public b(String str) {
        tk2 tk2Var = new tk2();
        tk2Var.c(str);
        this.s = new w(tk2Var);
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        qr0 qr0Var = (qr0) this.s;
        xa0 xa0Var = (xa0) this.f2374t;
        n70 n70Var = (n70) this.f2375u;
        zzga zzgaVar = qr0Var.f8445a.f4206a;
        if (z6) {
            if (zzgaVar != null && xa0Var.zzq() != null) {
                xa0Var.zzq().e2(zzgaVar);
            }
            n70Var.c();
            return;
        }
        n70Var.b(new p21(1, "Html video Web View failed to load. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        ((MediationInterstitialListener) this.f2375u).onAdFailedToLoad((CustomEventAdapter) this.s, adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
