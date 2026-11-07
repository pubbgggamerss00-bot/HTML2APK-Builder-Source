package w;

import com.yalantis.ucrop.view.CropImageView;
import s.l1;
import v.b1;

/* loaded from: classes.dex */
public final class o implements b<Float, s.o> {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f31031a;

    public o(l1 l1Var) {
        this.f31031a = l1Var;
    }

    @Override // w.b
    public final Object a(b1 b1Var, Float f10, Float f11, eh.l lVar, g gVar) {
        float fFloatValue = f10.floatValue();
        float fFloatValue2 = f11.floatValue();
        Object objC = m.c(b1Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, o1.j.a(CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue2, 28), this.f31031a, lVar, gVar);
        return objC == ug.a.f29706a ? objC : (a) objC;
    }
}
