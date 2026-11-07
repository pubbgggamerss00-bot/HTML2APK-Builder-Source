package w0;

import java.util.List;
import java.util.Set;
import qg.o;
import qg.p;
import qg.x;

/* loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<a> f31032b;

    /* renamed from: c, reason: collision with root package name */
    public static final List<a> f31033c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<a> f31034d;

    /* renamed from: a, reason: collision with root package name */
    public final int f31035a;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    public static final class C0313a {
        public static float a(int i10) {
            Set<a> set = a.f31032b;
            return i10 == 2 ? 900 : i10 == 1 ? 480 : 0;
        }
    }

    static {
        int i10 = 0;
        int i11 = 1;
        int i12 = 2;
        f31032b = o.C(new a[]{new a(i10), new a(i11), new a(i12)});
        List<a> listJ = p.j(new a(i12), new a(i11), new a(i10));
        f31033c = listJ;
        f31034d = x.h0(listJ);
    }

    public /* synthetic */ a(int i10) {
        this.f31035a = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return Float.compare(C0313a.a(this.f31035a), C0313a.a(aVar.f31035a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f31035a == ((a) obj).f31035a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31035a);
    }

    public final String toString() {
        int i10 = this.f31035a;
        return "WindowHeightSizeClass.".concat(i10 == 0 ? "Compact" : i10 == 1 ? "Medium" : i10 == 2 ? "Expanded" : "");
    }
}
