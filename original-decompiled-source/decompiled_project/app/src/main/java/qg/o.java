package qg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public class o extends m {
    public static List<Long> A(long[] jArr) {
        kotlin.jvm.internal.r.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return z.f22752a;
        }
        if (length == 1) {
            return c0.g0.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static <T> List<T> B(T[] tArr) {
        kotlin.jvm.internal.r.e(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new k(tArr, false)) : c0.g0.c(tArr[0]) : z.f22752a;
    }

    public static <T> Set<T> C(T[] tArr) {
        kotlin.jvm.internal.r.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return b0.f22711a;
        }
        if (length == 1) {
            return n0.g(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(j0.a(tArr.length));
        for (T t3 : tArr) {
            linkedHashSet.add(t3);
        }
        return linkedHashSet;
    }

    public static boolean q(char[] cArr, char c10) {
        int length = cArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (c10 == cArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    public static <T> boolean r(T[] tArr, T t3) {
        kotlin.jvm.internal.r.e(tArr, "<this>");
        return w(tArr, t3) >= 0;
    }

    public static ArrayList s(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T t(T[] tArr) {
        kotlin.jvm.internal.r.e(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static jh.g u(int[] iArr) {
        return new jh.g(0, iArr.length - 1, 1);
    }

    public static int v(long[] jArr) {
        kotlin.jvm.internal.r.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int w(T[] tArr, T t3) {
        kotlin.jvm.internal.r.e(tArr, "<this>");
        int i10 = 0;
        if (t3 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (t3.equals(tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static String x(int i10, Object[] objArr) {
        String str = (i10 & 1) != 0 ? ", " : ",";
        String str2 = (i10 & 2) != 0 ? "" : "[";
        String str3 = (i10 & 4) == 0 ? "]" : "";
        kotlin.jvm.internal.r.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) str);
            }
            mh.o.a(sb, obj, null);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String y(byte[] bArr, String str, eh.l lVar, int i10) {
        String str2 = (i10 & 2) != 0 ? "" : "[";
        String str3 = (i10 & 4) == 0 ? "]" : "";
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) str);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(Byte.valueOf(b10)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b10));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static List z(Comparator comparator, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.r.d(objArr, "copyOf(...)");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return m.a(objArr);
    }
}
