package androidx.lifecycle;

/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f2271b;

    public e1(l lVar, h1 h1Var) {
        this.f2270a = lVar;
        this.f2271b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2270a.a(this.f2271b);
    }
}
