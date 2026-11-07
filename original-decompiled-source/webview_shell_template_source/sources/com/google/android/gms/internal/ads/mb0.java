package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.uj1;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class mb0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, xa0 {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f7041t0 = 0;
    public final float A;
    public tb1 B;
    public vb1 C;
    public boolean D;
    public boolean E;
    public eb0 F;
    public zzm G;
    public vz0 H;
    public uz0 I;
    public cc0 J;
    public final String K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Boolean P;
    public boolean Q;
    public final String R;
    public ob0 S;
    public boolean T;
    public boolean U;
    public nq V;
    public sr0 W;

    /* renamed from: a0, reason: collision with root package name */
    public aj f7042a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f7043b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f7044c0;

    /* renamed from: d0, reason: collision with root package name */
    public ko f7045d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ko f7046e0;

    /* renamed from: f0, reason: collision with root package name */
    public ko f7047f0;

    /* renamed from: g0, reason: collision with root package name */
    public final lo f7048g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f7049h0;

    /* renamed from: i0, reason: collision with root package name */
    public zzm f7050i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f7051j0;

    /* renamed from: k0, reason: collision with root package name */
    public final zzck f7052k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f7053l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f7054m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f7055n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f7056o0;
    public HashMap p0;

    /* renamed from: q0, reason: collision with root package name */
    public final WindowManager f7057q0;

    /* renamed from: r0, reason: collision with root package name */
    public final kk f7058r0;
    public final bc0 s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f7059s0;

    /* renamed from: t, reason: collision with root package name */
    public final mf f7060t;

    /* renamed from: u, reason: collision with root package name */
    public final fc1 f7061u;

    /* renamed from: v, reason: collision with root package name */
    public final cp f7062v;

    /* renamed from: w, reason: collision with root package name */
    public final VersionInfoParcel f7063w;

    /* renamed from: x, reason: collision with root package name */
    public zzn f7064x;

    /* renamed from: y, reason: collision with root package name */
    public final zza f7065y;

    /* renamed from: z, reason: collision with root package name */
    public final DisplayMetrics f7066z;

    public mb0(bc0 bc0Var, cc0 cc0Var, String str, boolean z6, mf mfVar, cp cpVar, VersionInfoParcel versionInfoParcel, zzn zznVar, zza zzaVar, kk kkVar, tb1 tb1Var, vb1 vb1Var, fc1 fc1Var) throws PackageManager.NameNotFoundException {
        vb1 vb1Var2;
        String str2;
        super(bc0Var);
        this.D = false;
        this.E = false;
        this.Q = true;
        this.R = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f7053l0 = -1;
        this.f7054m0 = -1;
        this.f7055n0 = -1;
        this.f7056o0 = -1;
        this.s = bc0Var;
        this.J = cc0Var;
        this.K = str;
        this.N = z6;
        this.f7060t = mfVar;
        this.f7061u = fc1Var;
        this.f7062v = cpVar;
        this.f7063w = versionInfoParcel;
        this.f7064x = zznVar;
        this.f7065y = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f7057q0 = windowManager;
        zzv.zzq();
        DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
        this.f7066z = displayMetricsZzu;
        this.A = displayMetricsZzu.density;
        this.f7058r0 = kkVar;
        this.B = tb1Var;
        this.C = vb1Var;
        this.f7052k0 = new zzck(bc0Var.f3029a, this, this, null);
        this.f7059s0 = false;
        setBackgroundColor(0);
        if (((Boolean) zzbe.zzc().a(zn.vb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e6) {
            zzo.zzh("Unable to enable Javascript.", e6);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzbe.zzc().a(zn.ub)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzv.zzq().zzc(bc0Var, versionInfoParcel.afmaVersion));
        zzv.zzq();
        final Context context = getContext();
        zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                uj1 uj1Var = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.V0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        v0();
        addJavascriptInterface(new rb0(this, new ck1(2, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        lo loVar = this.f7048g0;
        if (loVar != null) {
            oo ooVar = (oo) loVar.f6799u;
            co coVarC = zzv.zzp().c();
            if (coVarC != null) {
                coVarC.f3619a.offer(ooVar);
            }
        }
        oo ooVar2 = new oo(this.K);
        lo loVar2 = new lo(ooVar2);
        this.f7048g0 = loVar2;
        synchronized (ooVar2.f7821c) {
        }
        if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue() && (vb1Var2 = this.C) != null && (str2 = vb1Var2.f9774b) != null) {
            ooVar2.b("gqi", str2);
        }
        ko koVar = new ko(zzv.zzC().b(), null, null);
        this.f7046e0 = koVar;
        ((HashMap) loVar2.f6798t).put("native:view_create", koVar);
        this.f7047f0 = null;
        this.f7045d0 = null;
        zzcg.zza().zzb(bc0Var);
        zzv.zzp().f2954j.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void A(int i6) {
        ko koVar = this.f7046e0;
        lo loVar = this.f7048g0;
        if (i6 == 0) {
            fo.d((oo) loVar.f6799u, koVar, "aebb2");
        }
        fo.d((oo) loVar.f6799u, koVar, "aeh2");
        loVar.getClass();
        ((oo) loVar.f6799u).b("close_type", String.valueOf(i6));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i6));
        map.put("version", this.f7063w.afmaVersion);
        G("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized boolean B() {
        return this.f7043b0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        boolean z6;
        synchronized (this) {
            z6 = aiVar.f2772j;
            this.T = z6;
        }
        x0(z6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void D() {
        this.f7059s0 = true;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void E(aj ajVar) {
        this.f7042a0 = ajVar;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized String F() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void G(String str, Map map) {
        try {
            j(str, zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final ArrayList H() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void I(zzm zzmVar) {
        this.f7050i0 = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void J() {
        if (this.f7047f0 == null) {
            lo loVar = this.f7048g0;
            loVar.getClass();
            ko koVar = new ko(zzv.zzC().b(), null, null);
            this.f7047f0 = koVar;
            ((HashMap) loVar.f6798t).put("native:view_load", koVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void K(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        try {
            try {
                if (o()) {
                    zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) zzbe.zzc().a(zn.f11358b0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e6) {
                    zzo.zzk("Unable to build MRAID_ENV", e6);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, vb0.b(str2, str3), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void L(String str, yt ytVar) {
        eb0 eb0Var = this.F;
        if (eb0Var != null) {
            synchronized (eb0Var.f4193v) {
                try {
                    List list = (List) eb0Var.f4192u.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(ytVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void N(boolean z6) {
        if (z6) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        zzm zzmVar = this.G;
        if (zzmVar != null) {
            zzmVar.zzB(z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void O() {
        eb0 eb0Var = this.F;
        if (eb0Var != null) {
            eb0Var.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void P(sr0 sr0Var) {
        this.W = sr0Var;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final fc1 R() {
        return this.f7061u;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void S(nq nqVar) {
        this.V = nqVar;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void T() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void U(uz0 uz0Var) {
        this.I = uz0Var;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean V(final int i6, final boolean z6) {
        destroy();
        jk jkVar = new jk() { // from class: com.google.android.gms.internal.ads.lb0
            @Override // com.google.android.gms.internal.ads.jk
            public final void c(cn cnVar) {
                int i7 = mb0.f7041t0;
                lm lmVarB = mm.B();
                boolean zD = ((mm) lmVarB.f4126t).D();
                boolean z7 = z6;
                if (zD != z7) {
                    lmVarB.i();
                    mm.E((mm) lmVarB.f4126t, z7);
                }
                lmVarB.i();
                mm.F((mm) lmVarB.f4126t, i6);
                mm mmVarG = lmVarB.g();
                cnVar.i();
                dn.H((dn) cnVar.f4126t, mmVarG);
            }
        };
        kk kkVar = this.f7058r0;
        kkVar.a(jkVar);
        kkVar.b(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized boolean W() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void X() {
        this.f7052k0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void Y(boolean z6) {
        try {
            boolean z7 = this.N;
            this.N = z6;
            v0();
            if (z6 != z7) {
                if (((Boolean) zzbe.zzc().a(zn.f11366c0)).booleanValue()) {
                    if (!this.J.b()) {
                    }
                }
                try {
                    j("onStateChanged", new JSONObject().put("state", true != z6 ? "default" : "expanded"));
                } catch (JSONException e6) {
                    zzo.zzh("Error occurred while dispatching state change.", e6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void Z(String str, yt ytVar) {
        eb0 eb0Var = this.F;
        if (eb0Var != null) {
            eb0Var.a(str, ytVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void a(String str, String str2) {
        p0(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final c5.a a0() {
        cp cpVar = this.f7062v;
        return cpVar == null ? ds1.f4001t : (xr1) bs1.q(xr1.p(ds1.f4001t), ((Long) qp.f8432c.c()).longValue(), TimeUnit.MILLISECONDS, cpVar.f3634c);
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.wb0
    public final mf b() {
        return this.f7060t;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized void b0(String str, s90 s90Var) {
        try {
            if (this.p0 == null) {
                this.p0 = new HashMap();
            }
            this.p0.put(str, s90Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized void c() {
        sr0 sr0Var = this.W;
        if (sr0Var != null) {
            zzs.zza.post(new t(9, sr0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void c0(zzc zzcVar, boolean z6, boolean z7, String str) {
        this.F.l0(zzcVar, z6, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.oa0
    public final tb1 d() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void d0(zzm zzmVar) {
        this.G = zzmVar;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final synchronized void destroy() {
        try {
            lo loVar = this.f7048g0;
            if (loVar != null) {
                oo ooVar = (oo) loVar.f6799u;
                co coVarC = zzv.zzp().c();
                if (coVarC != null) {
                    coVarC.f3619a.offer(ooVar);
                }
            }
            this.f7052k0.zza();
            zzm zzmVar = this.G;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.G.zzm();
                this.G = null;
            }
            this.H = null;
            this.I = null;
            this.F.Q();
            this.f7042a0 = null;
            this.f7064x = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.M) {
                return;
            }
            zzv.zzz().c(this);
            y0();
            this.M = true;
            if (!((Boolean) zzbe.zzc().a(zn.Fa)).booleanValue()) {
                zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity activity = this.s.f3029a;
            if (activity != null && activity.isDestroyed()) {
                zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            zze.zza("Initiating WebView self destruct sequence in 3...");
            zze.zza("Loading blank page in WebView, 2...");
            synchronized (this) {
                try {
                    zzs.zza.post(new yh(6, this));
                } catch (Throwable th) {
                    zzv.zzp().h("AdWebViewImpl.loadUrlUnsafe", th);
                    zzo.zzk("Could not call loadUrl in destroy(). ", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized vz0 e0() {
        return this.H;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (o()) {
            zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) zzbe.zzc().a(zn.Ga)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            i70.f5591f.w(new kb0(0, this, valueCallback, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.n10] */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // com.google.android.gms.internal.ads.ub0
    public final void f(int i6, boolean z6, boolean z7) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        on0 on0Var;
        ?? r10;
        int i7;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z8;
        eb0 eb0Var = this.F;
        xa0 xa0Var = eb0Var.s;
        boolean zC = eb0.C(xa0Var.x(), xa0Var);
        boolean z9 = true;
        if (!zC && z7) {
            z9 = false;
        }
        if (zC) {
            zzaVar = null;
            on0Var = null;
        } else {
            zzaVar = eb0Var.f4194w;
            on0Var = null;
        }
        zzr zzrVar = eb0Var.f4195x;
        on0 on0Var2 = on0Var;
        zzac zzacVar = eb0Var.M;
        VersionInfoParcel versionInfoParcelZzn = xa0Var.zzn();
        on0 on0Var3 = z9 ? on0Var2 : eb0Var.C;
        if (eb0.w(xa0Var)) {
            r10 = eb0Var.X;
            i7 = i6;
            z8 = z6;
            zzaVar2 = zzaVar;
        } else {
            r10 = on0Var2;
            i7 = i6;
            zzaVar2 = zzaVar;
            z8 = z6;
        }
        eb0Var.o0(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzacVar, xa0Var, z8, i7, versionInfoParcelZzn, on0Var3, r10));
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean f0() {
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.M) {
                        this.F.Q();
                        zzv.zzz().c(this);
                        y0();
                        w0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized aj g() {
        return this.f7042a0;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void g0(boolean z6) {
        zzm zzmVar;
        int i6 = this.f7043b0 + (true != z6 ? -1 : 1);
        this.f7043b0 = i6;
        if (i6 > 0 || (zzmVar = this.G) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.qb0
    public final vb1 h() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void h0(cc0 cc0Var) {
        this.J = cc0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void i(boolean z6, int i6, String str, boolean z7, boolean z8) {
        eb0 eb0Var = this.F;
        xa0 xa0Var = eb0Var.s;
        boolean zX = xa0Var.x();
        boolean zC = eb0.C(zX, xa0Var);
        boolean z9 = true;
        if (!zC && z7) {
            z9 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zC ? null : eb0Var.f4194w;
        db0 db0Var = zX ? null : new db0(xa0Var, eb0Var.f4195x);
        ft ftVar = eb0Var.A;
        oz0 oz0Var = null;
        ht htVar = eb0Var.B;
        boolean z10 = z9;
        db0 db0Var2 = db0Var;
        zzac zzacVar = eb0Var.M;
        VersionInfoParcel versionInfoParcelZzn = xa0Var.zzn();
        on0 on0Var = z10 ? null : eb0Var.C;
        if (eb0.w(xa0Var)) {
            oz0Var = eb0Var.X;
        }
        eb0Var.o0(new AdOverlayInfoParcel(zzaVar, db0Var2, ftVar, htVar, zzacVar, xa0Var, z6, i6, str, versionInfoParcelZzn, on0Var, oz0Var, z8));
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void i0() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzv.zzs().zze()));
        map.put("app_volume", String.valueOf(zzv.zzs().zza()));
        map.put("device_volume", String.valueOf(zzab.zzb(getContext())));
        G("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void j(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzo.zze("Dispatching AFMA event: ".concat(sbA.toString()));
        p0(sbA.toString());
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void j0(boolean z6) {
        boolean z7;
        zzm zzmVar = this.G;
        if (zzmVar == null) {
            this.L = z6;
            return;
        }
        eb0 eb0Var = this.F;
        synchronized (eb0Var.f4193v) {
            z7 = eb0Var.I;
        }
        zzmVar.zzy(z7, z6);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void k(boolean z6, int i6, String str, String str2, boolean z7) {
        eb0 eb0Var = this.F;
        xa0 xa0Var = eb0Var.s;
        boolean zX = xa0Var.x();
        boolean zC = eb0.C(zX, xa0Var);
        boolean z8 = true;
        if (!zC && z7) {
            z8 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zC ? null : eb0Var.f4194w;
        db0 db0Var = zX ? null : new db0(xa0Var, eb0Var.f4195x);
        ft ftVar = eb0Var.A;
        oz0 oz0Var = null;
        ht htVar = eb0Var.B;
        boolean z9 = z8;
        db0 db0Var2 = db0Var;
        zzac zzacVar = eb0Var.M;
        VersionInfoParcel versionInfoParcelZzn = xa0Var.zzn();
        on0 on0Var = z9 ? null : eb0Var.C;
        if (eb0.w(xa0Var)) {
            oz0Var = eb0Var.X;
        }
        eb0Var.o0(new AdOverlayInfoParcel(zzaVar, db0Var2, ftVar, htVar, zzacVar, xa0Var, z6, i6, str, str2, versionInfoParcelZzn, on0Var, oz0Var));
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void k0(boolean z6, long j6) {
        HashMap map = new HashMap(2);
        map.put("success", true != z6 ? "0" : "1");
        map.put("duration", Long.toString(j6));
        G("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void l(boolean z6) {
        this.Q = z6;
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void l0(String str, JSONObject jSONObject) {
        a(str, jSONObject.toString());
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (o()) {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (o()) {
                    zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final synchronized void loadUrl(String str) {
        if (o()) {
            zzo.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            zzs.zza.post(new as1(3, this, str));
        } catch (Throwable th) {
            zzv.zzp().h("AdWebViewImpl.loadUrl", th);
            zzo.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void m(int i6) {
        zzm zzmVar = this.G;
        if (zzmVar != null) {
            zzmVar.zzA(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void m0(vz0 vz0Var) {
        this.H = vz0Var;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void n(String str, String str2) {
        eb0 eb0Var = this.F;
        oz0 oz0Var = eb0Var.X;
        xa0 xa0Var = eb0Var.s;
        eb0Var.o0(new AdOverlayInfoParcel(xa0Var, xa0Var.zzn(), str, str2, 14, oz0Var));
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized boolean n0() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized boolean o() {
        return this.M;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        eb0 eb0Var = this.F;
        if (eb0Var != null) {
            eb0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!o()) {
                this.f7052k0.zzc();
            }
            if (this.f7059s0) {
                onResume();
                this.f7059s0 = false;
            }
            boolean z6 = this.T;
            eb0 eb0Var = this.F;
            if (eb0Var != null && eb0Var.i()) {
                if (!this.U) {
                    synchronized (this.F.f4193v) {
                    }
                    synchronized (this.F.f4193v) {
                    }
                    this.U = true;
                }
                u0();
                z6 = true;
            }
            x0(z6);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        eb0 eb0Var;
        synchronized (this) {
            try {
                if (!o()) {
                    this.f7052k0.zzd();
                }
                super.onDetachedFromWindow();
                if (this.U && (eb0Var = this.F) != null && eb0Var.i() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.F.f4193v) {
                    }
                    synchronized (this.F.f4193v) {
                    }
                    this.U = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzbe.zzc().a(zn.Ua)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzv.zzq();
            zzs.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e6) {
            zzo.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            zzv.zzp().h("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e6);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (o()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zU0 = u0();
        zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zU0) {
            return;
        }
        zzmVarZzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i6, int i7) {
        cc0 cc0Var;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (o()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.N && (i8 = (cc0Var = this.J).f3512a) != 0) {
            if (i8 == 5) {
                super.onMeasure(i6, i7);
                return;
            }
            if (i8 == 4) {
                if (((Boolean) zzbe.zzc().a(zn.V3)).booleanValue()) {
                    super.onMeasure(i6, i7);
                    return;
                }
                ob0 ob0VarZzq = zzq();
                float fZze = ob0VarZzq != null ? ob0VarZzq.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i6, i7);
                    return;
                }
                int size = View.MeasureSpec.getSize(i6);
                int size2 = View.MeasureSpec.getSize(i7);
                float f6 = size2 * fZze;
                int i12 = (int) (size / fZze);
                if (size2 != 0) {
                    int i13 = (int) f6;
                    if (size == 0) {
                        i11 = size;
                    } else if (i13 != 0) {
                        i12 = (int) (i13 / fZze);
                        i9 = size2;
                        i10 = i13;
                        i11 = i10;
                    }
                    i9 = size2;
                    i10 = i13;
                } else if (i12 != 0) {
                    i10 = (int) (i12 * fZze);
                    i11 = size;
                    i9 = i12;
                } else {
                    size2 = 0;
                    int i132 = (int) f6;
                    if (size == 0) {
                    }
                    i9 = size2;
                    i10 = i132;
                }
                setMeasuredDimension(Math.min(i10, i11), Math.min(i12, i9));
                return;
            }
            if (i8 == 2) {
                if (((Boolean) zzbe.zzc().a(zn.f11354a4)).booleanValue()) {
                    super.onMeasure(i6, i7);
                    return;
                }
                Z("/contentHeight", new zt(2, this));
                p0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f7 = this.f7066z.density;
                int size3 = View.MeasureSpec.getSize(i6);
                int i14 = this.f7044c0;
                setMeasuredDimension(size3, i14 != -1 ? (int) (i14 * f7) : View.MeasureSpec.getSize(i7));
                return;
            }
            if (cc0Var.b()) {
                DisplayMetrics displayMetrics = this.f7066z;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i6);
            int size4 = View.MeasureSpec.getSize(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            int size5 = View.MeasureSpec.getSize(i7);
            int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i16 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            cc0 cc0Var2 = this.J;
            boolean z6 = cc0Var2.f3514c > i15 || cc0Var2.f3513b > i16;
            if (((Boolean) zzbe.zzc().a(zn.f11475s5)).booleanValue()) {
                cc0 cc0Var3 = this.J;
                float f8 = cc0Var3.f3514c;
                float f9 = this.A;
                z6 &= f8 / f9 <= ((float) i15) / f9 && ((float) cc0Var3.f3513b) / f9 <= ((float) i16) / f9;
            }
            if (!z6) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.E) {
                    this.f7058r0.b(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR);
                    this.E = true;
                }
                cc0 cc0Var4 = this.J;
                setMeasuredDimension(cc0Var4.f3514c, cc0Var4.f3513b);
                return;
            }
            cc0 cc0Var5 = this.J;
            float f10 = cc0Var5.f3514c;
            float f11 = this.A;
            zzo.zzj("Not enough space to show ad. Needs " + ((int) (f10 / f11)) + "x" + ((int) (cc0Var5.f3513b / f11)) + " dp, but only has " + ((int) (size4 / f11)) + "x" + ((int) (size5 / f11)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.D) {
                return;
            }
            this.f7058r0.b(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB);
            this.D = true;
            return;
        }
        super.onMeasure(i6, i7);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final void onPause() {
        if (o()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) zzbe.zzc().a(zn.uc)).booleanValue() && androidx.activity.c0.f("MUTE_AUDIO")) {
                zzo.zze("Muting webview");
                int i6 = h2.c.f13280a;
                if (!i2.j.f13358i.d()) {
                    throw i2.j.a();
                }
                ((WebViewProviderBoundaryInterface) h2.c.c(this).f2049t).setAudioMuted(true);
            }
        } catch (Exception e6) {
            zzo.zzh("Could not pause webview.", e6);
            if (((Boolean) zzbe.zzc().a(zn.xc)).booleanValue()) {
                zzv.zzp().h("AdWebViewImpl.onPause", e6);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final void onResume() {
        if (o()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) zzbe.zzc().a(zn.uc)).booleanValue() && androidx.activity.c0.f("MUTE_AUDIO")) {
                zzo.zze("Unmuting webview");
                int i6 = h2.c.f13280a;
                if (!i2.j.f13358i.d()) {
                    throw i2.j.a();
                }
                ((WebViewProviderBoundaryInterface) h2.c.c(this).f2049t).setAudioMuted(false);
            }
        } catch (Exception e6) {
            zzo.zzh("Could not resume webview.", e6);
            if (((Boolean) zzbe.zzc().a(zn.xc)).booleanValue()) {
                zzv.zzp().h("AdWebViewImpl.onResume", e6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (((Boolean) zzbe.zzc().a(zn.D3)).booleanValue()) {
            eb0 eb0Var = this.F;
            synchronized (eb0Var.f4193v) {
                z8 = eb0Var.K;
            }
            z6 = z8;
        }
        if (this.F.i()) {
            eb0 eb0Var2 = this.F;
            synchronized (eb0Var2.f4193v) {
                z7 = eb0Var2.L;
            }
            if (z7) {
                if (!z6) {
                    mf mfVar = this.f7060t;
                    if (mfVar != null) {
                        mfVar.f7110b.zzk(motionEvent);
                    }
                    cp cpVar = this.f7062v;
                    if (cpVar != null) {
                        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > cpVar.f3632a.getEventTime()) {
                            cpVar.f3632a = MotionEvent.obtain(motionEvent);
                        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > cpVar.f3633b.getEventTime()) {
                            cpVar.f3633b = MotionEvent.obtain(motionEvent);
                        }
                    }
                }
            }
            synchronized (this) {
                try {
                    nq nqVar = this.V;
                    if (nqVar != null) {
                        nqVar.c(motionEvent);
                    }
                } finally {
                }
            }
        } else if (!z6) {
            synchronized (this) {
            }
        }
        if (o()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized uz0 p() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        synchronized (this) {
            bool = this.P;
        }
        if (bool == null) {
            synchronized (this) {
                b70 b70VarZzp = zzv.zzp();
                synchronized (b70VarZzp.f2946a) {
                    bool3 = b70VarZzp.f2953i;
                }
                this.P = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        t0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        t0(Boolean.FALSE);
                    }
                }
            }
            if (!bool2.booleanValue()) {
                synchronized (this) {
                    if (o()) {
                        zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            String strConcat = "javascript:".concat(str);
            synchronized (this) {
                if (o()) {
                    zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(strConcat);
                }
            }
            return;
        }
        synchronized (this) {
            bool2 = this.P;
            if (!bool2.booleanValue()) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void q(boolean z6) {
        this.F.V = z6;
    }

    public final /* synthetic */ void q0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void r(Context context) {
        bc0 bc0Var = this.s;
        bc0Var.setBaseContext(context);
        this.f7052k0.zze(bc0Var.f3029a);
    }

    public final /* synthetic */ void r0(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void s(tb1 tb1Var, vb1 vb1Var) {
        this.B = tb1Var;
        this.C = vb1Var;
    }

    public final /* synthetic */ void s0() {
        super.loadUrl("about:blank");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.xa0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof eb0) {
            this.F = (eb0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (o()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e6) {
            zzo.zzh("Could not stop loading webview.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void t() {
        zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzd();
        }
    }

    public final void t0(Boolean bool) {
        synchronized (this) {
            this.P = bool;
        }
        b70 b70VarZzp = zzv.zzp();
        synchronized (b70VarZzp.f2946a) {
            b70VarZzp.f2953i = bool;
        }
    }

    public final boolean u0() throws JSONException {
        boolean z6;
        int iZzv;
        int iZzv2;
        DisplayMetrics displayMetrics = this.f7066z;
        eb0 eb0Var = this.F;
        synchronized (eb0Var.f4193v) {
            z6 = eb0Var.I;
        }
        if (z6 || this.F.i()) {
            zzbc.zzb();
            int iZzv3 = zzf.zzv(displayMetrics, displayMetrics.widthPixels);
            zzbc.zzb();
            int iZzv4 = zzf.zzv(displayMetrics, displayMetrics.heightPixels);
            Activity activity = this.s.f3029a;
            if (activity == null || activity.getWindow() == null) {
                iZzv = iZzv3;
                iZzv2 = iZzv4;
            } else {
                zzv.zzq();
                int[] iArrZzQ = zzs.zzQ(activity);
                zzbc.zzb();
                iZzv = zzf.zzv(displayMetrics, iArrZzQ[0]);
                zzbc.zzb();
                iZzv2 = zzf.zzv(displayMetrics, iArrZzQ[1]);
            }
            int i6 = this.f7054m0;
            if (i6 != iZzv3 || this.f7053l0 != iZzv4 || this.f7055n0 != iZzv || this.f7056o0 != iZzv2) {
                boolean z7 = (i6 == iZzv3 && this.f7053l0 == iZzv4) ? false : true;
                this.f7054m0 = iZzv3;
                this.f7053l0 = iZzv4;
                this.f7055n0 = iZzv;
                this.f7056o0 = iZzv2;
                new ni0(5, this, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).n(iZzv3, iZzv4, iZzv, iZzv2, displayMetrics.density, this.f7057q0.getDefaultDisplay().getRotation());
                return z7;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized void v(ob0 ob0Var) {
        if (this.S != null) {
            zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.S = ob0Var;
        }
    }

    public final synchronized void v0() {
        try {
            tb1 tb1Var = this.B;
            if (tb1Var != null && tb1Var.f9195m0) {
                zzo.zze("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.O) {
                            setLayerType(1, null);
                        }
                        this.O = true;
                    } finally {
                    }
                }
                return;
            }
            if (this.N || this.J.b()) {
                zzo.zze("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.O) {
                            setLayerType(0, null);
                        }
                        this.O = false;
                    } finally {
                    }
                }
                return;
            }
            zzo.zze("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.O) {
                        setLayerType(0, null);
                    }
                    this.O = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized s90 w(String str) {
        HashMap map = this.p0;
        if (map == null) {
            return null;
        }
        return (s90) map.get(str);
    }

    public final synchronized void w0() {
        if (this.f7051j0) {
            return;
        }
        this.f7051j0 = true;
        zzv.zzp().f2954j.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized boolean x() {
        return this.N;
    }

    public final void x0(boolean z6) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z6 ? "0" : "1");
        G("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void y(String str, l2 l2Var) {
        eb0 eb0Var = this.F;
        if (eb0Var != null) {
            synchronized (eb0Var.f4193v) {
                try {
                    List<yt> list = (List) eb0Var.f4192u.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (yt ytVar : list) {
                        if (ytVar instanceof pw) {
                            if (((pw) ytVar).s.equals((yt) l2Var.f6565t)) {
                                arrayList.add(ytVar);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void y0() {
        try {
            HashMap map = this.p0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((s90) it.next()).release();
                }
            }
            this.p0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void z() {
        zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized void zzA(int i6) {
        this.f7049h0 = i6;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final Context zzE() {
        return this.s.f3031c;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized nq zzK() {
        return this.V;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized zzm zzL() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized zzm zzM() {
        return this.f7050i0;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final /* synthetic */ eb0 zzN() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final synchronized cc0 zzO() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final synchronized void zzX() {
        zze.zza("Destroying WebView!");
        w0();
        zzs.zza.post(new p(6, this));
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void zzY() {
        fo.d((oo) this.f7048g0.f6799u, this.f7046e0, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f7063w.afmaVersion);
        G("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void zza(String str) {
        p0(str);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void zzaa() {
        if (this.f7045d0 == null) {
            lo loVar = this.f7048g0;
            fo.d((oo) loVar.f6799u, this.f7046e0, "aes2");
            ko koVar = new ko(zzv.zzC().b(), null, null);
            this.f7045d0 = koVar;
            ((HashMap) loVar.f6798t).put("native:view_show", koVar);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f7063w.afmaVersion);
        G("onshow", map);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzde() {
        zzn zznVar = this.f7064x;
        if (zznVar != null) {
            zznVar.zzde();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdf() {
        zzn zznVar = this.f7064x;
        if (zznVar != null) {
            zznVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized int zzf() {
        return this.f7049h0;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final Activity zzi() {
        return this.s.f3029a;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final zza zzj() {
        return this.f7065y;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final ko zzk() {
        return this.f7046e0;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final lo zzm() {
        return this.f7048g0;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.xb0, com.google.android.gms.internal.ads.p80
    public final VersionInfoParcel zzn() {
        return this.f7063w;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final g80 zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final synchronized ob0 zzq() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized String zzr() {
        vb1 vb1Var = this.C;
        if (vb1Var == null) {
            return null;
        }
        return vb1Var.f9774b;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final synchronized String zzs() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void zzu() {
        eb0 eb0Var = this.F;
        if (eb0Var != null) {
            eb0Var.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final WebView u() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.yb0
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void e(int i6) {
    }
}
