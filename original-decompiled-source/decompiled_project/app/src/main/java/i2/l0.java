package i2;

import g2.h1;
import i2.e0;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class l0 extends g2.g1 implements y0, b1 {

    /* renamed from: m, reason: collision with root package name */
    public static final a f13935m = a.f13942a;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13936f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13937g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13938h;

    /* renamed from: j, reason: collision with root package name */
    public final g2.h0 f13939j;

    /* renamed from: k, reason: collision with root package name */
    public p.e0<g2.l1> f13940k;

    /* renamed from: l, reason: collision with root package name */
    public p.e0<g2.l1> f13941l;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<h2, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13942a = new a(1);

        @Override // eh.l
        public final pg.f0 invoke(h2 h2Var) {
            h2 h2Var2 = h2Var;
            if (h2Var2.U()) {
                h2Var2.f13912b.r0(h2Var2);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h2 f13943a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0 f13944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h2 h2Var, l0 l0Var) {
            super(0);
            this.f13943a = h2Var;
            this.f13944b = l0Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            eh.l<Object, pg.f0> lVarT = this.f13943a.f13911a.t();
            if (lVarT != null) {
                lVarT.invoke(new n0(this.f13944b));
            }
            return pg.f0.f21461a;
        }
    }

    public l0() {
        h1.a aVar = g2.h1.f11391a;
        this.f13939j = new g2.h0(this);
    }

    public static void B0(g1 g1Var) {
        g0 g0Var;
        g1 g1Var2 = g1Var.f13877r;
        e0 e0Var = g1Var.f13874n;
        if (!kotlin.jvm.internal.r.a(g1Var2 != null ? g1Var2.f13874n : null, e0Var)) {
            e0Var.K.f13929p.B.g();
            return;
        }
        i2.b bVarH = e0Var.K.f13929p.H();
        if (bVarH == null || (g0Var = ((x0) bVarH).B) == null) {
            return;
        }
        g0Var.g();
    }

    public abstract void E0();

    @Override // g2.q
    public boolean I0() {
        return false;
    }

    @Override // g2.o0
    public final g2.m0 K0(int i10, int i11, Map map, eh.l lVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new m0(i10, i11, map, lVar, this);
    }

    @Override // g2.p0
    public final int Q(g2.a aVar) {
        int iQ0;
        return (u0() && (iQ0 = q0(aVar)) != Integer.MIN_VALUE) ? iQ0 + ((int) (this.f11386e & BodyPartID.bodyIdMax)) : PKIFailureInfo.systemUnavail;
    }

    @Override // i2.b1
    public final void T(boolean z10) {
        l0 l0VarW0 = w0();
        e0 e0VarK1 = l0VarW0 != null ? l0VarW0.k1() : null;
        if (kotlin.jvm.internal.r.a(e0VarK1, k1())) {
            this.f13936f = z10;
            return;
        }
        if ((e0VarK1 != null ? e0VarK1.K.f13917d : null) != e0.d.f13835c) {
            if ((e0VarK1 != null ? e0VarK1.K.f13917d : null) != e0.d.f13836d) {
                return;
            }
        }
        this.f13936f = z10;
    }

    public abstract e0 k1();

    public abstract int q0(g2.a aVar);

    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(h2 h2Var) {
        long j10;
        long j11;
        long j12;
        char c10;
        l0 l0VarW0;
        f2 snapshotObserver;
        char c11;
        if (this.f13938h || h2Var.f13911a.t() == null) {
            return;
        }
        p.e0 e0Var = this.f13941l;
        if (e0Var == null) {
            e0Var = new p.e0((Object) null);
            this.f13941l = e0Var;
        }
        p.e0<g2.l1> e0Var2 = this.f13940k;
        if (e0Var2 == null) {
            e0Var2 = new p.e0<>((Object) null);
            this.f13940k = e0Var2;
        }
        Object[] objArr = e0Var2.f20605b;
        float[] fArr = e0Var2.f20606c;
        long[] jArr = e0Var2.f20604a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            j10 = 128;
            j11 = 255;
            while (true) {
                long j13 = jArr[i10];
                char c12 = 7;
                j12 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            c11 = c12;
                            e0Var.e(objArr[i13], fArr[i13]);
                        } else {
                            c11 = c12;
                        }
                        j13 >>= 8;
                        i12++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            j10 = 128;
            j11 = 255;
            j12 = -9187201950435737472L;
            c10 = 7;
        }
        e0Var2.a();
        v1 v1Var = k1().f13822p;
        if (v1Var != null && (snapshotObserver = v1Var.getSnapshotObserver()) != null) {
            snapshotObserver.a(h2Var, f13935m, new b(h2Var, this));
        }
        Object[] objArr2 = e0Var2.f20605b;
        long[] jArr2 = e0Var2.f20604a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j14 = jArr2[i14];
                if ((((~j14) << c10) & j14 & j12) != j12) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j14 & j11) < j10) {
                            g2.l1 l1Var = (g2.l1) objArr2[(i14 << 3) + i16];
                            if (e0Var.c(l1Var) < 0 && (l0VarW0 = w0()) != null) {
                                do {
                                    p.e0<g2.l1> e0Var3 = l0VarW0.f13940k;
                                    if (e0Var3 == null || e0Var3.c(l1Var) < 0) {
                                        l0VarW0 = l0VarW0.w0();
                                    }
                                } while (l0VarW0 != null);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 == length2) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        e0Var.a();
    }

    public abstract l0 s0();

    public abstract g2.v t0();

    public abstract boolean u0();

    public abstract g2.m0 v0();

    public abstract l0 w0();

    public abstract long z0();
}
