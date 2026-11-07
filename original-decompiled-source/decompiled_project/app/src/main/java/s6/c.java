package s6;

import android.graphics.Rect;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r6.a f24522a;

    public c(Rect rect) {
        this.f24522a = new r6.a(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c.class.equals(obj.getClass())) {
            return false;
        }
        return r.a(this.f24522a, ((c) obj).f24522a);
    }

    public final int hashCode() {
        return this.f24522a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics { bounds: ");
        r6.a aVar = this.f24522a;
        aVar.getClass();
        sb.append(new Rect(aVar.f23212a, aVar.f23213b, aVar.f23214c, aVar.f23215d));
        sb.append(" }");
        return sb.toString();
    }
}
