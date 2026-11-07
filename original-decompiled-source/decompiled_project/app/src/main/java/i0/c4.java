package i0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class c4 implements v.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.l1 f13226a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.g0 f13227b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.g0 f13228c;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4 f13229a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f4 f4Var) {
            super(0);
            this.f13229a = f4Var;
        }

        @Override // eh.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f13229a.f13281a.getFloatValue() > CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4 f13230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f4 f4Var) {
            super(0);
            this.f13230a = f4Var;
        }

        @Override // eh.a
        public final Boolean invoke() {
            f4 f4Var = this.f13230a;
            return Boolean.valueOf(f4Var.f13281a.getFloatValue() < f4Var.f13282b.getFloatValue());
        }
    }

    public c4(v.l1 l1Var, f4 f4Var) {
        this.f13226a = l1Var;
        this.f13227b = bg.b.d(new b(f4Var));
        this.f13228c = bg.b.d(new a(f4Var));
    }

    @Override // v.l1
    public final boolean a() {
        return this.f13226a.a();
    }

    @Override // v.l1
    public final boolean b() {
        return ((Boolean) this.f13228c.getValue()).booleanValue();
    }

    @Override // v.l1
    public final Object c(t.b1 b1Var, eh.p pVar, vg.c cVar) {
        return this.f13226a.c(b1Var, pVar, cVar);
    }

    @Override // v.l1
    public final boolean d() {
        return ((Boolean) this.f13227b.getValue()).booleanValue();
    }

    @Override // v.l1
    public final float e(float f10) {
        return this.f13226a.e(f10);
    }
}
