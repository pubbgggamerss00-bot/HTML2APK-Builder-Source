package di;

import d0.q1;

/* loaded from: classes2.dex */
public final class o extends ci.a {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f8061a;

    /* renamed from: b, reason: collision with root package name */
    public final ei.b f8062b;

    public o(n0 n0Var, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.r.e(json, "json");
        this.f8061a = n0Var;
        this.f8062b = json.f16437b;
    }

    @Override // ci.a, ci.d
    public final byte B() {
        pg.v vVar;
        n0 n0Var = this.f8061a;
        String strJ = n0Var.j();
        try {
            kotlin.jvm.internal.r.e(strJ, "<this>");
            pg.x xVarC = q1.c(strJ);
            if (xVarC != null) {
                int i10 = xVarC.f21488a;
                vVar = Integer.compareUnsigned(i10, 255) > 0 ? null : new pg.v((byte) i10);
            }
            if (vVar != null) {
                return vVar.f21483a;
            }
            mh.s.f(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            n0.n(n0Var, "Failed to parse type 'UByte' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ci.a, ci.d
    public final short C() {
        pg.c0 c0Var;
        n0 n0Var = this.f8061a;
        String strJ = n0Var.j();
        try {
            kotlin.jvm.internal.r.e(strJ, "<this>");
            pg.x xVarC = q1.c(strJ);
            if (xVarC != null) {
                int i10 = xVarC.f21488a;
                c0Var = Integer.compareUnsigned(i10, 65535) > 0 ? null : new pg.c0((short) i10);
            }
            if (c0Var != null) {
                return c0Var.f21455a;
            }
            mh.s.f(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            n0.n(n0Var, "Failed to parse type 'UShort' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ci.d, ci.b
    public final ei.b a() {
        return this.f8062b;
    }

    @Override // ci.b
    public final int g(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // ci.a, ci.d
    public final int m() {
        n0 n0Var = this.f8061a;
        String strJ = n0Var.j();
        try {
            kotlin.jvm.internal.r.e(strJ, "<this>");
            pg.x xVarC = q1.c(strJ);
            if (xVarC != null) {
                return xVarC.f21488a;
            }
            mh.s.f(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            n0.n(n0Var, "Failed to parse type 'UInt' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // ci.a, ci.d
    public final long v() {
        n0 n0Var = this.f8061a;
        String strJ = n0Var.j();
        try {
            kotlin.jvm.internal.r.e(strJ, "<this>");
            pg.z zVarD = q1.d(strJ);
            if (zVarD != null) {
                return zVarD.f21493a;
            }
            mh.s.f(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            n0.n(n0Var, "Failed to parse type 'ULong' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
