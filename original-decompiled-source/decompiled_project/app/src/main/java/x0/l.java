package x0;

/* loaded from: classes.dex */
public final class l implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f31801a;

    public l(k kVar) {
        this.f31801a = kVar;
    }

    @Override // x0.i0
    public final void done() {
        k kVar = this.f31801a;
        kVar.f31753z--;
    }

    @Override // x0.i0
    public final void start() {
        this.f31801a.f31753z++;
    }
}
