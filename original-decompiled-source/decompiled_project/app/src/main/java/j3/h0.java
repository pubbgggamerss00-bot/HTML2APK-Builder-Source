package j3;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var) {
        super(0);
        this.f15081a = g0Var;
    }

    @Override // eh.a
    public final Boolean invoke() {
        g0 g0Var = this.f15081a;
        g2.v parentLayoutCoordinates = g0Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.m()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || g0Var.m87getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
