package m0;

import android.graphics.Color;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f13852a = new ThreadLocal<>();

    public static int a(double d7, double d8, double d9) {
        double d10 = (((-0.4986d) * d9) + (((-1.5372d) * d8) + (3.2406d * d7))) / 100.0d;
        double d11 = ((0.0415d * d9) + ((1.8758d * d8) + ((-0.9689d) * d7))) / 100.0d;
        double d12 = ((1.057d * d9) + (((-0.204d) * d8) + (0.0557d * d7))) / 100.0d;
        double dPow = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double dPow2 = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double dPow3 = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static double b(int i6) {
        ThreadLocal<double[]> threadLocal = f13852a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i6);
        int iGreen = Color.green(i6);
        int iBlue = Color.blue(i6);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d7 = iRed / 255.0d;
        double dPow = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = iGreen / 255.0d;
        double dPow2 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d9 = iBlue / 255.0d;
        double dPow3 = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d10 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d10;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d10 / 100.0d;
    }

    public static int c(int i6, int i7) {
        int iAlpha = Color.alpha(i7);
        int iAlpha2 = Color.alpha(i6);
        int i8 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i8, d(Color.red(i6), iAlpha2, Color.red(i7), iAlpha, i8), d(Color.green(i6), iAlpha2, Color.green(i7), iAlpha, i8), d(Color.blue(i6), iAlpha2, Color.blue(i7), iAlpha, i8));
    }

    public static int d(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((255 - i7) * (i8 * i9)) + ((i6 * 255) * i7)) / (i10 * 255);
    }

    public static int e(int i6, int i7) {
        if (i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i6 & 16777215) | (i7 << 24);
    }
}
