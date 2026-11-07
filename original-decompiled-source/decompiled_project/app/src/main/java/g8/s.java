package g8;

import androidx.room.y0;

/* loaded from: classes.dex */
public interface s {

    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final String f11624a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11625b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11626c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11627d;

        public a(String str, String str2, String str3, String str4) {
            this.f11624a = str;
            this.f11625b = str2;
            this.f11626c = str3;
            this.f11627d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f11624a, aVar.f11624a) && kotlin.jvm.internal.r.a(this.f11625b, aVar.f11625b) && kotlin.jvm.internal.r.a(this.f11626c, aVar.f11626c) && kotlin.jvm.internal.r.a(this.f11627d, aVar.f11627d);
        }

        public final int hashCode() {
            int iHashCode = this.f11624a.hashCode() * 31;
            String str = this.f11625b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11626c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11627d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = y0.a("SignedIn(uid=", this.f11624a, ", name=", this.f11625b, ", email=");
            sbA.append(this.f11626c);
            sbA.append(", photoUrl=");
            sbA.append(this.f11627d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11628a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1282730907;
        }

        public final String toString() {
            return "SignedOut";
        }
    }

    public static final class c implements s {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11629a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -301038823;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
