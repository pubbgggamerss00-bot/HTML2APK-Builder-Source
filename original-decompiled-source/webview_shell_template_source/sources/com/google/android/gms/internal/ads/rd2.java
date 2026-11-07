package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rd2 {

    /* renamed from: d, reason: collision with root package name */
    public static final rd2 f8613d = new qd2().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8614a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8615b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8616c;

    public /* synthetic */ rd2(qd2 qd2Var) {
        this.f8614a = qd2Var.f8359a;
        this.f8615b = qd2Var.f8360b;
        this.f8616c = qd2Var.f8361c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rd2.class != obj.getClass()) {
            return false;
        }
        rd2 rd2Var = (rd2) obj;
        return this.f8614a == rd2Var.f8614a && this.f8615b == rd2Var.f8615b && this.f8616c == rd2Var.f8616c;
    }

    public final int hashCode() {
        int i6 = (this.f8614a ? 1 : 0) << 2;
        boolean z6 = this.f8615b;
        return (z6 ? 1 : 0) + (z6 ? 1 : 0) + i6 + (this.f8616c ? 1 : 0);
    }
}
