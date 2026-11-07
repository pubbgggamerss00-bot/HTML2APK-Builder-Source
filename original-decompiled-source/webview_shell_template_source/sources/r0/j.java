package r0;

import android.annotation.SuppressLint;
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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final w.f<String, Typeface> f14240a = new w.f<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f14241b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14242c;

    /* renamed from: d, reason: collision with root package name */
    public static final w.g<String, ArrayList<t0.a<a>>> f14243d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14241b = threadPoolExecutor;
        f14242c = new Object();
        f14243d = new w.g<>();
    }

    public static String a(int i6, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((e) list.get(i7)).f14229e);
            sb.append("-");
            sb.append(i6);
            if (i7 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static a b(String str, Context context, List<e> list, int i6) {
        int i7;
        Typeface typefaceB;
        w.f<String, Typeface> fVar = f14240a;
        Trace.beginSection(d2.a.d("getFontSync"));
        try {
            Typeface typefaceA = fVar.a(str);
            if (typefaceA != null) {
                return new a(typefaceA);
            }
            k kVarA = d.a(context, list);
            List<l[]> list2 = kVarA.f14247b;
            int i8 = kVarA.f14246a;
            if (i8 != 0) {
                i7 = i8 != 1 ? -3 : -2;
            } else {
                l[] lVarArr = list2.get(0);
                if (lVarArr == null || lVarArr.length == 0) {
                    i7 = 1;
                } else {
                    int length = lVarArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            i7 = 0;
                            break;
                        }
                        int i10 = lVarArr[i9].f14252e;
                        if (i10 == 0) {
                            i9++;
                        } else if (i10 >= 0) {
                            i7 = i10;
                        }
                    }
                }
            }
            if (i7 != 0) {
                return new a(i7);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                l[] lVarArr2 = list2.get(0);
                m0.k kVar = m0.e.f13861a;
                Trace.beginSection(d2.a.d("TypefaceCompat.createFromFontInfo"));
                typefaceB = m0.e.f13861a.b(context, lVarArr2, i6);
                Trace.endSection();
            } else {
                m0.k kVar2 = m0.e.f13861a;
                Trace.beginSection(d2.a.d("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceB = m0.e.f13861a.c(context, list2, i6);
                Trace.endSection();
            }
            if (typefaceB == null) {
                return new a(-3);
            }
            fVar.b(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f14244a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14245b;

        public a(int i6) {
            this.f14244a = null;
            this.f14245b = i6;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f14244a = typeface;
            this.f14245b = 0;
        }
    }
}
