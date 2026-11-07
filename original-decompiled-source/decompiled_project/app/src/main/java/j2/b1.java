package j2;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.s implements eh.l<ph.i0, b3> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s3 f14650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f14651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(s3 s3Var, d1 d1Var) {
        super(1);
        this.f14650a = s3Var;
        this.f14651b = d1Var;
    }

    @Override // eh.l
    public final b3 invoke(ph.i0 i0Var) {
        return new b3(this.f14650a, new a1(this.f14651b));
    }
}
