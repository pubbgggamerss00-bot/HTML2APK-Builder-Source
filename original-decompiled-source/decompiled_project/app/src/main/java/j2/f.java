package j2;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: c, reason: collision with root package name */
    public static f f14717c;

    @Override // j2.b
    public final int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && d().charAt(i10) == '\n' && (d().charAt(i10) == '\n' || (i10 != 0 && d().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !f(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    @Override // j2.b
    public final int[] e(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !f(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (d().charAt(i11) == '\n' || (i11 != 0 && d().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return c(i11, i10);
    }

    public final boolean f(int i10) {
        if (i10 <= 0 || d().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == d().length() || d().charAt(i10) == '\n';
    }
}
