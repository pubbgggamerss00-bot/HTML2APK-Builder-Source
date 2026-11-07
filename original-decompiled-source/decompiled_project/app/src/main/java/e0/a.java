package e0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class a implements b2.a {

    /* renamed from: a, reason: collision with root package name */
    public final b f8114a;

    public a(b bVar) {
        v.t0 t0Var = v.t0.f30083a;
        this.f8114a = bVar;
    }

    @Override // b2.a
    public final long n1(long j10, long j11, int i10) {
        if (i10 != 2) {
            return 0L;
        }
        v.t0 t0Var = v.t0.f30083a;
        if (Float.intBitsToFloat((int) (j11 >> 32)) == CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // b2.a
    public final long v0(int i10, long j10) {
        v.t0 t0Var = v.t0.f30083a;
        if (i10 != 1) {
            return 0L;
        }
        b bVar = this.f8114a;
        if (Math.abs(bVar.k()) <= 1.0E-6d) {
            return 0L;
        }
        float fK = bVar.k() * bVar.n();
        float fH = ((bVar.l().h() + bVar.l().g()) * (-Math.signum(bVar.k()))) + fK;
        if (bVar.k() > CropImageView.DEFAULT_ASPECT_RATIO) {
            fH = fK;
            fK = fH;
        }
        float f10 = -bVar.f8153k.e(-jh.j.l(Float.intBitsToFloat((int) (j10 >> 32)), fK, fH));
        v.t0 t0Var2 = v.t0.f30083a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // b2.a
    public final Object x1(long j10, long j11, tg.e<? super f3.w> eVar) {
        v.t0 t0Var = v.t0.f30083a;
        v.t0 t0Var2 = v.t0.f30083a;
        return new f3.w(f3.w.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1, j11));
    }
}
