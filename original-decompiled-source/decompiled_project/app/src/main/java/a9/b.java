package a9;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class b implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f132a;

    public b(z.f1 f1Var) {
        this.f132a = f1Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i FadingPage = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            p.c(androidx.compose.foundation.layout.f.d(this.f132a.c(), CropImageView.DEFAULT_ASPECT_RATIO, 13), null, null, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
