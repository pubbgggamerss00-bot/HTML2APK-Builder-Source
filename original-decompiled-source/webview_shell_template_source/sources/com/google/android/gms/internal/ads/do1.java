package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class do1 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f3980a;

    /* renamed from: b, reason: collision with root package name */
    public int f3981b = 0;

    /* renamed from: c, reason: collision with root package name */
    public co1 f3982c;

    public do1(int i6) {
        this.f3980a = new Object[i6 + i6];
    }

    public final void a(Object obj, Object obj2) {
        int i6 = this.f3981b + 1;
        Object[] objArr = this.f3980a;
        int length = objArr.length;
        int i7 = i6 + i6;
        if (i7 > length) {
            this.f3980a = Arrays.copyOf(objArr, me.o(length, i7));
        }
        en1.b(obj, obj2);
        Object[] objArr2 = this.f3980a;
        int i8 = this.f3981b;
        int i9 = i8 + i8;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f3981b = i8 + 1;
    }

    public final ip1 b() {
        co1 co1Var = this.f3982c;
        if (co1Var != null) {
            throw co1Var.a();
        }
        ip1 ip1VarE = ip1.e(this.f3981b, this.f3980a, this);
        co1 co1Var2 = this.f3982c;
        if (co1Var2 == null) {
            return ip1VarE;
        }
        throw co1Var2.a();
    }
}
