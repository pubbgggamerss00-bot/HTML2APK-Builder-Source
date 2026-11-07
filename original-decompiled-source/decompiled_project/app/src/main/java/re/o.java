package re;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<a, String> f23506b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<a, String> f23507c;

    /* renamed from: a, reason: collision with root package name */
    public a f23508a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(26);
        linkedHashMap.put(new a(1), "hstem");
        linkedHashMap.put(new a(3), "vstem");
        linkedHashMap.put(new a(4), "vmoveto");
        linkedHashMap.put(new a(5), "rlineto");
        linkedHashMap.put(new a(6), "hlineto");
        linkedHashMap.put(new a(7), "vlineto");
        linkedHashMap.put(new a(8), "rrcurveto");
        linkedHashMap.put(new a(9), "closepath");
        linkedHashMap.put(new a(10), "callsubr");
        linkedHashMap.put(new a(11), "return");
        linkedHashMap.put(new a(12), "escape");
        linkedHashMap.put(new a(12, 0), "dotsection");
        linkedHashMap.put(new a(12, 1), "vstem3");
        linkedHashMap.put(new a(12, 2), "hstem3");
        linkedHashMap.put(new a(12, 6), "seac");
        linkedHashMap.put(new a(12, 7), "sbw");
        linkedHashMap.put(new a(12, 12), "div");
        linkedHashMap.put(new a(12, 16), "callothersubr");
        linkedHashMap.put(new a(12, 17), "pop");
        linkedHashMap.put(new a(12, 33), "setcurrentpoint");
        linkedHashMap.put(new a(13), "hsbw");
        linkedHashMap.put(new a(14), "endchar");
        linkedHashMap.put(new a(21), "rmoveto");
        linkedHashMap.put(new a(22), "hmoveto");
        linkedHashMap.put(new a(30), "vhcurveto");
        linkedHashMap.put(new a(31), "hvcurveto");
        f23506b = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(48);
        linkedHashMap2.put(new a(1), "hstem");
        linkedHashMap2.put(new a(3), "vstem");
        linkedHashMap2.put(new a(4), "vmoveto");
        linkedHashMap2.put(new a(5), "rlineto");
        linkedHashMap2.put(new a(6), "hlineto");
        linkedHashMap2.put(new a(7), "vlineto");
        linkedHashMap2.put(new a(8), "rrcurveto");
        linkedHashMap2.put(new a(10), "callsubr");
        linkedHashMap2.put(new a(11), "return");
        linkedHashMap2.put(new a(12), "escape");
        linkedHashMap2.put(new a(12, 3), "and");
        linkedHashMap2.put(new a(12, 4), "or");
        linkedHashMap2.put(new a(12, 5), "not");
        linkedHashMap2.put(new a(12, 9), "abs");
        linkedHashMap2.put(new a(12, 10), "add");
        linkedHashMap2.put(new a(12, 11), "sub");
        linkedHashMap2.put(new a(12, 12), "div");
        linkedHashMap2.put(new a(12, 14), "neg");
        linkedHashMap2.put(new a(12, 15), "eq");
        linkedHashMap2.put(new a(12, 18), "drop");
        linkedHashMap2.put(new a(12, 20), "put");
        linkedHashMap2.put(new a(12, 21), "get");
        linkedHashMap2.put(new a(12, 22), "ifelse");
        linkedHashMap2.put(new a(12, 23), "random");
        linkedHashMap2.put(new a(12, 24), "mul");
        linkedHashMap2.put(new a(12, 26), "sqrt");
        linkedHashMap2.put(new a(12, 27), "dup");
        linkedHashMap2.put(new a(12, 28), "exch");
        linkedHashMap2.put(new a(12, 29), "index");
        linkedHashMap2.put(new a(12, 30), "roll");
        linkedHashMap2.put(new a(12, 34), "hflex");
        linkedHashMap2.put(new a(12, 35), "flex");
        linkedHashMap2.put(new a(12, 36), "hflex1");
        linkedHashMap2.put(new a(12, 37), "flex1");
        linkedHashMap2.put(new a(14), "endchar");
        linkedHashMap2.put(new a(18), "hstemhm");
        linkedHashMap2.put(new a(19), "hintmask");
        linkedHashMap2.put(new a(20), "cntrmask");
        linkedHashMap2.put(new a(21), "rmoveto");
        linkedHashMap2.put(new a(22), "hmoveto");
        linkedHashMap2.put(new a(23), "vstemhm");
        linkedHashMap2.put(new a(24), "rcurveline");
        linkedHashMap2.put(new a(25), "rlinecurve");
        linkedHashMap2.put(new a(26), "vvcurveto");
        linkedHashMap2.put(new a(27), "hhcurveto");
        linkedHashMap2.put(new a(28), "shortint");
        linkedHashMap2.put(new a(29), "callgsubr");
        linkedHashMap2.put(new a(30), "vhcurveto");
        linkedHashMap2.put(new a(31), "hvcurveto");
        f23507c = Collections.unmodifiableMap(linkedHashMap2);
    }

    public o(int i10) {
        this.f23508a = new a(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f23508a.equals(((o) obj).f23508a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23508a.hashCode();
    }

    public final String toString() {
        String str = f23507c.get(this.f23508a);
        if (str == null) {
            str = f23506b.get(this.f23508a);
        }
        if (str != null) {
            return str.concat("|");
        }
        return Arrays.toString(this.f23508a.f23509a) + '|';
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int[] f23509a;

        public a(int i10) {
            this.f23509a = new int[]{i10};
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int[] iArr = this.f23509a;
                int i10 = iArr[0];
                if (i10 == 12) {
                    int[] iArr2 = aVar.f23509a;
                    if (iArr2[0] == 12) {
                        return (iArr.length <= 1 || iArr2.length <= 1) ? iArr.length == iArr2.length : iArr[1] == iArr2[1];
                    }
                }
                if (i10 == aVar.f23509a[0]) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int[] iArr = this.f23509a;
            int i10 = iArr[0];
            return (i10 != 12 || iArr.length <= 1) ? i10 : iArr[1] ^ i10;
        }

        public final String toString() {
            return Arrays.toString(this.f23509a);
        }

        public a(int i10, int i11) {
            this.f23509a = new int[]{i10, i11};
        }
    }

    public o(int i10, int i11) {
        this.f23508a = new a(i10, i11);
    }
}
