package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j6, long j7) {
        this.mNumerator = j6;
        this.mDenominator = j7;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    public String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d7) {
        this((long) (d7 * 10000.0d), 10000L);
    }
}
