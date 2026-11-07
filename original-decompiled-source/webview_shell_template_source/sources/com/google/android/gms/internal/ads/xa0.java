package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface xa0 extends zza, on0, oa0, lw, qb0, sb0, rw, bi, ub0, zzn, wb0, xb0, p80, yb0 {
    void A(int i6);

    boolean B();

    void D();

    void E(aj ajVar);

    String F();

    ArrayList H();

    void I(zzm zzmVar);

    void J();

    void K(String str, String str2);

    void L(String str, yt ytVar);

    void N(boolean z6);

    void P(sr0 sr0Var);

    fc1 R();

    void S(nq nqVar);

    void T();

    void U(uz0 uz0Var);

    boolean V(int i6, boolean z6);

    boolean W();

    void X();

    void Y(boolean z6);

    void Z(String str, yt ytVar);

    c5.a a0();

    mf b();

    boolean canGoBack();

    tb1 d();

    void d0(zzm zzmVar);

    void destroy();

    vz0 e0();

    boolean f0();

    aj g();

    void g0(boolean z6);

    @Override // com.google.android.gms.internal.ads.sb0, com.google.android.gms.internal.ads.p80
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    void goBack();

    vb1 h();

    void h0(cc0 cc0Var);

    void i0();

    boolean isAttachedToWindow();

    void j0(boolean z6);

    void l(boolean z6);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m(int i6);

    void m0(vz0 vz0Var);

    void measure(int i6, int i7);

    boolean n0();

    boolean o();

    void onPause();

    void onResume();

    uz0 p();

    void q(boolean z6);

    void r(Context context);

    void s(tb1 tb1Var, vb1 vb1Var);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    WebView u();

    boolean x();

    void y(String str, l2 l2Var);

    void z();

    Context zzE();

    View zzF();

    nq zzK();

    zzm zzL();

    zzm zzM();

    eb0 zzN();

    cc0 zzO();

    void zzX();

    void zzY();

    void zzaa();

    Activity zzi();

    com.google.android.gms.ads.internal.zza zzj();

    lo zzm();

    VersionInfoParcel zzn();

    ob0 zzq();
}
