package o2;

import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<C0213b, WeakReference<a>> f18920a = new HashMap<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w1.d f18921a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18922b;

        public a(w1.d dVar, int i10) {
            this.f18921a = dVar;
            this.f18922b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.a(this.f18921a, aVar.f18921a) && this.f18922b == aVar.f18922b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18922b) + (this.f18921a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.f18921a);
            sb.append(", configFlags=");
            return b.b.a(sb, this.f18922b, ')');
        }
    }

    /* renamed from: o2.b$b, reason: collision with other inner class name */
    public static final class C0213b {

        /* renamed from: a, reason: collision with root package name */
        public final Resources.Theme f18923a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18924b;

        public C0213b(Resources.Theme theme, int i10) {
            this.f18923a = theme;
            this.f18924b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0213b)) {
                return false;
            }
            C0213b c0213b = (C0213b) obj;
            return r.a(this.f18923a, c0213b.f18923a) && this.f18924b == c0213b.f18924b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18924b) + (this.f18923a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.f18923a);
            sb.append(", id=");
            return b.b.a(sb, this.f18924b, ')');
        }
    }
}
