package r3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import q3.e;

/* loaded from: classes.dex */
public class y extends a0 {
    public static Font e(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iH = h(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iH2 = h(fontStyle, font2.getStyle());
            if (iH2 < iH) {
                font = font2;
                iH = iH2;
            }
        }
        return font;
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // r3.a0
    public final Typeface a(Context context, e.b bVar, Resources resources, int i10) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (e.c cVar : bVar.f21877a) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.f21883f).setWeight(cVar.f21879b).setSlant(cVar.f21880c ? 1 : 0).setTtcIndex(cVar.f21882e).setFontVariationSettings(cVar.f21881d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(e(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // r3.a0
    public final Typeface b(Context context, v3.l[] lVarArr, int i10) {
        try {
            FontFamily fontFamilyF = f(lVarArr, context.getContentResolver());
            if (fontFamilyF == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyF).setStyle(e(fontFamilyF, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // r3.a0
    public final Typeface c(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyF = f((v3.l[]) list.get(0), contentResolver);
            if (fontFamilyF == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyF);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyF2 = f((v3.l[]) list.get(i11), contentResolver);
                if (fontFamilyF2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyF2);
                }
            }
            return customFallbackBuilder.setStyle(e(fontFamilyF, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // r3.a0
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    public final FontFamily f(v3.l[] lVarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (v3.l lVar : lVarArr) {
            if (Objects.equals(lVar.f30593a.getScheme(), "systemfont")) {
                fontBuild = g(lVar);
            } else {
                try {
                    Uri uri = lVar.f30593a;
                    str = lVar.f30597e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(lVar.f30595c).setSlant(lVar.f30596d ? 1 : 0).setTtcIndex(lVar.f30594b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font g(v3.l lVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
