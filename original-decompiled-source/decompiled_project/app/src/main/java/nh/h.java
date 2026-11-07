package nh;

import kotlin.jvm.internal.r;
import nh.b;

/* loaded from: classes2.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18824a = new a();

        /* renamed from: nh.h$a$a, reason: collision with other inner class name */
        public static final class C0211a implements nh.a {

            /* renamed from: a, reason: collision with root package name */
            public final long f18825a;

            public /* synthetic */ C0211a(long j10) {
                this.f18825a = j10;
            }

            public static final long a(long j10, long j11) {
                int i10 = g.f18823b;
                e unit = e.f18814b;
                r.e(unit, "unit");
                if (((j11 - 1) | 1) != Long.MAX_VALUE) {
                    return (1 | (j10 - 1)) == Long.MAX_VALUE ? f.a(j10) : f.b(j10, j11, unit);
                }
                if (j10 != j11) {
                    return b.i(f.a(j11));
                }
                b.a aVar = b.f18809b;
                return 0L;
            }

            @Override // nh.a
            public final long N() {
                long jB = g.b();
                e unit = e.f18814b;
                r.e(unit, "unit");
                long j10 = this.f18825a;
                return (1 | (j10 - 1)) == Long.MAX_VALUE ? b.i(f.a(j10)) : f.b(jB, j10, unit);
            }

            @Override // java.lang.Comparable
            public final int compareTo(nh.a aVar) {
                nh.a other = aVar;
                r.e(other, "other");
                boolean z10 = other instanceof C0211a;
                long j10 = this.f18825a;
                if (z10) {
                    return b.c(a(j10, ((C0211a) other).f18825a), 0L);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j10 + ')')) + " and " + other);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C0211a) {
                    return this.f18825a == ((C0211a) obj).f18825a;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.f18825a);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.f18825a + ')';
            }
        }

        @Override // nh.h
        public final C0211a a() {
            return new C0211a(g.b());
        }

        public final String toString() {
            int i10 = g.f18823b;
            return "TimeSource(System.nanoTime())";
        }
    }

    a.C0211a a();
}
