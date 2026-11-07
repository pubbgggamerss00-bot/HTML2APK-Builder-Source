package v;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class j implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.s f29929a;

    /* renamed from: b, reason: collision with root package name */
    public final a f29930b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final t.d1 f29931c = new t.d1();

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f29932d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.x1 f29933e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.x1 f29934f;

    public static final class a implements b1 {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // v.b1
        public final float e(float f10) {
            if (Float.isNaN(f10)) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            j jVar = j.this;
            float fFloatValue = ((Number) jVar.f29929a.invoke(Float.valueOf(f10))).floatValue();
            jVar.f29933e.setValue(Boolean.valueOf(fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO));
            jVar.f29934f.setValue(Boolean.valueOf(fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(eh.l<? super Float, Float> lVar) {
        this.f29929a = (kotlin.jvm.internal.s) lVar;
        Boolean bool = Boolean.FALSE;
        this.f29932d = bg.b.h(bool);
        this.f29933e = bg.b.h(bool);
        this.f29934f = bg.b.h(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.l1
    public final boolean a() {
        return ((Boolean) this.f29932d.getValue()).booleanValue();
    }

    @Override // v.l1
    public final Object c(t.b1 b1Var, eh.p pVar, vg.c cVar) {
        Object objC = ph.j0.c(new i(this, b1Var, pVar, null), cVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // v.l1
    public final float e(float f10) {
        return ((Number) this.f29929a.invoke(Float.valueOf(f10))).floatValue();
    }
}
