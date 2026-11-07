package w0;

import java.util.List;
import java.util.Set;
import qg.o;
import qg.p;
import qg.x;

/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<b> f31036b;

    /* renamed from: c, reason: collision with root package name */
    public static final List<b> f31037c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<b> f31038d;

    /* renamed from: a, reason: collision with root package name */
    public final int f31039a;

    public static final class a {
        public static float a(int i10) {
            Set<b> set = b.f31036b;
            return i10 == 2 ? 840 : i10 == 1 ? 600 : 0;
        }
    }

    static {
        int i10 = 0;
        int i11 = 1;
        int i12 = 2;
        f31036b = o.C(new b[]{new b(i10), new b(i11), new b(i12)});
        List<b> listJ = p.j(new b(i12), new b(i11), new b(i10));
        f31037c = listJ;
        f31038d = x.h0(listJ);
    }

    public /* synthetic */ b(int i10) {
        this.f31039a = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return Float.compare(a.a(this.f31039a), a.a(bVar.f31039a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f31039a == ((b) obj).f31039a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31039a);
    }

    public final String toString() {
        int i10 = this.f31039a;
        return "WindowWidthSizeClass.".concat(i10 == 0 ? "Compact" : i10 == 1 ? "Medium" : i10 == 2 ? "Expanded" : "");
    }
}
