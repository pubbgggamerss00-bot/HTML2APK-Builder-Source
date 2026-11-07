package w5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements p5.l {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15101t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i6, Object obj) {
        super(1);
        this.s = i6;
        this.f15101t = obj;
    }

    @Override // p5.l
    public final Object invoke(Object obj) {
        switch (this.s) {
            case 0:
                kotlin.jvm.internal.j.e("it", obj);
                return ((p5.a) this.f15101t).a();
            default:
                ((c5.a) this.f15101t).cancel(false);
                return d5.j.f12745a;
        }
    }
}
