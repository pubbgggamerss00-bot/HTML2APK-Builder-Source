package androidx.compose.foundation.layout;

import com.yalantis.ucrop.view.CropImageView;
import j1.d;
import j1.f;
import j2.c3;
import kotlin.jvm.internal.r;
import t0.z5;
import z.g2;
import z.h2;
import z.i2;
import z.w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f974a;

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f975b;

    /* renamed from: c, reason: collision with root package name */
    public static final FillElement f976c;

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f977d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f978e;

    /* renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f979f;

    /* renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f980g;

    /* renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f981h;

    /* renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f982i;

    static {
        w wVar = w.f34655b;
        f974a = new FillElement(wVar, 1.0f);
        w wVar2 = w.f34654a;
        f975b = new FillElement(wVar2, 1.0f);
        w wVar3 = w.f34656c;
        f976c = new FillElement(wVar3, 1.0f);
        f.a aVar = d.a.f14615n;
        f977d = new WrapContentElement(wVar, new i2(aVar), aVar);
        f.a aVar2 = d.a.f14614m;
        f978e = new WrapContentElement(wVar, new i2(aVar2), aVar2);
        f.b bVar = d.a.f14612k;
        f979f = new WrapContentElement(wVar2, new g2(bVar), bVar);
        f.b bVar2 = d.a.f14611j;
        f980g = new WrapContentElement(wVar2, new g2(bVar2), bVar2);
        j1.f fVar = d.a.f14606e;
        f981h = new WrapContentElement(wVar3, new h2(fVar), fVar);
        j1.f fVar2 = d.a.f14602a;
        f982i = new WrapContentElement(wVar3, new h2(fVar2), fVar2);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.h(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return a(dVar, f10, f11);
    }

    public static androidx.compose.ui.d c(androidx.compose.ui.d dVar) {
        return dVar.h(f976c);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(f10 == 1.0f ? f974a : new FillElement(w.f34655b, f10));
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new SizeElement(CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, true, c3.f14686a, 5));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.h(new SizeElement(CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, f11, true, c3.f14686a, 5));
    }

    public static /* synthetic */ androidx.compose.ui.d h(androidx.compose.ui.d dVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return g(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new SizeElement(CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, false, c3.f14686a, 5));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new SizeElement(f10, f10, f10, f10, false, c3.f14686a));
    }

    public static final androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.h(new SizeElement(f10, f11, f10, f11, false, c3.f14686a));
    }

    public static androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13, int i10) {
        return dVar.h(new SizeElement(f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, false, c3.f14686a));
    }

    public static final androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new SizeElement(f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, false, c3.f14686a, 10));
    }

    public static final androidx.compose.ui.d n(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new SizeElement(f10, f10, f10, f10, true, c3.f14686a));
    }

    public static final androidx.compose.ui.d o(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.h(new SizeElement(f10, f11, f10, f11, true, c3.f14686a));
    }

    public static final androidx.compose.ui.d p(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13) {
        return dVar.h(new SizeElement(f10, f11, f12, f13, true, c3.f14686a));
    }

    public static /* synthetic */ androidx.compose.ui.d q(androidx.compose.ui.d dVar, float f10, float f11, int i10) {
        float f12 = z5.f27519b;
        if ((i10 & 2) != 0) {
            f12 = Float.NaN;
        }
        return p(dVar, f10, f12, f11, Float.NaN);
    }

    public static final androidx.compose.ui.d r(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new SizeElement(f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, true, c3.f14686a, 10));
    }

    public static androidx.compose.ui.d s(androidx.compose.ui.d dVar, float f10, float f11, int i10) {
        return dVar.h(new SizeElement((i10 & 1) != 0 ? Float.NaN : f10, CropImageView.DEFAULT_ASPECT_RATIO, (i10 & 2) != 0 ? Float.NaN : f11, CropImageView.DEFAULT_ASPECT_RATIO, true, c3.f14686a, 10));
    }

    public static androidx.compose.ui.d t(androidx.compose.ui.d dVar) {
        f.b bVar = d.a.f14612k;
        return dVar.h(r.a(bVar, bVar) ? f979f : r.a(bVar, d.a.f14611j) ? f980g : new WrapContentElement(w.f34654a, new g2(bVar), bVar));
    }

    public static androidx.compose.ui.d u(androidx.compose.ui.d dVar, j1.f fVar) {
        return dVar.h(fVar.equals(d.a.f14606e) ? f981h : fVar.equals(d.a.f14602a) ? f982i : new WrapContentElement(w.f34656c, new h2(fVar), fVar));
    }

    public static androidx.compose.ui.d v(androidx.compose.ui.d dVar) {
        f.a aVar = d.a.f14615n;
        return dVar.h(r.a(aVar, aVar) ? f977d : r.a(aVar, d.a.f14614m) ? f978e : new WrapContentElement(w.f34655b, new i2(aVar), aVar));
    }
}
