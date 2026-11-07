package z;

import org.bouncycastle.asn1.cmc.BodyPartID;
import z.g0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f34432a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34435d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final g2.k0 f34436a;

        /* renamed from: b, reason: collision with root package name */
        public final g2.g1 f34437b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34438c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f34439d = true;

        public a(g2.k0 k0Var, g2.g1 g1Var, long j10) {
            this.f34436a = k0Var;
            this.f34437b = g1Var;
            this.f34438c = j10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f34440a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34441b;

        public b(boolean z10, boolean z11) {
            this.f34440a = z10;
            this.f34441b = z11;
        }
    }

    public a0(j0 j0Var, long j10, int i10, int i11) {
        this.f34432a = j0Var;
        this.f34433b = j10;
        this.f34434c = i10;
        this.f34435d = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a aVar;
        g2.k0 k0Var;
        p.g gVar;
        g2.g1 g1Var;
        if (bVar.f34441b) {
            j0 j0Var = this.f34432a;
            int iOrdinal = j0Var.f34550a.ordinal();
            boolean z11 = true;
            if (iOrdinal == 0 || iOrdinal == 1) {
                aVar = null;
                if (aVar != null) {
                    if (i10 < 0 || (i13 != 0 && (i12 - ((int) (aVar.f34438c >> 32)) < 0 || i13 >= Integer.MAX_VALUE))) {
                        z11 = false;
                    }
                    aVar.f34439d = z11;
                    return aVar;
                }
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new pg.l();
                }
                if (z10) {
                    k0Var = j0Var.f34551b;
                    gVar = j0Var.f34555f;
                    g1Var = j0Var.f34552c;
                } else {
                    k0Var = (i10 < -1 || i11 < 0) ? null : j0Var.f34553d;
                    gVar = j0Var.f34556g;
                    g1Var = j0Var.f34554e;
                }
                if (k0Var != null) {
                    kotlin.jvm.internal.r.b(gVar);
                    aVar = new a(k0Var, g1Var, gVar.f20623a);
                }
                if (aVar != null) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b(boolean z10, int i10, long j10, p.g gVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        long j11;
        int i14 = i12 + i13;
        if (gVar == null) {
            return new b(true, true);
        }
        long j12 = gVar.f20623a;
        j0 j0Var = this.f34432a;
        if (j0Var.f34550a != g0.a.f34513a && (i11 >= Integer.MAX_VALUE || ((int) (j10 & BodyPartID.bodyIdMax)) - ((int) (j12 & BodyPartID.bodyIdMax)) < 0)) {
            return new b(true, true);
        }
        int i15 = this.f34434c;
        int i16 = this.f34435d;
        long j13 = this.f34433b;
        if (i10 != 0) {
            if (i10 >= Integer.MAX_VALUE) {
                j11 = 4294967295L;
            } else {
                j11 = 4294967295L;
            }
            return z11 ? new b(true, true) : new b(true, b(z10, 0, p.g.a(f3.b.i(j13), (((int) (j10 & j11)) - i16) - i13), new p.g(p.g.a(((int) (j12 >> 32)) - i15, (int) (j12 & j11))), i11 + 1, i14, 0, true, false).f34441b);
        }
        j11 = 4294967295L;
        int i17 = (int) (j12 & j11);
        int iMax = Math.max(i13, i17) + i12;
        p.g gVarA = z12 ? null : j0Var.a(i11, iMax, z10);
        if (gVarA == null || (i10 + 1 < Integer.MAX_VALUE && ((((int) (j10 >> 32)) - ((int) (j12 >> 32))) - i15) - ((int) (gVarA.f20623a >> 32)) >= 0)) {
            return new b(false, false);
        }
        if (z12) {
            return new b(true, true);
        }
        boolean z13 = b(false, 0, p.g.a(f3.b.i(j13), (((int) (j10 & j11)) - i16) - Math.max(i13, i17)), gVarA, i11 + 1, iMax, 0, true, true).f34441b;
        return new b(z13, z13);
    }
}
