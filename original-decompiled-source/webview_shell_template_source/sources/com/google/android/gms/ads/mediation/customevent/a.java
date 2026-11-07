package com.google.android.gms.ads.mediation.customevent;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.RemoteException;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.j;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.internal.ads.a21;
import com.google.android.gms.internal.ads.ca2;
import com.google.android.gms.internal.ads.ea2;
import com.google.android.gms.internal.ads.ej0;
import com.google.android.gms.internal.ads.fp0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.jm0;
import com.google.android.gms.internal.ads.lh2;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.my;
import com.google.android.gms.internal.ads.o21;
import com.google.android.gms.internal.ads.o70;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.q70;
import com.google.android.gms.internal.ads.r0;
import com.google.android.gms.internal.ads.rz;
import com.google.android.gms.internal.ads.sh2;
import com.google.android.gms.internal.ads.tb1;
import com.google.android.gms.internal.ads.th2;
import com.google.android.gms.internal.ads.u31;
import com.google.android.gms.internal.ads.ud1;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.vz0;
import com.google.android.gms.internal.ads.wd1;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zr1;
import com.google.android.gms.internal.ads.zw;
import com.google.android.ump.UserMessagingPlatform;
import com.google.android.ump.a;
import f1.a;
import f1.e;
import f1.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v3.c;
import v3.f;
import v3.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements CustomEventBannerListener, q70, MediationAdLoadCallback, zr1, ud1, jm0, UserMessagingPlatform.b, c {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f2372t;

    /* renamed from: u, reason: collision with root package name */
    public Object f2373u;

    public /* synthetic */ a(int i6) {
        this.s = i6;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        switch (this.s) {
            case 5:
                ((fp0) this.f2373u).m((vz0) obj, (View) this.f2372t);
                return;
            case 6:
                o21 o21Var = (o21) obj;
                synchronized (((a21) this.f2373u)) {
                    try {
                        ((a21) this.f2373u).h.c(o21Var, (tb1) this.f2372t);
                        tb1 tb1VarA = ((a21) this.f2373u).h.a();
                        if (tb1VarA != null) {
                            ((a21) this.f2373u).a(tb1VarA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((wd1) this.f2373u).f10171f.f2733c.o0(new ej0(17, (vd1) this.f2372t));
                return;
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.b
    public void b(com.google.android.ump.a aVar) {
        aVar.a((Activity) this.f2372t, (a.InterfaceC0040a) this.f2373u);
    }

    public KeyListener c(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((f1.a) this.f2373u).f12960a.getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
    }

    public void d(AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2372t).getContext().obtainStyledAttributes(attributeSet, f.a.f12941i, i6, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public f1.c e(InputConnection inputConnection, EditorInfo editorInfo) {
        f1.a aVar = (f1.a) this.f2373u;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            a.C0057a c0057a = aVar.f12960a;
            c0057a.getClass();
            if (!(inputConnection instanceof f1.c)) {
                inputConnection = new f1.c(c0057a.f12961a, inputConnection, editorInfo);
            }
        }
        return (f1.c) inputConnection;
    }

    public void f(boolean z6) {
        g gVar = ((f1.a) this.f2373u).f12960a.f12962b;
        if (gVar.f12980u != z6) {
            if (gVar.f12979t != null) {
                androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
                g.a aVar = gVar.f12979t;
                gVarA.getClass();
                j.e("initCallback cannot be null", aVar);
                ReentrantReadWriteLock reentrantReadWriteLock = gVarA.f992a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    gVarA.f993b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f12980u = z6;
            if (z6) {
                g.a(gVar.s, androidx.emoji2.text.g.a().b());
            }
        }
    }

    public void g(ca2 ca2Var) {
        ((List) this.f2373u).add(ca2Var);
    }

    @Override // v3.c
    public void h(p pVar) {
        ((e3.j) this.f2373u).f12889b.remove((f) this.f2372t);
    }

    public void i(ca2 ca2Var) {
        ((List) this.f2372t).add(ca2Var);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        switch (this.s) {
            case 5:
                if (((Boolean) zzbe.zzc().a(zn.f11439m5)).booleanValue()) {
                    zzv.zzp().g("omid native display exp", th);
                    return;
                }
                return;
            case 6:
                synchronized (((a21) this.f2373u)) {
                    try {
                        ((a21) this.f2373u).h.b((tb1) this.f2372t);
                        tb1 tb1VarA = ((a21) this.f2373u).h.a();
                        if (((tb1) this.f2372t).f9211v0) {
                            while (tb1VarA != null) {
                                ((a21) this.f2373u).a(tb1VarA);
                                tb1VarA = ((a21) this.f2373u).h.a();
                            }
                        } else if (tb1VarA != null) {
                            ((a21) this.f2373u).a(tb1VarA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((wd1) this.f2373u).f10171f.f2733c.o0(new r0((vd1) this.f2372t, th));
                return;
        }
    }

    public ea2 k() {
        return new ea2((List) this.f2372t, (List) this.f2373u);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        ((MediationBannerListener) this.f2373u).onAdClicked((CustomEventAdapter) this.f2372t);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        ((MediationBannerListener) this.f2373u).onAdClosed((CustomEventAdapter) this.f2372t);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdFailedToLoad(int i6) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationBannerListener) this.f2373u).onAdFailedToLoad((CustomEventAdapter) this.f2372t, i6);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationBannerListener) this.f2373u).onAdLeftApplication((CustomEventAdapter) this.f2372t);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public void onAdLoaded(View view) {
        zzo.zze("Custom event adapter called onAdLoaded.");
        CustomEventAdapter customEventAdapter = (CustomEventAdapter) this.f2372t;
        customEventAdapter.zze = view;
        ((MediationBannerListener) this.f2373u).onAdLoaded(customEventAdapter);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        ((MediationBannerListener) this.f2373u).onAdOpened((CustomEventAdapter) this.f2372t);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((rz) this.f2372t).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        rz rzVar = (rz) this.f2372t;
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd != null) {
            try {
                rzVar.z1(new gz(mediationInterscrollerAd));
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f2373u);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            rzVar.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.q70, com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
        switch (this.s) {
            case 2:
                zze.zza("callJs > getEngine: Promise rejected");
                ((o70) this.f2372t).b(new fx("Unable to obtain a JavascriptEngine."));
                ((zw) this.f2373u).e();
                break;
            default:
                u31 u31Var = (u31) this.f2372t;
                u31Var.f9452a.F((po) this.f2373u);
                break;
        }
    }

    public /* synthetic */ a(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f2372t = obj;
        this.f2373u = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i6, boolean z6) {
        this.s = i6;
        this.f2372t = obj2;
        this.f2373u = obj;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationBannerListener) this.f2373u).onAdFailedToLoad((CustomEventAdapter) this.f2372t, adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public a(int i6, int i7) {
        List arrayList;
        Object arrayList2;
        this.s = 10;
        if (i6 == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i6);
        }
        this.f2372t = arrayList;
        if (i7 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i7);
        }
        this.f2373u = arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        ((th2) obj).g(0, ((sh2) this.f2372t).f8938a, (lh2) this.f2373u);
    }

    public a(EditText editText) {
        this.s = 15;
        this.f2372t = editText;
        this.f2373u = new f1.a(editText);
    }
}
