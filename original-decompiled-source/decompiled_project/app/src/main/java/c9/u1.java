package c9;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5301a = 0;

    public static final String a(Object[] objArr, int i10, int i11, qg.g gVar) {
        StringBuilder sb = new StringBuilder((i11 * 3) + 2);
        sb.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public static void b(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.r.e(th2, "<this>");
        kotlin.jvm.internal.r.e(exception, "exception");
        if (th2 != exception) {
            xg.b.f33571a.a(th2, exception);
        }
    }

    public static final int c(x0.j jVar) {
        return jVar.D();
    }

    public static final void d() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final void e(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.r.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }
}
