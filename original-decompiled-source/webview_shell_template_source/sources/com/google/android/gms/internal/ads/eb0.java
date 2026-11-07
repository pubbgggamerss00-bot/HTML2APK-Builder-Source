package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class eb0 extends WebViewClient implements zza, on0 {
    public static final /* synthetic */ int Z = 0;
    public ft A;
    public ht B;
    public on0 C;
    public boolean D;
    public boolean E;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public zzac M;
    public a10 N;
    public zzb O;
    public r50 Q;
    public cu0 R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public final oz0 X;
    public bb0 Y;
    public final xa0 s;

    /* renamed from: t, reason: collision with root package name */
    public final kk f4191t;

    /* renamed from: w, reason: collision with root package name */
    public zza f4194w;

    /* renamed from: x, reason: collision with root package name */
    public zzr f4195x;

    /* renamed from: y, reason: collision with root package name */
    public zb0 f4196y;

    /* renamed from: z, reason: collision with root package name */
    public ac0 f4197z;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f4192u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final Object f4193v = new Object();
    public int F = 0;
    public String G = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String H = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public w00 P = null;
    public final HashSet W = new HashSet(Arrays.asList(((String) zzbe.zzc().a(zn.C5)).split(",")));

    public eb0(xa0 xa0Var, kk kkVar, boolean z6, a10 a10Var, oz0 oz0Var) {
        this.f4191t = kkVar;
        this.s = xa0Var;
        this.I = z6;
        this.N = a10Var;
        this.X = oz0Var;
    }

    public static final boolean C(boolean z6, xa0 xa0Var) {
        return (!z6 || xa0Var.zzO().b() || xa0Var.F().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse k() {
        if (((Boolean) zzbe.zzc().a(zn.U0)).booleanValue()) {
            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean w(xa0 xa0Var) {
        return xa0Var.d() != null && xa0Var.d().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a0 A[Catch: NoClassDefFoundError -> 0x0028, Exception -> 0x002b, TryCatch #12 {Exception -> 0x002b, NoClassDefFoundError -> 0x0028, blocks: (B:3:0x0016, B:5:0x0021, B:10:0x002e, B:12:0x003e, B:14:0x0045, B:16:0x0051, B:18:0x006d, B:20:0x0087, B:22:0x00a0, B:24:0x00a6, B:26:0x00aa, B:28:0x00bc, B:31:0x00c4, B:33:0x00d0, B:35:0x00e9, B:88:0x01fc, B:51:0x016b, B:114:0x02a0, B:117:0x02b2, B:119:0x02b8, B:121:0x02c6, B:81:0x01b8, B:89:0x0221, B:90:0x0247, B:50:0x0147, B:34:0x00dd, B:91:0x0248, B:93:0x0252, B:95:0x0258, B:97:0x025b, B:98:0x025c, B:99:0x0279, B:101:0x027c, B:102:0x027d, B:104:0x028b, B:108:0x0298, B:111:0x029b), top: B:133:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b8 A[Catch: NoClassDefFoundError -> 0x0028, Exception -> 0x002b, TryCatch #12 {Exception -> 0x002b, NoClassDefFoundError -> 0x0028, blocks: (B:3:0x0016, B:5:0x0021, B:10:0x002e, B:12:0x003e, B:14:0x0045, B:16:0x0051, B:18:0x006d, B:20:0x0087, B:22:0x00a0, B:24:0x00a6, B:26:0x00aa, B:28:0x00bc, B:31:0x00c4, B:33:0x00d0, B:35:0x00e9, B:88:0x01fc, B:51:0x016b, B:114:0x02a0, B:117:0x02b2, B:119:0x02b8, B:121:0x02c6, B:81:0x01b8, B:89:0x0221, B:90:0x0247, B:50:0x0147, B:34:0x00dd, B:91:0x0248, B:93:0x0252, B:95:0x0258, B:97:0x025b, B:98:0x025c, B:99:0x0279, B:101:0x027c, B:102:0x027d, B:104:0x028b, B:108:0x0298, B:111:0x029b), top: B:133:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[Catch: all -> 0x01ac, TryCatch #7 {all -> 0x01ac, blocks: (B:84:0x01df, B:86:0x01f1, B:87:0x01f8, B:74:0x0191, B:76:0x01a3, B:80:0x01ae), top: B:126:0x00e9 }] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse G(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponse;
        String str2;
        ?? r22;
        InputStream cq1Var;
        boolean z6;
        long j6;
        InputStream inputStreamL;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        String str3;
        xa0 xa0Var = this.s;
        try {
            Map map2 = new HashMap();
            if (xa0Var.d() != null) {
                map2 = xa0Var.d().f9213w0;
            }
            String strB = c60.b(str, xa0Var.getContext(), this.V, map2);
            if (!strB.equals(str)) {
                return n(strB, map);
            }
            xj xjVarL = xj.l(Uri.parse(str));
            if (xjVarL != null) {
                HashMap map3 = new HashMap();
                webResourceResponse = null;
                map3.put("Access-Control-Allow-Origin", "*");
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listB = cm1.a(new ml1('-')).b(uri.getQueryParameter("range"));
                    if (listB.size() == 2) {
                        int i6 = Integer.parseInt((String) listB.get(0));
                        int i7 = Integer.parseInt((String) listB.get(1)) + 1;
                        if (i6 > 0) {
                            str2 = "ms";
                            xjVarL.f10616z = i6;
                        } else {
                            str2 = "ms";
                        }
                        r22 = i7 - i6;
                    } else {
                        str2 = "ms";
                        r22 = -1;
                    }
                    if (((Boolean) zzbe.zzc().a(zn.f11464q4)).booleanValue()) {
                        String strZzr = xa0Var.zzr();
                        if (strZzr == null) {
                            strZzr = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        xjVarL.A = strZzr;
                        xjVarL.B = xa0Var.zzf();
                        try {
                            long jLongValue = (xjVarL.f10615y ? (Long) zzbe.zzc().a(zn.s4) : (Long) zzbe.zzc().a(zn.f11471r4)).longValue();
                            long jB = zzv.zzC().b();
                            zzv.zzd();
                            ak akVarA = hk.a(xa0Var.getContext(), xjVarL);
                            try {
                                ik ikVar = (ik) akVarA.s.get(jLongValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(ikVar.f5792b));
                                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(ikVar.f5793c));
                                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(ikVar.f5795e));
                                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(ikVar.f5794d));
                                        inputStreamL = ikVar.f5791a;
                                        if (r22 != -1) {
                                            long j7 = r22 == true ? 1L : 0L;
                                            try {
                                                int i8 = dq1.f3991a;
                                                inputStreamL = new cq1(inputStreamL, j7);
                                            } catch (InterruptedException e6) {
                                                e = e6;
                                                z9 = true;
                                                if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                                    zzv.zzp().h("AdWebViewClient.interceptRequest.gcache", e);
                                                }
                                                akVarA.cancel(true);
                                                Thread.currentThread().interrupt();
                                                final long jB2 = zzv.zzC().b() - jB;
                                                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.s.s.k0(z9, jB2);
                                                    }
                                                });
                                                str3 = "Cache connection took " + jB2 + str2;
                                                zze.zza(str3);
                                                cq1Var = inputStreamL;
                                                if (cq1Var != null) {
                                                }
                                                if (zzl.zzk()) {
                                                }
                                            } catch (ExecutionException e7) {
                                                e = e7;
                                                z8 = true;
                                                if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                                    zzv.zzp().h("AdWebViewClient.interceptRequest.gcache", e);
                                                }
                                                akVarA.cancel(true);
                                                final long jB3 = zzv.zzC().b() - jB;
                                                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.s.s.k0(z8, jB3);
                                                    }
                                                });
                                                str3 = "Cache connection took " + jB3 + str2;
                                                zze.zza(str3);
                                                cq1Var = inputStreamL;
                                                if (cq1Var != null) {
                                                }
                                                if (zzl.zzk()) {
                                                }
                                            } catch (TimeoutException e8) {
                                                e = e8;
                                                z8 = true;
                                                if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                                }
                                                akVarA.cancel(true);
                                                final long jB32 = zzv.zzC().b() - jB;
                                                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.s.s.k0(z8, jB32);
                                                    }
                                                });
                                                str3 = "Cache connection took " + jB32 + str2;
                                                zze.zza(str3);
                                                cq1Var = inputStreamL;
                                                if (cq1Var != null) {
                                                }
                                                if (zzl.zzk()) {
                                                }
                                            }
                                        }
                                        final long jB4 = zzv.zzC().b() - jB;
                                        final boolean z10 = true;
                                        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.s.s.k0(z10, jB4);
                                            }
                                        });
                                        str3 = "Cache connection took " + jB4 + str2;
                                    } catch (Throwable th) {
                                        th = th;
                                        z7 = true;
                                        final long jB5 = zzv.zzC().b() - jB;
                                        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.s.s.k0(z7, jB5);
                                            }
                                        });
                                        zze.zza("Cache connection took " + jB5 + str2);
                                        throw th;
                                    }
                                } catch (InterruptedException e9) {
                                    e = e9;
                                    inputStreamL = null;
                                } catch (ExecutionException e10) {
                                    e = e10;
                                    inputStreamL = null;
                                    z8 = true;
                                    if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                    }
                                    akVarA.cancel(true);
                                    final long jB322 = zzv.zzC().b() - jB;
                                    zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.s.s.k0(z8, jB322);
                                        }
                                    });
                                    str3 = "Cache connection took " + jB322 + str2;
                                    zze.zza(str3);
                                    cq1Var = inputStreamL;
                                    if (cq1Var != null) {
                                    }
                                    if (zzl.zzk()) {
                                    }
                                } catch (TimeoutException e11) {
                                    e = e11;
                                    inputStreamL = null;
                                    z8 = true;
                                    if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                    }
                                    akVarA.cancel(true);
                                    final long jB3222 = zzv.zzC().b() - jB;
                                    zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.s.s.k0(z8, jB3222);
                                        }
                                    });
                                    str3 = "Cache connection took " + jB3222 + str2;
                                    zze.zza(str3);
                                    cq1Var = inputStreamL;
                                    if (cq1Var != null) {
                                    }
                                    if (zzl.zzk()) {
                                    }
                                }
                            } catch (InterruptedException e12) {
                                e = e12;
                                inputStreamL = null;
                                z9 = false;
                            } catch (ExecutionException e13) {
                                e = e13;
                                inputStreamL = null;
                                z8 = false;
                                if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                }
                                akVarA.cancel(true);
                                final long jB32222 = zzv.zzC().b() - jB;
                                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.s.s.k0(z8, jB32222);
                                    }
                                });
                                str3 = "Cache connection took " + jB32222 + str2;
                                zze.zza(str3);
                                cq1Var = inputStreamL;
                                if (cq1Var != null) {
                                }
                                if (zzl.zzk()) {
                                }
                            } catch (TimeoutException e14) {
                                e = e14;
                                inputStreamL = null;
                                z8 = false;
                                if (((Boolean) zzbe.zzc().a(zn.f11493v4)).booleanValue()) {
                                }
                                akVarA.cancel(true);
                                final long jB322222 = zzv.zzC().b() - jB;
                                zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.s.s.k0(z8, jB322222);
                                    }
                                });
                                str3 = "Cache connection took " + jB322222 + str2;
                                zze.zza(str3);
                                cq1Var = inputStreamL;
                                if (cq1Var != null) {
                                }
                                if (zzl.zzk()) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z7 = false;
                            }
                            zze.zza(str3);
                        } catch (Throwable th3) {
                            th = th3;
                            z7 = r22;
                        }
                    } else {
                        uj ujVarA = zzv.zzc().a(xjVarL);
                        if (ujVarA == null || !ujVarA.m()) {
                            cq1Var = null;
                        } else {
                            synchronized (ujVarA) {
                                z6 = ujVarA.f9570t;
                            }
                            map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z6));
                            map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(ujVarA.o()));
                            map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(ujVarA.n()));
                            synchronized (ujVarA) {
                                j6 = ujVarA.f9572v;
                            }
                            map3.put("X-Afma-Gcache-CachedBytes", Long.toString(j6));
                            inputStreamL = ujVarA.l();
                            if (r22 != -1) {
                                long j8 = r22 == true ? 1L : 0L;
                                int i9 = dq1.f3991a;
                                cq1Var = new cq1(inputStreamL, j8);
                            }
                        }
                        if (cq1Var != null) {
                            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 200, "OK", map3, cq1Var);
                        }
                    }
                    cq1Var = inputStreamL;
                    if (cq1Var != null) {
                    }
                }
            } else {
                webResourceResponse = null;
            }
            return (zzl.zzk() || !((Boolean) op.f7829b.c()).booleanValue()) ? webResourceResponse : n(str, map);
        } catch (Exception e15) {
            e = e15;
            zzv.zzp().h("AdWebViewClient.interceptRequest", e);
            return k();
        } catch (NoClassDefFoundError e16) {
            e = e16;
            zzv.zzp().h("AdWebViewClient.interceptRequest", e);
            return k();
        }
    }

    public final void M() {
        zb0 zb0Var = this.f4196y;
        xa0 xa0Var = this.s;
        if (zb0Var != null && ((this.S && this.U <= 0) || this.T || this.E)) {
            if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue() && xa0Var.zzm() != null) {
                fo.d((oo) xa0Var.zzm().f6799u, xa0Var.zzk(), "awfllc");
            }
            zb0 zb0Var2 = this.f4196y;
            boolean z6 = false;
            if (!this.T && !this.E) {
                z6 = true;
            }
            zb0Var2.zza(z6, this.F, this.G, this.H);
            this.f4196y = null;
        }
        xa0Var.J();
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void O() {
        on0 on0Var = this.C;
        if (on0Var != null) {
            on0Var.O();
        }
    }

    public final void Q() {
        r50 r50Var = this.Q;
        if (r50Var != null) {
            r50Var.zze();
            this.Q = null;
        }
        bb0 bb0Var = this.Y;
        if (bb0Var != null) {
            ((View) this.s).removeOnAttachStateChangeListener(bb0Var);
        }
        synchronized (this.f4193v) {
            try {
                this.f4192u.clear();
                this.f4194w = null;
                this.f4195x = null;
                this.f4196y = null;
                this.f4197z = null;
                this.A = null;
                this.B = null;
                this.D = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.M = null;
                this.O = null;
                this.N = null;
                w00 w00Var = this.P;
                if (w00Var != null) {
                    w00Var.q(true);
                    this.P = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, yt ytVar) {
        synchronized (this.f4193v) {
            try {
                List copyOnWriteArrayList = (List) this.f4192u.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.f4192u.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(ytVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b0(Uri uri) {
        zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f4192u.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzbe.zzc().a(zn.B6)).booleanValue() || zzv.zzp().c() == null) {
                return;
            }
            i70.f5586a.execute(new t(4, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzbe.zzc().a(zn.B5)).booleanValue() && this.W.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbe.zzc().a(zn.D5)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                c5.a aVarZzb = zzv.zzq().zzb(uri);
                aVarZzb.addListener(new as1(0, aVarZzb, new cb0(this, list, path, uri)), i70.f5591f);
                return;
            }
        }
        zzv.zzq();
        t(zzs.zzP(uri), list, path);
    }

    public final void c(vf0 vf0Var, dz0 dz0Var, cf1 cf1Var) {
        f("/click");
        if (dz0Var == null || cf1Var == null) {
            a("/click", new nt(this.C, vf0Var));
        } else {
            a("/click", new hc1(this.C, vf0Var, cf1Var, dz0Var));
        }
    }

    public final void c0(int i6, int i7) {
        a10 a10Var = this.N;
        if (a10Var != null) {
            a10Var.q(i6, i7);
        }
        w00 w00Var = this.P;
        if (w00Var != null) {
            synchronized (w00Var.D) {
                w00Var.f10001x = i6;
                w00Var.f10002y = i7;
            }
        }
    }

    public final void e(vf0 vf0Var, dz0 dz0Var, cu0 cu0Var) {
        f("/open");
        a("/open", new iu(this.O, this.P, dz0Var, cu0Var, vf0Var));
    }

    public final void f(String str) {
        synchronized (this.f4193v) {
            try {
                List list = (List) this.f4192u.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        boolean z6;
        synchronized (this.f4193v) {
            z6 = this.J;
        }
        return z6;
    }

    public final void j(zza zzaVar, ft ftVar, zzr zzrVar, ht htVar, zzac zzacVar, boolean z6, bu buVar, zzb zzbVar, xj1 xj1Var, r50 r50Var, final dz0 dz0Var, final cf1 cf1Var, cu0 cu0Var, pu puVar, on0 on0Var, ou ouVar, zt ztVar, zt ztVar2, vf0 vf0Var) {
        xa0 xa0Var = this.s;
        zzb zzbVar2 = zzbVar == null ? new zzb(xa0Var.getContext(), r50Var, null) : zzbVar;
        this.P = new w00(xa0Var, xj1Var);
        this.Q = r50Var;
        if (((Boolean) zzbe.zzc().a(zn.f11359b1)).booleanValue()) {
            a("/adMetadata", new et(0, ftVar));
        }
        if (htVar != null) {
            a("/appEvent", new gt(0, htVar));
        }
        a("/backButton", xt.f10675j);
        a("/refresh", xt.f10676k);
        a("/canOpenApp", xt.f10668b);
        a("/canOpenURLs", xt.f10667a);
        a("/canOpenIntents", xt.f10669c);
        a("/close", xt.f10670d);
        a("/customClose", xt.f10671e);
        a("/instrument", xt.f10679n);
        a("/delayPageLoaded", xt.f10681p);
        a("/delayPageClosed", xt.f10682q);
        a("/getLocationInfo", xt.f10683r);
        a("/log", xt.f10673g);
        a("/mraid", new du(zzbVar2, this.P, xj1Var));
        a10 a10Var = this.N;
        if (a10Var != null) {
            a("/mraidLoaded", a10Var);
        }
        zzb zzbVar3 = zzbVar2;
        a("/open", new iu(zzbVar3, this.P, dz0Var, cu0Var, vf0Var));
        a("/precache", new t90());
        a("/touch", xt.f10674i);
        a("/video", xt.f10677l);
        a("/videoMeta", xt.f10678m);
        if (dz0Var == null || cf1Var == null) {
            a("/click", new nt(on0Var, vf0Var));
            a("/httpTrack", xt.f10672f);
        } else {
            a("/click", new hc1(on0Var, vf0Var, cf1Var, dz0Var));
            a("/httpTrack", new yt() { // from class: com.google.android.gms.internal.ads.ic1
                @Override // com.google.android.gms.internal.ads.yt
                public final void d(Object obj, Map map) {
                    oa0 oa0Var = (oa0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzo.zzj("URL missing from httpTrack GMSG.");
                        return;
                    }
                    tb1 tb1VarD = oa0Var.d();
                    if (tb1VarD != null && !tb1VarD.f9187i0) {
                        cf1Var.a(str, tb1VarD.f9215x0, null);
                        return;
                    }
                    vb1 vb1VarH = ((qb0) oa0Var).h();
                    if (vb1VarH == null) {
                        zzv.zzp().h("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    } else {
                        fz0 fz0Var = new fz0(zzv.zzC().a(), vb1VarH.f9774b, str, 2);
                        dz0 dz0Var2 = dz0Var;
                        dz0Var2.getClass();
                        dz0Var2.b(new ni0(13, dz0Var2, fz0Var));
                    }
                }
            });
        }
        if (zzv.zzo().e(xa0Var.getContext())) {
            Map map = new HashMap();
            if (xa0Var.d() != null) {
                map = xa0Var.d().f9213w0;
            }
            a("/logScionEvent", new cu(xa0Var.getContext(), map));
        }
        if (buVar != null) {
            a("/setInterstitialProperties", new au(0, buVar));
        }
        if (puVar != null) {
            if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue()) {
                a("/inspectorNetworkExtras", puVar);
            }
        }
        if (((Boolean) zzbe.zzc().a(zn.g9)).booleanValue() && ouVar != null) {
            a("/shareSheet", ouVar);
        }
        if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue() && ztVar != null) {
            a("/inspectorOutOfContextTest", ztVar);
        }
        if (((Boolean) zzbe.zzc().a(zn.p9)).booleanValue() && ztVar2 != null) {
            a("/inspectorStorage", ztVar2);
        }
        if (((Boolean) zzbe.zzc().a(zn.rb)).booleanValue()) {
            a("/bindPlayStoreOverlay", xt.f10685u);
            a("/presentPlayStoreOverlay", xt.f10686v);
            a("/expandPlayStoreOverlay", xt.f10687w);
            a("/collapsePlayStoreOverlay", xt.f10688x);
            a("/closePlayStoreOverlay", xt.f10689y);
        }
        if (((Boolean) zzbe.zzc().a(zn.f11470r3)).booleanValue()) {
            a("/setPAIDPersonalizationEnabled", xt.A);
            a("/resetPAID", xt.f10690z);
        }
        if (((Boolean) zzbe.zzc().a(zn.Lb)).booleanValue() && xa0Var.d() != null && xa0Var.d().f9204r0) {
            a("/writeToLocalStorage", xt.B);
            a("/clearLocalStorageKeys", xt.C);
        }
        this.f4194w = zzaVar;
        this.f4195x = zzrVar;
        this.A = ftVar;
        this.B = htVar;
        this.M = zzacVar;
        this.O = zzbVar3;
        this.C = on0Var;
        this.R = cu0Var;
        this.D = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        r50 r50Var = this.Q;
        if (r50Var != null) {
            xa0 xa0Var = this.s;
            WebView webViewU = xa0Var.u();
            WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
            if (webViewU.isAttachedToWindow()) {
                v(webViewU, r50Var, 10);
                return;
            }
            bb0 bb0Var = this.Y;
            if (bb0Var != null) {
                ((View) xa0Var).removeOnAttachStateChangeListener(bb0Var);
            }
            bb0 bb0Var2 = new bb0(this, r50Var);
            this.Y = bb0Var2;
            ((View) xa0Var).addOnAttachStateChangeListener(bb0Var2);
        }
    }

    public final void l0(zzc zzcVar, boolean z6, boolean z7, String str) {
        boolean z8;
        xa0 xa0Var = this.s;
        boolean zX = xa0Var.x();
        boolean z9 = false;
        boolean z10 = C(zX, xa0Var) || z7;
        if (z10 || !z6) {
            z8 = zX;
            z9 = true;
        } else {
            z8 = zX;
        }
        o0(new AdOverlayInfoParcel(zzcVar, z10 ? null : this.f4194w, z8 ? null : this.f4195x, this.M, xa0Var.zzn(), xa0Var, z9 ? null : this.C, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.zzv.zzq();
        r0 = r12.getContentType();
        r2 = android.text.TextUtils.isEmpty(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        r6 = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
    
        if (r2 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        r14 = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        r14 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzq();
        r0 = r12.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0124, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
    
        if (r0.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012e, code lost:
    
        if (r2 >= r0.length) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013c, code lost:
    
        if (r0[r2].trim().startsWith("charset") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        r4 = r0[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        if (r4.length <= 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        r6 = r4[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0157, code lost:
    
        r0 = r12.getHeaderFields();
        r2 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0170, code lost:
    
        if (r0.hasNext() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0172, code lost:
    
        r4 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        if (r4.getKey() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
    
        if (r4.getValue() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
    
        if (r4.getValue().isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0190, code lost:
    
        r2.put(r4.getKey(), r4.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a6, code lost:
    
        r7 = com.google.android.gms.ads.internal.zzv.zzr().zzb(r14, r15, r12.getResponseCode(), r12.getResponseMessage(), r2, r12.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse n(String str, Map map) throws IOException {
        WebResourceResponse webResourceResponseZzb;
        xa0 xa0Var = this.s;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i6 = 0;
            while (true) {
                i6++;
                if (i6 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                zzv.zzq().zzf(xa0Var.getContext(), xa0Var.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                webResourceResponseZzb = null;
                zzl zzlVar = new zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (!headerField.startsWith("tel:")) {
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        zzo.zzj("Protocol is null");
                        webResourceResponseZzb = k();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        zzo.zzj("Unsupported scheme: " + protocol);
                        webResourceResponseZzb = k();
                        break;
                    }
                    zzo.zze("Redirecting to " + headerField);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            return webResourceResponseZzb;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void o0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        w00 w00Var = this.P;
        if (w00Var != null) {
            synchronized (w00Var.D) {
                z = w00Var.K != null;
            }
        }
        zzv.zzj();
        zzn.zza(this.s.getContext(), adOverlayInfoParcel, !z, this.R);
        r50 r50Var = this.Q;
        if (r50Var != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            r50Var.zzh(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.f4194w;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            b0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f4193v) {
            try {
                if (this.s.o()) {
                    zze.zza("Blank page loaded, 1...");
                    this.s.zzX();
                    return;
                }
                this.S = true;
                ac0 ac0Var = this.f4197z;
                if (ac0Var != null) {
                    ac0Var.mo1zza();
                    this.f4197z = null;
                }
                M();
                if (this.s.zzL() != null) {
                    if (((Boolean) zzbe.zzc().a(zn.Mb)).booleanValue()) {
                        this.s.zzL().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i6, String str, String str2) {
        this.E = true;
        this.F = i6;
        this.G = str;
        this.H = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        return this.s.V(renderProcessGoneDetail.rendererPriorityAtExit(), zDidCrash);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return G(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            b0(uriA);
            return true;
        }
        boolean z6 = this.D;
        xa0 xa0Var = this.s;
        if (z6 && webView == xa0Var.u()) {
            String scheme = uriA.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zza zzaVar = this.f4194w;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                    r50 r50Var = this.Q;
                    if (r50Var != null) {
                        r50Var.zzh(str);
                    }
                    this.f4194w = null;
                }
                on0 on0Var = this.C;
                if (on0Var != null) {
                    on0Var.O();
                    this.C = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (xa0Var.u().willNotDraw()) {
            zzo.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            mf mfVarB = xa0Var.b();
            fc1 fc1VarR = xa0Var.R();
            if (!((Boolean) zzbe.zzc().a(zn.Rb)).booleanValue() || fc1VarR == null) {
                if (mfVarB != null && mfVarB.c(uriA)) {
                    uriA = mfVarB.a(uriA, xa0Var.getContext(), (View) xa0Var, xa0Var.zzi());
                }
            } else if (mfVarB != null && mfVarB.c(uriA)) {
                uriA = fc1VarR.a(uriA, xa0Var.getContext(), (View) xa0Var, xa0Var.zzi());
            }
        } catch (nf unused) {
            zzo.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        zzb zzbVar = this.O;
        if (zzbVar == null || zzbVar.zzc()) {
            l0(new zzc("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null), true, false, xa0Var.zzr());
        } else {
            zzbVar.zzb(str);
        }
        return true;
    }

    public final void t(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yt) it.next()).d(this.s, map);
        }
    }

    public final void v(final View view, final r50 r50Var, final int i6) {
        if (!r50Var.zzi() || i6 <= 0) {
            return;
        }
        r50Var.b(view);
        if (r50Var.zzi()) {
            zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.ya0
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.v(view, r50Var, i6 - 1);
                }
            }, 100L);
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void zzu() {
        on0 on0Var = this.C;
        if (on0Var != null) {
            on0Var.zzu();
        }
    }
}
