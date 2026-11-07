package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ck1 implements r70, om0, zb0, nq, nx0, ac0, p41, ab1, zr1, eq0, em1 {

    /* renamed from: u, reason: collision with root package name */
    public static ck1 f3612u;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f3613t;

    public /* synthetic */ ck1(int i6, Object obj) {
        this.s = i6;
        this.f3613t = obj;
    }

    public static final ck1 e(Context context) {
        ck1 ck1Var;
        synchronized (ck1.class) {
            try {
                if (f3612u == null) {
                    f3612u = new ck1(context);
                }
                ck1Var = f3612u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ck1Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        ((de1) this.f3613t).zzi();
    }

    @Override // com.google.android.gms.internal.ads.nx0
    public c5.a b(r30 r30Var) {
        dx0 dx0Var = ((ox0) this.f3613t).f7883b;
        String str = r30Var.f8530z;
        synchronized (dx0Var.f3318b) {
            try {
                int i6 = dx0Var.h;
                if (i6 != 1 && i6 != 3) {
                    return bs1.l(new ix0(2));
                }
                if (dx0Var.f3319c) {
                    return dx0Var.f3317a;
                }
                dx0Var.h = 3;
                dx0Var.f3319c = true;
                dx0Var.f4057g = str;
                dx0Var.f3322f.checkAvailabilityAndConnect();
                o70 o70Var = dx0Var.f3317a;
                o70Var.s.addListener(new yh(10, dx0Var), i70.f5592g);
                return dx0Var.f3317a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ab1
    public fk0 d(za1 za1Var) {
        return ((y91) this.f3613t).b(za1Var);
    }

    public void f() {
        synchronized (ck1.class) {
            ((yj1) this.f3613t).b("vendor_scoped_gpid_v2_id");
            ((yj1) this.f3613t).b("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.internal.ads.p41
    public void g(ti0 ti0Var) {
        synchronized (((wv0) this.f3613t)) {
            ((wv0) this.f3613t).f10279u = ti0Var.f9293f;
            ti0Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.nq, com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public JSONObject mo7zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nq
    public JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nq
    public void zzc() {
        fp0 fp0Var = ((vr0) this.f3613t).f9929v;
        if (fp0Var != null) {
            synchronized (fp0Var) {
                fp0Var.f4750l.k(NativeCustomFormatAd.ASSET_NAME_VIDEO);
            }
        }
    }

    public /* synthetic */ ck1(xc2 xc2Var, Object obj, int i6) {
        this.s = i6;
        this.f3613t = obj;
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return Boolean.valueOf(((ob2) this.f3613t).R);
    }

    public ck1(Context context) {
        this.s = 0;
        if (yj1.f11008c == null) {
            yj1.f11008c = new yj1(context);
        }
        this.f3613t = yj1.f11008c;
        xj1.d(context);
    }

    @Override // com.google.android.gms.internal.ads.ac0, com.google.android.gms.internal.ads.p41
    /* renamed from: zza, reason: collision with other method in class */
    public void mo1zza() {
        switch (this.s) {
            case 9:
                ((xa0) this.f3613t).zzaa();
                return;
            default:
                synchronized (((wv0) this.f3613t)) {
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r70, com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        int i6 = this.s;
        Object obj2 = this.f3613t;
        switch (i6) {
            case 1:
                zze.zza("Releasing engine reference.");
                ((zw) obj2).f11591w.h();
                break;
            case 3:
                ((ul0) obj).c((zzu) obj2);
                break;
            case 4:
                ((yl0) obj).k((r30) obj2);
                break;
            case 15:
                int i7 = gb2.f4973n0;
                ((bs) obj).m(((ic2) obj2).f5666f);
                break;
            case 17:
                ((yc2) obj).e((no) obj2);
                break;
            default:
                n90 n90Var = (n90) obj2;
                ((yc2) obj).l(n90Var);
                int i8 = n90Var.f7347a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        ((n70) this.f3613t).c();
    }

    @Override // com.google.android.gms.internal.ads.nq
    public void c(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
    }
}
