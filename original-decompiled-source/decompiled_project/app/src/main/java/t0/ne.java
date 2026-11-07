package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class ne extends kotlin.jvm.internal.s implements eh.q<xd, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(int i10) {
        super(3);
        this.f26537a = i10;
    }

    @Override // eh.q
    public final pg.f0 b(xd xdVar, x0.j jVar, Integer num) {
        xd xdVar2 = xdVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? jVar2.K(xdVar2) : jVar2.l(xdVar2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            ke.f26292a.a(Float.NaN, CropImageView.DEFAULT_ASPECT_RATIO, 196656, 0L, xdVar2.a(this.f26537a), null, jVar2);
        }
        return pg.f0.f21461a;
    }
}
