package t2;

import androidx.datastore.preferences.protobuf.a1;
import i0.x1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.s1;

/* loaded from: classes.dex */
public final class b implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final List<c<? extends a>> f27760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27761b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27762c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27763d;

    public interface a {
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return x1.b(Integer.valueOf(((c) t3).f27772b), Integer.valueOf(((c) t10).f27772b));
        }
    }

    static {
        g1.n nVar = y.f27891a;
    }

    public b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends c<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f27760a = list;
        this.f27761b = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) list.get(i10);
                T t3 = cVar.f27771a;
                if (t3 instanceof b0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (t3 instanceof s) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f27762c = arrayList;
        this.f27763d = arrayList2;
        List listU = arrayList2 != null ? qg.x.U(new d(), arrayList2) : null;
        if (listU == null || listU.isEmpty()) {
            return;
        }
        int i11 = ((c) qg.x.B(listU)).f27773c;
        p.x xVar = p.h.f20635a;
        p.x xVar2 = new p.x(1);
        xVar2.a(i11);
        int size2 = listU.size();
        for (int i12 = 1; i12 < size2; i12++) {
            c cVar2 = (c) listU.get(i12);
            while (true) {
                if (xVar2.f20751b != 0) {
                    int iD = xVar2.d();
                    int i13 = cVar2.f27772b;
                    int i14 = cVar2.f27773c;
                    if (i13 >= iD) {
                        xVar2.f(xVar2.f20751b - 1);
                    } else if (i14 > iD) {
                        z2.a.a("Paragraph overlap not allowed, end " + i14 + " should be less than or equal to " + iD);
                    }
                }
            }
            xVar2.a(cVar2.f27773c);
        }
    }

    public final List a(int i10) {
        List<c<? extends a>> list = this.f27760a;
        if (list == null) {
            return qg.z.f22752a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            c<? extends a> cVar = list.get(i11);
            c<? extends a> cVar2 = cVar;
            if ((cVar2.f27771a instanceof i) && e.b(0, i10, cVar2.f27772b, cVar2.f27773c)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b subSequence(int i10, int i11) {
        ArrayList arrayList;
        if (i10 > i11) {
            z2.a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        String str = this.f27761b;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        b bVar = e.f27797a;
        if (i10 > i11) {
            z2.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        List<c<? extends a>> list = this.f27760a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                c<? extends a> cVar = list.get(i12);
                int i13 = cVar.f27772b;
                int i14 = cVar.f27773c;
                if (e.b(i10, i11, i13, i14)) {
                    arrayList.add(new c(cVar.f27771a, Math.max(i10, cVar.f27772b) - i10, Math.min(i11, i14) - i10, cVar.f27774d));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new b(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f27761b.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.r.a(this.f27761b, bVar.f27761b) && kotlin.jvm.internal.r.a(this.f27760a, bVar.f27760a);
    }

    public final int hashCode() {
        int iHashCode = this.f27761b.hashCode() * 31;
        List<c<? extends a>> list = this.f27760a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f27761b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f27761b;
    }

    /* renamed from: t2.b$b, reason: collision with other inner class name */
    public static final class C0288b implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f27764a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f27765b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f27766c;

        public C0288b() {
            this.f27764a = new StringBuilder(16);
            this.f27765b = new ArrayList();
            this.f27766c = new ArrayList();
            new ArrayList();
        }

        public final void a(b0 b0Var, int i10, int i11) {
            this.f27766c.add(new a(b0Var, i10, i11, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof b) {
                c((b) charSequence);
                return this;
            }
            this.f27764a.append(charSequence);
            return this;
        }

        public final void b(String str) {
            this.f27764a.append(str);
        }

        public final void c(b bVar) {
            StringBuilder sb = this.f27764a;
            int length = sb.length();
            sb.append(bVar.f27761b);
            List<c<? extends a>> list = bVar.f27760a;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c<? extends a> cVar = list.get(i10);
                    this.f27766c.add(new a(cVar.f27771a, cVar.f27772b + length, cVar.f27773c + length, cVar.f27774d));
                }
            }
        }

        public final void d(int i10) {
            ArrayList arrayList = this.f27765b;
            if (i10 >= arrayList.size()) {
                z2.a.b(i10 + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i10) {
                if (arrayList.isEmpty()) {
                    z2.a.b("Nothing to pop.");
                }
                ((a) arrayList.remove(arrayList.size() - 1)).f27769c = this.f27764a.length();
            }
        }

        public final b e() {
            StringBuilder sb = this.f27764a;
            String string = sb.toString();
            ArrayList arrayList = this.f27766c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(((a) arrayList.get(i10)).a(sb.length()));
            }
            return new b(string, arrayList2);
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            boolean z10 = charSequence instanceof b;
            StringBuilder sb = this.f27764a;
            if (z10) {
                b bVar = (b) charSequence;
                int length = sb.length();
                sb.append((CharSequence) bVar.f27761b, i10, i11);
                List<c<? extends a>> listA = e.a(bVar, i10, i11, null);
                if (listA != null) {
                    int size = listA.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        c<? extends a> cVar = listA.get(i12);
                        this.f27766c.add(new a(cVar.f27771a, cVar.f27772b + length, cVar.f27773c + length, cVar.f27774d));
                    }
                }
                return this;
            }
            sb.append(charSequence, i10, i11);
            return this;
        }

        /* renamed from: t2.b$b$a */
        public static final class a<T> {

            /* renamed from: a, reason: collision with root package name */
            public final T f27767a;

            /* renamed from: b, reason: collision with root package name */
            public final int f27768b;

            /* renamed from: c, reason: collision with root package name */
            public int f27769c;

            /* renamed from: d, reason: collision with root package name */
            public final String f27770d;

            public a(T t3, int i10, int i11, String str) {
                this.f27767a = t3;
                this.f27768b = i10;
                this.f27769c = i11;
                this.f27770d = str;
            }

            public final c<T> a(int i10) {
                int i11 = this.f27769c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    z2.a.b("Item.end should be set first");
                }
                return new c<>(this.f27767a, this.f27768b, i10, this.f27770d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.r.a(this.f27767a, aVar.f27767a) && this.f27768b == aVar.f27768b && this.f27769c == aVar.f27769c && kotlin.jvm.internal.r.a(this.f27770d, aVar.f27770d);
            }

            public final int hashCode() {
                T t3 = this.f27767a;
                return this.f27770d.hashCode() + a1.a(this.f27769c, a1.a(this.f27768b, (t3 == null ? 0 : t3.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.f27767a);
                sb.append(", start=");
                sb.append(this.f27768b);
                sb.append(", end=");
                sb.append(this.f27769c);
                sb.append(", tag=");
                return s1.a(sb, this.f27770d, ')');
            }

            public /* synthetic */ a(a aVar, int i10, int i11, int i12) {
                this(aVar, i10, (i12 & 4) != 0 ? PKIFailureInfo.systemUnavail : i11, "");
            }
        }

        public C0288b(b bVar) {
            this();
            c(bVar);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) {
            this.f27764a.append(c10);
            return this;
        }
    }

    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f27771a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27772b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27773c;

        /* renamed from: d, reason: collision with root package name */
        public final String f27774d;

        public c(T t3, int i10, int i11, String str) {
            this.f27771a = t3;
            this.f27772b = i10;
            this.f27773c = i11;
            this.f27774d = str;
            if (i10 <= i11) {
                return;
            }
            z2.a.a("Reversed range is not supported");
        }

        public static c a(c cVar, s sVar, int i10, int i11) {
            if ((i11 & 1) != 0) {
                sVar = cVar.f27771a;
            }
            int i12 = cVar.f27772b;
            if ((i11 & 4) != 0) {
                i10 = cVar.f27773c;
            }
            return new c(sVar, i12, i10, cVar.f27774d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.r.a(this.f27771a, cVar.f27771a) && this.f27772b == cVar.f27772b && this.f27773c == cVar.f27773c && kotlin.jvm.internal.r.a(this.f27774d, cVar.f27774d);
        }

        public final int hashCode() {
            T t3 = this.f27771a;
            return this.f27774d.hashCode() + a1.a(this.f27773c, a1.a(this.f27772b, (t3 == null ? 0 : t3.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.f27771a);
            sb.append(", start=");
            sb.append(this.f27772b);
            sb.append(", end=");
            sb.append(this.f27773c);
            sb.append(", tag=");
            return s1.a(sb, this.f27774d, ')');
        }

        public c(T t3, int i10, int i11) {
            this(t3, i10, i11, "");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i10, String str, ArrayList arrayList) {
        List list = (i10 & 2) != 0 ? qg.z.f22752a : arrayList;
        b bVar = e.f27797a;
        this((List<? extends c<? extends a>>) (list.isEmpty() ? null : list), str);
    }

    public /* synthetic */ b(String str) {
        this(str, qg.z.f22752a);
    }

    public b(String str, List<? extends c<? extends a>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
