package p5;

import q1.l1;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21330a;

    public /* synthetic */ z(int i10) {
        this.f21330a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f21330a) {
            case 0:
                j5.a initializer = (j5.a) obj;
                kotlin.jvm.internal.r.e(initializer, "$this$initializer");
                break;
            case 1:
                ((w0) obj).f21297b = true;
                break;
            default:
                l1 graphicsLayer = (l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.c(graphicsLayer.N0(40));
                break;
        }
        return pg.f0.f21461a;
    }
}
