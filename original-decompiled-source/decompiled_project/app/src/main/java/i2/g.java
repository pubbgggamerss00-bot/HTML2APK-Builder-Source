package i2;

import i2.e0;

/* loaded from: classes.dex */
public interface g {

    /* renamed from: o, reason: collision with root package name */
    public static final a f13861o = a.f13862a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f13862a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final e0.a f13863b = e0.V;

        /* renamed from: c, reason: collision with root package name */
        public static final e f13864c = e.f13873a;

        /* renamed from: d, reason: collision with root package name */
        public static final c f13865d = c.f13871a;

        /* renamed from: e, reason: collision with root package name */
        public static final d f13866e = d.f13872a;

        /* renamed from: f, reason: collision with root package name */
        public static final b f13867f = b.f13870a;

        /* renamed from: g, reason: collision with root package name */
        public static final C0128a f13868g = C0128a.f13869a;

        /* renamed from: i2.g$a$a, reason: collision with other inner class name */
        public static final class C0128a extends kotlin.jvm.internal.s implements eh.p<g, Integer, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0128a f13869a = new C0128a(2);

            @Override // eh.p
            public final pg.f0 invoke(g gVar, Integer num) {
                num.intValue();
                gVar.getClass();
                return pg.f0.f21461a;
            }
        }

        public static final class b extends kotlin.jvm.internal.s implements eh.p<g, g2.l0, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f13870a = new b(2);

            @Override // eh.p
            public final pg.f0 invoke(g gVar, g2.l0 l0Var) {
                gVar.l(l0Var);
                return pg.f0.f21461a;
            }
        }

        public static final class c extends kotlin.jvm.internal.s implements eh.p<g, androidx.compose.ui.d, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f13871a = new c(2);

            @Override // eh.p
            public final pg.f0 invoke(g gVar, androidx.compose.ui.d dVar) {
                gVar.c(dVar);
                return pg.f0.f21461a;
            }
        }

        public static final class d extends kotlin.jvm.internal.s implements eh.p<g, x0.z, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final d f13872a = new d(2);

            @Override // eh.p
            public final pg.f0 invoke(g gVar, x0.z zVar) {
                gVar.i(zVar);
                return pg.f0.f21461a;
            }
        }

        public static final class e extends kotlin.jvm.internal.s implements eh.a<e0> {

            /* renamed from: a, reason: collision with root package name */
            public static final e f13873a = new e(0);

            @Override // eh.a
            public final e0 invoke() {
                return new e0(2);
            }
        }

        public static e0.a a() {
            return f13863b;
        }

        public static C0128a b() {
            return f13868g;
        }

        public static b c() {
            return f13867f;
        }

        public static c d() {
            return f13865d;
        }

        public static d e() {
            return f13866e;
        }
    }

    void c(androidx.compose.ui.d dVar);

    void i(x0.z zVar);

    void l(g2.l0 l0Var);
}
