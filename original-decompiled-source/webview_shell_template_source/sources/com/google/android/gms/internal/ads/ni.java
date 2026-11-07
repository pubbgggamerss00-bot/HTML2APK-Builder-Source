package com.google.android.gms.internal.ads;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ni implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7445t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7446u;

    public /* synthetic */ ni(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f7445t = obj2;
        this.f7446u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.h a1Var;
        int i6 = 1;
        Application application = null;
        switch (this.s) {
            case 0:
                ri riVar = (ri) this.f7446u;
                View view = (View) this.f7445t;
                try {
                    hi hiVar = new hi(riVar.f8643x, riVar.f8644y, riVar.f8645z, riVar.A, riVar.B, riVar.C, riVar.D, riVar.G);
                    mi miVarZzb = zzv.zzb();
                    synchronized (miVarZzb.f7160a) {
                        try {
                            ki kiVar = miVarZzb.f7161b;
                            if (kiVar != null) {
                                application = kiVar.f6423t;
                            }
                        } finally {
                        }
                    }
                    if (application != null && !TextUtils.isEmpty(riVar.E)) {
                        String str = (String) view.getTag(application.getResources().getIdentifier((String) zzbe.zzc().a(zn.f11401h0), "id", application.getPackageName()));
                        if (str != null && str.equals(riVar.E)) {
                            return;
                        }
                    }
                    qi qiVarA = riVar.a(view, hiVar);
                    hiVar.b();
                    if (qiVarA.f8390a == 0 && qiVarA.f8391b == 0) {
                        return;
                    }
                    int i7 = qiVarA.f8391b;
                    if (i7 != 0) {
                        if (i7 == 0) {
                        }
                        riVar.f8641v.a(hiVar);
                        return;
                    } else if (hiVar.f5408k == 0) {
                        return;
                    }
                    ji jiVar = riVar.f8641v;
                    synchronized (jiVar.f6068a) {
                        try {
                            if (jiVar.f6070c.contains(hiVar)) {
                                return;
                            }
                            riVar.f8641v.a(hiVar);
                            return;
                        } finally {
                        }
                    }
                } catch (Exception e6) {
                    zzo.zzh("Exception in fetchContentOnUIThread", e6);
                    zzv.zzp().h("ContentFetchTask.fetchContent", e6);
                    return;
                }
            case 1:
                if (((ak) this.f7445t).isCancelled()) {
                    ((Future) this.f7446u).cancel(true);
                    return;
                }
                return;
            case 2:
                i70.f5591f.execute(new bb((fe0) this.f7445t, (Runnable) this.f7446u, 6, false));
                return;
            case 3:
                r01 r01Var = (r01) this.f7445t;
                xa0 xa0Var = (xa0) this.f7446u;
                xa0Var.i0();
                ec1 ec1Var = r01Var.f8498d;
                ob0 ob0VarZzq = xa0Var.zzq();
                zzga zzgaVar = ec1Var.f4206a;
                if (zzgaVar != null && ob0VarZzq != null) {
                    ob0VarZzq.e2(zzgaVar);
                }
                if (!((Boolean) zzbe.zzc().a(zn.f11468r1)).booleanValue() || xa0Var.isAttachedToWindow()) {
                    return;
                }
                xa0Var.onPause();
                xa0Var.D();
                return;
            case 4:
                ((wd1) this.f7445t).f10171f.f2733c.o0(new l2(13, (vd1) this.f7446u));
                return;
            case 5:
                xg1.b((WebView) this.f7445t, (String) this.f7446u);
                return;
            case 6:
                com.google.android.gms.internal.consent_sdk.r rVar = (com.google.android.gms.internal.consent_sdk.r) this.f7445t;
                com.google.android.gms.internal.consent_sdk.n nVar = (com.google.android.gms.internal.consent_sdk.n) this.f7446u;
                AtomicReference atomicReference = rVar.f11875d;
                Objects.requireNonNull(atomicReference);
                nVar.b(new com.google.android.gms.internal.consent_sdk.f(i6, atomicReference), new com.google.android.gms.internal.consent_sdk.l2());
                return;
            default:
                e3.b0 b0Var = (e3.b0) this.f7446u;
                u3.k kVar = (u3.k) this.f7445t;
                c3.b bVar = kVar.f14604t;
                if (bVar.l()) {
                    com.google.android.gms.common.internal.c0 c0Var = kVar.f14605u;
                    com.google.android.gms.common.internal.l.f(c0Var);
                    c3.b bVar2 = c0Var.f2426u;
                    if (!bVar2.l()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                        b0Var.f12864y.b(bVar2);
                        b0Var.f12863x.disconnect();
                        return;
                    }
                    e3.u uVar = b0Var.f12864y;
                    IBinder iBinder = c0Var.f2425t;
                    if (iBinder == null) {
                        a1Var = null;
                    } else {
                        int i8 = h.a.s;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        a1Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.h ? (com.google.android.gms.common.internal.h) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.a1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    Set<Scope> set = b0Var.f12861v;
                    uVar.getClass();
                    if (a1Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        uVar.b(new c3.b(4, null, null));
                    } else {
                        uVar.f12906c = a1Var;
                        uVar.f12907d = set;
                        if (uVar.f12908e) {
                            uVar.f12904a.getRemoteService(a1Var, set);
                        }
                    }
                } else {
                    b0Var.f12864y.b(bVar);
                }
                b0Var.f12863x.disconnect();
                return;
        }
    }

    public /* synthetic */ ni(Object obj, Object obj2, int i6, boolean z6) {
        this.s = i6;
        this.f7445t = obj;
        this.f7446u = obj2;
    }
}
