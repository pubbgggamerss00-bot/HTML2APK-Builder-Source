package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kh {

    /* renamed from: a, reason: collision with root package name */
    public final dg f6407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6408b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6409c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f6411e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f6410d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f6412f = new CountDownLatch(1);

    public kh(dg dgVar, String str, String str2, Class... clsArr) {
        this.f6407a = dgVar;
        this.f6408b = str;
        this.f6409c = str2;
        this.f6411e = clsArr;
        dgVar.f3898b.submit(new u(2, this));
    }
}
