package p;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f20602a = new Object();

    public static final void a(c1 c1Var) {
        int i10 = c1Var.f20585d;
        int[] iArr = c1Var.f20583b;
        Object[] objArr = c1Var.f20584c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f20602a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c1Var.f20582a = false;
        c1Var.f20585d = i11;
    }
}
