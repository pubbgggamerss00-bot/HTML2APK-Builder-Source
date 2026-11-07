package m0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import l0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends k {
    public static Font g(FontFamily fontFamily, int i6) {
        FontStyle fontStyle = new FontStyle((i6 & 1) != 0 ? 700 : 400, (i6 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i7 = i(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int i9 = i(fontStyle, font2.getStyle());
            if (i9 < i7) {
                font = font2;
                i7 = i9;
            }
        }
        return font;
    }

    public static FontFamily h(r0.l[] lVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (r0.l lVar : lVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(lVar.f14248a, "r", null);
            } catch (IOException e6) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(lVar.f14250c).setSlant(lVar.f14251d ? 1 : 0).setTtcIndex(lVar.f14249b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // m0.k
    public final Typeface a(Context context, e.b bVar, Resources resources, int i6) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (e.c cVar : bVar.f13783a) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.f13789f).setWeight(cVar.f13785b).setSlant(cVar.f13786c ? 1 : 0).setTtcIndex(cVar.f13788e).setFontVariationSettings(cVar.f13787d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(g(fontFamilyBuild, i6).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // m0.k
    public final Typeface b(Context context, r0.l[] lVarArr, int i6) {
        try {
            FontFamily fontFamilyH = h(lVarArr, context.getContentResolver());
            if (fontFamilyH == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyH).setStyle(g(fontFamilyH, i6).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // m0.k
    public final Typeface c(Context context, List list, int i6) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyH = h((r0.l[]) list.get(0), contentResolver);
            if (fontFamilyH == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyH);
            for (int i7 = 1; i7 < list.size(); i7++) {
                FontFamily fontFamilyH2 = h((r0.l[]) list.get(i7), contentResolver);
                if (fontFamilyH2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyH2);
                }
            }
            return customFallbackBuilder.setStyle(g(fontFamilyH, i6).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // m0.k
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // m0.k
    public final Typeface e(Context context, Resources resources, int i6, String str, int i7) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i6).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // m0.k
    public final r0.l f(r0.l[] lVarArr, int i6) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
