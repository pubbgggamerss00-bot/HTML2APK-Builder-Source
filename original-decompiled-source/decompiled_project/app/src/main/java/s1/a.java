package s1;

import android.graphics.Paint;
import f3.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.l;
import q1.b1;
import q1.c1;
import q1.h0;
import q1.i0;
import q1.i2;
import q1.n1;
import q1.p0;
import q1.u0;
import q1.u1;
import q1.w0;
import q1.w1;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C0270a f24172a;

    /* renamed from: b, reason: collision with root package name */
    public final b f24173b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f24174c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f24175d;

    /* renamed from: s1.a$a, reason: collision with other inner class name */
    public static final class C0270a {

        /* renamed from: a, reason: collision with root package name */
        public f3.d f24176a;

        /* renamed from: b, reason: collision with root package name */
        public r f24177b;

        /* renamed from: c, reason: collision with root package name */
        public w0 f24178c;

        /* renamed from: d, reason: collision with root package name */
        public long f24179d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0270a)) {
                return false;
            }
            C0270a c0270a = (C0270a) obj;
            return kotlin.jvm.internal.r.a(this.f24176a, c0270a.f24176a) && this.f24177b == c0270a.f24177b && kotlin.jvm.internal.r.a(this.f24178c, c0270a.f24178c) && p1.h.a(this.f24179d, c0270a.f24179d);
        }

        public final int hashCode() {
            return Long.hashCode(this.f24179d) + ((this.f24178c.hashCode() + ((this.f24177b.hashCode() + (this.f24176a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.f24176a + ", layoutDirection=" + this.f24177b + ", canvas=" + this.f24178c + ", size=" + ((Object) p1.h.f(this.f24179d)) + ')';
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final s1.b f24180a = new s1.b(this);

        /* renamed from: b, reason: collision with root package name */
        public t1.d f24181b;

        public b() {
        }

        public final w0 a() {
            return a.this.f24172a.f24178c;
        }

        public final f3.d b() {
            return a.this.f24172a.f24176a;
        }

        public final r c() {
            return a.this.f24172a.f24177b;
        }

        public final long d() {
            return a.this.f24172a.f24179d;
        }

        public final void e(w0 w0Var) {
            a.this.f24172a.f24178c = w0Var;
        }

        public final void f(f3.d dVar) {
            a.this.f24172a.f24176a = dVar;
        }

        public final void g(r rVar) {
            a.this.f24172a.f24177b = rVar;
        }

        public final void h(long j10) {
            a.this.f24172a.f24179d = j10;
        }
    }

    public a() {
        r rVar = r.f8828a;
        C0270a c0270a = new C0270a();
        c0270a.f24176a = d.f24184a;
        c0270a.f24177b = rVar;
        c0270a.f24178c = g.f24185a;
        c0270a.f24179d = 0L;
        this.f24172a = c0270a;
        this.f24173b = new b();
    }

    public static h0 m(a aVar, long j10, f fVar, float f10, c1 c1Var, int i10) {
        h0 h0VarW = aVar.w(fVar);
        if (f10 != 1.0f) {
            j10 = b1.c(b1.e(j10) * f10, j10);
        }
        if (!b1.d(h0VarW.c(), j10)) {
            h0VarW.i(j10);
        }
        if (h0VarW.f21696c != null) {
            h0VarW.l(null);
        }
        if (!kotlin.jvm.internal.r.a(h0VarW.f21697d, c1Var)) {
            h0VarW.j(c1Var);
        }
        if (h0VarW.f21695b != i10) {
            h0VarW.h(i10);
        }
        if (h0VarW.f21694a.isFilterBitmap()) {
            return h0VarW;
        }
        h0VarW.k(1);
        return h0VarW;
    }

    @Override // s1.e
    public final void A1(long j10, long j11, long j12, float f10, f fVar, c1 c1Var, int i10) {
        w0 w0Var = this.f24172a.f24178c;
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & BodyPartID.bodyIdMax);
        w0Var.t(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i12), m(this, j10, fVar, f10, c1Var, i10));
    }

    @Override // s1.e
    public final void B1(long j10, long j11, long j12, long j13, f fVar, float f10) {
        w0 w0Var = this.f24172a.f24178c;
        int i10 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j11 & BodyPartID.bodyIdMax);
        w0Var.p(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & BodyPartID.bodyIdMax)), m(this, j10, fVar, f10, null, 3));
    }

    @Override // s1.e
    public final void D1(n1 n1Var, f fVar, p0 p0Var) {
        this.f24172a.f24178c.c(n1Var, r(null, fVar, 1.0f, p0Var, 3, 1));
    }

    @Override // f3.d
    public final float G0() {
        return this.f24172a.f24176a.G0();
    }

    @Override // s1.e
    public final void H0(u1 u1Var, u0 u0Var, float f10, f fVar, int i10) {
        this.f24172a.f24178c.k(u1Var, r(u0Var, fVar, f10, null, i10, 1));
    }

    @Override // s1.e
    public final b Q0() {
        return this.f24173b;
    }

    @Override // s1.e
    public final void S0(long j10, float f10, float f11, long j11, long j12, f fVar) {
        w0 w0Var = this.f24172a.f24178c;
        int i10 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j11 & BodyPartID.bodyIdMax);
        w0Var.e(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i11), f10, f11, m(this, j10, fVar, 1.0f, null, 3));
    }

    @Override // s1.e
    public final void c0(u0 u0Var, long j10, long j11, float f10, f fVar) {
        w0 w0Var = this.f24172a.f24178c;
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        w0Var.t(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j11)) + Float.intBitsToFloat(i11), r(u0Var, fVar, f10, null, 3, 1));
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f24172a.f24176a.getDensity();
    }

    @Override // s1.e
    public final r getLayoutDirection() {
        return this.f24172a.f24177b;
    }

    @Override // s1.e
    public final void h0(u0 u0Var, long j10, long j11, long j12, float f10, f fVar) {
        w0 w0Var = this.f24172a.f24178c;
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        w0Var.p(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax)), r(u0Var, fVar, f10, null, 3, 1));
    }

    @Override // s1.e
    public final void j1(i2 i2Var, long j10, long j11, float f10, float f11) {
        w0 w0Var = this.f24172a.f24178c;
        h0 h0VarA = this.f24175d;
        if (h0VarA == null) {
            h0VarA = i0.a();
            h0VarA.q(1);
            this.f24175d = h0VarA;
        }
        Paint paint = h0VarA.f21694a;
        i2Var.a(f11, i(), h0VarA);
        if (!kotlin.jvm.internal.r.a(h0VarA.f21697d, null)) {
            h0VarA.j(null);
        }
        if (h0VarA.f21695b != 3) {
            h0VarA.h(3);
        }
        if (paint.getStrokeWidth() != f10) {
            h0VarA.p(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            h0VarA.o(4.0f);
        }
        if (h0VarA.e() != 0) {
            h0VarA.m(0);
        }
        if (h0VarA.f() != 0) {
            h0VarA.n(0);
        }
        if (!paint.isFilterBitmap()) {
            h0VarA.k(1);
        }
        w0Var.l(j10, j11, h0VarA);
    }

    @Override // s1.e
    public final void k0(long j10, long j11, long j12, float f10, int i10) {
        w0 w0Var = this.f24172a.f24178c;
        h0 h0VarA = this.f24175d;
        if (h0VarA == null) {
            h0VarA = i0.a();
            h0VarA.q(1);
            this.f24175d = h0VarA;
        }
        Paint paint = h0VarA.f21694a;
        if (!b1.d(h0VarA.c(), j10)) {
            h0VarA.i(j10);
        }
        if (h0VarA.f21696c != null) {
            h0VarA.l(null);
        }
        if (!kotlin.jvm.internal.r.a(h0VarA.f21697d, null)) {
            h0VarA.j(null);
        }
        if (h0VarA.f21695b != 3) {
            h0VarA.h(3);
        }
        if (paint.getStrokeWidth() != f10) {
            h0VarA.p(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            h0VarA.o(4.0f);
        }
        if (h0VarA.e() != i10) {
            h0VarA.m(i10);
        }
        if (h0VarA.f() != 0) {
            h0VarA.n(0);
        }
        if (!paint.isFilterBitmap()) {
            h0VarA.k(1);
        }
        w0Var.l(j11, j12, h0VarA);
    }

    @Override // s1.e
    public final void n0(u1 u1Var, long j10, f fVar, int i10) {
        this.f24172a.f24178c.k(u1Var, m(this, j10, fVar, 1.0f, null, i10));
    }

    @Override // s1.e
    public final void o1(long j10, float f10, long j11, f fVar, int i10) {
        this.f24172a.f24178c.q(f10, j11, m(this, j10, fVar, 1.0f, null, i10));
    }

    public final h0 r(u0 u0Var, f fVar, float f10, c1 c1Var, int i10, int i11) {
        h0 h0VarW = w(fVar);
        if (u0Var != null) {
            u0Var.a(f10, i(), h0VarW);
        } else {
            if (h0VarW.f21696c != null) {
                h0VarW.l(null);
            }
            long jC = h0VarW.c();
            long j10 = b1.f21648b;
            if (!b1.d(jC, j10)) {
                h0VarW.i(j10);
            }
            if (h0VarW.b() != f10) {
                h0VarW.g(f10);
            }
        }
        if (!kotlin.jvm.internal.r.a(h0VarW.f21697d, c1Var)) {
            h0VarW.j(c1Var);
        }
        if (h0VarW.f21695b != i10) {
            h0VarW.h(i10);
        }
        if (h0VarW.f21694a.isFilterBitmap() == i11) {
            return h0VarW;
        }
        h0VarW.k(i11);
        return h0VarW;
    }

    public final h0 w(f fVar) {
        if (kotlin.jvm.internal.r.a(fVar, h.f24186a)) {
            h0 h0Var = this.f24174c;
            if (h0Var != null) {
                return h0Var;
            }
            h0 h0VarA = i0.a();
            h0VarA.q(0);
            this.f24174c = h0VarA;
            return h0VarA;
        }
        if (!(fVar instanceof i)) {
            throw new l();
        }
        h0 h0VarA2 = this.f24175d;
        if (h0VarA2 == null) {
            h0VarA2 = i0.a();
            h0VarA2.q(1);
            this.f24175d = h0VarA2;
        }
        Paint paint = h0VarA2.f21694a;
        float strokeWidth = paint.getStrokeWidth();
        i iVar = (i) fVar;
        float f10 = iVar.f24187a;
        if (strokeWidth != f10) {
            h0VarA2.p(f10);
        }
        int iE = h0VarA2.e();
        int i10 = iVar.f24189c;
        if (iE != i10) {
            h0VarA2.m(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = iVar.f24188b;
        if (strokeMiter != f11) {
            h0VarA2.o(f11);
        }
        int iF = h0VarA2.f();
        int i11 = iVar.f24190d;
        if (iF != i11) {
            h0VarA2.n(i11);
        }
        return h0VarA2;
    }

    @Override // s1.e
    public final void x0(w1 w1Var, float f10, long j10, f fVar) {
        this.f24172a.f24178c.q(f10, j10, r(w1Var, fVar, 1.0f, null, 3, 1));
    }

    @Override // s1.e
    public final void y0(n1 n1Var, long j10, long j11, long j12, long j13, float f10, f fVar, c1 c1Var, int i10, int i11) {
        this.f24172a.f24178c.r(n1Var, j10, j11, j12, j13, r(null, fVar, f10, c1Var, i10, i11));
    }
}
