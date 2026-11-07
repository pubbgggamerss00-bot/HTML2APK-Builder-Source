package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bt0 {

    /* renamed from: a, reason: collision with root package name */
    public final nk0 f3270a;

    /* renamed from: b, reason: collision with root package name */
    public final nn0 f3271b;

    /* renamed from: c, reason: collision with root package name */
    public final fl0 f3272c;

    /* renamed from: d, reason: collision with root package name */
    public final ml0 f3273d;

    /* renamed from: e, reason: collision with root package name */
    public final rl0 f3274e;

    /* renamed from: f, reason: collision with root package name */
    public final gm0 f3275f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f3276g;
    public final ln0 h;

    /* renamed from: i, reason: collision with root package name */
    public final lg0 f3277i;

    /* renamed from: j, reason: collision with root package name */
    public final zzb f3278j;

    /* renamed from: k, reason: collision with root package name */
    public final r50 f3279k;

    /* renamed from: l, reason: collision with root package name */
    public final mf f3280l;

    /* renamed from: m, reason: collision with root package name */
    public final cm0 f3281m;

    /* renamed from: n, reason: collision with root package name */
    public final dz0 f3282n;

    /* renamed from: o, reason: collision with root package name */
    public final cf1 f3283o;

    /* renamed from: p, reason: collision with root package name */
    public final cu0 f3284p;

    /* renamed from: q, reason: collision with root package name */
    public final vf0 f3285q;

    /* renamed from: r, reason: collision with root package name */
    public final it0 f3286r;

    public bt0(nk0 nk0Var, fl0 fl0Var, ml0 ml0Var, rl0 rl0Var, gm0 gm0Var, Executor executor, ln0 ln0Var, lg0 lg0Var, zzb zzbVar, r50 r50Var, mf mfVar, cm0 cm0Var, dz0 dz0Var, cf1 cf1Var, cu0 cu0Var, nn0 nn0Var, vf0 vf0Var, it0 it0Var) {
        this.f3270a = nk0Var;
        this.f3272c = fl0Var;
        this.f3273d = ml0Var;
        this.f3274e = rl0Var;
        this.f3275f = gm0Var;
        this.f3276g = executor;
        this.h = ln0Var;
        this.f3277i = lg0Var;
        this.f3278j = zzbVar;
        this.f3279k = r50Var;
        this.f3280l = mfVar;
        this.f3281m = cm0Var;
        this.f3282n = dz0Var;
        this.f3283o = cf1Var;
        this.f3284p = cu0Var;
        this.f3271b = nn0Var;
        this.f3285q = vf0Var;
        this.f3286r = it0Var;
    }

    public static final o70 b(xa0 xa0Var, String str, String str2, Bundle bundle) {
        if (((Boolean) zzbe.zzc().a(zn.f11437m2)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-load-html-start", bundle);
        }
        o70 o70Var = new o70();
        xa0Var.zzN().f4196y = new lo(4, bundle, o70Var);
        xa0Var.K(str, str2);
        return o70Var;
    }

    public final void a(xa0 xa0Var, boolean z6, bu buVar, Bundle bundle) {
        ff ffVar;
        nn nnVar = zn.f11437m2;
        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f("rendering-configure-webview-start", bundle);
        }
        xa0Var.zzN().j(new zza() { // from class: com.google.android.gms.internal.ads.xs0
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.s.f3270a.onAdClicked();
            }
        }, this.f3273d, this.f3274e, new ht() { // from class: com.google.android.gms.internal.ads.ys0
            @Override // com.google.android.gms.internal.ads.ht
            public final void a(String str, String str2) {
                this.s.f3275f.a(str, str2);
            }
        }, new cs0(1, this), z6, buVar, this.f3278j, new xj1(13, this), this.f3279k, this.f3282n, this.f3283o, this.f3284p, null, this.f3271b, null, null, null, this.f3285q);
        xa0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zs0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                bt0 bt0Var = this.s;
                if (((Boolean) zzbe.zzc().a(zn.T9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    bt0Var.f3286r.f5841a = motionEvent;
                }
                bt0Var.f3278j.zza();
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        xa0Var.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.at0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.s.f3278j.zza();
            }
        });
        if (((Boolean) zzbe.zzc().a(zn.K2)).booleanValue() && (ffVar = this.f3280l.f7110b) != null) {
            ffVar.zzo(xa0Var.zzF());
        }
        ln0 ln0Var = this.h;
        Executor executor = this.f3276g;
        ln0Var.l0(xa0Var, executor);
        ln0Var.l0(new or0(xa0Var, 1), executor);
        ln0Var.p0(xa0Var.zzF());
        xa0Var.Z("/trackActiveViewUnit", new wo0(this, xa0Var));
        lg0 lg0Var = this.f3277i;
        lg0Var.getClass();
        lg0Var.B = new WeakReference(xa0Var);
        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f("rendering-configure-webview-end", bundle);
        }
    }
}
