package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzg;
import d6.a;
import i2.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t31 implements zzg {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9095t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f9096u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f9097v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f9098w;

    public t31(u31 u31Var, o70 o70Var, ac1 ac1Var, tb1 tb1Var, dh0 dh0Var) {
        this.s = o70Var;
        this.f9095t = ac1Var;
        this.f9096u = tb1Var;
        this.f9097v = dh0Var;
        this.f9098w = u31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(t31 t31Var, String str) {
        gg1 gg1Var = gg1.f5039t;
        ig1 ig1Var = ig1.f5749t;
        mg1 mg1Var = mg1.f7151u;
        int i6 = 0;
        fg1 fg1Var = new fg1(py0.a(gg1Var, ig1Var, mg1Var, mg1Var, false), new dg1((mo) t31Var.s, (WebView) t31Var.f9095t, null, null, eg1.f4279t), str);
        ((HashMap) t31Var.f9097v).put(str, fg1Var);
        vh1 vh1Var = (vh1) t31Var.f9096u;
        fg1Var.c(vh1Var == null ? null : (View) vh1Var.get());
        ArrayList arrayList = ((vg1) t31Var.f9098w).f9861a;
        int size = arrayList.size();
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ug1 ug1Var = (ug1) obj;
            fg1Var.a((View) ug1Var.f9555a.get(), ug1Var.f9557c);
        }
        fg1Var.d();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
        dh0 dh0Var = (dh0) this.f9097v;
        x31 x31Var = ((u31) this.f9098w).f9455d;
        ac1 ac1Var = (ac1) this.f9095t;
        tb1 tb1Var = (tb1) this.f9096u;
        w31 w31Var = new w31(new bq(25, (byte) 0), null);
        ud0 ud0VarA = x31Var.f10343a.a(new androidx.camera.view.b(ac1Var, tb1Var, null), w31Var);
        v31 v31Var = new v31(12, ud0VarA);
        synchronized (dh0Var) {
            dh0Var.f3937t = v31Var;
        }
        ((o70) this.s).a(ud0VarA.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t31(mo moVar, WebView webView) {
        HashMap map = new HashMap();
        this.f9097v = map;
        this.f9098w = new vg1();
        if (!bq.D.f3169a) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.s = moVar;
        this.f9095t = webView;
        vh1 vh1Var = (vh1) this.f9096u;
        if ((vh1Var == null ? null : (View) vh1Var.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((cg1) it.next()).c(webView);
            }
            this.f9096u = new vh1(webView);
        }
        if (!androidx.activity.c0.f("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebView webView2 = (WebView) this.f9095t;
        int i6 = h2.c.f13280a;
        a.d dVar = i2.j.f13357g;
        if (!dVar.d()) {
            throw i2.j.a();
        }
        ((WebViewProviderBoundaryInterface) h2.c.c(webView2).f2049t).removeWebMessageListener("omidJsSessionService");
        kg1 kg1Var = new kg1(this);
        WebView webView3 = (WebView) this.f9095t;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        if (!dVar.d()) {
            throw i2.j.a();
        }
        ((WebViewProviderBoundaryInterface) h2.c.c(webView3).f2049t).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new a.C0048a(new i2.h(kg1Var)));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
    }
}
