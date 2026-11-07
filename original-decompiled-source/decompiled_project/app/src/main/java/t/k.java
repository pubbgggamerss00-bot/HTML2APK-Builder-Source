package t;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.f2;
import q1.s1;

/* loaded from: classes.dex */
public final class k extends d.c implements i2.r, i2.o1 {

    /* renamed from: q, reason: collision with root package name */
    public long f25278q;

    /* renamed from: r, reason: collision with root package name */
    public q1.u0 f25279r;

    /* renamed from: s, reason: collision with root package name */
    public float f25280s;

    /* renamed from: t, reason: collision with root package name */
    public f2 f25281t;

    /* renamed from: v, reason: collision with root package name */
    public long f25282v;

    /* renamed from: w, reason: collision with root package name */
    public f3.r f25283w;

    /* renamed from: x, reason: collision with root package name */
    public q1.s1 f25284x;

    /* renamed from: y, reason: collision with root package name */
    public f2 f25285y;

    /* renamed from: z, reason: collision with root package name */
    public q1.s1 f25286z;

    @Override // i2.o1
    public final void V0() {
        this.f25282v = 9205357640488583168L;
        this.f25283w = null;
        this.f25284x = null;
        this.f25285y = null;
        i2.s.a(this);
    }

    @Override // i2.r
    public final void z(i2.h0 h0Var) {
        q1.s1 s1Var;
        q1.u0 u0Var;
        q1.u1 u1Var;
        s1.a aVar = h0Var.f13901a;
        if (this.f25281t == q1.y1.f21750a) {
            if (!q1.b1.d(this.f25278q, q1.b1.f21654h)) {
                s1.e.X0(h0Var, this.f25278q, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
            }
            q1.u0 u0Var2 = this.f25279r;
            if (u0Var2 != null) {
                s1.e.d0(h0Var, u0Var2, 0L, 0L, this.f25280s, null, 118);
            }
        } else {
            if (p1.h.a(aVar.i(), this.f25282v) && h0Var.getLayoutDirection() == this.f25283w && kotlin.jvm.internal.r.a(this.f25285y, this.f25281t)) {
                s1Var = this.f25284x;
                kotlin.jvm.internal.r.b(s1Var);
            } else {
                i2.p1.a(this, new s.e(1, this, h0Var));
                s1Var = this.f25286z;
                this.f25286z = null;
            }
            this.f25284x = s1Var;
            this.f25282v = aVar.i();
            this.f25283w = h0Var.getLayoutDirection();
            this.f25285y = this.f25281t;
            kotlin.jvm.internal.r.b(s1Var);
            if (!q1.b1.d(this.f25278q, q1.b1.f21654h)) {
                q1.t1.a(h0Var, s1Var, this.f25278q);
            }
            q1.u0 u0Var3 = this.f25279r;
            if (u0Var3 != null) {
                float f10 = this.f25280s;
                s1.h hVar = s1.h.f24186a;
                if (s1Var instanceof s1.b) {
                    p1.e eVar = ((s1.b) s1Var).f21734a;
                    float f11 = eVar.f21131a;
                    float f12 = eVar.f21132b;
                    h0Var.c0(u0Var3, (Float.floatToRawIntBits(f12) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f11) << 32), q1.t1.b(eVar), f10, hVar);
                } else {
                    if (s1Var instanceof s1.c) {
                        s1.c cVar = (s1.c) s1Var;
                        u0Var = u0Var3;
                        u1Var = cVar.f21736b;
                        if (u1Var == null) {
                            p1.g gVar = cVar.f21735a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f21142h >> 32));
                            float f13 = gVar.f21135a;
                            float f14 = gVar.f21136b;
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax);
                            float fB = gVar.b();
                            float fA = gVar.a();
                            h0Var.h0(u0Var, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & BodyPartID.bodyIdMax), f10, hVar);
                        }
                    } else {
                        if (!(s1Var instanceof s1.a)) {
                            throw new pg.l();
                        }
                        q1.u1 u1Var2 = ((s1.a) s1Var).f21733a;
                        u0Var = u0Var3;
                        u1Var = u1Var2;
                    }
                    h0Var.H0(u1Var, u0Var, f10, hVar, 3);
                }
            }
        }
        h0Var.z1();
    }
}
