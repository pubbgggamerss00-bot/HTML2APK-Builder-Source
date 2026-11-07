package p;

/* loaded from: classes.dex */
public final class e1 extends qg.h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f20610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1<Object> f20611b;

    public e1(c1<Object> c1Var) {
        this.f20611b = c1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20610a < this.f20611b.f();
    }

    @Override // qg.h0
    public final int nextInt() {
        int i10 = this.f20610a;
        this.f20610a = i10 + 1;
        return this.f20611b.d(i10);
    }
}
