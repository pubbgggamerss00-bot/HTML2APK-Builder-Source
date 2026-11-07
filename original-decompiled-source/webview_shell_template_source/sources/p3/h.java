package p3;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: w, reason: collision with root package name */
    public static final h f14090w = new h(new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    public final transient Object[] f14091u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f14092v;

    public h(Object[] objArr, int i6) {
        this.f14091u = objArr;
        this.f14092v = i6;
    }

    @Override // p3.b
    public final Object[] c() {
        return this.f14091u;
    }

    @Override // p3.b
    public final int d() {
        return 0;
    }

    @Override // p3.b
    public final int e() {
        return this.f14092v;
    }

    @Override // p3.f, p3.b
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f14091u;
        int i6 = this.f14092v;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return i6;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        l.a(i6, this.f14092v);
        Object obj = this.f14091u[i6];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14092v;
    }
}
