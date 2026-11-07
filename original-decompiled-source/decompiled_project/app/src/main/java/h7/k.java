package h7;

import g2.b0;
import g2.g1;
import g2.k0;
import g2.m0;
import g2.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import qg.a0;
import x7.a;

/* loaded from: classes.dex */
public final class k implements x7.i, b0 {

    /* renamed from: b, reason: collision with root package name */
    public long f12321b;

    /* renamed from: c, reason: collision with root package name */
    public tg.j f12322c;

    @vg.e(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", l = {39}, m = "size")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public k f12323a;

        /* renamed from: b, reason: collision with root package name */
        public tg.j f12324b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f12325c;

        /* renamed from: e, reason: collision with root package name */
        public int f12327e;

        public a(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f12325c = obj;
            this.f12327e |= PKIFailureInfo.systemUnavail;
            return k.this.b(this);
        }
    }

    public final void A(long j10) {
        this.f12321b = j10;
        if (f3.b.l(j10)) {
            return;
        }
        tg.j jVar = this.f12322c;
        if (jVar != null) {
            jVar.resumeWith(f0.f21461a);
        }
        this.f12322c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tg.e<? super x7.h> eVar) {
        a aVar;
        k kVar;
        tg.j jVar;
        int i10;
        x7.a c0326a;
        int iH;
        x7.a c0326a2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i11 = aVar.f12327e;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f12327e = i11 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a((vg.c) eVar);
            }
        }
        Object obj = aVar.f12325c;
        ug.a aVar2 = ug.a.f29706a;
        int i12 = aVar.f12327e;
        if (i12 == 0) {
            pg.q.b(obj);
            if (!f3.b.l(this.f12321b)) {
                kVar = this;
                long j10 = kVar.f12321b;
                int i13 = i7.i.f14196b;
                i10 = f3.b.i(j10);
                if (i10 == Integer.MAX_VALUE) {
                    x7.b.a(i10);
                    c0326a = new a.C0326a(i10);
                } else {
                    c0326a = a.b.f32184a;
                }
                iH = f3.b.h(j10);
                if (iH == Integer.MAX_VALUE) {
                    x7.b.a(iH);
                    c0326a2 = new a.C0326a(iH);
                } else {
                    c0326a2 = a.b.f32184a;
                }
                return new x7.h(c0326a, c0326a2);
            }
            tg.j jVar2 = this.f12322c;
            aVar.f12323a = this;
            aVar.f12324b = jVar2;
            aVar.f12327e = 1;
            tg.j jVar3 = new tg.j(ah.p.c(aVar));
            this.f12322c = jVar3;
            if (jVar3.a() == aVar2) {
                return aVar2;
            }
            kVar = this;
            jVar = jVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = aVar.f12324b;
            kVar = aVar.f12323a;
            pg.q.b(obj);
        }
        if (jVar != null) {
            jVar.resumeWith(f0.f21461a);
        }
        long j102 = kVar.f12321b;
        int i132 = i7.i.f14196b;
        i10 = f3.b.i(j102);
        if (i10 == Integer.MAX_VALUE) {
        }
        iH = f3.b.h(j102);
        if (iH == Integer.MAX_VALUE) {
        }
        return new x7.h(c0326a, c0326a2);
    }

    @Override // g2.b0
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        A(j10);
        g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, a0.f22708a, new j(g1VarP, 0));
    }
}
