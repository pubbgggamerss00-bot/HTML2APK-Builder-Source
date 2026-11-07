package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.d;
import eh.p;
import h2.f;
import i2.a1;
import i2.d1;
import i2.e0;
import i2.h;
import i2.i;
import i2.k;
import i2.m;
import i2.o1;
import i2.p1;
import j2.j2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import o1.a0;
import o1.c0;
import o1.h0;
import o1.i0;
import o1.j0;
import o1.q;
import o1.w;
import o1.x;
import o1.y;
import o1.z;
import pg.f0;
import pg.l;

/* loaded from: classes.dex */
public final class FocusTargetNode extends d.c implements h, j0, o1, f {

    /* renamed from: q, reason: collision with root package name */
    public final p<h0, h0, f0> f1179q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1180r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1181s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1182t;

    public static final class FocusTargetElement extends a1<FocusTargetNode> {

        /* renamed from: b, reason: collision with root package name */
        public static final FocusTargetElement f1183b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // i2.a1
        public final d.c a() {
            return new FocusTargetNode(0, null, 7);
        }

        @Override // i2.a1
        public final /* bridge */ /* synthetic */ void b(d.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public static final class a extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0<w> f1184a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f1185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0<w> g0Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.f1184a = g0Var;
            this.f1185b = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, o1.z] */
        @Override // eh.a
        public final f0 invoke() {
            this.f1184a.f16327a = this.f1185b.U1();
            return f0.f21461a;
        }
    }

    public FocusTargetNode() {
        throw null;
    }

    public FocusTargetNode(int i10, p pVar, int i11) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        this.f1179q = (i11 & 2) != 0 ? null : pVar;
        this.f1182t = i10;
    }

    @Override // o1.j0
    public final boolean H(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zG = false;
            if (!U1().f18909a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = f3.a.f(this, i10).ordinal();
            if (iOrdinal == 0) {
                zG = f3.a.g(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zG = true;
                } else if (iOrdinal != 3) {
                    throw new l();
                }
            }
            return zG;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        int iOrdinal = Y().ordinal();
        if (iOrdinal == 0 || (iOrdinal != 1 && iOrdinal == 2)) {
            q focusOwner = k.g(this).getFocusOwner();
            focusOwner.l(8, true, false);
            focusOwner.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [z0.b] */
    public final void T1(i0 i0Var, i0 i0Var2) {
        d1 d1Var;
        p<h0, h0, f0> pVar;
        q focusOwner = k.g(this).getFocusOwner();
        FocusTargetNode focusTargetNodeR = focusOwner.r();
        if (!i0Var.equals(i0Var2) && (pVar = this.f1179q) != null) {
            pVar.invoke(i0Var, i0Var2);
        }
        d.c cVar = this.f1144a;
        if (!cVar.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = this.f1144a;
        e0 e0VarF = k.f(this);
        while (e0VarF != null) {
            if ((e0VarF.I.f13793e.f1147d & 5120) != 0) {
                while (cVar2 != null) {
                    int i10 = cVar2.f1146c;
                    if ((i10 & 5120) != 0) {
                        if (cVar2 != cVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            m mVarB = cVar2;
                            ?? bVar = 0;
                            while (mVarB != 0) {
                                if (mVarB instanceof o1.h) {
                                    o1.h hVar = (o1.h) mVarB;
                                    if (focusTargetNodeR == focusOwner.r()) {
                                        hVar.Q(i0Var2);
                                    }
                                } else if ((mVarB.f1146c & 4096) != 0 && (mVarB instanceof m)) {
                                    d.c cVar3 = mVarB.f13947r;
                                    int i11 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.f1146c & 4096) != 0) {
                                            i11++;
                                            bVar = bVar;
                                            if (i11 == 1) {
                                                mVarB = cVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f1149f;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVarB = k.b(bVar);
                            }
                        }
                    }
                    cVar2 = cVar2.f1148e;
                }
            }
            e0VarF = e0VarF.G();
            cVar2 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [z0.b] */
    public final z U1() {
        boolean z10;
        d1 d1Var;
        z zVar = new z();
        zVar.f18909a = true;
        c0 c0Var = c0.f18854b;
        zVar.f18910b = c0Var;
        zVar.f18911c = c0Var;
        zVar.f18912d = c0Var;
        zVar.f18913e = c0Var;
        zVar.f18914f = c0Var;
        zVar.f18915g = c0Var;
        zVar.f18916h = c0Var;
        zVar.f18917i = c0Var;
        zVar.f18918j = x.f18907a;
        zVar.f18919k = y.f18908a;
        int i10 = this.f1182t;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((z1.b) i.a(this, j2.f14784m)).a() == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        zVar.f18909a = z10;
        d.c cVar = this.f1144a;
        if (!cVar.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = this.f1144a;
        e0 e0VarF = k.f(this);
        loop0: while (e0VarF != null) {
            if ((e0VarF.I.f13793e.f1147d & 3072) != 0) {
                while (cVar2 != null) {
                    int i11 = cVar2.f1146c;
                    if ((i11 & 3072) != 0) {
                        if (cVar2 != cVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            m mVarB = cVar2;
                            ?? bVar = 0;
                            while (mVarB != 0) {
                                if (mVarB instanceof a0) {
                                    ((a0) mVarB).Y0(zVar);
                                } else if ((mVarB.f1146c & 2048) != 0 && (mVarB instanceof m)) {
                                    d.c cVar3 = mVarB.f13947r;
                                    int i12 = 0;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                    while (cVar3 != null) {
                                        if ((cVar3.f1146c & 2048) != 0) {
                                            i12++;
                                            bVar = bVar;
                                            if (i12 == 1) {
                                                mVarB = cVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new z0.b(new d.c[16]);
                                                }
                                                if (mVarB != 0) {
                                                    bVar.b(mVarB);
                                                    mVarB = 0;
                                                }
                                                bVar.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.f1149f;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                mVarB = k.b(bVar);
                            }
                        }
                    }
                    cVar2 = cVar2.f1148e;
                }
            }
            e0VarF = e0VarF.G();
            cVar2 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
        }
        return zVar;
    }

    @Override // i2.o1
    public final void V0() {
        W1();
    }

    @Override // o1.j0
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public final i0 Y() {
        q focusOwner;
        FocusTargetNode focusTargetNodeR;
        d1 d1Var;
        if (this.f1157p && (focusTargetNodeR = (focusOwner = k.g(this).getFocusOwner()).r()) != null) {
            if (this == focusTargetNodeR) {
                return focusOwner.e() ? i0.f18866c : i0.f18864a;
            }
            if (focusTargetNodeR.f1157p) {
                if (!focusTargetNodeR.f1144a.f1157p) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                d.c cVar = focusTargetNodeR.f1144a.f1148e;
                e0 e0VarF = k.f(focusTargetNodeR);
                while (e0VarF != null) {
                    if ((e0VarF.I.f13793e.f1147d & 1024) != 0) {
                        while (cVar != null) {
                            if ((cVar.f1146c & 1024) != 0) {
                                d.c cVarB = cVar;
                                z0.b bVar = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) cVarB)) {
                                            return i0.f18865b;
                                        }
                                    } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof m)) {
                                        int i10 = 0;
                                        for (d.c cVar2 = ((m) cVarB).f13947r; cVar2 != null; cVar2 = cVar2.f1149f) {
                                            if ((cVar2.f1146c & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVarB = cVar2;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new z0.b(new d.c[16]);
                                                    }
                                                    if (cVarB != null) {
                                                        bVar.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    bVar.b(cVar2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    cVarB = k.b(bVar);
                                }
                            }
                            cVar = cVar.f1148e;
                        }
                    }
                    e0VarF = e0VarF.G();
                    cVar = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
                }
            }
            return i0.f18867d;
        }
        return i0.f18867d;
    }

    public final void W1() {
        int iOrdinal = Y().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            g0 g0Var = new g0();
            p1.a(this, new a(g0Var, this));
            T t3 = g0Var.f16327a;
            if (t3 == 0) {
                r.h("focusProperties");
                throw null;
            }
            if (((w) t3).a()) {
                return;
            }
            k.g(this).getFocusOwner().f();
        }
    }
}
