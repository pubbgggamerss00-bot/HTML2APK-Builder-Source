package r3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p.b1;
import q3.e;
import q3.g;
import v3.j;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f23169a;

    /* renamed from: b, reason: collision with root package name */
    public static final p.s<String, Typeface> f23170b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f23171c;

    public static class a extends ya.b {

        /* renamed from: c, reason: collision with root package name */
        public g.c f23172c;
    }

    static {
        Trace.beginSection(m6.a.c("TypefaceCompat static init"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f23169a = new z();
        } else if (i10 >= 29) {
            f23169a = new y();
        } else {
            f23169a = new x();
        }
        f23170b = new p.s<>(16);
        f23171c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        r5 = r10.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, e.a aVar, Resources resources, int i10, String str, int i11, int i12, g.c cVar, boolean z10) throws InterruptedException {
        Typeface typefaceA;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        if (aVar instanceof e.d) {
            e.d dVar = (e.d) aVar;
            String str2 = dVar.f21887d;
            typefaceA = null;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = dVar.f21884a;
                if (arrayList.size() == 1) {
                    typefaceBuild = c(((v3.e) arrayList.get(0)).f30572e);
                } else if (Build.VERSION.SDK_INT < 31) {
                    typefaceBuild = null;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList.size()) {
                            Typeface.CustomFallbackBuilder customFallbackBuilderA = null;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= arrayList.size()) {
                                    break;
                                }
                                v3.e eVar = (v3.e) arrayList.get(i14);
                                if (i14 == arrayList.size() - 1 && TextUtils.isEmpty(eVar.f30573f)) {
                                    customFallbackBuilderA.setSystemFallback(eVar.f30572e);
                                    break;
                                }
                                String str3 = eVar.f30572e;
                                String str4 = eVar.f30573f;
                                Font fontD = d(c(str3));
                                if (fontD == null) {
                                    Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.f30572e + ". Falling back to provider font.");
                                    break;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    fontFamilyBuild = i.a(fontD).build();
                                } else {
                                    try {
                                        k.a();
                                        l.a();
                                        fontFamilyBuild = i.a(t.a(fontD).setFontVariationSettings(str4).build()).build();
                                    } catch (IOException unused) {
                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                    }
                                }
                                if (customFallbackBuilderA == null) {
                                    customFallbackBuilderA = j.a(fontFamilyBuild);
                                } else {
                                    customFallbackBuilderA.addCustomFallback(fontFamilyBuild);
                                }
                                i14++;
                            }
                        } else {
                            if (c(((v3.e) arrayList.get(i13)).f30572e) == null) {
                                break;
                            }
                            i13++;
                        }
                    }
                    typefaceBuild = null;
                }
            }
            if (typefaceBuild != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new q3.h(cVar, typefaceBuild));
                }
                f23170b.put(b(resources, i10, str, i11, i12), typefaceBuild);
                return typefaceBuild;
            }
            boolean z11 = !z10 ? cVar != null : dVar.f21886c != 0;
            int i15 = z10 ? dVar.f21885b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar2 = new a();
            aVar2.f23172c = cVar;
            ArrayList arrayList2 = dVar.f21884a;
            v3.n nVar = new v3.n(handler);
            v3.c cVar2 = new v3.c(aVar2, nVar);
            if (!z11) {
                String strA = v3.j.a(i12, arrayList2);
                Typeface typeface = v3.j.f30585a.get(strA);
                if (typeface != null) {
                    nVar.execute(new v3.a(aVar2, typeface));
                    typefaceA = typeface;
                } else {
                    v3.g gVar = new v3.g(cVar2);
                    synchronized (v3.j.f30587c) {
                        try {
                            b1<String, ArrayList<x3.a<j.a>>> b1Var = v3.j.f30588d;
                            ArrayList<x3.a<j.a>> arrayList3 = b1Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(gVar);
                            } else {
                                ArrayList<x3.a<j.a>> arrayList4 = new ArrayList<>();
                                arrayList4.add(gVar);
                                b1Var.put(strA, arrayList4);
                                v3.h hVar = new v3.h(strA, context, arrayList2, i12);
                                ThreadPoolExecutor threadPoolExecutor = v3.j.f30586b;
                                v3.i iVar = new v3.i(strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                v3.o oVar = new v3.o();
                                oVar.f30601a = hVar;
                                oVar.f30602b = iVar;
                                oVar.f30603c = handler2;
                                threadPoolExecutor.execute(oVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                v3.e eVar2 = (v3.e) arrayList2.get(0);
                p.s<String, Typeface> sVar = v3.j.f30585a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = v3.j.a(i12, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = v3.j.f30585a.get(strA2);
                if (typeface2 != null) {
                    nVar.execute(new v3.a(aVar2, typeface2));
                    typefaceA = typeface2;
                } else if (i15 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{eVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    j.a aVarB = v3.j.b(strA2, context, Collections.unmodifiableList(arrayList6), i12);
                    cVar2.a(aVarB);
                    typefaceA = aVarB.f30589a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    j.a aVar3 = (j.a) v3.j.f30586b.submit(new v3.f(strA2, context, eVar2, i12)).get(i15, TimeUnit.MILLISECONDS);
                                    cVar2.a(aVar3);
                                    typefaceA = aVar3.f30589a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        }
                    } catch (InterruptedException unused3) {
                        cVar2.f30562b.execute(new v3.b(cVar2.f30561a, -3));
                    }
                }
            }
        } else {
            typefaceA = f23169a.a(context, (e.b) aVar, resources, i12);
            if (cVar != null) {
                if (typefaceA != null) {
                    new Handler(Looper.getMainLooper()).post(new q3.h(cVar, typefaceA));
                } else {
                    cVar.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            f23170b.put(b(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f23171c == null) {
            f23171c = new Paint();
        }
        f23171c.setTextSize(10.0f);
        f23171c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, f23171c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
