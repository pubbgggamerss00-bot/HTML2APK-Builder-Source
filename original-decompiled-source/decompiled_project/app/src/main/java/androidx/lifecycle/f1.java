package androidx.lifecycle;

/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f2276b;

    public f1(l lVar, h1 h1Var) {
        this.f2275a = lVar;
        this.f2276b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2275a.c(this.f2276b);
    }
}
