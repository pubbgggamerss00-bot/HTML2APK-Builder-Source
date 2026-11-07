package b2;

import androidx.compose.ui.d;
import f3.w;
import i2.o2;
import i2.p2;
import kotlin.jvm.internal.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.q;
import ph.i0;

/* loaded from: classes.dex */
public final class e extends d.c implements o2, b2.a {

    /* renamed from: q, reason: collision with root package name */
    public b2.a f3518q;

    /* renamed from: r, reason: collision with root package name */
    public b2.b f3519r;

    /* renamed from: s, reason: collision with root package name */
    public e f3520s;

    /* renamed from: t, reason: collision with root package name */
    public final String f3521t;

    @vg.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {103, 113}, m = "onPostFling-RZ2iAVY")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public e f3522a;

        /* renamed from: b, reason: collision with root package name */
        public long f3523b;

        /* renamed from: c, reason: collision with root package name */
        public long f3524c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f3525d;

        /* renamed from: f, reason: collision with root package name */
        public int f3527f;

        public a(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f3525d = obj;
            this.f3527f |= PKIFailureInfo.systemUnavail;
            return e.this.x1(0L, 0L, this);
        }
    }

    @vg.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {HeaderItem.CLASS_COUNT_OFFSET, 97}, m = "onPreFling-QWom1Mo")
    public static final class b extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public e f3528a;

        /* renamed from: b, reason: collision with root package name */
        public long f3529b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f3530c;

        /* renamed from: e, reason: collision with root package name */
        public int f3532e;

        public b(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f3530c = obj;
            this.f3532e |= PKIFailureInfo.systemUnavail;
            return e.this.e0(0L, this);
        }
    }

    public e(b2.a aVar, b2.b bVar) {
        this.f3518q = aVar;
        this.f3519r = bVar == null ? new b2.b() : bVar;
        this.f3521t = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // i2.o2
    public final Object L() {
        return this.f3521t;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        b2.b bVar = this.f3519r;
        bVar.f3507a = this;
        bVar.f3508b = null;
        this.f3520s = null;
        bVar.f3509c = new f(this);
        this.f3519r.f3510d = H1();
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        g0 g0Var = new g0();
        p2.b(this, new g(g0Var));
        e eVar = (e) ((o2) g0Var.f16327a);
        this.f3520s = eVar;
        b2.b bVar = this.f3519r;
        bVar.f3508b = eVar;
        if (bVar.f3507a == this) {
            bVar.f3507a = null;
        }
    }

    public final i0 T1() {
        e eVar = this.f1157p ? (e) p2.a(this) : null;
        if (eVar != null) {
            return eVar.T1();
        }
        i0 i0Var = this.f3519r.f3510d;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(long j10, tg.e<? super w> eVar) {
        b bVar;
        long j11;
        e eVar2;
        long j12;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f3532e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f3532e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b((vg.c) eVar);
            }
        }
        Object objE0 = bVar.f3530c;
        ug.a aVar = ug.a.f29706a;
        int i11 = bVar.f3532e;
        if (i11 == 0) {
            q.b(objE0);
            boolean z10 = this.f1157p;
            e eVar3 = (z10 && z10) ? (e) p2.a(this) : null;
            if (eVar3 != null) {
                bVar.f3528a = this;
                bVar.f3529b = j10;
                bVar.f3532e = 1;
                objE0 = eVar3.e0(j10, bVar);
                if (objE0 != aVar) {
                    eVar2 = this;
                }
                return aVar;
            }
            j11 = 0;
            eVar2 = this;
            long j13 = j11;
            long j14 = j10;
            j12 = j13;
            b2.a aVar2 = eVar2.f3518q;
            long jD = w.d(j14, j12);
            bVar.f3528a = null;
            bVar.f3529b = j12;
            bVar.f3532e = 2;
            objE0 = aVar2.e0(jD, bVar);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = bVar.f3529b;
                q.b(objE0);
                return new w(w.e(j12, ((w) objE0).f8837a));
            }
            j10 = bVar.f3529b;
            eVar2 = bVar.f3528a;
            q.b(objE0);
        }
        j11 = ((w) objE0).f8837a;
        long j132 = j11;
        long j142 = j10;
        j12 = j132;
        b2.a aVar22 = eVar2.f3518q;
        long jD2 = w.d(j142, j12);
        bVar.f3528a = null;
        bVar.f3529b = j12;
        bVar.f3532e = 2;
        objE0 = aVar22.e0(jD2, bVar);
    }

    @Override // b2.a
    public final long n1(long j10, long j11, int i10) {
        long jN1 = this.f3518q.n1(j10, j11, i10);
        boolean z10 = this.f1157p;
        e eVar = null;
        if (z10 && z10) {
            eVar = (e) p2.a(this);
        }
        e eVar2 = eVar;
        return p1.c.g(jN1, eVar2 != null ? eVar2.n1(p1.c.g(j10, jN1), p1.c.f(j11, jN1), i10) : 0L);
    }

    @Override // b2.a
    public final long v0(int i10, long j10) {
        boolean z10 = this.f1157p;
        e eVar = null;
        if (z10 && z10) {
            eVar = (e) p2.a(this);
        }
        long jV0 = eVar != null ? eVar.v0(i10, j10) : 0L;
        return p1.c.g(jV0, this.f3518q.v0(i10, p1.c.f(j10, jV0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x1(long j10, long j11, tg.e<? super w> eVar) {
        a aVar;
        e eVar2;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f3527f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3527f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a((vg.c) eVar);
            }
        }
        a aVar2 = aVar;
        Object objX1 = aVar2.f3525d;
        ug.a aVar3 = ug.a.f29706a;
        int i11 = aVar2.f3527f;
        if (i11 == 0) {
            q.b(objX1);
            b2.a aVar4 = this.f3518q;
            aVar2.f3522a = this;
            aVar2.f3523b = j10;
            aVar2.f3524c = j11;
            aVar2.f3527f = 1;
            objX1 = aVar4.x1(j10, j11, aVar2);
            if (objX1 != aVar3) {
                eVar2 = this;
                j12 = j10;
                j13 = j11;
            }
            return aVar3;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j16 = aVar2.f3523b;
            q.b(objX1);
            j15 = ((w) objX1).f8837a;
            j14 = j16;
            return new w(w.e(j14, j15));
        }
        j13 = aVar2.f3524c;
        j12 = aVar2.f3523b;
        eVar2 = aVar2.f3522a;
        q.b(objX1);
        j14 = ((w) objX1).f8837a;
        boolean z10 = eVar2.f1157p;
        e eVar3 = z10 ? (z10 && z10) ? (e) p2.a(eVar2) : null : eVar2.f3520s;
        if (eVar3 == null) {
            j15 = 0;
            return new w(w.e(j14, j15));
        }
        long jE = w.e(j12, j14);
        long jD = w.d(j13, j14);
        aVar2.f3522a = null;
        aVar2.f3523b = j14;
        aVar2.f3527f = 2;
        objX1 = eVar3.x1(jE, jD, aVar2);
        if (objX1 != aVar3) {
            j16 = j14;
            j15 = ((w) objX1).f8837a;
            j14 = j16;
            return new w(w.e(j14, j15));
        }
        return aVar3;
    }
}
