package t0;

/* loaded from: classes.dex */
public final class fe extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f25890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(long j10, long j11, boolean z10, f1.b bVar, int i10) {
        super(2);
        this.f25887a = j10;
        this.f25888b = j11;
        this.f25889c = z10;
        this.f25890d = bVar;
        this.f25891e = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        he.c(this.f25887a, this.f25888b, this.f25889c, this.f25890d, jVar, f3.i.n(this.f25891e | 1));
        return pg.f0.f21461a;
    }
}
