package m0;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f17258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar) {
        super(0);
        this.f17258a = wVar;
    }

    @Override // eh.a
    public final Boolean invoke() {
        return Boolean.valueOf((this.f17258a.a() & 9223372034707292159L) != 9205357640488583168L);
    }
}
