package g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static q f13162d;

    /* renamed from: a, reason: collision with root package name */
    public long f13163a;

    /* renamed from: b, reason: collision with root package name */
    public long f13164b;

    /* renamed from: c, reason: collision with root package name */
    public int f13165c;

    public final void a(double d7, double d8, long j6) {
        double d9 = (0.01720197f * ((j6 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d8) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d10 = 0.01745329238474369d * d7;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d10))) / (Math.cos(dAsin) * Math.cos(d10));
        if (dSin3 >= 1.0d) {
            this.f13165c = 1;
            this.f13163a = -1L;
            this.f13164b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f13165c = 0;
                this.f13163a = -1L;
                this.f13164b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f13163a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f13164b = jRound;
            if (jRound >= j6 || this.f13163a <= j6) {
                this.f13165c = 1;
            } else {
                this.f13165c = 0;
            }
        }
    }
}
