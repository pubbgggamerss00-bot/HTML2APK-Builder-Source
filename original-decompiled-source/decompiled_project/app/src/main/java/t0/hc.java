package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class hc implements v.y {

    /* renamed from: a, reason: collision with root package name */
    public final int f26016a;

    /* renamed from: b, reason: collision with root package name */
    public final jh.d f26017b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.u1 f26018c;

    /* renamed from: d, reason: collision with root package name */
    public eh.l<? super Float, pg.f0> f26019d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f26020e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.v1 f26021f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26022g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.u1 f26023h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.u1 f26024i;

    /* renamed from: j, reason: collision with root package name */
    public final x0.x1 f26025j;

    /* renamed from: k, reason: collision with root package name */
    public final gc f26026k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.u1 f26027l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.u1 f26028m;

    /* renamed from: n, reason: collision with root package name */
    public final fc f26029n;

    /* renamed from: o, reason: collision with root package name */
    public final t.d1 f26030o;

    public hc() {
        this(CropImageView.DEFAULT_ASPECT_RATIO, 0, new jh.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
    }

    @Override // v.y
    public final Object a(androidx.compose.foundation.gestures.g gVar, androidx.compose.foundation.gestures.f fVar) {
        t.b1 b1Var = t.b1.f25167a;
        Object objC = ph.j0.c(new ec(this, gVar, null), fVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }

    public final void b(float f10) {
        float fG = this.f26021f.g();
        x0.u1 u1Var = this.f26024i;
        float f11 = 2;
        float fMax = Math.max(fG - (u1Var.getFloatValue() / f11), CropImageView.DEFAULT_ASPECT_RATIO);
        float fMin = Math.min(u1Var.getFloatValue() / f11, fMax);
        x0.u1 u1Var2 = this.f26027l;
        float floatValue = u1Var2.getFloatValue() + f10;
        x0.u1 u1Var3 = this.f26028m;
        u1Var2.e(u1Var3.getFloatValue() + floatValue);
        u1Var3.e(CropImageView.DEFAULT_ASPECT_RATIO);
        float fE = dc.e(u1Var2.getFloatValue(), this.f26020e, fMin, fMax);
        jh.d dVar = this.f26017b;
        float f12 = fMax - fMin;
        float fB = h3.b.b(Float.valueOf(dVar.f15742a).floatValue(), Float.valueOf(dVar.f15743b).floatValue(), jh.j.l(f12 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (fE - fMin) / f12, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
        if (fB == this.f26018c.getFloatValue()) {
            return;
        }
        eh.l<? super Float, pg.f0> lVar = this.f26019d;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(fB));
        } else {
            d(fB);
        }
    }

    public final float c() {
        jh.d dVar = this.f26017b;
        float fFloatValue = Float.valueOf(dVar.f15742a).floatValue();
        float f10 = dVar.f15743b;
        float fFloatValue2 = Float.valueOf(f10).floatValue();
        float fL = jh.j.l(this.f26018c.getFloatValue(), Float.valueOf(dVar.f15742a).floatValue(), Float.valueOf(f10).floatValue());
        float f11 = dc.f25690a;
        float f12 = fFloatValue2 - fFloatValue;
        return jh.j.l(f12 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (fL - fFloatValue) / f12, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
    }

    public final void d(float f10) {
        jh.d dVar = this.f26017b;
        float fFloatValue = Float.valueOf(dVar.f15742a).floatValue();
        float f11 = dVar.f15743b;
        this.f26018c.e(dc.e(jh.j.l(f10, fFloatValue, Float.valueOf(f11).floatValue()), this.f26020e, Float.valueOf(dVar.f15742a).floatValue(), Float.valueOf(f11).floatValue()));
    }

    public hc(float f10, int i10, jh.d dVar) {
        float[] fArr;
        this.f26016a = i10;
        this.f26017b = dVar;
        this.f26018c = new x0.u1(f10);
        float f11 = dc.f25690a;
        if (i10 == 0) {
            fArr = new float[0];
        } else {
            int i11 = i10 + 2;
            float[] fArr2 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr2[i12] = i12 / (i10 + 1);
            }
            fArr = fArr2;
        }
        this.f26020e = fArr;
        this.f26021f = new x0.v1(0);
        this.f26023h = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f26024i = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f26025j = bg.b.h(Boolean.FALSE);
        this.f26026k = new gc(this);
        jh.d dVar2 = this.f26017b;
        float fFloatValue = Float.valueOf(dVar2.f15742a).floatValue();
        float fFloatValue2 = Float.valueOf(dVar2.f15743b).floatValue() - fFloatValue;
        this.f26027l = new x0.u1(h3.b.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, jh.j.l(fFloatValue2 == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (f10 - fFloatValue) / fFloatValue2, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
        this.f26028m = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f26029n = new fc(this);
        this.f26030o = new t.d1();
    }
}
