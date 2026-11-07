package s;

import s.s;

/* loaded from: classes.dex */
public final class b<T, V extends s> {

    /* renamed from: a, reason: collision with root package name */
    public final n2<T, V> f23652a;

    /* renamed from: b, reason: collision with root package name */
    public final T f23653b;

    /* renamed from: c, reason: collision with root package name */
    public final n<T, V> f23654c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f23655d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.x1 f23656e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f23657f;

    /* renamed from: g, reason: collision with root package name */
    public final l1<T> f23658g;

    /* renamed from: h, reason: collision with root package name */
    public final V f23659h;

    /* renamed from: i, reason: collision with root package name */
    public final V f23660i;

    /* renamed from: j, reason: collision with root package name */
    public final V f23661j;

    /* renamed from: k, reason: collision with root package name */
    public final V f23662k;

    @vg.e(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<T, V> f23663a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f23664b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T, V> bVar, T t3, tg.e<? super a> eVar) {
            super(1, eVar);
            this.f23663a = bVar;
            this.f23664b = t3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            return new a(this.f23663a, this.f23664b, eVar);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.f0> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            b<T, V> bVar = this.f23663a;
            b.b(bVar);
            Object objA = b.a(bVar, this.f23664b);
            bVar.f23654c.f23843b.setValue(objA);
            bVar.f23656e.setValue(objA);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object obj, n2 n2Var, Object obj2) {
        this.f23652a = n2Var;
        this.f23653b = obj2;
        n<T, V> nVar = new n<>(n2Var, obj, null, 60);
        this.f23654c = nVar;
        this.f23655d = bg.b.h(Boolean.FALSE);
        this.f23656e = bg.b.h(obj);
        this.f23657f = new v0();
        this.f23658g = new l1<>(obj2, 3);
        V v10 = nVar.f23844c;
        V v11 = v10 instanceof o ? d.f23699e : v10 instanceof p ? d.f23700f : v10 instanceof q ? d.f23701g : d.f23702h;
        kotlin.jvm.internal.r.c(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f23659h = v11;
        V v12 = nVar.f23844c;
        V v13 = v12 instanceof o ? d.f23695a : v12 instanceof p ? d.f23696b : v12 instanceof q ? d.f23697c : d.f23698d;
        kotlin.jvm.internal.r.c(v13, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f23660i = v13;
        this.f23661j = v11;
        this.f23662k = v13;
    }

    public static final Object a(b bVar, Object obj) {
        n2<T, V> n2Var = bVar.f23652a;
        V v10 = bVar.f23662k;
        V v11 = bVar.f23661j;
        if (!kotlin.jvm.internal.r.a(v11, bVar.f23659h) || !kotlin.jvm.internal.r.a(v10, bVar.f23660i)) {
            V vInvoke = n2Var.a().invoke(obj);
            int iB = vInvoke.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (vInvoke.a(i10) < v11.a(i10) || vInvoke.a(i10) > v10.a(i10)) {
                    vInvoke.e(jh.j.l(vInvoke.a(i10), v11.a(i10), v10.a(i10)), i10);
                    z10 = true;
                }
            }
            if (z10) {
                return n2Var.b().invoke(vInvoke);
            }
        }
        return obj;
    }

    public static final void b(b bVar) {
        n<T, V> nVar = bVar.f23654c;
        nVar.f23844c.d();
        nVar.f23845d = Long.MIN_VALUE;
        bVar.f23655d.setValue(Boolean.FALSE);
    }

    public static Object c(b bVar, Object obj, l lVar, eh.l lVar2, tg.e eVar, int i10) {
        if ((i10 & 2) != 0) {
            lVar = bVar.f23658g;
        }
        l lVar3 = lVar;
        T tInvoke = bVar.f23652a.b().invoke(bVar.f23654c.f23844c);
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        eh.l lVar4 = lVar2;
        Object objD = bVar.d();
        n2<T, V> n2Var = bVar.f23652a;
        return v0.a(bVar.f23657f, new s.a(bVar, tInvoke, new x1(lVar3, n2Var, objD, obj, n2Var.a().invoke(tInvoke)), bVar.f23654c.f23845d, lVar4, null), eVar);
    }

    public final T d() {
        return this.f23654c.f23843b.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f23655d.getValue()).booleanValue();
    }

    public final Object f(T t3, tg.e<? super pg.f0> eVar) {
        Object objA = v0.a(this.f23657f, new a(this, t3, null), eVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    public final Object g(vg.i iVar) {
        Object objA = v0.a(this.f23657f, new c(this, null), iVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }

    public /* synthetic */ b(Object obj, n2 n2Var, Object obj2, int i10) {
        this(obj, n2Var, (i10 & 4) != 0 ? null : obj2);
    }
}
