package i0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.s implements eh.l<n1.g, n1.k> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j10) {
        super(1);
        this.f13275a = j10;
    }

    @Override // eh.l
    public final n1.k invoke(n1.g gVar) {
        n1.g gVar2 = gVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar2.f18310a.i() >> 32)) / 2.0f;
        return gVar2.m(new e(fIntBitsToFloat, m0.g.d(gVar2, fIntBitsToFloat), new q1.p0(5, this.f13275a)));
    }
}
