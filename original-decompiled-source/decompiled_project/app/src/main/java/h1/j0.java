package h1;

/* loaded from: classes.dex */
public abstract class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f1.a f12131a = new f1.a(0);

    public final boolean n(int i10) {
        return (i10 & this.f12131a.get()) != 0;
    }

    public final void o(int i10) {
        f1.a aVar;
        int i11;
        do {
            aVar = this.f12131a;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }
}
