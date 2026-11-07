package androidx.activity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.k implements p5.a<d5.j> {
    public final /* synthetic */ OnBackPressedDispatcher s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0);
        this.s = onBackPressedDispatcher;
    }

    @Override // p5.a
    public final d5.j a() {
        this.s.c();
        return d5.j.f12745a;
    }
}
