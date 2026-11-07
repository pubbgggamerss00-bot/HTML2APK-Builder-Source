package c9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5085b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5086c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5087d;

    public e(float[] fArr, int i10, float f10, boolean z10) {
        this.f5084a = fArr;
        this.f5085b = i10;
        this.f5086c = f10;
        this.f5087d = z10;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f5085b, "InkMark(points=", Arrays.toString(this.f5084a), ", color=", ", width=");
        sbA.append(this.f5086c);
        sbA.append(", highlighter=");
        sbA.append(this.f5087d);
        sbA.append(")");
        return sbA.toString();
    }
}
