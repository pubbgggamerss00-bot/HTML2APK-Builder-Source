package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.ump.UserMessagingPlatform;
import com.google.android.ump.a;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n implements com.google.android.ump.a {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11831a;

    /* renamed from: b, reason: collision with root package name */
    public final w f11832b;

    /* renamed from: c, reason: collision with root package name */
    public final j f11833c;

    /* renamed from: d, reason: collision with root package name */
    public final s f11834d;

    /* renamed from: e, reason: collision with root package name */
    public final v f11835e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f11836f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f11837g;
    public u h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f11838i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f11839j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f11840k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f11841l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public boolean f11842m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11843n = false;

    public n(Application application, w wVar, j jVar, s sVar, v vVar, g0 g0Var) {
        this.f11831a = application;
        this.f11832b = wVar;
        this.f11833c = jVar;
        this.f11834d = sVar;
        this.f11835e = vVar;
        this.f11836f = g0Var;
    }

    @Override // com.google.android.ump.a
    public final void a(Activity activity, a.InterfaceC0040a interfaceC0040a) {
        m0.a();
        ((Queue) this.f11836f.h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.f11838i.compareAndSet(false, true)) {
            f2 f2Var = new f2(3, true != this.f11842m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(f2Var);
            interfaceC0040a.a(f2Var.a());
            return;
        }
        u uVar = this.h;
        y yVar = uVar.f11909t;
        Objects.requireNonNull(yVar);
        uVar.s.post(new com.google.android.gms.ads.internal.util.a(3, yVar));
        l lVar = new l(this, activity);
        this.f11831a.registerActivityLifecycleCallbacks(lVar);
        this.f11841l.set(lVar);
        this.f11832b.f11923a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            f2 f2Var2 = new f2(3, "Activity with null windows is passed in.");
            d(f2Var2);
            interfaceC0040a.a(f2Var2.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        u0.q0.a(window, false);
        this.f11840k.set(interfaceC0040a);
        dialog.show();
        this.f11837g = dialog;
        this.h.a("UMP_messagePresented", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        d(null);
    }

    public final void b(UserMessagingPlatform.b bVar, UserMessagingPlatform.a aVar) {
        v vVar = this.f11835e;
        w wVar = (w) ((y8) vVar.s).zzb();
        Handler handler = m0.f11819a;
        l2.a(handler);
        this.h = new u(wVar, handler, ((z) vVar.f11913t).zzb());
        boolean z6 = this.f11842m;
        g0 g0Var = this.f11836f;
        if (!z6) {
            ((Queue) g0Var.f11754j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        u uVar = this.h;
        uVar.setBackgroundColor(0);
        uVar.getSettings().setJavaScriptEnabled(true);
        uVar.getSettings().setAllowFileAccess(false);
        uVar.getSettings().setAllowContentAccess(false);
        uVar.setWebViewClient(new t(uVar));
        if (!this.f11842m) {
            g0Var.a((Queue) g0Var.f11754j.get(), 3, 2, null);
        }
        this.f11839j.set(new m(bVar, aVar));
        u uVar2 = this.h;
        s sVar = this.f11834d;
        uVar2.loadDataWithBaseURL(sVar.f11881a, sVar.f11882b, "text/html", "UTF-8", null);
        handler.postDelayed(new com.google.android.gms.ads.internal.util.a(1, this), 10000L);
    }

    public final void c(f2 f2Var) {
        m mVar = (m) this.f11839j.getAndSet(null);
        if (mVar == null) {
            return;
        }
        if (!this.f11842m) {
            String message = f2Var.getMessage();
            boolean z6 = this.f11843n;
            g0 g0Var = this.f11836f;
            if (z6) {
                g0Var.a((Queue) g0Var.f11753i.get(), 10, 11, message);
            } else {
                g0Var.a((Queue) g0Var.f11752g.get(), 4, 5, message);
            }
        }
        mVar.c(f2Var.a());
    }

    public final void d(f2 f2Var) {
        if (this.f11842m) {
            return;
        }
        String message = f2Var == null ? null : f2Var.getMessage();
        boolean z6 = this.f11843n;
        g0 g0Var = this.f11836f;
        if (z6) {
            g0Var.a((Queue) g0Var.f11753i.get(), 10, 11, message);
        } else {
            g0Var.a((Queue) g0Var.h.get(), 6, 7, message);
        }
    }
}
