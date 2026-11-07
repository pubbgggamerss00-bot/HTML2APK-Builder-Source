package m0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.activity.c0;
import com.google.android.gms.internal.ads.la2;
import com.htmltoapk.template.u0;
import e3.n;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.e;
import l0.f;
import r0.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f13861a;

    /* renamed from: b, reason: collision with root package name */
    public static final w.f<String, Typeface> f13862b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends c0 {

        /* renamed from: a, reason: collision with root package name */
        public f.c f13863a;
    }

    static {
        Trace.beginSection(d2.a.d("TypefaceCompat static init"));
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            f13861a = new j();
        } else if (i6 >= 28) {
            f13861a = new i();
        } else if (i6 >= 26) {
            f13861a = new h();
        } else {
            Method method = g.f13871c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f13861a = new g();
            } else {
                f13861a = new f();
            }
        }
        f13862b = new w.f<>(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, e.a aVar, Resources resources, int i6, String str, int i7, int i8, f.c cVar, boolean z6) throws InterruptedException {
        Typeface typefaceA;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i9 = -3;
        int i10 = 1;
        if (aVar instanceof e.d) {
            e.d dVar = (e.d) aVar;
            String str2 = dVar.f13794e;
            Typeface typeface = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (cVar != null) {
                        new Handler(Looper.getMainLooper()).post(new u0(1, cVar, typefaceCreate));
                    }
                    return typefaceCreate;
                }
                boolean z7 = !z6 ? cVar != null : dVar.f13793d != 0;
                int i11 = z6 ? dVar.f13792c : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                a aVar2 = new a();
                aVar2.f13863a = cVar;
                r0.e eVar = dVar.f13791b;
                if (eVar != null) {
                    Object[] objArr = {dVar.f13790a, eVar};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i12 = 0; i12 < 2; i12++) {
                        Object obj = objArr[i12];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                } else {
                    Object[] objArr2 = {dVar.f13790a};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                }
                n nVar = new n(handler, 1);
                r0.b bVar = new r0.b(aVar2, nVar);
                if (!z7) {
                    String strA = r0.j.a(i8, listUnmodifiableList);
                    Typeface typefaceA2 = r0.j.f14240a.a(strA);
                    if (typefaceA2 != null) {
                        nVar.execute(new r0.a(aVar2, typefaceA2));
                        typeface = typefaceA2;
                    } else {
                        r0.g gVar = new r0.g(bVar);
                        synchronized (r0.j.f14242c) {
                            try {
                                w.g<String, ArrayList<t0.a<j.a>>> gVar2 = r0.j.f14243d;
                                ArrayList<t0.a<j.a>> arrayList3 = gVar2.get(strA);
                                if (arrayList3 != null) {
                                    arrayList3.add(gVar);
                                } else {
                                    ArrayList<t0.a<j.a>> arrayList4 = new ArrayList<>();
                                    arrayList4.add(gVar);
                                    gVar2.put(strA, arrayList4);
                                    r0.h hVar = new r0.h(strA, context, listUnmodifiableList, i8);
                                    ThreadPoolExecutor threadPoolExecutor = r0.j.f14241b;
                                    r0.i iVar = new r0.i(strA);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    r0.n nVar2 = new r0.n();
                                    nVar2.s = hVar;
                                    nVar2.f14253t = iVar;
                                    nVar2.f14254u = handler2;
                                    threadPoolExecutor.execute(nVar2);
                                }
                            } finally {
                            }
                        }
                    }
                } else {
                    if (listUnmodifiableList.size() > 1) {
                        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                    }
                    r0.e eVar2 = (r0.e) listUnmodifiableList.get(0);
                    w.f<String, Typeface> fVar = r0.j.f14240a;
                    ArrayList arrayList5 = new ArrayList(1);
                    Object obj3 = new Object[]{eVar2}[0];
                    Objects.requireNonNull(obj3);
                    arrayList5.add(obj3);
                    String strA2 = r0.j.a(i8, Collections.unmodifiableList(arrayList5));
                    Typeface typefaceA3 = r0.j.f14240a.a(strA2);
                    if (typefaceA3 != null) {
                        nVar.execute(new r0.a(aVar2, typefaceA3));
                        typeface = typefaceA3;
                    } else if (i11 == -1) {
                        ArrayList arrayList6 = new ArrayList(1);
                        Object obj4 = new Object[]{eVar2}[0];
                        Objects.requireNonNull(obj4);
                        arrayList6.add(obj4);
                        j.a aVarB = r0.j.b(strA2, context, Collections.unmodifiableList(arrayList6), i8);
                        bVar.a(aVarB);
                        typeface = aVarB.f14244a;
                    } else {
                        try {
                            try {
                                try {
                                    j.a aVar3 = (j.a) r0.j.f14241b.submit(new r0.f(strA2, context, eVar2, i8)).get(i11, TimeUnit.MILLISECONDS);
                                    bVar.a(aVar3);
                                    typeface = aVar3.f14244a;
                                } catch (InterruptedException e6) {
                                    throw e6;
                                }
                            } catch (ExecutionException e7) {
                                throw new RuntimeException(e7);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused2) {
                            bVar.f14219b.execute(new la2(i9, i10, bVar.f14218a));
                        }
                    }
                }
                typefaceA = typeface;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceA = f13861a.a(context, (e.b) aVar, resources, i8);
            if (cVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new u0(1, cVar, typefaceA));
                } else {
                    cVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            f13862b.b(b(resources, i6, str, i7, i8), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i6, String str, int i7, int i8) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i7 + '-' + i6 + '-' + i8;
    }
}
