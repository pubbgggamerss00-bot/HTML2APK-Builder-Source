package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fh1 extends ch1 {

    /* renamed from: e, reason: collision with root package name */
    public WebView f4683e;

    /* renamed from: f, reason: collision with root package name */
    public Long f4684f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f4685g;

    public fh1(String str, Map map) {
        super(str);
        this.f4684f = null;
        this.f4685g = map;
    }

    @Override // com.google.android.gms.internal.ads.ch1
    public final void b() {
        super.b();
        new Handler().postDelayed(new x(this), Math.max(4000 - (this.f4684f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f4684f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f4683e = null;
    }

    @Override // com.google.android.gms.internal.ads.ch1
    public final void d(fg1 fg1Var, dg1 dg1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(dg1Var.f3929d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        e(fg1Var, dg1Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ch1
    public final void f() {
        WebView webView = new WebView(wg1.f10196t.s);
        this.f4683e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f4683e.getSettings().setAllowContentAccess(false);
        this.f4683e.getSettings().setAllowFileAccess(false);
        this.f4683e.setWebViewClient(new eh1(this));
        this.f3577b = new wh1(this.f4683e);
        xg1.b(this.f4683e, null);
        Map map = this.f4685g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.f4684f = Long.valueOf(System.nanoTime());
    }
}
