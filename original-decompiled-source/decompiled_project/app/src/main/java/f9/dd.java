package f9;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class dd implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9331b;

    public /* synthetic */ dd(Object obj, int i10) {
        this.f9330a = i10;
        this.f9331b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9330a) {
            case 0:
                fg fgVar = (fg) this.f9331b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.M0;
                z0Var.getClass();
                z0Var.j(null, bool);
                break;
            default:
                q1.q1 q1Var = (q1.q1) this.f9331b;
                s1.e onDrawBehind = (s1.e) obj;
                kotlin.jvm.internal.r.e(onDrawBehind, "$this$onDrawBehind");
                s1.e.d0(onDrawBehind, q1Var, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                break;
        }
        return pg.f0.f21461a;
    }
}
