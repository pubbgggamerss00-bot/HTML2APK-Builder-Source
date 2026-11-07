package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import x0.j;

/* loaded from: classes.dex */
public final class t5 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f33197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33201h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f33202j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33203k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33204l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33205m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33206n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33207p;

    public t5(eh.a<pg.f0> aVar, x0.n1<Boolean> n1Var, eh.a<pg.f0> aVar2, boolean z10, eh.a<pg.f0> aVar3, ProjectEntity projectEntity, eh.a<pg.f0> aVar4, eh.a<pg.f0> aVar5, boolean z11, eh.a<pg.f0> aVar6, eh.a<pg.f0> aVar7, eh.a<pg.f0> aVar8, eh.a<pg.f0> aVar9, eh.a<pg.f0> aVar10) {
        this.f33194a = aVar;
        this.f33195b = n1Var;
        this.f33196c = aVar2;
        this.f33197d = z10;
        this.f33198e = aVar3;
        this.f33199f = projectEntity;
        this.f33200g = aVar4;
        this.f33201h = aVar5;
        this.f33202j = z11;
        this.f33203k = aVar6;
        this.f33204l = aVar7;
        this.f33205m = aVar8;
        this.f33206n = aVar9;
        this.f33207p = aVar10;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r AppDropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AppDropdownMenu, "$this$AppDropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-16112452);
            final eh.a<pg.f0> aVar = this.f33194a;
            Object obj = j.a.f31715a;
            final x0.n1<Boolean> n1Var = this.f33195b;
            if (aVar != null) {
                f1.b bVar = c.I;
                jVar2.L(-16093816);
                boolean zK = jVar2.K(n1Var) | jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK || objG == obj) {
                    objG = new eh.a() { // from class: x8.l5
                        @Override // eh.a
                        public final Object invoke() {
                            g5.F(n1Var, false);
                            aVar.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                q8.g.b(bVar, (eh.a) objG, c.J, jVar2, 390, 0);
            }
            jVar2.B();
            f1.b bVar2 = c.K;
            jVar2.L(-16072537);
            boolean zK2 = jVar2.K(n1Var);
            final eh.a<pg.f0> aVar2 = this.f33196c;
            boolean zK3 = zK2 | jVar2.K(aVar2);
            Object objG2 = jVar2.g();
            if (zK3 || objG2 == obj) {
                objG2 = new eh.a() { // from class: x8.m5
                    @Override // eh.a
                    public final Object invoke() {
                        g5.F(n1Var, false);
                        aVar2.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            q8.g.b(bVar2, (eh.a) objG2, c.L, jVar2, 390, 0);
            jVar2.L(-16069173);
            boolean z10 = this.f33197d;
            if (!z10) {
                f1.b bVar3 = c.M;
                jVar2.L(-16051126);
                boolean zK4 = jVar2.K(n1Var);
                final eh.a<pg.f0> aVar3 = this.f33198e;
                boolean zK5 = zK4 | jVar2.K(aVar3);
                Object objG3 = jVar2.g();
                if (zK5 || objG3 == obj) {
                    objG3 = new eh.a() { // from class: x8.n5
                        @Override // eh.a
                        public final Object invoke() {
                            g5.F(n1Var, false);
                            aVar3.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG3);
                }
                jVar2.B();
                q8.g.b(bVar3, (eh.a) objG3, c.N, jVar2, 390, 0);
            }
            jVar2.B();
            jVar2.L(-16047649);
            ProjectEntity projectEntity = this.f33199f;
            if (projectEntity.getFolderId() == null) {
                f1.b bVar4 = c.O;
                jVar2.L(-16028982);
                boolean zK6 = jVar2.K(n1Var);
                Object obj2 = this.f33200g;
                boolean zK7 = zK6 | jVar2.K(obj2);
                Object objG4 = jVar2.g();
                if (zK7 || objG4 == obj) {
                    objG4 = new kotlinx.serialization.internal.q(1, obj2, n1Var);
                    jVar2.C(objG4);
                }
                jVar2.B();
                q8.g.b(bVar4, (eh.a) objG4, c.P, jVar2, 390, 0);
            }
            jVar2.B();
            jVar2.L(-16022646);
            if (projectEntity.getFolderId() != null) {
                f1.b bVar5 = c.Q;
                jVar2.L(-16003762);
                boolean zK8 = jVar2.K(n1Var);
                final eh.a<pg.f0> aVar4 = this.f33201h;
                boolean zK9 = zK8 | jVar2.K(aVar4);
                Object objG5 = jVar2.g();
                if (zK9 || objG5 == obj) {
                    objG5 = new eh.a() { // from class: x8.o5
                        @Override // eh.a
                        public final Object invoke() {
                            g5.F(n1Var, false);
                            aVar4.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG5);
                }
                jVar2.B();
                q8.g.b(bVar5, (eh.a) objG5, c.R, jVar2, 390, 0);
            }
            jVar2.B();
            jVar2.L(-16000058);
            final eh.a<pg.f0> aVar5 = this.f33204l;
            final boolean z11 = this.f33202j;
            if (z10) {
                f1.b bVar6 = c.S;
                jVar2.L(-15981887);
                boolean zK10 = jVar2.K(n1Var) | jVar2.c(z11);
                final eh.a<pg.f0> aVar6 = this.f33203k;
                boolean zK11 = zK10 | jVar2.K(aVar6) | jVar2.K(aVar5);
                Object objG6 = jVar2.g();
                if (zK11 || objG6 == obj) {
                    objG6 = new eh.a() { // from class: x8.p5
                        @Override // eh.a
                        public final Object invoke() {
                            g5.F(n1Var, false);
                            (z11 ? aVar6 : aVar5).invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG6);
                }
                jVar2.B();
                q8.g.b(bVar6, (eh.a) objG6, c.T, jVar2, 390, 0);
            }
            jVar2.B();
            jVar2.L(-15974608);
            if (z10) {
                f1.b bVar7 = c.U;
                jVar2.L(-15956344);
                boolean zK12 = jVar2.K(n1Var) | jVar2.c(z11);
                final eh.a<pg.f0> aVar7 = this.f33205m;
                boolean zK13 = zK12 | jVar2.K(aVar7) | jVar2.K(aVar5);
                Object objG7 = jVar2.g();
                if (zK13 || objG7 == obj) {
                    objG7 = new eh.a() { // from class: x8.q5
                        @Override // eh.a
                        public final Object invoke() {
                            g5.F(n1Var, false);
                            (z11 ? aVar7 : aVar5).invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG7);
                }
                jVar2.B();
                q8.g.b(bVar7, (eh.a) objG7, c.V, jVar2, 390, 0);
            }
            jVar2.B();
            f1.b bVar8 = c.W;
            jVar2.L(-15931420);
            boolean zK14 = jVar2.K(n1Var);
            final eh.a<pg.f0> aVar8 = this.f33206n;
            boolean zK15 = zK14 | jVar2.K(aVar8);
            Object objG8 = jVar2.g();
            if (zK15 || objG8 == obj) {
                objG8 = new eh.a() { // from class: x8.r5
                    @Override // eh.a
                    public final Object invoke() {
                        g5.F(n1Var, false);
                        aVar8.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG8);
            }
            jVar2.B();
            q8.g.b(bVar8, (eh.a) objG8, c.X, jVar2, 390, 0);
            f1.b bVar9 = c.Y;
            jVar2.L(-15909660);
            boolean zK16 = jVar2.K(n1Var);
            final eh.a<pg.f0> aVar9 = this.f33207p;
            boolean zK17 = zK16 | jVar2.K(aVar9);
            Object objG9 = jVar2.g();
            if (zK17 || objG9 == obj) {
                objG9 = new eh.a() { // from class: x8.s5
                    @Override // eh.a
                    public final Object invoke() {
                        g5.F(n1Var, false);
                        aVar9.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG9);
            }
            jVar2.B();
            q8.g.b(bVar9, (eh.a) objG9, c.Z, jVar2, 390, 0);
        }
        return pg.f0.f21461a;
    }
}
