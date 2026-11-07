package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jb0 extends FrameLayout implements xa0 {
    public final mb0 s;

    /* renamed from: t, reason: collision with root package name */
    public final g80 f6011t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f6012u;

    public jb0(mb0 mb0Var) {
        super(mb0Var.getContext());
        this.f6012u = new AtomicBoolean();
        this.s = mb0Var;
        this.f6011t = new g80(mb0Var.s.f3031c, this, this);
        addView(mb0Var);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void A(int i6) {
        this.s.A(i6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean B() {
        return this.s.B();
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        this.s.C(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void D() {
        this.s.f7059s0 = true;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void E(aj ajVar) {
        this.s.E(ajVar);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final String F() {
        return this.s.F();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void G(String str, Map map) {
        this.s.G(str, map);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final ArrayList H() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt != this.s) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void I(zzm zzmVar) {
        this.s.I(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void J() {
        this.s.J();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void K(String str, String str2) throws Throwable {
        this.s.K(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void L(String str, yt ytVar) {
        this.s.L(str, ytVar);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void N(boolean z6) {
        this.s.N(z6);
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void O() {
        mb0 mb0Var = this.s;
        if (mb0Var != null) {
            mb0Var.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void P(sr0 sr0Var) {
        this.s.P(sr0Var);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final fc1 R() {
        return this.s.f7061u;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void S(nq nqVar) {
        this.s.S(nqVar);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void T() {
        setBackgroundColor(0);
        this.s.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void U(uz0 uz0Var) {
        this.s.U(uz0Var);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean V(int i6, boolean z6) {
        if (!this.f6012u.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzbe.zzc().a(zn.W0)).booleanValue()) {
            return false;
        }
        mb0 mb0Var = this.s;
        if (mb0Var.getParent() instanceof ViewGroup) {
            ((ViewGroup) mb0Var.getParent()).removeView(mb0Var);
        }
        mb0Var.V(i6, z6);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean W() {
        return this.s.W();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void X() {
        this.s.X();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void Y(boolean z6) {
        this.s.Y(z6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void Z(String str, yt ytVar) {
        this.s.Z(str, ytVar);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void a(String str, String str2) {
        this.s.a("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final c5.a a0() {
        return this.s.a0();
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.wb0
    public final mf b() {
        return this.s.f7060t;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void b0(String str, s90 s90Var) {
        this.s.b0(str, s90Var);
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void c() {
        this.s.c();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void c0(zzc zzcVar, boolean z6, boolean z7, String str) {
        this.s.c0(zzcVar, z6, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean canGoBack() {
        return this.s.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.oa0
    public final tb1 d() {
        return this.s.B;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void d0(zzm zzmVar) {
        this.s.d0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void destroy() {
        uz0 uz0VarP;
        mb0 mb0Var = this.s;
        vz0 vz0VarE0 = mb0Var.e0();
        if (vz0VarE0 != null) {
            uj1 uj1Var = zzs.zza;
            uj1Var.post(new b(10, vz0VarE0));
            uj1Var.postDelayed(new u(5, mb0Var), ((Integer) zzbe.zzc().a(zn.f11379d5)).intValue());
        } else if (!((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() || (uz0VarP = mb0Var.p()) == null) {
            mb0Var.destroy();
        } else {
            zzs.zza.post(new wx(3, this, uz0VarP));
        }
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void e(int i6) {
        f80 f80Var = this.f6011t.f4938d;
        if (f80Var != null) {
            if (((Boolean) zzbe.zzc().a(zn.S)).booleanValue()) {
                f80Var.f4537t.setBackgroundColor(i6);
                f80Var.f4538u.setBackgroundColor(i6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final vz0 e0() {
        return this.s.e0();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void f(int i6, boolean z6, boolean z7) {
        this.s.f(i6, z6, z7);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean f0() {
        return this.f6012u.get();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final aj g() {
        return this.s.g();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void g0(boolean z6) {
        this.s.g0(z6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void goBack() {
        this.s.goBack();
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.qb0
    public final vb1 h() {
        return this.s.C;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void h0(cc0 cc0Var) {
        this.s.h0(cc0Var);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void i(boolean z6, int i6, String str, boolean z7, boolean z8) {
        this.s.i(z6, i6, str, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void i0() {
        this.s.i0();
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void j(String str, JSONObject jSONObject) {
        this.s.j(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void j0(boolean z6) {
        this.s.j0(z6);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void k(boolean z6, int i6, String str, String str2, boolean z7) {
        this.s.k(z6, i6, str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void k0(boolean z6, long j6) {
        this.s.k0(z6, j6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void l(boolean z6) {
        this.s.l(z6);
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void l0(String str, JSONObject jSONObject) {
        this.s.a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void loadData(String str, String str2, String str3) {
        this.s.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        this.s.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void loadUrl(String str) {
        this.s.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void m(int i6) {
        this.s.m(i6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void m0(vz0 vz0Var) {
        this.s.m0(vz0Var);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void n(String str, String str2) {
        this.s.n(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean n0() {
        return this.s.n0();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean o() {
        return this.s.o();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        mb0 mb0Var = this.s;
        if (mb0Var != null) {
            mb0Var.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void onPause() {
        b80 b80Var;
        g80 g80Var = this.f6011t;
        g80Var.getClass();
        com.google.android.gms.common.internal.l.d("onPause must be called from the UI thread.");
        f80 f80Var = g80Var.f4938d;
        if (f80Var != null && (b80Var = f80Var.f4542y) != null) {
            b80Var.r();
        }
        this.s.onPause();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void onResume() {
        this.s.onResume();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final uz0 p() {
        return this.s.p();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void q(boolean z6) {
        this.s.F.V = z6;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void r(Context context) {
        this.s.r(context);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void s(tb1 tb1Var, vb1 vb1Var) {
        mb0 mb0Var = this.s;
        mb0Var.B = tb1Var;
        mb0Var.C = vb1Var;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.xa0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.xa0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.s.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.s.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.s.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void t() {
        this.s.t();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final WebView u() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void v(ob0 ob0Var) {
        this.s.v(ob0Var);
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final s90 w(String str) {
        return this.s.w(str);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final boolean x() {
        return this.s.x();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void y(String str, l2 l2Var) {
        this.s.y(str, l2Var);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void z() {
        vz0 vz0VarE0;
        uz0 uz0VarP;
        TextView textView = new TextView(getContext());
        zzv.zzq();
        textView.setText(zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue();
        mb0 mb0Var = this.s;
        if (zBooleanValue && (uz0VarP = mb0Var.p()) != null) {
            uz0VarP.a(textView);
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.f11387e5)).booleanValue() && (vz0VarE0 = mb0Var.e0()) != null && vz0VarE0.f9966b.f3932g == eg1.f4279t) {
            tz0 tz0VarZzB = zzv.zzB();
            fg1 fg1Var = vz0VarE0.f9965a;
            ((sz0) tz0VarZzB).getClass();
            sz0.j(new q(8, fg1Var, textView));
        }
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final void zzA(int i6) {
        this.s.zzA(i6);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final Context zzE() {
        return this.s.s.f3031c;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final nq zzK() {
        return this.s.zzK();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final zzm zzL() {
        return this.s.zzL();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final zzm zzM() {
        return this.s.zzM();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final eb0 zzN() {
        return this.s.F;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final cc0 zzO() {
        return this.s.zzO();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void zzX() {
        g80 g80Var = this.f6011t;
        g80Var.getClass();
        com.google.android.gms.common.internal.l.d("onDestroy must be called from the UI thread.");
        f80 f80Var = g80Var.f4938d;
        if (f80Var != null) {
            f80Var.f4540w.a();
            b80 b80Var = f80Var.f4542y;
            if (b80Var != null) {
                b80Var.w();
            }
            f80Var.b();
            g80Var.f4937c.removeView(g80Var.f4938d);
            g80Var.f4938d = null;
        }
        this.s.zzX();
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void zzY() {
        this.s.zzY();
    }

    @Override // com.google.android.gms.internal.ads.rw
    public final void zza(String str) {
        this.s.p0(str);
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final void zzaa() {
        this.s.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        this.s.zzde();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        this.s.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final int zzf() {
        return this.s.zzf();
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final int zzg() {
        return ((Boolean) zzbe.zzc().a(zn.W3)).booleanValue() ? this.s.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final int zzh() {
        return ((Boolean) zzbe.zzc().a(zn.W3)).booleanValue() ? this.s.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final Activity zzi() {
        return this.s.s.f3029a;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final zza zzj() {
        return this.s.f7065y;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final ko zzk() {
        return this.s.f7046e0;
    }

    @Override // com.google.android.gms.internal.ads.xa0
    public final lo zzm() {
        return this.s.f7048g0;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.xb0, com.google.android.gms.internal.ads.p80
    public final VersionInfoParcel zzn() {
        return this.s.f7063w;
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final g80 zzo() {
        return this.f6011t;
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.p80
    public final ob0 zzq() {
        return this.s.zzq();
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final String zzr() {
        return this.s.zzr();
    }

    @Override // com.google.android.gms.internal.ads.p80
    public final String zzs() {
        return this.s.zzs();
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void zzu() {
        mb0 mb0Var = this.s;
        if (mb0Var != null) {
            mb0Var.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.xa0, com.google.android.gms.internal.ads.yb0
    public final View zzF() {
        return this;
    }
}
