package ya;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.r;
import q1.e0;
import q1.f0;
import r1.a0;
import r1.j;
import r1.z;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f34354a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f34355b;

    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e0 a(int i10, int i11, int i12, int i13) {
        ColorSpace rgb;
        ColorSpace rgb2;
        int i14 = (i13 & 4) != 0 ? 0 : i12;
        z zVar = j.f23079e;
        f0.b(i14);
        int i15 = Build.VERSION.SDK_INT;
        Bitmap.Config configB = f0.b(i14);
        if (r.a(zVar, zVar)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (r.a(zVar, j.f23091q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (r.a(zVar, j.f23092r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (r.a(zVar, j.f23089o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (r.a(zVar, j.f23084j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (r.a(zVar, j.f23083i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (r.a(zVar, j.f23094t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (r.a(zVar, j.f23093s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (r.a(zVar, j.f23085k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (r.a(zVar, j.f23086l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (r.a(zVar, j.f23081g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (r.a(zVar, j.f23082h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (r.a(zVar, j.f23080f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (r.a(zVar, j.f23087m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (r.a(zVar, j.f23090p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!r.a(zVar, j.f23088n)) {
                if (i15 >= 34) {
                    rgb = r.a(zVar, j.f23096v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : r.a(zVar, j.f23097w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (rgb != null) {
                    }
                } else if (zVar != null) {
                    String str = zVar.f23072a;
                    float[] fArrA = zVar.f23126d.a();
                    a0 a0Var = zVar.f23129g;
                    ColorSpace.Rgb.TransferParameters transferParameters = a0Var != null ? new ColorSpace.Rgb.TransferParameters(a0Var.f23059b, a0Var.f23060c, a0Var.f23061d, a0Var.f23062e, a0Var.f23063f, a0Var.f23064g, a0Var.f23058a) : null;
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, zVar.f23130h, fArrA, transferParameters);
                    } else {
                        float[] fArr = zVar.f23130h;
                        final z.c cVar = zVar.f23134l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: q1.f1
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d10) {
                                return ((Number) cVar.invoke(Double.valueOf(d10))).doubleValue();
                            }
                        };
                        final z.b bVar = zVar.f23137o;
                        rgb2 = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: q1.g1
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d10) {
                                return ((Number) bVar.invoke(Double.valueOf(d10))).doubleValue();
                            }
                        }, zVar.f23127e, zVar.f23128f);
                    }
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new e0(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configB, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new e0(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configB, true, rgb2));
    }
}
