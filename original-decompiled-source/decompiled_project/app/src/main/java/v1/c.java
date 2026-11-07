package v1;

import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import f3.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p1.f;
import pg.f0;
import q1.c1;
import q1.h0;
import q1.i0;
import q1.w0;
import s1.e;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public h0 f30542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30543b;

    /* renamed from: c, reason: collision with root package name */
    public c1 f30544c;

    /* renamed from: d, reason: collision with root package name */
    public float f30545d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public r f30546e = r.f8828a;

    public static final class a extends s implements l<e, f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(e eVar) {
            c.this.i(eVar);
            return f0.f21461a;
        }
    }

    public c() {
        new a();
    }

    public boolean a(float f10) {
        return false;
    }

    public boolean e(c1 c1Var) {
        return false;
    }

    public void f(r rVar) {
    }

    public final void g(e eVar, long j10, float f10, c1 c1Var) {
        if (this.f30545d != f10) {
            if (!a(f10)) {
                if (f10 == 1.0f) {
                    h0 h0Var = this.f30542a;
                    if (h0Var != null) {
                        h0Var.g(f10);
                    }
                    this.f30543b = false;
                } else {
                    h0 h0VarA = this.f30542a;
                    if (h0VarA == null) {
                        h0VarA = i0.a();
                        this.f30542a = h0VarA;
                    }
                    h0VarA.g(f10);
                    this.f30543b = true;
                }
            }
            this.f30545d = f10;
        }
        if (!kotlin.jvm.internal.r.a(this.f30544c, c1Var)) {
            if (!e(c1Var)) {
                if (c1Var == null) {
                    h0 h0Var2 = this.f30542a;
                    if (h0Var2 != null) {
                        h0Var2.j(null);
                    }
                    this.f30543b = false;
                } else {
                    h0 h0VarA2 = this.f30542a;
                    if (h0VarA2 == null) {
                        h0VarA2 = i0.a();
                        this.f30542a = h0VarA2;
                    }
                    h0VarA2.j(c1Var);
                    this.f30543b = true;
                }
            }
            this.f30544c = c1Var;
        }
        r layoutDirection = eVar.getLayoutDirection();
        if (this.f30546e != layoutDirection) {
            f(layoutDirection);
            this.f30546e = layoutDirection;
        }
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.i() >> 32)) - Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar.i() & BodyPartID.bodyIdMax));
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat3 = fIntBitsToFloat2 - Float.intBitsToFloat(i11);
        eVar.Q0().f24180a.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat, fIntBitsToFloat3);
        if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
            try {
                if (Float.intBitsToFloat(i10) > CropImageView.DEFAULT_ASPECT_RATIO && Float.intBitsToFloat(i11) > CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (this.f30543b) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                        float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
                        p1.e eVarA = f.a(0L, (Float.floatToRawIntBits(fIntBitsToFloat5) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32));
                        w0 w0VarA = eVar.Q0().a();
                        h0 h0VarA3 = this.f30542a;
                        if (h0VarA3 == null) {
                            h0VarA3 = i0.a();
                            this.f30542a = h0VarA3;
                        }
                        try {
                            w0VarA.j(eVarA, h0VarA3);
                            i(eVar);
                            w0VarA.o();
                        } catch (Throwable th2) {
                            w0VarA.o();
                            throw th2;
                        }
                    } else {
                        i(eVar);
                    }
                }
            } catch (Throwable th3) {
                eVar.Q0().f24180a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat3);
                throw th3;
            }
        }
        eVar.Q0().f24180a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat3);
    }

    public abstract long h();

    public abstract void i(e eVar);
}
