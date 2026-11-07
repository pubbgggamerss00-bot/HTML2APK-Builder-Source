package f1;

import eh.p;
import eh.q;
import eh.r;
import eh.s;
import eh.t;
import eh.u;
import eh.v;
import eh.w;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import pg.f0;
import x0.g2;
import x0.h2;

/* loaded from: classes.dex */
public final class b implements p, q, r, s, t, u, v, w, eh.b, eh.c, eh.e, eh.f, eh.g, eh.h, eh.i, eh.j, eh.k, eh.m, eh.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f8777a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8778b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8779c;

    /* renamed from: d, reason: collision with root package name */
    public g2 f8780d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f8781e;

    public /* synthetic */ class a extends kotlin.jvm.internal.a implements p<x0.j, Integer, f0> {
        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            int iIntValue = num.intValue();
            ((b) this.f16308a).c(iIntValue, jVar);
            return f0.f21461a;
        }
    }

    /* renamed from: f1.b$b, reason: collision with other inner class name */
    public static final class C0093b extends kotlin.jvm.internal.s implements p<x0.j, Integer, f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f8783b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f8784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0093b(Object obj, int i10) {
            super(2);
            this.f8783b = obj;
            this.f8784c = i10;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f8784c) | 1;
            b.this.a(iN, this.f8783b, jVar);
            return f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements p<x0.j, Integer, f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f8786b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f8787c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f8788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, Object obj2, int i10) {
            super(2);
            this.f8786b = obj;
            this.f8787c = obj2;
            this.f8788d = i10;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f8788d) | 1;
            b.this.e(this.f8786b, this.f8787c, jVar, iN);
            return f0.f21461a;
        }
    }

    public b(int i10, boolean z10, Object obj) {
        this.f8777a = i10;
        this.f8778b = z10;
        this.f8779c = obj;
    }

    public final Object a(int i10, Object obj, x0.j jVar) {
        x0.k kVarP = jVar.p(this.f8777a);
        g(kVarP);
        int iA = kVarP.K(this) ? f1.c.a(2, 1) : f1.c.a(1, 1);
        Object obj2 = this.f8779c;
        kotlin.jvm.internal.r.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        m0.b(3, obj2);
        Object objB = ((q) obj2).b(obj, kVarP, Integer.valueOf(iA | i10));
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new C0093b(obj, i10);
        }
        return objB;
    }

    @Override // eh.q
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return a(((Number) obj3).intValue(), obj, (x0.j) obj2);
    }

    public final Object c(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(this.f8777a);
        g(kVarP);
        int iA = i10 | (kVarP.K(this) ? f1.c.a(2, 0) : f1.c.a(1, 0));
        Object obj = this.f8779c;
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        m0.b(2, obj);
        Object objInvoke = ((p) obj).invoke(kVarP, Integer.valueOf(iA));
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(2, this, b.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object e(Object obj, Object obj2, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(this.f8777a);
        g(kVarP);
        int iA = kVarP.K(this) ? f1.c.a(2, 2) : f1.c.a(1, 2);
        Object obj3 = this.f8779c;
        kotlin.jvm.internal.r.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        m0.b(4, obj3);
        Object objF = ((r) obj3).f(obj, obj2, kVarP, Integer.valueOf(iA | i10));
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c(obj, obj2, i10);
        }
        return objF;
    }

    @Override // eh.r
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (x0.j) obj3, ((Number) obj4).intValue());
    }

    public final void g(x0.j jVar) {
        h2 h2VarB;
        if (!this.f8778b || (h2VarB = jVar.b()) == null) {
            return;
        }
        jVar.I(h2VarB);
        if (f1.c.c(this.f8780d, h2VarB)) {
            this.f8780d = h2VarB;
            return;
        }
        ArrayList arrayList = this.f8781e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f8781e = arrayList2;
            arrayList2.add(h2VarB);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (f1.c.c((g2) arrayList.get(i10), h2VarB)) {
                arrayList.set(i10, h2VarB);
                return;
            }
        }
        arrayList.add(h2VarB);
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c(((Number) obj2).intValue(), (x0.j) obj);
    }
}
