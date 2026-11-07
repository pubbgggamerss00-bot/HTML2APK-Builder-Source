package d0;

import d0.o;

/* loaded from: classes.dex */
public final class a2<T> {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b<g<T>> f7051a = new z0.b<>(new g[16]);

    /* renamed from: b, reason: collision with root package name */
    public int f7052b;

    /* renamed from: c, reason: collision with root package name */
    public g<? extends T> f7053c;

    public final void a(int i10, o.a aVar) {
        if (i10 < 0) {
            y.c.a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        g gVar = new g(this.f7052b, i10, aVar);
        this.f7052b += i10;
        this.f7051a.b(gVar);
    }

    public final g<T> b(int i10) {
        if (i10 < 0 || i10 >= this.f7052b) {
            StringBuilder sbB = p.i0.b(i10, "Index ", ", size ");
            sbB.append(this.f7052b);
            y.c.e(sbB.toString());
        }
        g<? extends T> gVar = this.f7053c;
        if (gVar != null) {
            int i11 = gVar.f7131a;
            if (i10 < gVar.f7132b + i11 && i11 <= i10) {
                return gVar;
            }
        }
        z0.b<g<T>> bVar = this.f7051a;
        g gVar2 = (g<? extends T>) bVar.f34700a[h.b(i10, bVar)];
        this.f7053c = gVar2;
        return gVar2;
    }
}
