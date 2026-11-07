package th;

/* loaded from: classes2.dex */
public final class z<T> implements tg.e<T>, vg.d {

    /* renamed from: a, reason: collision with root package name */
    public final tg.e<T> f28860a;

    /* renamed from: b, reason: collision with root package name */
    public final tg.h f28861b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(tg.e<? super T> eVar, tg.h hVar) {
        this.f28860a = eVar;
        this.f28861b = hVar;
    }

    @Override // vg.d
    public final vg.d getCallerFrame() {
        tg.e<T> eVar = this.f28860a;
        if (eVar instanceof vg.d) {
            return (vg.d) eVar;
        }
        return null;
    }

    @Override // tg.e
    public final tg.h getContext() {
        return this.f28861b;
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        this.f28860a.resumeWith(obj);
    }
}
