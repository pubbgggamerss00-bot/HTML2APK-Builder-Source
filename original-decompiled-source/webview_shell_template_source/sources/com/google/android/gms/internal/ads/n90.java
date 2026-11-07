package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n90 {

    /* renamed from: d, reason: collision with root package name */
    public static final n90 f7346d = new n90(1.0f, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f7347a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7348b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7349c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public n90(float f6, int i6, int i7) {
        this.f7347a = i6;
        this.f7348b = i7;
        this.f7349c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n90) {
            n90 n90Var = (n90) obj;
            if (this.f7347a == n90Var.f7347a && this.f7348b == n90Var.f7348b && this.f7349c == n90Var.f7349c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f7349c) + ((((this.f7347a + 217) * 31) + this.f7348b) * 31);
    }
}
