package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3630b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3631c;

    public co1(Object obj, Object obj2, Object obj3) {
        this.f3629a = obj;
        this.f3630b = obj2;
        this.f3631c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f3629a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f3630b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f3631c);
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbA.append(strValueOf3);
        sbA.append("=");
        sbA.append(strValueOf4);
        return new IllegalArgumentException(sbA.toString());
    }
}
