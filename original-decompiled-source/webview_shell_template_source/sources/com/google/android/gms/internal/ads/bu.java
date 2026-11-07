package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3287a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3288b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3289c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3290d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z6) {
        if (!this.f3290d.get()) {
            return z6;
        }
        return this.f3287a;
    }
}
