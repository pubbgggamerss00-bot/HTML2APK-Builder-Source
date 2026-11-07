package t6;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f28049a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f28050b;

    public static class a extends s {

        /* renamed from: c, reason: collision with root package name */
        public final int f28051c;

        public a(int i10) {
            this.f28051c = i10;
        }

        @Override // t6.s
        public final void a(String str, String str2) {
            if (this.f28051c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // t6.s
        public final void b(String str, String str2) {
            if (this.f28051c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // t6.s
        public final void c(String str, String str2, Throwable th2) {
            if (this.f28051c <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // t6.s
        public final void e(String str, String str2) {
            if (this.f28051c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // t6.s
        public final void g(String str, String str2) {
            if (this.f28051c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static s d() {
        a aVar;
        synchronized (f28049a) {
            try {
                if (f28050b == null) {
                    f28050b = new a(3);
                }
                aVar = f28050b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static String f(String str) {
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

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2);

    public abstract void c(String str, String str2, Throwable th2);

    public abstract void e(String str, String str2);

    public abstract void g(String str, String str2);
}
