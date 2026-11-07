package x8;

import android.graphics.Path;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.s1;
import q1.u1;

/* loaded from: classes.dex */
public final class a implements q1.f2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f32209a;

    public a(float f10) {
        this.f32209a = f10;
    }

    @Override // q1.f2
    public final q1.s1 a(long j10, f3.r layoutDirection, f3.d density) {
        kotlin.jvm.internal.r.e(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.r.e(density, "density");
        float f10 = this.f32209a;
        if (f10 >= 1.0f) {
            return new s1.b(new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))));
        }
        p1.e eVar = p1.e.f21130e;
        if (f10 <= 0.001f) {
            return new s1.b(eVar);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        float fL = jh.j.l(f10, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * ((float) Math.hypot(Float.intBitsToFloat(r0) / 2.0f, Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)))) * 1.15f;
        if (fL <= 0.5f) {
            return new s1.b(eVar);
        }
        q1.j0 j0VarA = q1.l0.a();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) & BodyPartID.bodyIdMax);
        int i10 = (int) (jFloatToRawIntBits >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) - fL;
        int i11 = (int) (jFloatToRawIntBits & BodyPartID.bodyIdMax);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i11) - fL;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i10) + fL;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i11) + fL;
        u1.a aVar = u1.a.f21740a;
        if (j0VarA.f21713b == null) {
            j0VarA.f21713b = new RectF();
        }
        RectF rectF = j0VarA.f21713b;
        kotlin.jvm.internal.r.b(rectF);
        rectF.set(fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5);
        Path path = j0VarA.f21712a;
        RectF rectF2 = j0VarA.f21713b;
        kotlin.jvm.internal.r.b(rectF2);
        path.addOval(rectF2, q1.l0.b(aVar));
        return new s1.a(j0VarA);
    }
}
