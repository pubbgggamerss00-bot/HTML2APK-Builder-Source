package j2;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public static c f14670d;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f14671c;

    @Override // j2.b
    public final int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f14671c;
            if (breakIterator == null) {
                kotlin.jvm.internal.r.h("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f14671c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.r.h("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f14671c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.r.h("impl");
                throw null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f14671c;
            if (breakIterator == null) {
                kotlin.jvm.internal.r.h("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f14671c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.r.h("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f14671c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.r.h("impl");
                throw null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }
}
