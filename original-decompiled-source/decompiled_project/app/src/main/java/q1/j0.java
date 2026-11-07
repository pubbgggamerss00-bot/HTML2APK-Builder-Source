package q1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.u1;

/* loaded from: classes.dex */
public final class j0 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f21712a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f21713b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f21714c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f21715d;

    public j0() {
        this(0);
    }

    @Override // q1.u1
    public final void a(float f10, float f11, float f12, float f13) {
        this.f21712a.rQuadTo(f10, f11, f12, f13);
    }

    @Override // q1.u1
    public final boolean b() {
        return this.f21712a.isConvex();
    }

    @Override // q1.u1
    public final void c(float f10, float f11) {
        this.f21712a.rMoveTo(f10, f11);
    }

    @Override // q1.u1
    public final void close() {
        this.f21712a.close();
    }

    @Override // q1.u1
    public final void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f21712a.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // q1.u1
    public final void e(float f10, float f11, float f12, float f13) {
        this.f21712a.quadTo(f10, f11, f12, f13);
    }

    @Override // q1.u1
    public final void g(float f10, float f11, float f12, float f13) {
        this.f21712a.rQuadTo(f10, f11, f12, f13);
    }

    @Override // q1.u1
    public final p1.e getBounds() {
        if (this.f21713b == null) {
            this.f21713b = new RectF();
        }
        RectF rectF = this.f21713b;
        kotlin.jvm.internal.r.b(rectF);
        this.f21712a.computeBounds(rectF, true);
        return new p1.e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // q1.u1
    public final void h(int i10) {
        this.f21712a.setFillType(i10 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // q1.u1
    public final void i(float f10, float f11, float f12, float f13) {
        this.f21712a.quadTo(f10, f11, f12, f13);
    }

    @Override // q1.u1
    public final int j() {
        return this.f21712a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // q1.u1
    public final void k(p1.g gVar) {
        u1.a aVar = u1.a.f21740a;
        if (this.f21713b == null) {
            this.f21713b = new RectF();
        }
        RectF rectF = this.f21713b;
        kotlin.jvm.internal.r.b(rectF);
        float f10 = gVar.f21135a;
        long j10 = gVar.f21142h;
        long j11 = gVar.f21141g;
        long j12 = gVar.f21140f;
        long j13 = gVar.f21139e;
        rectF.set(f10, gVar.f21136b, gVar.f21137c, gVar.f21138d);
        if (this.f21714c == null) {
            this.f21714c = new float[8];
        }
        float[] fArr = this.f21714c;
        kotlin.jvm.internal.r.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j13 & BodyPartID.bodyIdMax));
        fArr[2] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j12 & BodyPartID.bodyIdMax));
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax));
        fArr[6] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        RectF rectF2 = this.f21713b;
        kotlin.jvm.internal.r.b(rectF2);
        float[] fArr2 = this.f21714c;
        kotlin.jvm.internal.r.b(fArr2);
        this.f21712a.addRoundRect(rectF2, fArr2, l0.b(aVar));
    }

    @Override // q1.u1
    public final void l(float f10, float f11) {
        this.f21712a.moveTo(f10, f11);
    }

    @Override // q1.u1
    public final void m(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f21712a.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // q1.u1
    public final void n() {
        this.f21712a.rewind();
    }

    @Override // q1.u1
    public final void o(float f10, float f11) {
        this.f21712a.rLineTo(f10, f11);
    }

    @Override // q1.u1
    public final void p(float f10, float f11) {
        this.f21712a.lineTo(f10, f11);
    }

    public final boolean q(u1 u1Var, u1 u1Var2, int i10) {
        Path.Op op = i10 == 0 ? Path.Op.DIFFERENCE : i10 == 1 ? Path.Op.INTERSECT : i10 == 4 ? Path.Op.REVERSE_DIFFERENCE : i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(u1Var instanceof j0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((j0) u1Var).f21712a;
        if (u1Var2 instanceof j0) {
            return this.f21712a.op(path, ((j0) u1Var2).f21712a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // q1.u1
    public final void reset() {
        this.f21712a.reset();
    }

    public j0(int i10) {
        this.f21712a = new Path();
    }
}
