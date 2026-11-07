package x0;

import java.util.Collection;
import java.util.Set;

@vg.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {142, 146, 169}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o3 extends vg.i implements eh.p<sh.g<Object>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public p.m0 f31839a;

    /* renamed from: b, reason: collision with root package name */
    public eh.l f31840b;

    /* renamed from: c, reason: collision with root package name */
    public rh.h f31841c;

    /* renamed from: d, reason: collision with root package name */
    public h1.g f31842d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31843e;

    /* renamed from: f, reason: collision with root package name */
    public int f31844f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f31845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.a<Object> f31846h;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p.m0<Object> f31847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p.m0<Object> m0Var) {
            super(1);
            this.f31847a = m0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(Object obj) {
            if (obj instanceof h1.j0) {
                ((h1.j0) obj).o(4);
            }
            this.f31847a.d(obj);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<Set<? extends Object>, h1.h, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rh.c f31848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rh.c cVar) {
            super(2);
            this.f31848a = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        @Override // eh.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(Set<? extends Object> set, h1.h hVar) {
            Set<? extends Object> set2 = set;
            if (set2 instanceof z0.d) {
                p.x0<T> x0Var = ((z0.d) set2).f34709a;
                Object[] objArr = x0Var.f20753b;
                long[] jArr = x0Var.f20752a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    loop0: while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    Object obj = objArr[(i10 << 3) + i12];
                                    if (!(obj instanceof h1.j0) || ((h1.j0) obj).n(4)) {
                                        break loop0;
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } else {
                Set<? extends Object> set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (Object obj2 : set3) {
                        if (!(obj2 instanceof h1.j0) || ((h1.j0) obj2).n(4)) {
                            this.f31848a.g(set2);
                            break loop0;
                        }
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(eh.a<Object> aVar, tg.e<? super o3> eVar) {
        super(2, eVar);
        this.f31846h = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        o3 o3Var = new o3(this.f31846h, eVar);
        o3Var.f31845g = obj;
        return o3Var;
    }

    @Override // eh.p
    public final Object invoke(sh.g<Object> gVar, tg.e<? super pg.f0> eVar) throws Throwable {
        ((o3) create(gVar, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0189, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00f8, B:57:0x0129], limit reached: 125 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x014d A[EDGE_INSN: B:124:0x014d->B:68:0x014d BREAK  A[LOOP:0: B:38:0x00d6->B:94:0x01a3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[Catch: all -> 0x0024, PHI: r2 r4 r6 r7 r8 r9 r10 r11
      0x00d3: PHI (r2v8 java.lang.Object) = (r2v11 java.lang.Object), (r2v14 java.lang.Object) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r4v1 int) = (r4v9 int), (r4v0 int) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r6v6 h1.g) = (r6v22 h1.g), (r6v25 h1.g) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r7v2 ??) = (r7v11 ??), (r7v12 ??) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r8v1 eh.l<java.lang.Object, pg.f0>) = (r8v2 eh.l<java.lang.Object, pg.f0>), (r8v5 eh.l<java.lang.Object, pg.f0>) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r9v1 p.m0) = (r9v2 p.m0), (r9v5 p.m0) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r10v2 sh.g) = (r10v3 sh.g), (r10v8 sh.g) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r11v5 java.lang.Object) = (r11v10 java.lang.Object), (r11v11 java.lang.Object) binds: [B:34:0x00cf, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:8:0x001f, B:33:0x00bd, B:36:0x00d3, B:77:0x017a, B:92:0x019f, B:93:0x01a2, B:15:0x003d, B:18:0x0052, B:25:0x008e, B:29:0x00a3, B:100:0x01b1, B:101:0x01b4, B:26:0x0098, B:28:0x00a0, B:98:0x01ad, B:99:0x01b0), top: B:109:0x0009, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #7 {all -> 0x018d, blocks: (B:50:0x0114, B:66:0x0140, B:69:0x014f, B:73:0x0167, B:75:0x0170, B:54:0x011f, B:58:0x012b), top: B:119:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3 A[LOOP:0: B:38:0x00d6->B:94:0x01a3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [rh.h, rh.w] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [rh.h] */
    /* JADX WARN: Type inference failed for: r7v7, types: [rh.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0188 -> B:81:0x0189). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        h1.g gVar;
        sh.g gVar2;
        p.m0 m0Var;
        eh.l<Object, pg.f0> aVar;
        Object obj2;
        Object objB;
        ?? r72;
        Set set;
        boolean z10;
        h1.g gVar3;
        int i10;
        h1.h hVarU;
        rh.c cVar;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = this.f31844f;
        int i12 = 2;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                gVar2 = (sh.g) this.f31845g;
                m0Var = new p.m0((Object) null);
                aVar = new a(m0Var);
                rh.c cVarA = rh.k.a(Integer.MAX_VALUE, 6, null);
                b bVar = new b(cVarA);
                h1.n.f(h1.n.f12158a);
                synchronized (h1.n.f12160c) {
                    h1.n.f12165h = qg.x.P(bVar, h1.n.f12165h);
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                gVar = new h1.g(bVar);
                h1.h hVarU2 = h1.n.k().u(aVar);
                eh.a<Object> aVar3 = this.f31846h;
                try {
                    h1.h hVarJ = hVarU2.j();
                    try {
                        Object objInvoke = aVar3.invoke();
                        hVarU2.c();
                        this.f31845g = gVar2;
                        this.f31839a = m0Var;
                        this.f31840b = aVar;
                        this.f31841c = cVarA;
                        this.f31842d = gVar;
                        this.f31843e = objInvoke;
                        this.f31844f = 1;
                        if (gVar2.c(objInvoke, this) == aVar2) {
                            return aVar2;
                        }
                        obj2 = objInvoke;
                        cVar = cVarA;
                    } finally {
                        h1.h.q(hVarJ);
                    }
                } finally {
                    hVarU2.c();
                }
            } else if (i11 == 1) {
                obj2 = this.f31843e;
                gVar = this.f31842d;
                ?? r73 = this.f31841c;
                aVar = this.f31840b;
                m0Var = this.f31839a;
                gVar2 = (sh.g) this.f31845g;
                pg.q.b(obj);
                cVar = r73;
            } else if (i11 == 2) {
                obj2 = this.f31843e;
                gVar = this.f31842d;
                rh.h hVar = this.f31841c;
                aVar = this.f31840b;
                m0Var = this.f31839a;
                gVar2 = (sh.g) this.f31845g;
                pg.q.b(obj);
                objB = obj;
                r72 = hVar;
                set = (Set) objB;
                z10 = false;
                while (true) {
                    if (z10) {
                        try {
                            Object[] objArr = m0Var.f20753b;
                            long[] jArr = m0Var.f20752a;
                            int length = jArr.length - i12;
                            if (length >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j10 = jArr[i13];
                                    gVar3 = gVar;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i14 = 8;
                                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j10 & 255) < 128) {
                                                i10 = i14;
                                                try {
                                                    if (set.contains(objArr[(i13 << 3) + i16])) {
                                                        break;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    gVar = gVar3;
                                                    gVar.a();
                                                    throw th;
                                                }
                                            } else {
                                                i10 = i14;
                                            }
                                            j10 >>= i10;
                                            i16++;
                                            i14 = i10;
                                        }
                                        if (i15 != i14) {
                                            break;
                                        }
                                    }
                                    if (i13 == length) {
                                        break;
                                    }
                                    i13++;
                                    gVar = gVar3;
                                }
                            } else {
                                gVar3 = gVar;
                            }
                            z10 = false;
                            set = (Set) rh.l.a(r72.c());
                            if (set == null) {
                                break;
                            }
                            gVar = gVar3;
                            i12 = 2;
                        } catch (Throwable th3) {
                            th = th3;
                            gVar3 = gVar;
                        }
                    } else {
                        gVar3 = gVar;
                    }
                    z10 = true;
                    set = (Set) rh.l.a(r72.c());
                    if (set == null) {
                    }
                }
                if (!z10) {
                    try {
                        m0Var.e();
                        hVarU = h1.n.k().u(aVar);
                        eh.a<Object> aVar4 = this.f31846h;
                        try {
                            Object objInvoke2 = aVar4.invoke();
                            hVarU.c();
                            if (!kotlin.jvm.internal.r.a(objInvoke2, obj2)) {
                                this.f31845g = gVar2;
                                this.f31839a = m0Var;
                                this.f31840b = aVar;
                                this.f31841c = r72;
                                gVar = gVar3;
                                this.f31842d = gVar;
                                this.f31843e = objInvoke2;
                                this.f31844f = 3;
                                if (gVar2.c(objInvoke2, this) != aVar2) {
                                    obj2 = objInvoke2;
                                }
                                return aVar2;
                            }
                            gVar = gVar3;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            th = th6;
                            throw th;
                        }
                    }
                    h1.h hVarJ2 = hVarU.j();
                }
                i12 = 2;
                cVar = r72;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f31843e;
                gVar = this.f31842d;
                r72 = this.f31841c;
                aVar = this.f31840b;
                m0Var = this.f31839a;
                gVar2 = (sh.g) this.f31845g;
                pg.q.b(obj);
                i12 = 2;
                cVar = r72;
            }
            this.f31845g = gVar2;
            this.f31839a = m0Var;
            this.f31840b = aVar;
            this.f31841c = cVar;
            this.f31842d = gVar;
            this.f31843e = obj2;
            this.f31844f = i12;
            objB = cVar.b(this);
            r72 = cVar;
            if (objB == aVar2) {
                set = (Set) objB;
                z10 = false;
                while (true) {
                    if (z10) {
                    }
                    z10 = true;
                    set = (Set) rh.l.a(r72.c());
                    if (set == null) {
                    }
                    gVar = gVar3;
                    i12 = 2;
                }
                if (!z10) {
                }
                i12 = 2;
                cVar = r72;
                this.f31845g = gVar2;
                this.f31839a = m0Var;
                this.f31840b = aVar;
                this.f31841c = cVar;
                this.f31842d = gVar;
                this.f31843e = obj2;
                this.f31844f = i12;
                objB = cVar.b(this);
                r72 = cVar;
                if (objB == aVar2) {
                }
            }
            return aVar2;
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
