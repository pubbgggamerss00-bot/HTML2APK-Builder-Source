package di;

import bi.m;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8078a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8079b;

    /* renamed from: c, reason: collision with root package name */
    public int f8080c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8081a = new a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i10 = this.f8080c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f8078a[i11];
            if (obj instanceof bi.f) {
                bi.f fVar = (bi.f) obj;
                if (!kotlin.jvm.internal.r.a(fVar.getKind(), m.b.f4279a)) {
                    int i12 = this.f8079b[i11];
                    if (i12 >= 0) {
                        sb.append(".");
                        sb.append(fVar.f(i12));
                    }
                } else if (this.f8079b[i11] != -1) {
                    sb.append("[");
                    sb.append(this.f8079b[i11]);
                    sb.append("]");
                }
            } else if (obj != a.f8081a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a();
    }
}
