package h8;

import java.util.List;

/* loaded from: classes.dex */
public interface t {

    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final List<w> f12455a;

        /* renamed from: b, reason: collision with root package name */
        public final u f12456b;

        public a(List<w> list, u uVar) {
            this.f12455a = list;
            this.f12456b = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f12455a, aVar.f12455a) && kotlin.jvm.internal.r.a(this.f12456b, aVar.f12456b);
        }

        public final int hashCode() {
            return this.f12456b.hashCode() + (this.f12455a.hashCode() * 31);
        }

        public final String toString() {
            return "Edit(blocks=" + this.f12455a + ", settings=" + this.f12456b + ")";
        }
    }

    public static final class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final String f12457a;

        /* renamed from: b, reason: collision with root package name */
        public final u f12458b;

        public b(String str, u uVar) {
            this.f12457a = str;
            this.f12458b = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.r.a(this.f12457a, bVar.f12457a) && kotlin.jvm.internal.r.a(this.f12458b, bVar.f12458b);
        }

        public final int hashCode() {
            return this.f12458b.hashCode() + (this.f12457a.hashCode() * 31);
        }

        public final String toString() {
            return "NewApp(html=" + this.f12457a + ", settings=" + this.f12458b + ")";
        }
    }
}
