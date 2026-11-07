package h8;

import androidx.datastore.preferences.protobuf.a1;
import androidx.room.y0;
import p5.g0;

/* loaded from: classes.dex */
public interface v {

    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12473a;

        public a(String str) {
            this.f12473a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.r.a(this.f12473a, ((a) obj).f12473a);
        }

        public final int hashCode() {
            return this.f12473a.hashCode();
        }

        public final String toString() {
            return i8.n.d("Code(delta=", this.f12473a, ")");
        }
    }

    public static final class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12474a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12475b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12476c;

        /* renamed from: d, reason: collision with root package name */
        public final Long f12477d;

        /* renamed from: e, reason: collision with root package name */
        public final t f12478e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f12479f;

        public b(String str, String str2, int i10, Long l10, t tVar, boolean z10) {
            this.f12474a = str;
            this.f12475b = str2;
            this.f12476c = i10;
            this.f12477d = l10;
            this.f12478e = tVar;
            this.f12479f = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.r.a(this.f12474a, bVar.f12474a) && kotlin.jvm.internal.r.a(this.f12475b, bVar.f12475b) && this.f12476c == bVar.f12476c && kotlin.jvm.internal.r.a(this.f12477d, bVar.f12477d) && kotlin.jvm.internal.r.a(this.f12478e, bVar.f12478e) && this.f12479f == bVar.f12479f;
        }

        public final int hashCode() {
            int iA = a1.a(this.f12476c, l0.k.a(this.f12474a.hashCode() * 31, 31, this.f12475b), 31);
            Long l10 = this.f12477d;
            int iHashCode = (iA + (l10 == null ? 0 : l10.hashCode())) * 31;
            t tVar = this.f12478e;
            return Boolean.hashCode(this.f12479f) + ((iHashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = y0.a("Done(sessionId=", this.f12474a, ", turnId=", this.f12475b, ", credits=");
            sbA.append(this.f12476c);
            sbA.append(", balance=");
            sbA.append(this.f12477d);
            sbA.append(", result=");
            sbA.append(this.f12478e);
            sbA.append(", free=");
            sbA.append(this.f12479f);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12480a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12481b;

        public c(String str, String str2) {
            this.f12480a = str;
            this.f12481b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.r.a(this.f12480a, cVar.f12480a) && kotlin.jvm.internal.r.a(this.f12481b, cVar.f12481b);
        }

        public final int hashCode() {
            int iHashCode = this.f12480a.hashCode() * 31;
            String str = this.f12481b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return g0.a("Error(code=", this.f12480a, ", message=", this.f12481b, ")");
        }
    }

    public static final class d implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12482a;

        public d(String str) {
            this.f12482a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.r.a(this.f12482a, ((d) obj).f12482a);
        }

        public final int hashCode() {
            return this.f12482a.hashCode();
        }

        public final String toString() {
            return i8.n.d("Phase(phase=", this.f12482a, ")");
        }
    }

    public static final class e implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12483a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12484b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12485c;

        public e(String str, String str2, String str3) {
            this.f12483a = str;
            this.f12484b = str2;
            this.f12485c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.r.a(this.f12483a, eVar.f12483a) && kotlin.jvm.internal.r.a(this.f12484b, eVar.f12484b) && kotlin.jvm.internal.r.a(this.f12485c, eVar.f12485c);
        }

        public final int hashCode() {
            int iA = l0.k.a(this.f12483a.hashCode() * 31, 31, this.f12484b);
            String str = this.f12485c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return b.o.a(y0.a("Session(sessionId=", this.f12483a, ", turnId=", this.f12484b, ", model="), this.f12485c, ")");
        }
    }

    public static final class f implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12486a;

        public f(String str) {
            this.f12486a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.r.a(this.f12486a, ((f) obj).f12486a);
        }

        public final int hashCode() {
            return this.f12486a.hashCode();
        }

        public final String toString() {
            return i8.n.d("Text(delta=", this.f12486a, ")");
        }
    }

    public static final class g implements v {

        /* renamed from: a, reason: collision with root package name */
        public final String f12487a;

        public g(String str) {
            this.f12487a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.r.a(this.f12487a, ((g) obj).f12487a);
        }

        public final int hashCode() {
            return this.f12487a.hashCode();
        }

        public final String toString() {
            return i8.n.d("Thinking(delta=", this.f12487a, ")");
        }
    }
}
