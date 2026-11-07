package th;

import d0.q1;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import ph.f1;
import ph.g0;
import ph.i0;
import ph.p2;
import ph.v1;
import ph.x0;
import ph.z2;
import qg.e0;

/* loaded from: classes2.dex */
public final class n {

    @vg.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {EACTags.TRANSACTION_DATE, 73, 76}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public rh.h f28820a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f28821b;

        /* renamed from: c, reason: collision with root package name */
        public int f28822c;

        /* renamed from: d, reason: collision with root package name */
        public int f28823d;

        /* renamed from: e, reason: collision with root package name */
        public int f28824e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f28825f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sh.f<Object>[] f28826g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ eh.a<Object[]> f28827h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ vg.i f28828j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ sh.g<Object> f28829k;

        @vg.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        /* renamed from: th.n$a$a, reason: collision with other inner class name */
        public static final class C0294a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f28830a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sh.f<Object>[] f28831b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f28832c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f28833d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ rh.c f28834e;

            /* renamed from: th.n$a$a$a, reason: collision with other inner class name */
            public static final class C0295a<T> implements sh.g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ rh.c f28835a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f28836b;

                @vg.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                /* renamed from: th.n$a$a$a$a, reason: collision with other inner class name */
                public static final class C0296a extends vg.c {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f28837a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0295a<T> f28838b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f28839c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0296a(C0295a<? super T> c0295a, tg.e<? super C0296a> eVar) {
                        super(eVar);
                        this.f28838b = c0295a;
                    }

                    @Override // vg.a
                    public final Object invokeSuspend(Object obj) {
                        this.f28837a = obj;
                        this.f28839c |= PKIFailureInfo.systemUnavail;
                        return this.f28838b.c(null, this);
                    }
                }

                public C0295a(rh.c cVar, int i10) {
                    this.f28835a = cVar;
                    this.f28836b = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
                
                    if (r10 == r1) goto L60;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // sh.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(T t3, tg.e<? super f0> eVar) {
                    C0296a c0296a;
                    Object obj;
                    if (eVar instanceof C0296a) {
                        c0296a = (C0296a) eVar;
                        int i10 = c0296a.f28839c;
                        if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                            c0296a.f28839c = i10 - PKIFailureInfo.systemUnavail;
                        } else {
                            c0296a = new C0296a(this, eVar);
                        }
                    }
                    Object obj2 = c0296a.f28837a;
                    Object obj3 = ug.a.f29706a;
                    int i11 = c0296a.f28839c;
                    if (i11 == 0) {
                        pg.q.b(obj2);
                        e0 e0Var = new e0(this.f28836b, t3);
                        c0296a.f28839c = 1;
                        if (this.f28835a.d(e0Var, c0296a) != obj3) {
                        }
                        return obj3;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj2);
                        return f0.f21461a;
                    }
                    pg.q.b(obj2);
                    c0296a.f28839c = 2;
                    tg.h context = c0296a.getContext();
                    v1.e(context);
                    tg.e eVarC = ah.p.c(c0296a);
                    uh.f fVar = eVarC instanceof uh.f ? (uh.f) eVarC : null;
                    if (fVar == null) {
                        obj = f0.f21461a;
                    } else {
                        g0 g0Var = fVar.f29733d;
                        if (uh.g.c(g0Var, context)) {
                            fVar.f29735f = f0.f21461a;
                            fVar.f21605c = 1;
                            g0Var.E0(context, fVar);
                        } else {
                            z2 z2Var = new z2();
                            tg.h hVarPlus = context.plus(z2Var);
                            f0 f0Var = f0.f21461a;
                            fVar.f29735f = f0Var;
                            fVar.f21605c = 1;
                            g0Var.E0(hVarPlus, fVar);
                            if (z2Var.f21636b) {
                                f1 f1VarA = p2.a();
                                qg.l<x0<?>> lVar = f1VarA.f21532e;
                                if (!(lVar != null ? lVar.isEmpty() : true)) {
                                    if (f1VarA.f21530c >= 4294967296L) {
                                        fVar.f29735f = f0Var;
                                        fVar.f21605c = 1;
                                        f1VarA.I0(fVar);
                                        obj = ug.a.f29706a;
                                    } else {
                                        f1VarA.J0(true);
                                        try {
                                            fVar.run();
                                            do {
                                            } while (f1VarA.L0());
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                    }
                                }
                                obj = f0.f21461a;
                            }
                        }
                        obj = ug.a.f29706a;
                    }
                    if (obj != ug.a.f29706a) {
                        obj = f0.f21461a;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0294a(sh.f[] fVarArr, int i10, AtomicInteger atomicInteger, rh.c cVar, tg.e eVar) {
                super(2, eVar);
                this.f28831b = fVarArr;
                this.f28832c = i10;
                this.f28833d = atomicInteger;
                this.f28834e = cVar;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                return new C0294a(this.f28831b, this.f28832c, this.f28833d, this.f28834e, eVar);
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
                return ((C0294a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f28830a;
                AtomicInteger atomicInteger = this.f28833d;
                rh.c cVar = this.f28834e;
                try {
                    if (i10 == 0) {
                        pg.q.b(obj);
                        sh.f<Object>[] fVarArr = this.f28831b;
                        int i11 = this.f28832c;
                        sh.f<Object> fVar = fVarArr[i11];
                        C0295a c0295a = new C0295a(cVar, i11);
                        this.f28830a = 1;
                        if (fVar.b(c0295a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        cVar.m(null);
                    }
                    return f0.f21461a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        cVar.m(null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.a aVar, eh.q qVar, sh.g gVar, tg.e eVar, sh.f[] fVarArr) {
            super(2, eVar);
            this.f28826g = fVarArr;
            this.f28827h = aVar;
            this.f28828j = (vg.i) qVar;
            this.f28829k = gVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [eh.q, vg.i] */
        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f28827h, this.f28828j, this.f28829k, eVar, this.f28826g);
            aVar.f28825f = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
        
            if (r8 != 0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:34:0x00c4, B:32:0x00b5], limit reached: 44 */
        /* JADX WARN: Path cross not found for [B:35:0x00c6, B:20:0x0085], limit reached: 44 */
        /* JADX WARN: Path cross not found for [B:37:0x00d4, B:40:0x00e7], limit reached: 44 */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[LOOP:0: B:27:0x00a5->B:45:?, LOOP_START, PHI: r8 r12
          0x00a5: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:24:0x00a0, B:45:?] A[DONT_GENERATE, DONT_INLINE]
          0x00a5: PHI (r12v4 qg.e0) = (r12v3 qg.e0), (r12v10 qg.e0) binds: [B:24:0x00a0, B:45:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r14v4, types: [eh.q, vg.i] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e4 -> B:20:0x0085). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fc -> B:20:0x0085). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            Object[] objArr;
            byte[] bArr;
            byte b10;
            rh.h hVar;
            Object objE;
            e0 e0Var;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f28824e;
            uh.v vVar = u.f28849b;
            if (i10 == 0) {
                pg.q.b(obj);
                i0 i0Var = (i0) this.f28825f;
                length = this.f28826g.length;
                if (length == 0) {
                    return f0.f21461a;
                }
                objArr = new Object[length];
                qg.m.m(objArr, 0, length, vVar);
                rh.c cVarA = rh.k.a(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i11 = 0; i11 < length; i11++) {
                    ph.h.c(i0Var, null, null, new C0294a(this.f28826g, i11, atomicInteger, cVarA, null), 3);
                }
                bArr = new byte[length];
                b10 = 0;
                hVar = cVarA;
            } else if (i10 == 1) {
                ?? r22 = this.f28823d;
                length = this.f28822c;
                byte[] bArr2 = this.f28821b;
                hVar = this.f28820a;
                Object[] objArr2 = (Object[]) this.f28825f;
                pg.q.b(obj);
                objE = ((rh.l) obj).f23626a;
                b10 = r22;
                bArr = bArr2;
                objArr = objArr2;
                e0Var = (e0) rh.l.a(objE);
                if (e0Var != null) {
                    return f0.f21461a;
                }
                while (true) {
                    int i12 = e0Var.f22719a;
                    Object obj2 = objArr[i12];
                    objArr[i12] = e0Var.f22720b;
                    if (obj2 == vVar) {
                        length--;
                    }
                    if (bArr[i12] != b10) {
                        bArr[i12] = b10;
                        e0Var = (e0) rh.l.a(hVar.c());
                        if (e0Var != null) {
                        }
                    }
                    if (length == 0) {
                        Object[] objArrInvoke = this.f28827h.invoke();
                        sh.g<Object> gVar = this.f28829k;
                        ?? r14 = this.f28828j;
                        if (objArrInvoke == null) {
                            this.f28825f = objArr;
                            this.f28820a = hVar;
                            this.f28821b = bArr;
                            this.f28822c = length;
                            this.f28823d = b10;
                            this.f28824e = 2;
                            if (r14.b(gVar, objArr, this) != aVar) {
                                break;
                            }
                        } else {
                            qg.m.i(objArr, 0, objArrInvoke, 0, 14);
                            this.f28825f = objArr;
                            this.f28820a = hVar;
                            this.f28821b = bArr;
                            this.f28822c = length;
                            this.f28823d = b10;
                            this.f28824e = 3;
                            if (r14.b(gVar, objArrInvoke, this) != aVar) {
                                break;
                            }
                        }
                    }
                }
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r23 = this.f28823d;
                length = this.f28822c;
                byte[] bArr3 = this.f28821b;
                hVar = this.f28820a;
                Object[] objArr3 = (Object[]) this.f28825f;
                pg.q.b(obj);
                b10 = r23;
                bArr = bArr3;
                objArr = objArr3;
            }
            b10 = (byte) (b10 + 1);
            this.f28825f = objArr;
            this.f28820a = hVar;
            this.f28821b = bArr;
            this.f28822c = length;
            this.f28823d = b10;
            this.f28824e = 1;
            objE = hVar.e(this);
            if (objE != aVar) {
                e0Var = (e0) rh.l.a(objE);
                if (e0Var != null) {
                }
            }
            return aVar;
        }
    }

    public static final Object a(eh.a aVar, eh.q qVar, sh.g gVar, tg.e eVar, sh.f[] fVarArr) {
        a aVar2 = new a(aVar, qVar, gVar, null, fVarArr);
        p pVar = new p(eVar, eVar.getContext());
        Object objB = q1.b(pVar, pVar, aVar2);
        return objB == ug.a.f29706a ? objB : f0.f21461a;
    }
}
