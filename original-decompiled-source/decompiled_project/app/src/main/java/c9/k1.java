package c9;

import com.yalantis.ucrop.view.CropImageView;
import f9.fg;

/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5126b;

    public /* synthetic */ k1(Object obj, int i10) {
        this.f5125a = i10;
        this.f5126b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f5125a;
        Object obj2 = this.f5126b;
        switch (i10) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                String strB0 = mh.y.b0(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, it);
                int i11 = r0.f5188b;
                ((x0.n1) obj2).setValue(strB0);
                break;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                sh.z0 z0Var = ((fg) obj2).f9598x;
                z0Var.getClass();
                z0Var.j(null, it2);
                break;
        }
        return pg.f0.f21461a;
    }
}
