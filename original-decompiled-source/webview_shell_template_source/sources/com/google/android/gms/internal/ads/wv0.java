package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class wv0 implements NativeAd.OnNativeAdLoadedListener, zr1, jm0 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10278t;

    /* renamed from: u, reason: collision with root package name */
    public Object f10279u;

    public wv0(s41 s41Var, String str) {
        this.s = s41Var;
        this.f10278t = str;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2a(Object obj) {
        de1 de1Var = (de1) this.s;
        de1Var.s(((zzt) obj) == zzt.SUCCESS);
        he1 he1Var = (he1) this.f10278t;
        if (he1Var == null) {
            ((cf1) this.f10279u).f3558f.b(de1Var.zzm());
        } else {
            he1Var.a(de1Var);
            he1Var.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(vb1 vb1Var, tb1 tb1Var, int i6, d01 d01Var, long j6) {
        String strGroup;
        bu0 bu0VarA = ((cu0) this.f10279u).a();
        bu0VarA.a("gqi", vb1Var.f9774b);
        bu0VarA.b(tb1Var);
        bu0VarA.a("action", "adapter_status");
        bu0VarA.a("adapter_l", String.valueOf(j6));
        bu0VarA.a("sc", Integer.toString(i6));
        kt0 kt0Var = null;
        if (d01Var != null) {
            bu0VarA.a("arec", Integer.toString(d01Var.f3708t.zza));
            oc1 oc1Var = (oc1) this.s;
            String message = d01Var.getMessage();
            Pattern pattern = oc1Var.f7704a;
            if (pattern == null || message == null) {
                strGroup = null;
                if (strGroup != null) {
                    bu0VarA.a("areec", strGroup);
                }
            } else {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    strGroup = matcher.group();
                }
                if (strGroup != null) {
                }
            }
        }
        lt0 lt0Var = (lt0) this.f10278t;
        Iterator it = tb1Var.f9206t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kt0 kt0VarA = lt0Var.a((String) it.next());
            if (kt0VarA != null) {
                kt0Var = kt0VarA;
                break;
            }
        }
        if (kt0Var != null) {
            bu0VarA.a("ancn", kt0Var.f6487a);
            n00 n00Var = kt0Var.f6488b;
            if (n00Var != null) {
                bu0VarA.a("adapter_v", n00Var.toString());
            }
            n00 n00Var2 = kt0Var.f6489c;
            if (n00Var2 != null) {
                bu0VarA.a("adapter_sv", n00Var2.toString());
            }
        }
        bu0VarA.c();
    }

    public synchronized void c(zzm zzmVar, int i6) {
        this.f10279u = null;
        q41 q41Var = new q41(i6);
        ck1 ck1Var = new ck1(10, this);
        ((s41) this.s).a(zzmVar, (String) this.f10278t, q41Var, ck1Var);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        de1 de1Var = (de1) this.s;
        de1Var.s(false);
        he1 he1Var = (he1) this.f10278t;
        if (he1Var == null) {
            ((cf1) this.f10279u).f3558f.b(de1Var.zzm());
        } else {
            he1Var.a(de1Var);
            he1Var.h();
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        ((dw0) this.s).i1((String) this.f10278t, (String) this.f10279u, nativeAd);
    }

    @Override // com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        ((th2) obj).f(0, ((sh2) this.s).f8938a, (fh2) this.f10278t, (lh2) this.f10279u);
    }

    public wv0(cf1 cf1Var, de1 de1Var, he1 he1Var) {
        this.s = de1Var;
        this.f10278t = he1Var;
        this.f10279u = cf1Var;
    }

    public /* synthetic */ wv0(Object obj, Object obj2, Object obj3) {
        this.s = obj;
        this.f10278t = obj2;
        this.f10279u = obj3;
    }

    public wv0() {
        this.f10278t = new ArrayDeque();
        this.f10279u = null;
        this.s = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
}
