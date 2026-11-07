package x0;

/* loaded from: classes.dex */
public interface d<N> {
    void a(int i10, N n10);

    void b(N n10);

    default void c() {
        N nH = h();
        h hVar = nH instanceof h ? (h) nH : null;
        if (hVar != null) {
            hVar.j();
        }
    }

    void d(int i10, int i11, int i12);

    void e(int i10, int i11);

    void f();

    void g(int i10, N n10);

    N h();
}
