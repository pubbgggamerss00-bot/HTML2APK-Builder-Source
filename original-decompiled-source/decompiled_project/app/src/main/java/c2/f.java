package c2;

import androidx.compose.ui.d;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g2.v f4629a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4630b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4632d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4633e;

    /* renamed from: f, reason: collision with root package name */
    public final p.h0<d.c> f4634f = new p.h0<>((Object) null);

    /* renamed from: g, reason: collision with root package name */
    public final p f4635g = new p();

    /* renamed from: h, reason: collision with root package name */
    public final p.c0<p.h0<o>> f4636h = new p.c0<>(10);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.c f4638b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d.c cVar) {
            super(0);
            this.f4638b = cVar;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            f.this.d(this.f4638b);
            return pg.f0.f21461a;
        }
    }

    public f(g2.v vVar) {
        this.f4629a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j10, List<? extends d.c> list, boolean z10) {
        int i10;
        o oVar;
        p.h0<o> h0VarB;
        o oVar2;
        p.c0<p.h0<o>> c0Var = this.f4636h;
        c0Var.c();
        int size = list.size();
        p pVar = this.f4635g;
        p pVar2 = pVar;
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            d.c cVar = list.get(i11);
            if (cVar.f1157p) {
                cVar.f1156n = new a(cVar);
                if (z11) {
                    z0.b<o> bVar = pVar2.f4684a;
                    o[] oVarArr = bVar.f34700a;
                    int i12 = bVar.f34702c;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            oVar2 = null;
                            break;
                        }
                        oVar2 = oVarArr[i13];
                        if (kotlin.jvm.internal.r.a(oVar2.f4675c, cVar)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    oVar = oVar2;
                    if (oVar != null) {
                        oVar.f4681i = true;
                        oVar.f4676d.a(j10);
                        p.h0<o> h0VarB2 = c0Var.b(j10);
                        if (h0VarB2 == null) {
                            h0VarB2 = new p.h0<>((Object) null);
                            c0Var.h(h0VarB2, j10);
                        }
                        h0VarB2.g(oVar);
                        pVar2 = oVar;
                    } else {
                        z11 = false;
                        oVar = new o(cVar);
                        oVar.f4676d.a(j10);
                        h0VarB = c0Var.b(j10);
                        if (h0VarB == null) {
                            h0VarB = new p.h0<>((Object) null);
                            c0Var.h(h0VarB, j10);
                        }
                        h0VarB.g(oVar);
                        pVar2.f4684a.b(oVar);
                        pVar2 = oVar;
                    }
                } else {
                    oVar = new o(cVar);
                    oVar.f4676d.a(j10);
                    h0VarB = c0Var.b(j10);
                    if (h0VarB == null) {
                    }
                    h0VarB.g(oVar);
                    pVar2.f4684a.b(oVar);
                    pVar2 = oVar;
                }
            }
        }
        if (!z10) {
            return;
        }
        long[] jArr = c0Var.f20678b;
        Object[] objArr = c0Var.f20679c;
        long[] jArr2 = c0Var.f20677a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j11 = jArr2[i14];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j11) < 128) {
                        int i18 = (i14 << 3) + i17;
                        long j12 = jArr[i18];
                        p.h0<o> h0Var = (p.h0) objArr[i18];
                        z0.b<o> bVar2 = pVar.f4684a;
                        i10 = i15;
                        o[] oVarArr2 = bVar2.f34700a;
                        int i19 = bVar2.f34702c;
                        for (int i20 = 0; i20 < i19; i20++) {
                            oVarArr2[i20].f(j12, h0Var);
                        }
                    } else {
                        i10 = i15;
                    }
                    j11 >>= i10;
                    i17++;
                    i15 = i10;
                }
                if (i16 != i15) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final boolean b(j jVar, boolean z10) {
        p.q<b0> qVar = jVar.f4651a;
        g2.v vVar = this.f4629a;
        p pVar = this.f4635g;
        boolean zA = pVar.a(qVar, vVar, jVar, z10);
        z0.b<o> bVar = pVar.f4684a;
        if (!zA) {
            return false;
        }
        boolean z11 = true;
        this.f4630b = true;
        o[] oVarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = oVarArr[i11].e(jVar, z10) || z12;
        }
        o[] oVarArr2 = bVar.f34700a;
        int i12 = bVar.f34702c;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = oVarArr2[i13].d(jVar) || z13;
        }
        pVar.b(jVar);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f4630b = false;
        if (this.f4633e) {
            this.f4633e = false;
            p.h0<d.c> h0Var = this.f4634f;
            int i14 = h0Var.f20707b;
            for (int i15 = 0; i15 < i14; i15++) {
                d(h0Var.b(i15));
            }
            h0Var.i();
        }
        if (this.f4631c) {
            this.f4631c = false;
            c();
        }
        if (this.f4632d) {
            this.f4632d = false;
            pVar.f4684a.g();
        }
        return z11;
    }

    public final void c() {
        if (this.f4630b) {
            this.f4631c = true;
            return;
        }
        p pVar = this.f4635g;
        z0.b<o> bVar = pVar.f4684a;
        o[] oVarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            oVarArr[i11].c();
        }
        if (this.f4632d) {
            this.f4632d = true;
        } else {
            pVar.f4684a.g();
        }
    }

    public final void d(d.c cVar) {
        if (this.f4630b) {
            this.f4633e = true;
            this.f4634f.g(cVar);
            return;
        }
        p pVar = this.f4635g;
        p.h0<p> h0Var = pVar.f4685b;
        h0Var.i();
        h0Var.g(pVar);
        while (h0Var.e()) {
            p pVarK = h0Var.k(h0Var.f20707b - 1);
            int i10 = 0;
            while (true) {
                z0.b<o> bVar = pVarK.f4684a;
                if (i10 < bVar.f34702c) {
                    o oVar = bVar.f34700a[i10];
                    if (kotlin.jvm.internal.r.a(oVar.f4675c, cVar)) {
                        pVarK.f4684a.j(oVar);
                        oVar.c();
                    } else {
                        h0Var.g(oVar);
                        i10++;
                    }
                }
            }
        }
    }
}
