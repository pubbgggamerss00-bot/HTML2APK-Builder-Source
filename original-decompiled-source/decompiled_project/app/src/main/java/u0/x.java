package u0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class x implements v.y {

    /* renamed from: a, reason: collision with root package name */
    public final a f29175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29176b;

    public static final class a implements v.w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Object> f29177a;

        public a(a0<Object> a0Var) {
            this.f29177a = a0Var;
        }

        @Override // v.w
        public final void a(float f10) {
            a0<Object> a0Var = this.f29177a;
            a0Var.f28954n.a(a0Var.f(f10), CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    public x(a0<Object> a0Var) {
        this.f29176b = a0Var;
        this.f29175a = new a(a0Var);
    }

    @Override // v.y
    public final Object a(androidx.compose.foundation.gestures.g gVar, androidx.compose.foundation.gestures.f fVar) throws Throwable {
        Object objB = this.f29176b.b(t.b1.f25168b, new w(this, gVar, null), fVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }
}
