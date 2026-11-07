package u2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f29223a;

    /* renamed from: b, reason: collision with root package name */
    public int f29224b = -1;

    /* renamed from: c, reason: collision with root package name */
    public float f29225c;

    public r(j0 j0Var) {
        this.f29223a = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i11 = 1;
        j0 j0Var = this.f29223a;
        if (z10) {
            int iA = lf.c.a(j0Var.f29206f, i10, z10);
            z13 = i10 == j0Var.f29206f.getLineStart(iA) || i10 == j0Var.f(iA);
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f29224b == i13) {
            return this.f29225c;
        }
        float fH = z12 ? j0Var.h(i10, z10) : j0Var.i(i10, z10);
        if (z11) {
            this.f29224b = i13;
            this.f29225c = fH;
        }
        return fH;
    }
}
