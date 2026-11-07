package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fg1 extends cg1 {

    /* renamed from: a, reason: collision with root package name */
    public final dg1 f4651a;

    /* renamed from: d, reason: collision with root package name */
    public ch1 f4654d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4657g;

    /* renamed from: b, reason: collision with root package name */
    public final vg1 f4652b = new vg1();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4655e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4656f = false;

    /* renamed from: c, reason: collision with root package name */
    public vh1 f4653c = new vh1(null);

    public fg1(py0 py0Var, dg1 dg1Var, String str) throws JSONException {
        this.f4651a = dg1Var;
        this.f4657g = str;
        eg1 eg1Var = dg1Var.f3932g;
        if (eg1Var == eg1.f4279t || eg1Var == eg1.f4280u) {
            WebView webView = dg1Var.f3927b;
            dh1 dh1Var = new dh1(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            dh1Var.f3577b = new wh1(webView);
            this.f4654d = dh1Var;
        } else {
            this.f4654d = new fh1(str, Collections.unmodifiableMap(dg1Var.f3929d));
        }
        this.f4654d.f();
        rg1.f8631c.f8632a.add(this);
        ch1 ch1Var = this.f4654d;
        WebView webViewA = ch1Var.a();
        String str2 = ch1Var.f3576a;
        JSONObject jSONObject = new JSONObject();
        gh1.c(jSONObject, "impressionOwner", (mg1) py0Var.f8176t);
        gh1.c(jSONObject, "mediaEventsOwner", (mg1) py0Var.f8177u);
        gh1.c(jSONObject, "creativeType", (gg1) py0Var.f8178v);
        gh1.c(jSONObject, "impressionType", (ig1) py0Var.f8179w);
        gh1.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(py0Var.s));
        xg1.a(webViewA, "init", jSONObject, str2);
    }

    @Override // com.google.android.gms.internal.ads.cg1
    public final void a(View view, hg1 hg1Var) {
        if (this.f4656f) {
            return;
        }
        this.f4652b.a(view, hg1Var);
    }

    @Override // com.google.android.gms.internal.ads.cg1
    public final void b() {
        if (this.f4656f) {
            return;
        }
        this.f4653c.clear();
        if (!this.f4656f) {
            this.f4652b.f9861a.clear();
        }
        this.f4656f = true;
        ch1 ch1Var = this.f4654d;
        xg1.a(ch1Var.a(), "finishSession", ch1Var.f3576a);
        rg1 rg1Var = rg1.f8631c;
        ArrayList arrayList = rg1Var.f8632a;
        ArrayList arrayList2 = rg1Var.f8633b;
        boolean z6 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z6 && arrayList2.size() <= 0) {
            yg1 yg1VarB = yg1.b();
            yg1VarB.getClass();
            oh1 oh1Var = oh1.f7759g;
            oh1Var.getClass();
            Handler handler = oh1.f7760i;
            if (handler != null) {
                handler.removeCallbacks(oh1.f7762k);
                oh1.f7760i = null;
            }
            oh1Var.f7763a.clear();
            oh1.h.post(new x(20, oh1Var));
            qg1 qg1Var = qg1.f8382v;
            qg1Var.s = false;
            qg1Var.f9277u = null;
            og1 og1Var = yg1VarB.f10975b;
            og1Var.f7750a.getContentResolver().unregisterContentObserver(og1Var);
        }
        this.f4654d.b();
        this.f4654d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.cg1
    public final void c(View view) {
        if (this.f4656f || ((View) this.f4653c.get()) == view) {
            return;
        }
        this.f4653c = new vh1(view);
        ch1 ch1Var = this.f4654d;
        ch1Var.getClass();
        ch1Var.f3578c = System.nanoTime();
        ch1Var.f3579d = 1;
        Collection<fg1> collectionUnmodifiableCollection = Collections.unmodifiableCollection(rg1.f8631c.f8632a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (fg1 fg1Var : collectionUnmodifiableCollection) {
            if (fg1Var != this && ((View) fg1Var.f4653c.get()) == view) {
                fg1Var.f4653c.clear();
            }
        }
    }

    public final void d() throws JSONException {
        if (this.f4655e || this.f4654d == null) {
            return;
        }
        this.f4655e = true;
        ArrayList arrayList = rg1.f8631c.f8633b;
        boolean z6 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z6) {
            yg1 yg1VarB = yg1.b();
            yg1VarB.getClass();
            qg1 qg1Var = qg1.f8382v;
            qg1Var.f9277u = yg1VarB;
            qg1Var.s = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z7 = runningAppProcessInfo.importance == 100 || qg1Var.b();
            qg1Var.f9276t = z7;
            qg1Var.a(z7);
            oh1.f7759g.getClass();
            oh1.b();
            og1 og1Var = yg1VarB.f10975b;
            og1Var.f7752c = og1Var.a();
            og1Var.b();
            og1Var.f7750a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, og1Var);
        }
        float f6 = yg1.b().f10974a;
        ch1 ch1Var = this.f4654d;
        xg1.a(ch1Var.a(), "setDeviceVolume", Float.valueOf(f6), ch1Var.f3576a);
        ch1 ch1Var2 = this.f4654d;
        Date date = pg1.f8065e.f8066a;
        ch1Var2.c(date != null ? (Date) date.clone() : null);
        this.f4654d.d(this, this.f4651a);
    }
}
