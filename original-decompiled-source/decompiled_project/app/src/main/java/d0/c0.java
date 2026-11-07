package d0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.d f7070a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f7071b;

    /* renamed from: c, reason: collision with root package name */
    public final p.l0<Object, a> f7072c = p.w0.b();

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f7073a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f7074b;

        /* renamed from: c, reason: collision with root package name */
        public int f7075c;

        /* renamed from: d, reason: collision with root package name */
        public f1.b f7076d;

        public a(int i10, Object obj, Object obj2) {
            this.f7073a = obj;
            this.f7074b = obj2;
            this.f7075c = i10;
        }
    }

    public c0(g1.d dVar, n0 n0Var) {
        this.f7070a = dVar;
        this.f7071b = n0Var;
    }

    public final eh.p<x0.j, Integer, pg.f0> a(int i10, Object obj, Object obj2) {
        p.l0<Object, a> l0Var = this.f7072c;
        a aVarD = l0Var.d(obj);
        if (aVarD != null && aVarD.f7075c == i10 && kotlin.jvm.internal.r.a(aVarD.f7074b, obj2)) {
            f1.b bVar = aVarD.f7076d;
            if (bVar != null) {
                return bVar;
            }
            f1.b bVar2 = new f1.b(1403994769, true, new b0(c0.this, aVarD));
            aVarD.f7076d = bVar2;
            return bVar2;
        }
        a aVar = new a(i10, obj, obj2);
        l0Var.l(obj, aVar);
        f1.b bVar3 = aVar.f7076d;
        if (bVar3 != null) {
            return bVar3;
        }
        f1.b bVar4 = new f1.b(1403994769, true, new b0(this, aVar));
        aVar.f7076d = bVar4;
        return bVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarD = this.f7072c.d(obj);
        if (aVarD != null) {
            return aVarD.f7074b;
        }
        g0 g0Var = (g0) this.f7071b.invoke();
        int iC = g0Var.c(obj);
        if (iC != -1) {
            return g0Var.e(iC);
        }
        return null;
    }
}
