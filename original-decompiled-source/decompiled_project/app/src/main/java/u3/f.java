package u3;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f29245b = new f(new h(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final h f29246a;

    public f(h hVar) {
        this.f29246a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f29246a.equals(((f) obj).f29246a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29246a.f29247a.hashCode();
    }

    public final String toString() {
        return this.f29246a.f29247a.toString();
    }
}
