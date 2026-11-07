package p3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: u, reason: collision with root package name */
    public final transient f f14085u;

    public d(f fVar) {
        this.f14085u = fVar;
    }

    @Override // p3.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14085u.contains(obj);
    }

    @Override // p3.f
    public final f g() {
        return this.f14085u;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        f fVar = this.f14085u;
        l.a(i6, fVar.size());
        return fVar.get((fVar.size() - 1) - i6);
    }

    @Override // p3.f, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final f subList(int i6, int i7) {
        f fVar = this.f14085u;
        l.b(i6, i7, fVar.size());
        return fVar.subList(fVar.size() - i7, fVar.size() - i6).g();
    }

    @Override // p3.f, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f14085u.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p3.f, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f14085u.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14085u.size();
    }
}
