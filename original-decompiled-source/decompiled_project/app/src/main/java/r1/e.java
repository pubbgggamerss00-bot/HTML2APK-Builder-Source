package r1;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements n {
    @Override // r1.n
    public final double b(double d10) {
        double d11;
        double dPow = d10 < 0.0d ? -d10 : d10;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d11 = 0.9478672985781991d;
        } else {
            d11 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d11, d10);
    }
}
