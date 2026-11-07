package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mx1 {

    /* renamed from: a, reason: collision with root package name */
    public final jx1 f7240a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7241b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7242c;

    public /* synthetic */ mx1(jx1 jx1Var, List list, Integer num) {
        this.f7240a = jx1Var;
        this.f7241b = list;
        this.f7242c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mx1)) {
            return false;
        }
        mx1 mx1Var = (mx1) obj;
        return this.f7240a.equals(mx1Var.f7240a) && this.f7241b.equals(mx1Var.f7241b) && Objects.equals(this.f7242c, mx1Var.f7242c);
    }

    public final int hashCode() {
        return Objects.hash(this.f7240a, this.f7241b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f7240a, this.f7241b, this.f7242c);
    }
}
