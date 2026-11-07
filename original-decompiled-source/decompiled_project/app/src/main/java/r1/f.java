package r1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements n {
    public static String a(int i10, int i11, String str, String str2, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    @Override // r1.n
    public double b(double d10) {
        double d11 = d10 < 0.0d ? -d10 : d10;
        return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d10);
    }
}
