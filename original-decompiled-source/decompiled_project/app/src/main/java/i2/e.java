package i2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13804a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f13805b = b.f13807a;

    /* renamed from: c, reason: collision with root package name */
    public static final c f13806c = c.f13808a;

    public static final class a implements h2.h {
        @Override // h2.h
        public final <T> T y(h2.c<T> cVar) {
            return cVar.f12221a.invoke();
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<i2.c, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13807a = new b(1);

        @Override // eh.l
        public final pg.f0 invoke(i2.c cVar) {
            i2.c cVar2 = cVar;
            cVar2.f13774r = true;
            s.a(cVar2);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<i2.c, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13808a = new c(1);

        @Override // eh.l
        public final pg.f0 invoke(i2.c cVar) {
            cVar.V1();
            return pg.f0.f21461a;
        }
    }

    public static final boolean a(i2.c cVar) {
        l2 l2Var = k.f(cVar).I.f13792d;
        kotlin.jvm.internal.r.c(l2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return l2Var.f13945q;
    }
}
