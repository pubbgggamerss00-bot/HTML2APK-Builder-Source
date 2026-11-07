package sd;

import fe.a;

/* loaded from: classes2.dex */
public final class w<T> implements fe.b<T>, fe.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final t f24883c = new t();

    /* renamed from: d, reason: collision with root package name */
    public static final u f24884d = new u();

    /* renamed from: a, reason: collision with root package name */
    public a.InterfaceC0098a<T> f24885a;

    /* renamed from: b, reason: collision with root package name */
    public volatile fe.b<T> f24886b;

    public w(t tVar, fe.b bVar) {
        this.f24885a = tVar;
        this.f24886b = bVar;
    }

    @Override // fe.a
    public final void a(final ae.b bVar) {
        fe.b<T> bVar2;
        fe.b<T> bVar3;
        fe.b<T> bVar4 = this.f24886b;
        u uVar = f24884d;
        if (bVar4 != uVar) {
            bVar.a(bVar4);
            return;
        }
        synchronized (this) {
            bVar2 = this.f24886b;
            if (bVar2 != uVar) {
                bVar3 = bVar2;
            } else {
                final a.InterfaceC0098a<T> interfaceC0098a = this.f24885a;
                this.f24885a = new a.InterfaceC0098a() { // from class: sd.v
                    @Override // fe.a.InterfaceC0098a
                    public final void a(fe.b bVar5) {
                        interfaceC0098a.a(bVar5);
                        bVar.a(bVar5);
                    }
                };
                bVar3 = null;
            }
        }
        if (bVar3 != null) {
            bVar.a(bVar2);
        }
    }

    @Override // fe.b
    public final T get() {
        return this.f24886b.get();
    }
}
