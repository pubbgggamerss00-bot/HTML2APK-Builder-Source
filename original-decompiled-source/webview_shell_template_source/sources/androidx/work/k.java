package androidx.work;

import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static a f1830a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public final int f1831b;

        public a(int i6) {
            this.f1831b = i6;
        }

        @Override // androidx.work.k
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f1831b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.k
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f1831b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.k
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f1831b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.k
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f1831b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized k c() {
        try {
            if (f1830a == null) {
                f1830a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1830a;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
