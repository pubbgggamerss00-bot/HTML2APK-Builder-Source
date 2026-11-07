package s1;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.p1;
import q1.u1;
import q1.w0;
import s1.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.b f24183a;

    public b(a.b bVar) {
        this.f24183a = bVar;
    }

    public final void a(u1 u1Var) {
        this.f24183a.a().i(u1Var);
    }

    public final void b(float f10, float f11, float f12, float f13, int i10) {
        this.f24183a.a().m(f10, f11, f12, f13, i10);
    }

    public final void c(float f10, float f11, float f12, float f13) {
        a.b bVar = this.f24183a;
        w0 w0VarA = bVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - (f12 + f10);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() & BodyPartID.bodyIdMax)) - (f13 + f11);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < CropImageView.DEFAULT_ASPECT_RATIO || Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax)) < CropImageView.DEFAULT_ASPECT_RATIO) {
            p1.a("Width and height must be greater than or equal to zero");
        }
        bVar.h(jFloatToRawIntBits);
        w0VarA.n(f10, f11);
    }

    public final void d(float f10, long j10) {
        w0 w0VarA = this.f24183a.a();
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        w0VarA.n(fIntBitsToFloat, Float.intBitsToFloat(i11));
        w0VarA.b(f10);
        w0VarA.n(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public final void e(float f10, float f11, long j10) {
        w0 w0VarA = this.f24183a.a();
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        w0VarA.n(fIntBitsToFloat, Float.intBitsToFloat(i11));
        w0VarA.a(f10, f11);
        w0VarA.n(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public final void f(float f10, float f11) {
        this.f24183a.a().n(f10, f11);
    }
}
