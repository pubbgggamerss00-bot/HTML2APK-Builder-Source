package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xt1 implements lo1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10703a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10704b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final yw1 f10705c;

    /* renamed from: d, reason: collision with root package name */
    public jy1 f10706d;

    /* renamed from: e, reason: collision with root package name */
    public oj1 f10707e;

    /* renamed from: f, reason: collision with root package name */
    public zl1 f10708f;

    /* renamed from: g, reason: collision with root package name */
    public lo1 f10709g;
    public g72 h;

    /* renamed from: i, reason: collision with root package name */
    public um1 f10710i;

    /* renamed from: j, reason: collision with root package name */
    public a42 f10711j;

    /* renamed from: k, reason: collision with root package name */
    public lo1 f10712k;

    public xt1(Context context, yw1 yw1Var) {
        this.f10703a = context.getApplicationContext();
        this.f10705c = yw1Var;
    }

    public static final void l(lo1 lo1Var, o52 o52Var) {
        if (lo1Var != null) {
            lo1Var.d(o52Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) {
        y5.r(this.f10712k == null);
        Uri uri = os1Var.f7851a;
        String scheme = uri.getScheme();
        int i6 = j31.f5914a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f10703a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f10706d == null) {
                    jy1 jy1Var = new jy1(false);
                    this.f10706d = jy1Var;
                    k(jy1Var);
                }
                this.f10712k = this.f10706d;
            } else {
                if (this.f10707e == null) {
                    oj1 oj1Var = new oj1(context);
                    this.f10707e = oj1Var;
                    k(oj1Var);
                }
                this.f10712k = this.f10707e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f10707e == null) {
                oj1 oj1Var2 = new oj1(context);
                this.f10707e = oj1Var2;
                k(oj1Var2);
            }
            this.f10712k = this.f10707e;
        } else if ("content".equals(scheme)) {
            if (this.f10708f == null) {
                zl1 zl1Var = new zl1(context);
                this.f10708f = zl1Var;
                k(zl1Var);
            }
            this.f10712k = this.f10708f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            yw1 yw1Var = this.f10705c;
            if (zEquals) {
                if (this.f10709g == null) {
                    try {
                        lo1 lo1Var = (lo1) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f10709g = lo1Var;
                        k(lo1Var);
                    } catch (ClassNotFoundException unused) {
                        qs0.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e6) {
                        throw new RuntimeException("Error instantiating RTMP extension", e6);
                    }
                    if (this.f10709g == null) {
                        this.f10709g = yw1Var;
                    }
                }
                this.f10712k = this.f10709g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    g72 g72Var = new g72();
                    this.h = g72Var;
                    k(g72Var);
                }
                this.f10712k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.f10710i == null) {
                    um1 um1Var = new um1(false);
                    this.f10710i = um1Var;
                    k(um1Var);
                }
                this.f10712k = this.f10710i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f10711j == null) {
                    a42 a42Var = new a42(context);
                    this.f10711j = a42Var;
                    k(a42Var);
                }
                this.f10712k = this.f10711j;
            } else {
                this.f10712k = yw1Var;
            }
        }
        return this.f10712k.c(os1Var);
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void d(o52 o52Var) {
        o52Var.getClass();
        this.f10705c.d(o52Var);
        this.f10704b.add(o52Var);
        l(this.f10706d, o52Var);
        l(this.f10707e, o52Var);
        l(this.f10708f, o52Var);
        l(this.f10709g, o52Var);
        l(this.h, o52Var);
        l(this.f10710i, o52Var);
        l(this.f10711j, o52Var);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) {
        lo1 lo1Var = this.f10712k;
        lo1Var.getClass();
        return lo1Var.j(i6, i7, bArr);
    }

    public final void k(lo1 lo1Var) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f10704b;
            if (i6 >= arrayList.size()) {
                return;
            }
            lo1Var.d((o52) arrayList.get(i6));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        lo1 lo1Var = this.f10712k;
        if (lo1Var == null) {
            return null;
        }
        return lo1Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() {
        lo1 lo1Var = this.f10712k;
        if (lo1Var != null) {
            try {
                lo1Var.zzd();
            } finally {
                this.f10712k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Map zze() {
        lo1 lo1Var = this.f10712k;
        return lo1Var == null ? Collections.EMPTY_MAP : lo1Var.zze();
    }
}
