package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qm0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f8405a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8406b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f8407c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8408d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f8409e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f8410f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f8411g = new HashSet();
    public final HashSet h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f8412i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f8413j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f8414k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f8415l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f8416m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f8417n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public ba1 f8418o;

    public final void a(rk0 rk0Var, Executor executor) {
        this.f8412i.add(new kn0(rk0Var, executor));
    }

    public final void b(yl0 yl0Var, Executor executor) {
        this.f8406b.add(new kn0(yl0Var, executor));
    }

    public final void c(AppEventListener appEventListener, Executor executor) {
        this.f8414k.add(new kn0(appEventListener, executor));
    }

    public final void d(on0 on0Var, Executor executor) {
        this.f8408d.add(new kn0(on0Var, executor));
    }
}
