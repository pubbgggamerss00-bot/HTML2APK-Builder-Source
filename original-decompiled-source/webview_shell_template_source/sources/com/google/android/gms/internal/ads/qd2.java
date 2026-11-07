package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qd2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8359a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8361c;

    public final rd2 a() {
        if (this.f8359a || !(this.f8360b || this.f8361c)) {
            return new rd2(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
