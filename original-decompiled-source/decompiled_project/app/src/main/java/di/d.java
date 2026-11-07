package di;

/* loaded from: classes2.dex */
public final class d extends c5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f7995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bi.f f7997c;

    public d(f fVar, String str, bi.f fVar2) {
        this.f7995a = fVar;
        this.f7996b = str;
        this.f7997c = fVar2;
    }

    @Override // c5.p, ci.e
    public final void N(String value) {
        kotlin.jvm.internal.r.e(value, "value");
        this.f7995a.d0(this.f7996b, new kotlinx.serialization.json.r(value, false, this.f7997c));
    }

    @Override // ci.e
    public final ei.b a() {
        return this.f7995a.f8006b.f16437b;
    }
}
