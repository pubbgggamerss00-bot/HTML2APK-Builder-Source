package u0;

import com.yalantis.ucrop.view.CropImageView;
import s.m2;
import s.y1;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements eh.q<y1.b<h0>, x0.j, Integer, s.e0<Float>> {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f29131a = new r1(3);

    @Override // eh.q
    public final s.e0<Float> b(y1.b<h0> bVar, x0.j jVar, Integer num) {
        y1.b<h0> bVar2 = bVar;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(-1154662212);
        h0 h0Var = h0.f29014a;
        h0 h0Var2 = h0.f29015b;
        s.e0<Float> e0VarD = bVar2.d(h0Var, h0Var2) ? s.m.d(67, 0, s.d0.f23706d, 2) : (bVar2.d(h0Var2, h0Var) || bVar2.d(h0.f29016c, h0Var2)) ? new m2(83, 67, s.d0.f23706d) : s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
        jVar2.B();
        return e0VarD;
    }
}
