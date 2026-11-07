package qg;

import c9.u1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public class m {
    public static List a(Object[] objArr) {
        kotlin.jvm.internal.r.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.r.d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!b((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof pg.w) && (obj2 instanceof pg.w)) {
                    byte[] bArr = ((pg.w) obj).f21484a;
                    byte[] bArr2 = ((pg.w) obj2).f21484a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof pg.d0) && (obj2 instanceof pg.d0)) {
                    short[] sArr = ((pg.d0) obj).f21456a;
                    ?? r52 = ((pg.d0) obj2).f21456a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, (short[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof pg.y) && (obj2 instanceof pg.y)) {
                    int[] iArr = ((pg.y) obj).f21489a;
                    ?? r53 = ((pg.y) obj2).f21489a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, (int[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if ((obj instanceof pg.a0) && (obj2 instanceof pg.a0)) {
                    long[] jArr = ((pg.a0) obj).f21446a;
                    ?? r54 = ((pg.a0) obj2).f21446a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, (long[]) (r54 != 0 ? r54 : null))) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void c(int i10, byte[] bArr, int i11, byte[] destination, int i12) {
        kotlin.jvm.internal.r.e(bArr, "<this>");
        kotlin.jvm.internal.r.e(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    public static void d(int i10, int[] iArr, int i11, int i12, int[] destination) {
        kotlin.jvm.internal.r.e(iArr, "<this>");
        kotlin.jvm.internal.r.e(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    public static void e(int i10, long[] jArr, int i11, long[] destination, int i12) {
        kotlin.jvm.internal.r.e(jArr, "<this>");
        kotlin.jvm.internal.r.e(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
    }

    public static void f(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        kotlin.jvm.internal.r.e(cArr, "<this>");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    public static void g(Object[] objArr, int i10, Object[] destination, int i11, int i12) {
        kotlin.jvm.internal.r.e(objArr, "<this>");
        kotlin.jvm.internal.r.e(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    public static /* synthetic */ void h(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        d(i10, iArr, 0, i11, iArr2);
    }

    public static /* synthetic */ void i(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        g(objArr, 0, objArr2, i10, i11);
    }

    public static byte[] j(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.r.e(bArr, "<this>");
        l(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.r.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] k(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.r.e(objArr, "<this>");
        l(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        kotlin.jvm.internal.r.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void l(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(r1.f.a(i10, i11, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void m(Object[] objArr, int i10, int i11, Object obj) {
        kotlin.jvm.internal.r.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static void n(long[] jArr, long j10) {
        int length = jArr.length;
        kotlin.jvm.internal.r.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j10);
    }

    public static final void p(Throwable th2, tg.h hVar) {
        Throwable runtimeException;
        Iterator it = uh.d.f29727a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).getClass();
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    u1.b(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            u1.b(th2, new uh.e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }
}
