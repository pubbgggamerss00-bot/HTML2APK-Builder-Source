package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fp0 extends ti0 {
    public static final /* synthetic */ int G = 0;
    public final VersionInfoParcel A;
    public final Context B;
    public final hp0 C;
    public final k41 D;
    public final HashMap E;
    public final ArrayList F;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f4748j;

    /* renamed from: k, reason: collision with root package name */
    public final jp0 f4749k;

    /* renamed from: l, reason: collision with root package name */
    public final np0 f4750l;

    /* renamed from: m, reason: collision with root package name */
    public final up0 f4751m;

    /* renamed from: n, reason: collision with root package name */
    public final mp0 f4752n;

    /* renamed from: o, reason: collision with root package name */
    public final pp0 f4753o;

    /* renamed from: p, reason: collision with root package name */
    public final u92 f4754p;

    /* renamed from: q, reason: collision with root package name */
    public final u92 f4755q;

    /* renamed from: r, reason: collision with root package name */
    public final u92 f4756r;
    public final u92 s;

    /* renamed from: t, reason: collision with root package name */
    public final u92 f4757t;

    /* renamed from: u, reason: collision with root package name */
    public sh f4758u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4759v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4760w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4761x;

    /* renamed from: y, reason: collision with root package name */
    public final z50 f4762y;

    /* renamed from: z, reason: collision with root package name */
    public final mf f4763z;

    static {
        zn1 zn1Var = bo1.f3236t;
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        ap1.a(objArr, 6);
        bo1.k(objArr, 6);
    }

    public fp0(si0 si0Var, Executor executor, jp0 jp0Var, np0 np0Var, up0 up0Var, mp0 mp0Var, pp0 pp0Var, u92 u92Var, u92 u92Var2, u92 u92Var3, u92 u92Var4, u92 u92Var5, z50 z50Var, mf mfVar, VersionInfoParcel versionInfoParcel, Context context, hp0 hp0Var, k41 k41Var) {
        super(si0Var);
        this.f4748j = executor;
        this.f4749k = jp0Var;
        this.f4750l = np0Var;
        this.f4751m = up0Var;
        this.f4752n = mp0Var;
        this.f4753o = pp0Var;
        this.f4754p = u92Var;
        this.f4755q = u92Var2;
        this.f4756r = u92Var3;
        this.s = u92Var4;
        this.f4757t = u92Var5;
        this.f4762y = z50Var;
        this.f4763z = mfVar;
        this.A = versionInfoParcel;
        this.B = context;
        this.C = hp0Var;
        this.D = k41Var;
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static boolean h(View view) {
        if (!((Boolean) zzbe.zzc().a(zn.wa)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        zzv.zzq();
        long jZzx = zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            return jZzx >= ((long) ((Integer) zzbe.zzc().a(zn.xa)).intValue());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void a() {
        x xVar = new x(12, this);
        Executor executor = this.f4748j;
        executor.execute(xVar);
        if (this.f4749k.g() != 7) {
            np0 np0Var = this.f4750l;
            Objects.requireNonNull(np0Var);
            executor.execute(new yh(9, np0Var));
        }
        super.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(View view, Map map, Map map2, boolean z6) {
        try {
            if (!this.f4760w) {
                if (((Boolean) zzbe.zzc().a(zn.S1)).booleanValue() && this.f9289b.f9191k0) {
                    Iterator it = this.E.keySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) this.E.get((String) it.next())).booleanValue()) {
                            break;
                        }
                    }
                    if (!z6) {
                    }
                } else {
                    if (!z6) {
                        l(view, map, map2);
                        return;
                    }
                    if (((Boolean) zzbe.zzc().a(zn.X3)).booleanValue() && map != null) {
                        Iterator it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                            if (view2 != null && h(view2)) {
                                l(view, map, map2);
                                return;
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0059, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x000b, B:9:0x0012, B:11:0x001a, B:14:0x0027, B:15:0x002c, B:17:0x003e, B:20:0x0047, B:22:0x004d), top: B:33:0x0001, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(View view, View view2, Map map, Map map2, boolean z6) {
        xa0 xa0VarM;
        up0 up0Var = this.f4751m;
        ?? r12 = this.f4758u;
        bq0 bq0Var = up0Var.f9599e;
        if (r12 != 0 && bq0Var != null && r12.zzh() != null && up0Var.f9597c.f()) {
            try {
                r12.zzh().addView(bq0Var.a());
            } catch (hb0 e6) {
                zze.zzb("web view can not be obtained", e6);
            }
            this.f4750l.f(view, view2, map, map2, z6, j());
            if (this.f4761x) {
            }
            return;
        }
        this.f4750l.f(view, view2, map, map2, z6, j());
        if (this.f4761x) {
            jp0 jp0Var = this.f4749k;
            if (jp0Var.m() != null && (xa0VarM = jp0Var.m()) != null) {
                xa0VarM.G("onSdkAdUserInteractionClick", new w.a());
                return;
            }
        }
        return;
    }

    public final synchronized void d(final View view, final int i6) {
        if (((Boolean) zzbe.zzc().a(zn.sb)).booleanValue()) {
            sh shVar = this.f4758u;
            if (shVar == null) {
                zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z6 = shVar instanceof rp0;
                this.f4748j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bp0
                    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        fp0 fp0Var = this.s;
                        ?? r12 = fp0Var.f4758u;
                        if (r12 == 0) {
                            zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                            return;
                        }
                        fp0Var.f4750l.j(view, r12.zzf(), fp0Var.f4758u.zzl(), fp0Var.f4758u.zzm(), z6, fp0Var.j(), i6);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(View view) {
        o70 o70Var;
        jp0 jp0Var = this.f4749k;
        if (!((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue() || jp0Var.g() == 3) {
            m(jp0Var.o(), view);
            return;
        }
        synchronized (jp0Var) {
            o70Var = jp0Var.f6135n;
        }
        if (o70Var == null) {
            return;
        }
        com.google.android.gms.ads.mediation.customevent.a aVar = new com.google.android.gms.ads.mediation.customevent.a(this, view, 5, false);
        o70Var.addListener(new as1(0 == true ? 1 : 0, o70Var, aVar), this.f4748j);
    }

    public final synchronized void f(hq0 hq0Var) {
        if (((Boolean) zzbe.zzc().a(zn.Q1)).booleanValue()) {
            zzs.zza.post(new wx(this, hq0Var));
        } else {
            n(hq0Var);
        }
    }

    public final synchronized void g(hq0 hq0Var) {
        if (((Boolean) zzbe.zzc().a(zn.Q1)).booleanValue()) {
            zzs.zza.post(new q(this, hq0Var));
        } else {
            o(hq0Var);
        }
    }

    public final synchronized boolean i(Bundle bundle) {
        if (this.f4760w) {
            return true;
        }
        boolean zD = this.f4750l.d(bundle);
        this.f4760w = zD;
        return zD;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    public final synchronized ImageView.ScaleType j() {
        ?? r02 = this.f4758u;
        if (r02 == 0) {
            zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        k3.a aVarZzj = r02.zzj();
        if (aVarZzj != null) {
            return (ImageView.ScaleType) k3.b.i1(aVarZzj);
        }
        return up0.f9594k;
    }

    public final void k() {
        c5.a aVar;
        if (!((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue()) {
            q("Google", true);
            return;
        }
        jp0 jp0Var = this.f4749k;
        synchronized (jp0Var) {
            aVar = jp0Var.f6134m;
        }
        if (aVar == null) {
            return;
        }
        dh0 dh0Var = new dh0(13, this);
        aVar.addListener(new as1(0, aVar, dh0Var), this.f4748j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    public final synchronized void l(View view, Map map, Map map2) {
        this.f4751m.a(this.f4758u);
        this.f4750l.a(view, map, map2, j());
        this.f4760w = true;
    }

    public final void m(vz0 vz0Var, View view) {
        xa0 xa0VarL = this.f4749k.l();
        if (!this.f4752n.c() || vz0Var == null || xa0VarL == null || view == null) {
            return;
        }
        ((sz0) zzv.zzB()).d(vz0Var.f9965a, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    public final synchronized void n(hq0 hq0Var) {
        Iterator<String> itKeys;
        View view;
        ff ffVar;
        try {
            if (!this.f4759v) {
                this.f4758u = (sh) hq0Var;
                up0 up0Var = this.f4751m;
                up0Var.f9601g.execute(new q(up0Var, hq0Var));
                this.f4750l.e(hq0Var.zzf(), hq0Var.zzm(), hq0Var.zzn(), hq0Var, hq0Var);
                if (((Boolean) zzbe.zzc().a(zn.K2)).booleanValue() && (ffVar = this.f4763z.f7110b) != null) {
                    ffVar.zzo(hq0Var.zzf());
                }
                if (((Boolean) zzbe.zzc().a(zn.S1)).booleanValue()) {
                    tb1 tb1Var = this.f9289b;
                    if (tb1Var.f9191k0 && (itKeys = tb1Var.f9189j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ?? r22 = this.f4758u;
                            WeakReference weakReference = r22 == 0 ? null : (WeakReference) r22.zzl().get(next);
                            this.E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ci ciVar = new ci(this.B, view);
                                this.F.add(ciVar);
                                ciVar.D.add(new dp0(this, next));
                                ciVar.c(3);
                            }
                        }
                    }
                }
                if (hq0Var.zzi() != null) {
                    ci ciVarZzi = hq0Var.zzi();
                    ciVarZzi.D.add(this.f4762y);
                    ciVarZzi.c(3);
                }
            }
        } finally {
        }
    }

    public final void o(hq0 hq0Var) {
        View viewZzf = hq0Var.zzf();
        hq0Var.zzl();
        this.f4750l.h(viewZzf);
        if (hq0Var.zzh() != null) {
            hq0Var.zzh().setClickable(false);
            hq0Var.zzh().removeAllViews();
        }
        if (hq0Var.zzi() != null) {
            ci ciVarZzi = hq0Var.zzi();
            ciVarZzi.D.remove(this.f4762y);
        }
        this.f4758u = null;
    }

    public final synchronized void p() {
        this.f4759v = true;
        this.f4748j.execute(new b(12, this));
        dl0 dl0Var = this.f9290c;
        dl0Var.getClass();
        dl0Var.o0(new wg1(null));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.rz0] */
    public final vz0 q(final String str, boolean z6) {
        final String str2;
        final int i6;
        final int i7;
        vz0 vz0Var;
        Object objA;
        if (this.f4752n.c() && !TextUtils.isEmpty(str)) {
            jp0 jp0Var = this.f4749k;
            xa0 xa0VarL = jp0Var.l();
            xa0 xa0VarM = jp0Var.m();
            if (xa0VarL == null && xa0VarM == null) {
                zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z7 = false;
            boolean z8 = xa0VarL != null;
            boolean z9 = xa0VarM != null;
            if (((Boolean) zzbe.zzc().a(zn.f11420j5)).booleanValue()) {
                this.f4752n.a();
                int iD = this.f4752n.a().d();
                int i8 = iD - 1;
                if (i8 != 0) {
                    if (i8 != 1) {
                        zzo.zzj("Unknown omid media type: " + (iD != 1 ? iD != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    }
                    if (xa0VarL == null) {
                        zzo.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z9 = false;
                    z7 = true;
                } else {
                    if (xa0VarM == null) {
                        zzo.zzj("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    z9 = true;
                }
            } else {
                z7 = z8;
            }
            if (z7) {
                str2 = null;
            } else {
                str2 = "javascript";
                xa0VarL = xa0VarM;
            }
            if (xa0VarL != null) {
                if (!((sz0) zzv.zzB()).f(this.B)) {
                    zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                VersionInfoParcel versionInfoParcel = this.A;
                final String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                if (z9) {
                    i7 = 3;
                    i6 = 2;
                } else {
                    i6 = this.f4749k.g() == 3 ? 4 : 3;
                    i7 = 2;
                }
                tz0 tz0VarZzB = zzv.zzB();
                final WebView webViewU = xa0VarL.u();
                final String str4 = this.f9289b.f9193l0;
                ((sz0) tz0VarZzB).getClass();
                if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue() && bq.D.f3169a) {
                    try {
                        objA = new Object() { // from class: com.google.android.gms.internal.ads.rz0
                            public final Object a() {
                                mo moVarA = mo.a(str, str3);
                                mg1 mg1VarI = sz0.i("javascript");
                                String str5 = str2;
                                mg1 mg1VarI2 = sz0.i(str5);
                                int i9 = i7;
                                gg1 gg1VarG = sz0.g(androidx.camera.view.g.b(i9));
                                mg1 mg1Var = mg1.f7152v;
                                if (mg1VarI == mg1Var) {
                                    zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
                                    return null;
                                }
                                if (gg1VarG == null) {
                                    zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(androidx.camera.view.g.g(i9)));
                                    return null;
                                }
                                if (gg1VarG == gg1.f5042w && mg1VarI2 == mg1Var) {
                                    zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str5)));
                                    return null;
                                }
                                dg1 dg1Var = new dg1(moVarA, webViewU, str4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, eg1.f4280u);
                                py0 py0VarA = py0.a(gg1VarG, sz0.h(androidx.camera.core.t.b(i6)), mg1VarI, mg1VarI2, true);
                                if (bq.D.f3169a) {
                                    return new vz0(new fg1(py0VarA, dg1Var, UUID.randomUUID().toString()), dg1Var);
                                }
                                throw new IllegalStateException("Method called before OM SDK activation");
                            }
                        }.a();
                    } catch (RuntimeException e6) {
                        zzv.zzp().g("omid exception", e6);
                        objA = null;
                    }
                    vz0Var = (vz0) objA;
                } else {
                    vz0Var = null;
                }
                if (vz0Var == null) {
                    zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                jp0 jp0Var2 = this.f4749k;
                synchronized (jp0Var2) {
                    jp0Var2.f6133l = vz0Var;
                }
                xa0VarL.m0(vz0Var);
                if (z9) {
                    fg1 fg1Var = vz0Var.f9965a;
                    if (xa0VarM != null) {
                        ((sz0) zzv.zzB()).d(fg1Var, xa0VarM.zzF());
                    }
                    this.f4761x = true;
                }
                if (z6) {
                    ((sz0) zzv.zzB()).e(vz0Var.f9965a);
                    xa0VarL.G("onSdkLoaded", new w.a());
                }
                return vz0Var;
            }
            zzo.zzj("Webview is null in InternalNativeAd");
        }
        return null;
    }
}
