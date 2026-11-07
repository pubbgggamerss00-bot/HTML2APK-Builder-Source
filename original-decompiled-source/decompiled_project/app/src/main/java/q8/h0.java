package q8;

import com.yalantis.ucrop.view.CropImageView;
import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22224b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f22223a = i10;
        this.f22224b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f22223a;
        Object obj2 = this.f22224b;
        switch (i10) {
            case 0:
                w0 w0Var = (w0) obj2;
                q1.l1 graphicsLayer = (q1.l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f(jh.j.l((w0Var.f22432e.getFloatValue() - 0.5f) / 0.5f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * w0Var.f22433f.getFloatValue());
                break;
            default:
                g2.v it = (g2.v) obj;
                kotlin.jvm.internal.r.e(it, "it");
                p1.e eVarN = g2.w.c(it).N(it, true);
                boolean z10 = g5.f32665a;
                ((x0.n1) obj2).setValue(eVarN);
                break;
        }
        return pg.f0.f21461a;
    }
}
