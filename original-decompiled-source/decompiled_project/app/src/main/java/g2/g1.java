package g2;

import com.yalantis.ucrop.view.CropImageView;
import g2.h1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class g1 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f11382a;

    /* renamed from: b, reason: collision with root package name */
    public int f11383b;

    /* renamed from: c, reason: collision with root package name */
    public long f11384c;

    /* renamed from: d, reason: collision with root package name */
    public long f11385d = h1.f11392b;

    /* renamed from: e, reason: collision with root package name */
    public long f11386e = 0;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11387a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(a aVar, g1 g1Var) {
            aVar.getClass();
            if (g1Var instanceof i2.b1) {
                ((i2.b1) g1Var).T(aVar.f11387a);
            }
        }

        public static void f(a aVar, g1 g1Var, long j10) {
            aVar.getClass();
            a(aVar, g1Var);
            g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j10, g1Var.f11386e), null);
        }

        public static void g(a aVar, g1 g1Var, int i10, int i11) {
            long j10 = (i10 << 32) | (i11 & BodyPartID.bodyIdMax);
            if (aVar.b() == f3.r.f8828a || aVar.c() == 0) {
                a(aVar, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j10, g1Var.f11386e), null);
            } else {
                long jC = (((aVar.c() - g1Var.f11382a) - ((int) (j10 >> 32))) << 32) | (((int) (j10 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                a(aVar, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(jC, g1Var.f11386e), null);
            }
        }

        public static void h(a aVar, g1 g1Var, int i10, int i11) {
            h1.a aVar2 = h1.f11391a;
            long j10 = (i10 << 32) | (i11 & BodyPartID.bodyIdMax);
            if (aVar.b() == f3.r.f8828a || aVar.c() == 0) {
                a(aVar, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j10, g1Var.f11386e), aVar2);
            } else {
                long jC = (((aVar.c() - g1Var.f11382a) - ((int) (j10 >> 32))) << 32) | (((int) (j10 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
                a(aVar, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(jC, g1Var.f11386e), aVar2);
            }
        }

        public static void i(a aVar, g1 g1Var, long j10) {
            h1.a aVar2 = h1.f11391a;
            if (aVar.b() == f3.r.f8828a || aVar.c() == 0) {
                a(aVar, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j10, g1Var.f11386e), aVar2);
            } else {
                int iC = (aVar.c() - g1Var.f11382a) - ((int) (j10 >> 32));
                long j11 = ((int) (j10 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax;
                a(aVar, g1Var);
                g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j11 | (iC << 32), g1Var.f11386e), aVar2);
            }
        }

        public static void j(a aVar, g1 g1Var, long j10, t1.d dVar) {
            if (aVar.b() == f3.r.f8828a || aVar.c() == 0) {
                a(aVar, g1Var);
                g1Var.m0(f3.m.d(j10, g1Var.f11386e), CropImageView.DEFAULT_ASPECT_RATIO, dVar);
            } else {
                int iC = (aVar.c() - g1Var.f11382a) - ((int) (j10 >> 32));
                long j11 = ((int) (j10 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax;
                a(aVar, g1Var);
                g1Var.m0(f3.m.d(j11 | (iC << 32), g1Var.f11386e), CropImageView.DEFAULT_ASPECT_RATIO, dVar);
            }
        }

        public static void k(a aVar, g1 g1Var, int i10, int i11, eh.l lVar, int i12) {
            if ((i12 & 8) != 0) {
                lVar = h1.f11391a;
            }
            aVar.getClass();
            long j10 = (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
            a(aVar, g1Var);
            g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j10, g1Var.f11386e), lVar);
        }

        public static void l(a aVar, g1 g1Var, long j10) {
            h1.a aVar2 = h1.f11391a;
            aVar.getClass();
            a(aVar, g1Var);
            g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j10, g1Var.f11386e), aVar2);
        }

        public abstract f3.r b();

        public abstract int c();

        public final void d(g1 g1Var, int i10, int i11, float f10) {
            long j10 = (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
            a(this, g1Var);
            g1Var.l0(f10, f3.m.d(j10, g1Var.f11386e), null);
        }
    }

    public g1() {
        long j10 = 0;
        this.f11384c = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public int e0() {
        return (int) (this.f11384c & BodyPartID.bodyIdMax);
    }

    public int g0() {
        return (int) (this.f11384c >> 32);
    }

    public final void j0() {
        this.f11382a = jh.j.m((int) (this.f11384c >> 32), f3.b.k(this.f11385d), f3.b.i(this.f11385d));
        this.f11383b = jh.j.m((int) (this.f11384c & BodyPartID.bodyIdMax), f3.b.j(this.f11385d), f3.b.h(this.f11385d));
        int i10 = this.f11382a;
        long j10 = this.f11384c;
        this.f11386e = (((i10 - ((int) (j10 >> 32))) / 2) << 32) | (BodyPartID.bodyIdMax & ((r0 - ((int) (j10 & BodyPartID.bodyIdMax))) / 2));
    }

    public abstract void l0(float f10, long j10, eh.l lVar);

    public void m0(long j10, float f10, t1.d dVar) {
        l0(f10, j10, null);
    }

    public final void o0(long j10) {
        if (f3.p.b(this.f11384c, j10)) {
            return;
        }
        this.f11384c = j10;
        j0();
    }

    public final void p0(long j10) {
        if (f3.b.c(this.f11385d, j10)) {
            return;
        }
        this.f11385d = j10;
        j0();
    }
}
