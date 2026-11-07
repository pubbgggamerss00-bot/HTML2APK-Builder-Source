package mf;

/* loaded from: classes2.dex */
public final class r {
    public static boolean a(int i10, int i11) {
        if (i10 + 1 != i11) {
            return false;
        }
        return ((i10 >> 8) & 255) == ((i11 >> 8) & 255) && (i10 & 255) < (i11 & 255);
    }
}
