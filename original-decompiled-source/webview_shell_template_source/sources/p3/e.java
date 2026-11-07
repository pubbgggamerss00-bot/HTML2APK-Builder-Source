package p3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: u, reason: collision with root package name */
    public final transient int f14086u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f14087v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f14088w;

    public e(f fVar, int i6, int i7) {
        this.f14088w = fVar;
        this.f14086u = i6;
        this.f14087v = i7;
    }

    @Override // p3.b
    public final Object[] c() {
        return this.f14088w.c();
    }

    @Override // p3.b
    public final int d() {
        return this.f14088w.d() + this.f14086u;
    }

    @Override // p3.b
    public final int e() {
        return this.f14088w.d() + this.f14086u + this.f14087v;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        l.a(i6, this.f14087v);
        return this.f14088w.get(i6 + this.f14086u);
    }

    @Override // p3.f, java.util.List
    /* renamed from: h */
    public final f subList(int i6, int i7) {
        l.b(i6, i7, this.f14087v);
        int i8 = this.f14086u;
        return this.f14088w.subList(i6 + i8, i7 + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14087v;
    }
}
