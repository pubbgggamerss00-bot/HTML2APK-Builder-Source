package y9;

/* loaded from: classes.dex */
public final class m implements t9.b<l> {

    /* renamed from: a, reason: collision with root package name */
    public final og.a<s> f34346a;

    /* renamed from: b, reason: collision with root package name */
    public final og.a<String> f34347b;

    public m(og.a aVar, og.a aVar2) {
        this.f34346a = aVar;
        this.f34347b = aVar2;
    }

    @Override // og.a
    public final Object get() {
        aa.c cVar = new aa.c();
        aa.b bVar = new aa.b();
        a aVar = a.f34316f;
        if (aVar != null) {
            return new l(cVar, bVar, aVar, this.f34346a.get(), this.f34347b);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
