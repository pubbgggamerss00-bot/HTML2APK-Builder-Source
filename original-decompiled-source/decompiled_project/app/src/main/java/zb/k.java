package zb;

import com.yalantis.ucrop.view.CropImageView;
import zb.p;

/* loaded from: classes2.dex */
public final class k extends e {
    @Override // zb.e
    public final void a(p pVar, float f10, float f11) {
        float f12 = f11 * f10;
        pVar.d(f12, 180.0f, 90.0f);
        float f13 = f12 * 2.0f;
        pVar.getClass();
        p.c cVar = new p.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, f13);
        cVar.f34983f = 180.0f;
        cVar.f34984g = 90.0f;
        pVar.f34972f.add(cVar);
        p.a aVar = new p.a(cVar);
        float f14 = 180.0f + 90.0f;
        boolean z10 = 90.0f < CropImageView.DEFAULT_ASPECT_RATIO;
        float f15 = z10 ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f16 = z10 ? (180.0f + f14) % 360.0f : f14;
        pVar.a(f15);
        pVar.f34973g.add(aVar);
        pVar.f34970d = f16;
        double d10 = f14;
        pVar.f34968b = (((f13 - CropImageView.DEFAULT_ASPECT_RATIO) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((CropImageView.DEFAULT_ASPECT_RATIO + f13) * 0.5f);
        pVar.f34969c = (((f13 - CropImageView.DEFAULT_ASPECT_RATIO) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((CropImageView.DEFAULT_ASPECT_RATIO + f13) * 0.5f);
    }
}
