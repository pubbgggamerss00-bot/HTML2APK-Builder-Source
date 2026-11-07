package e0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class q implements v.d {

    /* renamed from: b, reason: collision with root package name */
    public final b f8272b;

    /* renamed from: c, reason: collision with root package name */
    public final v.d f8273c;

    public q(b bVar, v.d dVar) {
        this.f8272b = bVar;
        this.f8273c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.d
    public final float a(float f10, float f11, float f12) {
        float fA = this.f8273c.a(f10, f11, f12);
        boolean z10 = false;
        if (f10 <= CropImageView.DEFAULT_ASPECT_RATIO ? f10 + f11 <= CropImageView.DEFAULT_ASPECT_RATIO : f10 + f11 > f12) {
            z10 = true;
        }
        float fAbs = Math.abs(fA);
        b bVar = this.f8272b;
        if (fAbs == CropImageView.DEFAULT_ASPECT_RATIO || !z10) {
            if (Math.abs(bVar.f8148f) < 1.0E-6d) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            float fO = bVar.f8148f * (-1.0f);
            if (((Boolean) bVar.F.getValue()).booleanValue()) {
                fO += bVar.o();
            }
            return jh.j.l(fO, -f12, f12);
        }
        float fO2 = bVar.f8148f * (-1);
        while (fA > CropImageView.DEFAULT_ASPECT_RATIO && fO2 < fA) {
            fO2 += bVar.o();
        }
        while (fA < CropImageView.DEFAULT_ASPECT_RATIO && fO2 > fA) {
            fO2 -= bVar.o();
        }
        return fO2;
    }
}
