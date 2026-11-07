package t0;

import t0.k9;

/* loaded from: classes.dex */
public final class ef {

    public static final class a implements q1.e1, kotlin.jvm.internal.m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k9.a f25821a;

        public a(k9.a aVar) {
            this.f25821a = aVar;
        }

        @Override // q1.e1
        public final long a() {
            return ((q1.b1) this.f25821a.get()).f21656a;
        }

        @Override // kotlin.jvm.internal.m
        public final pg.f<?> b() {
            return this.f25821a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q1.e1) || !(obj instanceof kotlin.jvm.internal.m)) {
                return false;
            }
            return this.f25821a.equals(((kotlin.jvm.internal.m) obj).b());
        }

        public final int hashCode() {
            return this.f25821a.hashCode();
        }
    }
}
