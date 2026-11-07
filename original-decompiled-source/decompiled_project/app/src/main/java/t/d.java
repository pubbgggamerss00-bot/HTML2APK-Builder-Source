package t;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.d;
import i2.o2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x.o;

@vg.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25176a;

    /* renamed from: b, reason: collision with root package name */
    public int f25177b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25178c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v.u0 f25179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.m f25181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t.a f25182g;

    @vg.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1257, 1260}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public o.b f25183a;

        /* renamed from: b, reason: collision with root package name */
        public int f25184b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t.a f25185c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f25186d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x.m f25187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t.a aVar, long j10, x.m mVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f25185c = aVar;
            this.f25186d = j10;
            this.f25187e = mVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f25185c, this.f25186d, this.f25187e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3, types: [z0.b] */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6, types: [z0.b] */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r13v9 */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            boolean z11;
            i2.d1 d1Var;
            o.b bVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25184b;
            t.a aVar2 = this.f25185c;
            if (i10 == 0) {
                pg.q.b(obj);
                kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
                y yVar = new y(b0Var);
                if (!aVar2.f1144a.f1157p) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                d.c cVar = aVar2.f1144a.f1148e;
                i2.e0 e0VarF = i2.k.f(aVar2);
                loop0: while (e0VarF != null) {
                    if ((e0VarF.I.f13793e.f1147d & PKIFailureInfo.transactionIdInUse) != 0) {
                        while (cVar != null) {
                            if ((cVar.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                                i2.m mVarB = cVar;
                                ?? bVar2 = 0;
                                while (mVarB != 0) {
                                    if (mVarB instanceof o2) {
                                        o2 o2Var = (o2) mVarB;
                                        if (!(v.c1.f29792s.equals(o2Var.L()) ? ((Boolean) yVar.invoke(o2Var)).booleanValue() : true)) {
                                            break loop0;
                                        }
                                    } else {
                                        if (((mVarB.f1146c & PKIFailureInfo.transactionIdInUse) != 0) && (mVarB instanceof i2.m)) {
                                            d.c cVar2 = mVarB.f13947r;
                                            int i11 = 0;
                                            mVarB = mVarB;
                                            bVar2 = bVar2;
                                            while (cVar2 != null) {
                                                if ((cVar2.f1146c & PKIFailureInfo.transactionIdInUse) != 0) {
                                                    i11++;
                                                    bVar2 = bVar2;
                                                    if (i11 == 1) {
                                                        mVarB = cVar2;
                                                    } else {
                                                        if (bVar2 == 0) {
                                                            bVar2 = new z0.b(new d.c[16]);
                                                        }
                                                        if (mVarB != 0) {
                                                            bVar2.b(mVarB);
                                                            mVarB = 0;
                                                        }
                                                        bVar2.b(cVar2);
                                                    }
                                                }
                                                cVar2 = cVar2.f1149f;
                                                mVarB = mVarB;
                                                bVar2 = bVar2;
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                    }
                                    mVarB = i2.k.b(bVar2);
                                }
                            }
                            cVar = cVar.f1148e;
                        }
                    }
                    e0VarF = e0VarF.G();
                    cVar = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
                }
                if (!b0Var.f16318a) {
                    int i12 = c0.f25175b;
                    ViewParent parent = i2.l.a(aVar2).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup.shouldDelayChildPressedState()) {
                            z11 = true;
                            break;
                        }
                        parent = viewGroup.getParent();
                    }
                    z11 = false;
                    if (!z11) {
                        z10 = false;
                    }
                    if (z10) {
                        long j10 = c0.f25174a;
                        this.f25184b = 1;
                        if (ph.t0.b(j10, this) != aVar) {
                        }
                        return aVar;
                    }
                }
                z10 = true;
                if (z10) {
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = this.f25183a;
                    pg.q.b(obj);
                    aVar2.C = bVar;
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
            }
            o.b bVar3 = new o.b(this.f25186d);
            this.f25183a = bVar3;
            this.f25184b = 2;
            if (this.f25187e.c(bVar3, this) != aVar) {
                bVar = bVar3;
                aVar2.C = bVar;
                return pg.f0.f21461a;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v.u0 u0Var, long j10, x.m mVar, t.a aVar, tg.e<? super d> eVar) {
        super(2, eVar);
        this.f25179d = u0Var;
        this.f25180e = j10;
        this.f25181f = mVar;
        this.f25182g = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        d dVar = new d(this.f25179d, this.f25180e, this.f25181f, this.f25182g, eVar);
        dVar.f25178c = obj;
        return dVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r14.c(r2, r16) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (r14.c(r3, r16) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.s1 s1VarC;
        Object objG1;
        boolean z10;
        o.c cVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25177b;
        t.a aVar2 = this.f25182g;
        x.m mVar = this.f25181f;
        if (i10 == 0) {
            pg.q.b(obj);
            s1VarC = ph.h.c((ph.i0) this.f25178c, null, null, new a(aVar2, this.f25180e, this.f25181f, null), 3);
            this.f25178c = s1VarC;
            this.f25177b = 1;
            objG1 = this.f25179d.G1(this);
            if (objG1 != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            s1VarC = (ph.s1) this.f25178c;
            pg.q.b(obj);
            objG1 = obj;
        } else {
            if (i10 == 2) {
                z10 = this.f25176a;
                pg.q.b(obj);
                if (z10) {
                    o.b bVar = new o.b(this.f25180e);
                    o.c cVar2 = new o.c(bVar);
                    this.f25178c = cVar2;
                    this.f25177b = 3;
                    if (mVar.c(bVar, this) != aVar) {
                        cVar = cVar2;
                        this.f25178c = null;
                        this.f25177b = 4;
                    }
                    return aVar;
                }
                aVar2.C = null;
                return pg.f0.f21461a;
            }
            if (i10 != 3) {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                aVar2.C = null;
                return pg.f0.f21461a;
            }
            cVar = (o.c) this.f25178c;
            pg.q.b(obj);
            this.f25178c = null;
            this.f25177b = 4;
        }
        boolean zBooleanValue = ((Boolean) objG1).booleanValue();
        if (!s1VarC.isActive()) {
            o.b bVar2 = aVar2.C;
            if (bVar2 != null) {
                x.k cVar3 = zBooleanValue ? new o.c(bVar2) : new o.a(bVar2);
                this.f25178c = null;
                this.f25177b = 5;
            }
            aVar2.C = null;
            return pg.f0.f21461a;
        }
        this.f25178c = null;
        this.f25176a = zBooleanValue;
        this.f25177b = 2;
        if (ph.v1.c(s1VarC, this) != aVar) {
            z10 = zBooleanValue;
            if (z10) {
            }
            aVar2.C = null;
            return pg.f0.f21461a;
        }
        return aVar;
    }
}
