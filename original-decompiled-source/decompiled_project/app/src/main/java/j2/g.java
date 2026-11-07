package j2;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public static g f14725d;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f14726c;

    @Override // j2.b
    public final int[] b(int i10) {
        if (d().length() > 0 && i10 < d().length()) {
            if (i10 < 0) {
                i10 = 0;
            }
            while (!g(i10) && (!g(i10) || (i10 != 0 && g(i10 - 1)))) {
                BreakIterator breakIterator = this.f14726c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.r.h("impl");
                    throw null;
                }
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f14726c;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.r.h("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i10);
            if (iFollowing != -1 && f(iFollowing)) {
                return c(i10, iFollowing);
            }
        }
        return null;
    }

    @Override // j2.b
    public final int[] e(int i10) {
        int length = d().length();
        if (length > 0 && i10 > 0) {
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && !g(i10 - 1) && !f(i10)) {
                BreakIterator breakIterator = this.f14726c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.r.h("impl");
                    throw null;
                }
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f14726c;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.r.h("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i10);
            if (iPreceding != -1 && g(iPreceding) && (iPreceding == 0 || !g(iPreceding - 1))) {
                return c(iPreceding, i10);
            }
        }
        return null;
    }

    public final boolean f(int i10) {
        if (i10 <= 0 || !g(i10 - 1)) {
            return false;
        }
        return i10 == d().length() || !g(i10);
    }

    public final boolean g(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }
}
