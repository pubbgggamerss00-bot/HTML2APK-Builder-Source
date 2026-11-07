package q6;

import com.yalantis.ucrop.view.CropImageView;
import s.y;
import v.b1;

/* loaded from: classes.dex */
public final class h implements w.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22067a;

    public /* synthetic */ h(Object obj) {
        this.f22067a = obj;
    }

    @Override // w.b
    public Object a(b1 b1Var, Float f10, Float f11, eh.l lVar, w.g gVar) {
        Object objA = w.m.a(b1Var, f10.floatValue(), o1.j.a(CropImageView.DEFAULT_ASPECT_RATIO, f11.floatValue(), 28), (y) this.f22067a, lVar, gVar);
        return objA == ug.a.f29706a ? objA : (w.a) objA;
    }
}
