package j2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u4 implements i2.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14914a;

    /* renamed from: b, reason: collision with root package name */
    public final List<u4> f14915b;

    /* renamed from: c, reason: collision with root package name */
    public Float f14916c = null;

    /* renamed from: d, reason: collision with root package name */
    public Float f14917d = null;

    /* renamed from: e, reason: collision with root package name */
    public q2.j f14918e = null;

    /* renamed from: f, reason: collision with root package name */
    public q2.j f14919f = null;

    public u4(ArrayList arrayList, int i10) {
        this.f14914a = i10;
        this.f14915b = arrayList;
    }

    @Override // i2.w1
    public final boolean U() {
        return this.f14915b.contains(this);
    }
}
