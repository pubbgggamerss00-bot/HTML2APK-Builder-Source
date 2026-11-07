package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qr0 {

    /* renamed from: a, reason: collision with root package name */
    public final ec1 f8445a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f8446b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0 f8447c;

    /* renamed from: d, reason: collision with root package name */
    public final ms0 f8448d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8449e;

    /* renamed from: f, reason: collision with root package name */
    public final cu0 f8450f;

    /* renamed from: g, reason: collision with root package name */
    public final cf1 f8451g;
    public final dz0 h;

    public qr0(ec1 ec1Var, Executor executor, ct0 ct0Var, Context context, cu0 cu0Var, cf1 cf1Var, dz0 dz0Var, ms0 ms0Var) {
        this.f8445a = ec1Var;
        this.f8446b = executor;
        this.f8447c = ct0Var;
        this.f8449e = context;
        this.f8450f = cu0Var;
        this.f8451g = cf1Var;
        this.h = dz0Var;
        this.f8448d = ms0Var;
    }

    public static final void b(xa0 xa0Var) {
        xa0Var.Z("/videoClicked", xt.h);
        eb0 eb0VarZzN = xa0Var.zzN();
        synchronized (eb0VarZzN.f4193v) {
            eb0VarZzN.J = true;
        }
        xa0Var.Z("/getNativeAdViewSignals", xt.s);
        xa0Var.Z("/getNativeClickMeta", xt.f10684t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(xa0 xa0Var) {
        b(xa0Var);
        xa0Var.Z("/video", xt.f10677l);
        xa0Var.Z("/videoMeta", xt.f10678m);
        xa0Var.Z("/precache", new t90());
        xa0Var.Z("/delayPageLoaded", xt.f10681p);
        xa0Var.Z("/instrument", xt.f10679n);
        xa0Var.Z("/log", xt.f10673g);
        xa0Var.Z("/click", new nt(null, 0 == true ? 1 : 0));
        if (this.f8445a.f4207b != null) {
            eb0 eb0VarZzN = xa0Var.zzN();
            synchronized (eb0VarZzN.f4193v) {
                eb0VarZzN.L = true;
            }
            xa0Var.Z("/open", new iu(null, null, null, null, null));
        } else {
            eb0 eb0VarZzN2 = xa0Var.zzN();
            synchronized (eb0VarZzN2.f4193v) {
                eb0VarZzN2.L = false;
            }
        }
        if (zzv.zzo().e(xa0Var.getContext())) {
            Map map = new HashMap();
            if (xa0Var.d() != null) {
                map = xa0Var.d().f9213w0;
            }
            xa0Var.Z("/logScionEvent", new cu(xa0Var.getContext(), map));
        }
    }
}
