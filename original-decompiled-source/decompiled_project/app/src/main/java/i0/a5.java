package i0;

/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final z4 f13152a = new z4(0, 0);

    public static final y2.o0 a(y2.q0 q0Var, t2.b bVar) {
        ((y2.p0) q0Var).getClass();
        int length = bVar.f27761b.length();
        int length2 = bVar.f27761b.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            b(i10, length2, i10);
        }
        b(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            c(i11, length, i11);
        }
        c(length2, length, length2);
        return new y2.o0(bVar, new z4(bVar.f27761b.length(), bVar.f27761b.length()));
    }

    public static final void b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbA = p.g0.a(i12, i10, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbA.append(i11);
        sbA.append(']');
        y.c.c(sbA.toString());
    }

    public static final void c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbA = p.g0.a(i12, i10, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbA.append(i11);
        sbA.append(']');
        y.c.c(sbA.toString());
    }
}
