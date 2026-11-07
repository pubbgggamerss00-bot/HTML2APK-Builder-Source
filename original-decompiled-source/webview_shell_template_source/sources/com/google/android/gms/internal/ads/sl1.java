package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sl1 {
    public static void a(int i6, int i7) {
        String strA;
        if (i6 < 0 || i6 >= i7) {
            if (i6 < 0) {
                strA = dm1.a("%s (%s) must not be negative", "index", Integer.valueOf(i6));
            } else {
                if (i7 < 0) {
                    throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i7, "negative size: "));
                }
                strA = dm1.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i6, int i7) {
        if (i6 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException(i(i6, i7, "index"));
        }
    }

    public static void c(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void d(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(boolean z6, String str, long j6) {
        if (!z6) {
            throw new IllegalArgumentException(dm1.a(str, Long.valueOf(j6)));
        }
    }

    public static void g(int i6, int i7, int i8) {
        if (i6 < 0 || i7 < i6 || i7 > i8) {
            throw new IndexOutOfBoundsException((i6 < 0 || i6 > i8) ? i(i6, i8, "start index") : (i7 < 0 || i7 > i8) ? i(i7, i8, "end index") : dm1.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i7), Integer.valueOf(i6)));
        }
    }

    public static void h(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    public static String i(int i6, int i7, String str) {
        if (i6 < 0) {
            return dm1.a("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i7 >= 0) {
            return dm1.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i7));
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i7, "negative size: "));
    }
}
