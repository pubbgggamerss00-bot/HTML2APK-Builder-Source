package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class as1 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2844t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2845u;

    public /* synthetic */ as1(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f2844t = obj;
        this.f2845u = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Runnable runnable;
        switch (this.s) {
            case 0:
                zr1 zr1Var = (zr1) this.f2845u;
                Future future = (Future) this.f2844t;
                if ((future instanceof xs1) && (thA = ((xs1) future).a()) != null) {
                    zr1Var.j(thA);
                    return;
                }
                try {
                    zr1Var.mo2a(bs1.r(future));
                    return;
                } catch (ExecutionException e6) {
                    zr1Var.j(e6.getCause());
                    return;
                } catch (Throwable th) {
                    zr1Var.j(th);
                    return;
                }
            case 1:
                ((qw) this.f2844t).s.loadData((String) this.f2845u, "text/html", "UTF-8");
                return;
            case 2:
                cx cxVar = (cx) this.f2844t;
                bx bxVar = (bx) this.f2845u;
                String str = cxVar.f3679c;
                long jA = zzv.zzC().a();
                ArrayList arrayList = new ArrayList();
                try {
                    zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
                    qw qwVar = new qw(cxVar.f3678b, cxVar.f3680d);
                    zze.zza("loadJavascriptEngine > After createJavascriptEngine");
                    zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
                    qwVar.s.zzN().f4197z = new dh0(8, new sw(jA, qwVar, bxVar, cxVar, arrayList));
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    qwVar.M("/jsLoaded", new vw(cxVar, jA, bxVar, qwVar));
                    zzby zzbyVar = new zzby();
                    ww wwVar = new ww(cxVar, qwVar, zzbyVar);
                    zzbyVar.zzb(wwVar);
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    qwVar.M("/requestReload", wwVar);
                    zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
                    if (str.endsWith(".js")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                        zze.zza("loadJavascript on adWebView from path: ".concat(str));
                        qw.f(new as1(1, qwVar, "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>"));
                        zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str.startsWith("<html>")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                        zze.zza("loadHtml on adWebView from html");
                        qw.f(new bb(qwVar, str, 2, false));
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        zze.zza("loadHtmlWrapper on adWebView from path: ".concat(str));
                        qw.f(new q(2, qwVar, str));
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    zzs.zza.postDelayed(new xw(jA, qwVar, bxVar, cxVar, arrayList), ((Integer) zzbe.zzc().a(zn.f11365c)).intValue());
                    return;
                } catch (Throwable th2) {
                    zzo.zzh("Error creating webview.", th2);
                    if (((Boolean) zzbe.zzc().a(zn.B7)).booleanValue()) {
                        bxVar.b("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th2);
                        return;
                    } else if (((Boolean) zzbe.zzc().a(zn.D7)).booleanValue()) {
                        zzv.zzp().g("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        bxVar.a();
                        return;
                    } else {
                        zzv.zzp().h("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        bxVar.a();
                        return;
                    }
                }
            case 3:
                ((mb0) this.f2844t).r0((String) this.f2845u);
                return;
            case 4:
                vf0 vf0Var = (vf0) this.f2844t;
                Throwable th3 = (Throwable) this.f2845u;
                Context context = vf0Var.f9844a;
                if (((Boolean) zzbe.zzc().a(zn.ha)).booleanValue()) {
                    u20 u20VarE = t20.e(context);
                    vf0Var.f9851i = u20VarE;
                    u20VarE.b("AttributionReporting.getUpdatedUrlAndRegisterSource", th3);
                    return;
                } else {
                    u20 u20VarA = t20.a(context);
                    vf0Var.h = u20VarA;
                    u20VarA.b("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th3);
                    return;
                }
            case 5:
                fi0 fi0Var = (fi0) this.f2844t;
                t tVar = (t) this.f2845u;
                AtomicReference atomicReference = (AtomicReference) tVar.f9052t;
                try {
                    if (fi0Var.f4689j.g(new k3.b(tVar)) || (runnable = (Runnable) atomicReference.getAndSet(null)) == null) {
                        return;
                    }
                    runnable.run();
                    return;
                } catch (RemoteException unused) {
                    Runnable runnable2 = (Runnable) atomicReference.getAndSet(null);
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
            case 6:
                ((hu0) this.f2844t).f5486d.zza((String) this.f2845u);
                return;
            case 7:
                ((fv0) this.f2844t).f4794i.execute(new p(11, (o70) this.f2845u));
                return;
            case 8:
                ((r41) this.f2844t).f8540w.f8787d.f7595c.k0((com.google.android.gms.ads.internal.client.zze) this.f2845u);
                return;
            case 9:
                ((w91) this.f2844t).f10131w.f10901d.k0((com.google.android.gms.ads.internal.client.zze) this.f2845u);
                return;
            case 10:
                hl1 hl1Var = (hl1) this.f2844t;
                try {
                    ((Runnable) this.f2845u).run();
                    return;
                } catch (RuntimeException e7) {
                    hl1Var.f5439c.a("error caused by ", e7);
                    return;
                }
            case 11:
                synchronized (((v3.l) this.f2845u).f14811t) {
                    v3.d dVar = ((v3.l) this.f2845u).f14812u;
                    Exception excD = ((v3.p) this.f2844t).d();
                    com.google.android.gms.common.internal.l.f(excD);
                    dVar.k(excD);
                }
                return;
            default:
                y5.f fVar = (y5.f) this.f2845u;
                c5.a aVar = (c5.a) this.f2844t;
                if (aVar.isCancelled()) {
                    fVar.j(null);
                    return;
                }
                try {
                    fVar.g(y.a.e(aVar));
                    return;
                } catch (ExecutionException e8) {
                    Throwable cause = e8.getCause();
                    if (cause != null) {
                        fVar.g(d5.e.a(cause));
                        return;
                    } else {
                        d5.a aVar2 = new d5.a();
                        kotlin.jvm.internal.j.f(aVar2, kotlin.jvm.internal.j.class.getName());
                        throw aVar2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.s) {
            case 0:
                yw ywVar = new yw(as1.class.getSimpleName());
                zr1 zr1Var = (zr1) this.f2845u;
                s70 s70Var = new s70(6);
                ((s70) ywVar.f11096v).f8824u = s70Var;
                ywVar.f11096v = s70Var;
                s70Var.f8823t = zr1Var;
                return ywVar.toString();
            default:
                return super.toString();
        }
    }

    public as1(v3.l lVar, v3.p pVar) {
        this.s = 11;
        this.f2845u = lVar;
        this.f2844t = pVar;
    }
}
