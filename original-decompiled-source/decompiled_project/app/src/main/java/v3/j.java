package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.b1;
import p.s;
import r3.a0;
import r3.u;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final s<String, Typeface> f30585a = new s<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f30586b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f30587c;

    /* renamed from: d, reason: collision with root package name */
    public static final b1<String, ArrayList<x3.a<a>>> f30588d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f30586b = threadPoolExecutor;
        f30587c = new Object();
        f30588d = new b1<>();
    }

    public static String a(int i10, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((e) list.get(i11)).f30574g);
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static a b(String str, Context context, List<e> list, int i10) {
        int i11;
        Typeface typefaceB;
        s<String, Typeface> sVar = f30585a;
        Trace.beginSection(m6.a.c("getFontSync"));
        try {
            Typeface typeface = sVar.get(str);
            if (typeface != null) {
                return new a(typeface);
            }
            k kVarA = d.a(context, list);
            List<l[]> list2 = kVarA.f30592b;
            int i12 = kVarA.f30591a;
            if (i12 != 0) {
                i11 = i12 != 1 ? -3 : -2;
            } else {
                l[] lVarArr = list2.get(0);
                if (lVarArr == null || lVarArr.length == 0) {
                    i11 = 1;
                } else {
                    int length = lVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i11 = 0;
                            break;
                        }
                        int i14 = lVarArr[i13].f30598f;
                        if (i14 == 0) {
                            i13++;
                        } else if (i14 >= 0) {
                            i11 = i14;
                        }
                    }
                }
            }
            if (i11 != 0) {
                return new a(i11);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                l[] lVarArr2 = list2.get(0);
                a0 a0Var = u.f23169a;
                Trace.beginSection(m6.a.c("TypefaceCompat.createFromFontInfo"));
                typefaceB = u.f23169a.b(context, lVarArr2, i10);
                Trace.endSection();
            } else {
                a0 a0Var2 = u.f23169a;
                Trace.beginSection(m6.a.c("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceB = u.f23169a.c(context, list2, i10);
                Trace.endSection();
            }
            if (typefaceB == null) {
                return new a(-3);
            }
            sVar.put(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            Trace.endSection();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f30589a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30590b;

        public a(int i10) {
            this.f30589a = null;
            this.f30590b = i10;
        }

        public a(Typeface typeface) {
            this.f30589a = typeface;
            this.f30590b = 0;
        }
    }
}
