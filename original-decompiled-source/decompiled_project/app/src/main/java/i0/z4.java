package i0;

/* loaded from: classes.dex */
public final class z4 implements y2.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f13757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13758b;

    public z4(int i10, int i11) {
        this.f13757a = i10;
        this.f13758b = i11;
    }

    @Override // y2.v
    public final int a(int i10) {
        if (i10 >= 0 && i10 <= this.f13758b) {
            a5.c(i10, this.f13757a, i10);
        }
        return i10;
    }

    @Override // y2.v
    public final int b(int i10) {
        if (i10 >= 0 && i10 <= this.f13757a) {
            a5.b(i10, this.f13758b, i10);
        }
        return i10;
    }
}
