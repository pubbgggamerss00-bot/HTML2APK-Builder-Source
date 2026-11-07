package p;

/* loaded from: classes.dex */
public final class c<E> {

    /* renamed from: a, reason: collision with root package name */
    public E[] f20577a;

    /* renamed from: b, reason: collision with root package name */
    public int f20578b;

    /* renamed from: c, reason: collision with root package name */
    public int f20579c;

    /* renamed from: d, reason: collision with root package name */
    public int f20580d;

    public final void a(x5.e eVar) {
        E[] eArr = this.f20577a;
        int i10 = this.f20579c;
        eArr[i10] = eVar;
        int i11 = this.f20580d & (i10 + 1);
        this.f20579c = i11;
        int i12 = this.f20578b;
        if (i11 == i12) {
            int length = eArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            E[] eArr2 = (E[]) new Object[i14];
            qg.m.g(eArr, 0, eArr2, i12, length);
            qg.m.g(this.f20577a, i13, eArr2, 0, this.f20578b);
            this.f20577a = eArr2;
            this.f20578b = 0;
            this.f20579c = length;
            this.f20580d = i14 - 1;
        }
    }
}
