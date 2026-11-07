package z;

import j1.d;
import j1.f;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34644a = 0;

    public static final class a extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f34645b = 0;

        static {
            new a();
        }

        @Override // z.v
        public final int a(int i10, f3.r rVar) {
            return i10 / 2;
        }
    }

    public static final class b extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f34646b = 0;

        static {
            new b();
        }

        @Override // z.v
        public final int a(int i10, f3.r rVar) {
            if (rVar == f3.r.f8828a) {
                return i10;
            }
            return 0;
        }
    }

    public static final class c extends v {

        /* renamed from: b, reason: collision with root package name */
        public final d.b f34647b;

        public c(f.a aVar) {
            this.f34647b = aVar;
        }

        @Override // z.v
        public final int a(int i10, f3.r rVar) {
            return this.f34647b.a(0, i10, rVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.r.a(this.f34647b, ((c) obj).f34647b);
        }

        public final int hashCode() {
            return this.f34647b.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f34647b + ')';
        }
    }

    public static final class d extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f34648b = 0;

        static {
            new d();
        }

        @Override // z.v
        public final int a(int i10, f3.r rVar) {
            if (rVar == f3.r.f8828a) {
                return 0;
            }
            return i10;
        }
    }

    public static final class e extends v {

        /* renamed from: b, reason: collision with root package name */
        public final f.b f34649b = d.a.f14611j;

        @Override // z.v
        public final int a(int i10, f3.r rVar) {
            return this.f34649b.a(0, i10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.r.a(this.f34649b, ((e) obj).f34649b);
        }

        public final int hashCode() {
            return Float.hashCode(this.f34649b.f14622a);
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f34649b + ')';
        }
    }

    static {
        int i10 = a.f34645b;
        int i11 = d.f34648b;
        int i12 = b.f34646b;
    }

    public abstract int a(int i10, f3.r rVar);
}
