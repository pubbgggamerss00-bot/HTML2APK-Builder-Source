package t;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import g2.e1;
import i2.k2;
import i2.o2;
import m0.i3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.s1;
import t.a;

/* loaded from: classes.dex */
public final class j0 extends i2.m implements k2, i2.t, i2.h, i2.o1, o2 {
    public static final a A = new a();

    /* renamed from: s, reason: collision with root package name */
    public x.m f25264s;

    /* renamed from: t, reason: collision with root package name */
    public final eh.l<Boolean, pg.f0> f25265t;

    /* renamed from: v, reason: collision with root package name */
    public x.e f25266v;

    /* renamed from: w, reason: collision with root package name */
    public e1.a f25267w;

    /* renamed from: x, reason: collision with root package name */
    public i2.g1 f25268x;

    /* renamed from: y, reason: collision with root package name */
    public final o1.j0 f25269y;

    /* renamed from: z, reason: collision with root package name */
    public b f25270z;

    public static final class a {
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            return Boolean.valueOf(j0.this.f25269y.H(7));
        }
    }

    @vg.e(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {314}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25272a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x.m f25273b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x.k f25274c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ph.b1 f25275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x.m mVar, x.k kVar, ph.b1 b1Var, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f25273b = mVar;
            this.f25274c = kVar;
            this.f25275d = b1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f25273b, this.f25274c, this.f25275d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25272a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f25272a = 1;
                if (this.f25273b.c(this.f25274c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            ph.b1 b1Var = this.f25275d;
            if (b1Var != null) {
                b1Var.a();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x.m f25276a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x.k f25277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x.m mVar, x.k kVar) {
            super(1);
            this.f25276a = mVar;
            this.f25277b = kVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            this.f25276a.a(this.f25277b);
            return pg.f0.f21461a;
        }
    }

    public j0() {
        throw null;
    }

    public j0(x.m mVar, int i10, a.c cVar) {
        this.f25264s = mVar;
        this.f25265t = cVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i10, new k0(2, this, j0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 4);
        T1(focusTargetNode);
        this.f25269y = focusTargetNode;
    }

    @Override // i2.o2
    public final Object L() {
        return A;
    }

    @Override // androidx.compose.ui.d.c
    public final void N1() {
        e1.a aVar = this.f25267w;
        if (aVar != null) {
            aVar.a();
        }
        this.f25267w = null;
    }

    @Override // i2.o1
    public final void V0() {
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        i2.p1.a(this, new i3(1, g0Var, this));
        g2.e1 e1Var = (g2.e1) g0Var.f16327a;
        if (this.f25269y.Y().b()) {
            e1.a aVar = this.f25267w;
            if (aVar != null) {
                aVar.a();
            }
            this.f25267w = e1Var != null ? e1Var.b() : null;
        }
    }

    public final void W1(x.m mVar, x.k kVar) {
        if (!this.f1157p) {
            mVar.a(kVar);
        } else {
            ph.s1 s1Var = (ph.s1) ((uh.c) H1()).f29723a.get(s1.a.f21589a);
            ph.h.c(H1(), null, null, new c(mVar, kVar, s1Var != null ? s1Var.invokeOnCompletion(new d(mVar, kVar)) : null, null), 3);
        }
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        boolean zB = this.f25269y.Y().b();
        kh.i<Object>[] iVarArr = q2.a0.f21754a;
        q2.c0<Boolean> c0Var = q2.w.f21830k;
        kh.i<Object> iVar = q2.a0.f21754a[4];
        Boolean boolValueOf = Boolean.valueOf(zB);
        c0Var.getClass();
        d0Var.c(c0Var, boolValueOf);
        if (this.f25270z == null) {
            this.f25270z = new b();
        }
        d0Var.c(q2.k.f21794v, new q2.a(null, this.f25270z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final m0 X1() {
        o2 o2Var;
        i2.d1 d1Var;
        if (this.f1157p) {
            if (!this.f1144a.f1157p) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            d.c cVar = this.f1144a.f1148e;
            i2.e0 e0VarF = i2.k.f(this);
            loop0: while (true) {
                if (e0VarF == null) {
                    o2Var = null;
                    break;
                }
                if ((e0VarF.I.f13793e.f1147d & PKIFailureInfo.transactionIdInUse) != 0) {
                    while (cVar != null) {
                        if ((cVar.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                            i2.m mVarB = cVar;
                            ?? bVar = 0;
                            while (mVarB != 0) {
                                if (mVarB instanceof o2) {
                                    o2Var = (o2) mVarB;
                                    if (m0.f25296s.equals(o2Var.L())) {
                                        break loop0;
                                    }
                                } else if ((mVarB.f1146c & PKIFailureInfo.transactionIdInUse) != 0 && (mVarB instanceof i2.m)) {
                                    d.c cVar2 = mVarB.f13947r;
                                    int i10 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                                            i10++;
                                            bVar = bVar;
                                            if (i10 == 1) {
                                                mVarB = cVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f1149f;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVarB = i2.k.b(bVar);
                            }
                        }
                        cVar = cVar.f1148e;
                    }
                }
                e0VarF = e0VarF.G();
                cVar = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
            }
            if (o2Var instanceof m0) {
                return (m0) o2Var;
            }
        }
        return null;
    }

    public final void Y1(x.m mVar) {
        x.e eVar;
        if (kotlin.jvm.internal.r.a(this.f25264s, mVar)) {
            return;
        }
        x.m mVar2 = this.f25264s;
        if (mVar2 != null && (eVar = this.f25266v) != null) {
            mVar2.a(new x.f(eVar));
        }
        this.f25266v = null;
        this.f25264s = mVar;
    }

    @Override // i2.t
    public final void g0(i2.g1 g1Var) {
        m0 m0VarX1;
        this.f25268x = g1Var;
        if (this.f25269y.Y().b()) {
            if (!g1Var.l1().f1157p) {
                m0 m0VarX12 = X1();
                if (m0VarX12 != null) {
                    m0VarX12.T1(null);
                    return;
                }
                return;
            }
            i2.g1 g1Var2 = this.f25268x;
            if (g1Var2 == null || !g1Var2.l1().f1157p || (m0VarX1 = X1()) == null) {
                return;
            }
            m0VarX1.T1(this.f25268x);
        }
    }
}
