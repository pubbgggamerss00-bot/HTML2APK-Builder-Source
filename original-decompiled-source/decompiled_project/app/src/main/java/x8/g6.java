package x8;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$1", f = "HomeViewModel.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32680b;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j6 f32681a;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$1$1", f = "HomeViewModel.kt", l = {192, 194, 195}, m = "emit")
        /* renamed from: x8.g6$a$a, reason: collision with other inner class name */
        public static final class C0331a extends vg.c {

            /* renamed from: a, reason: collision with root package name */
            public a f32682a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f32683b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<T> f32684c;

            /* renamed from: d, reason: collision with root package name */
            public int f32685d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0331a(a<? super T> aVar, tg.e<? super C0331a> eVar) {
                super(eVar);
                this.f32684c = aVar;
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                this.f32683b = obj;
                this.f32685d |= PKIFailureInfo.systemUnavail;
                return this.f32684c.b(false, this);
            }
        }

        public a(j6 j6Var) {
            this.f32681a = j6Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        
            if (r7 != r1) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:13:0x0029, B:20:0x0039, B:35:0x0072, B:38:0x0089, B:32:0x0061), top: B:48:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(boolean z10, tg.e<? super pg.f0> eVar) throws Exception {
            C0331a c0331a;
            a<T> aVar;
            Object objA;
            if (eVar instanceof C0331a) {
                c0331a = (C0331a) eVar;
                int i10 = c0331a.f32685d;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    c0331a.f32685d = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    c0331a = new C0331a(this, eVar);
                }
            }
            Object objB = c0331a.f32683b;
            ug.a aVar2 = ug.a.f29706a;
            int i11 = c0331a.f32685d;
            try {
            } catch (Exception e10) {
                if (e10 instanceof CancellationException) {
                    throw e10;
                }
            }
            if (i11 == 0) {
                pg.q.b(objB);
                if (z10) {
                    n8.m1 m1Var = this.f32681a.f32777d;
                    c0331a.f32682a = this;
                    c0331a.f32685d = 1;
                    objB = m1Var.b(c0331a);
                    if (objB != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                return pg.f0.f21461a;
            }
            if (i11 == 1) {
                aVar = c0331a.f32682a;
                pg.q.b(objB);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(objB);
                    return pg.f0.f21461a;
                }
                aVar = c0331a.f32682a;
                pg.q.b(objB);
                n8.m1 m1Var2 = aVar.f32681a.f32777d;
                c0331a.f32682a = null;
                c0331a.f32685d = 3;
                objA = v4.g.a(m1Var2.f18526b, new n8.i0(2, null), c0331a);
                if (objA == aVar2) {
                    objA = pg.f0.f21461a;
                }
            }
            if (!((Boolean) objB).booleanValue()) {
                n8.s sVar = aVar.f32681a.f32775b;
                c0331a.f32682a = aVar;
                c0331a.f32685d = 2;
                if (sVar.f18583a.clearWatermarks(c0331a) != aVar2) {
                    n8.m1 m1Var22 = aVar.f32681a.f32777d;
                    c0331a.f32682a = null;
                    c0331a.f32685d = 3;
                    objA = v4.g.a(m1Var22.f18526b, new n8.i0(2, null), c0331a);
                    if (objA == aVar2) {
                    }
                }
                return aVar2;
            }
            return pg.f0.f21461a;
        }

        @Override // sh.g
        public final /* bridge */ /* synthetic */ Object c(Object obj, tg.e eVar) {
            return b(((Boolean) obj).booleanValue(), eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(j6 j6Var, tg.e<? super g6> eVar) {
        super(2, eVar);
        this.f32680b = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g6(this.f32680b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((g6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32679a;
        if (i10 == 0) {
            pg.q.b(obj);
            j6 j6Var = this.f32680b;
            n8.g1 g1Var = j6Var.f32777d.f18530f;
            a aVar2 = new a(j6Var);
            this.f32679a = 1;
            if (g1Var.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
