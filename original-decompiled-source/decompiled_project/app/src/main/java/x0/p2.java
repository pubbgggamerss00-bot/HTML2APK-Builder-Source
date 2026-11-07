package x0;

import java.util.List;
import java.util.Set;
import x0.k2;

@vg.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public h1.g f31851a;

    /* renamed from: b, reason: collision with root package name */
    public int f31852b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f31854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f31855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1 f31856f;

    @vg.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1072}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f31857a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f31858b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q2 f31859c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d1 f31860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q2 q2Var, d1 d1Var, tg.e eVar) {
            super(2, eVar);
            this.f31859c = q2Var;
            this.f31860d = d1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f31859c, this.f31860d, eVar);
            aVar.f31858b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f31857a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f31858b;
            this.f31857a = 1;
            this.f31859c.b(i0Var, this.f31860d, this);
            return aVar;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<Set<? extends Object>, h1.h, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k2 f31861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k2 k2Var) {
            super(2);
            this.f31861a = k2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
        @Override // eh.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(Set<? extends Object> set, h1.h hVar) {
            ph.k<pg.f0> kVarX;
            Set<? extends Object> set2 = set;
            k2 k2Var = this.f31861a;
            synchronized (k2Var.f31765b) {
                try {
                    if (((k2.d) k2Var.f31783t.getValue()).compareTo(k2.d.f31792e) >= 0) {
                        p.m0<Object> m0Var = k2Var.f31770g;
                        if (set2 instanceof z0.d) {
                            p.x0<T> x0Var = ((z0.d) set2).f34709a;
                            Object[] objArr = x0Var.f20753b;
                            long[] jArr = x0Var.f20752a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j10 = jArr[i10];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((255 & j10) < 128) {
                                                Object obj = objArr[(i10 << 3) + i12];
                                                if (!(obj instanceof h1.j0) || ((h1.j0) obj).n(1)) {
                                                    m0Var.d(obj);
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
                            for (Object obj2 : set2) {
                                if (!(obj2 instanceof h1.j0) || ((h1.j0) obj2).n(1)) {
                                    m0Var.d(obj2);
                                }
                            }
                        }
                        kVarX = k2Var.x();
                    } else {
                        kVarX = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (kVarX != null) {
                ((ph.m) kVarX).resumeWith(pg.f0.f21461a);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(k2 k2Var, q2 q2Var, d1 d1Var, tg.e eVar) {
        super(2, eVar);
        this.f31854d = k2Var;
        this.f31855e = q2Var;
        this.f31856f = d1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p2 p2Var = new p2(this.f31854d, this.f31855e, this.f31856f, eVar);
        p2Var.f31853c = obj;
        return p2Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ph.s1 s1VarF;
        sh.z0 z0Var;
        a1.e eVar;
        d1.b bVarAdd;
        h1.g gVar;
        List<f0> listA;
        k2 k2Var;
        sh.z0 z0Var2;
        a1.e eVar2;
        d1.b bVarM;
        k2 k2Var2;
        sh.z0 z0Var3;
        a1.e eVar3;
        d1.b bVarM2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f31852b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f31851a;
            s1VarF = (ph.s1) this.f31853c;
            try {
                pg.q.b(obj);
                gVar.a();
                k2Var2 = this.f31854d;
                synchronized (k2Var2.f31765b) {
                    try {
                        if (k2Var2.f31766c == s1VarF) {
                            k2Var2.f31766c = null;
                        }
                        k2Var2.x();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                sh.z0 z0Var4 = k2.f31762x;
                k2.c cVar = this.f31854d.f31786w;
                do {
                    z0Var3 = k2.f31762x;
                    eVar3 = (a1.e) z0Var3.getValue();
                    bVarM2 = eVar3.M(cVar);
                    if (eVar3 == bVarM2) {
                        break;
                    }
                } while (!z0Var3.a(eVar3, bVarM2));
                return pg.f0.f21461a;
            } catch (Throwable th3) {
                th = th3;
                gVar.a();
                k2Var = this.f31854d;
                synchronized (k2Var.f31765b) {
                    try {
                        if (k2Var.f31766c == s1VarF) {
                            k2Var.f31766c = null;
                        }
                        k2Var.x();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                sh.z0 z0Var5 = k2.f31762x;
                k2.c cVar2 = this.f31854d.f31786w;
                do {
                    z0Var2 = k2.f31762x;
                    eVar2 = (a1.e) z0Var2.getValue();
                    bVarM = eVar2.M(cVar2);
                    if (eVar2 == bVarM) {
                        break;
                    }
                } while (!z0Var2.a(eVar2, bVarM));
                throw th;
            }
        }
        pg.q.b(obj);
        s1VarF = ph.v1.f(((ph.i0) this.f31853c).getCoroutineContext());
        k2 k2Var3 = this.f31854d;
        synchronized (k2Var3.f31765b) {
            Throwable th5 = k2Var3.f31767d;
            if (th5 != null) {
                throw th5;
            }
            if (((k2.d) k2Var3.f31783t.getValue()).compareTo(k2.d.f31789b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (k2Var3.f31766c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            k2Var3.f31766c = s1VarF;
            k2Var3.x();
        }
        b bVar = new b(this.f31854d);
        h1.n.f(h1.n.f12158a);
        synchronized (h1.n.f12160c) {
            h1.n.f12165h = qg.x.P(bVar, h1.n.f12165h);
            pg.f0 f0Var = pg.f0.f21461a;
        }
        h1.g gVar2 = new h1.g(bVar);
        sh.z0 z0Var6 = k2.f31762x;
        k2.c cVar3 = this.f31854d.f31786w;
        try {
            do {
                z0Var = k2.f31762x;
                eVar = (a1.e) z0Var.getValue();
                bVarAdd = eVar.add((Object) cVar3);
                if (eVar != bVarAdd) {
                }
                break;
            } while (!z0Var.a(eVar, bVarAdd));
            break;
            k2 k2Var4 = this.f31854d;
            synchronized (k2Var4.f31765b) {
                listA = k2Var4.A();
            }
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                listA.get(i11).t();
            }
            a aVar2 = new a(this.f31855e, this.f31856f, null);
            this.f31853c = s1VarF;
            this.f31851a = gVar2;
            this.f31852b = 1;
            if (ph.j0.c(aVar2, this) == aVar) {
                return aVar;
            }
            gVar = gVar2;
            gVar.a();
            k2Var2 = this.f31854d;
            synchronized (k2Var2.f31765b) {
            }
        } catch (Throwable th6) {
            th = th6;
            gVar = gVar2;
            gVar.a();
            k2Var = this.f31854d;
            synchronized (k2Var.f31765b) {
            }
        }
    }
}
