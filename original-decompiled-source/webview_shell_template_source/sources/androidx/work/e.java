package androidx.work;

import android.net.Uri;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1771a = new HashSet();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f1772a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1773b;

        public a(Uri uri, boolean z6) {
            this.f1772a = uri;
            this.f1773b = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f1773b == aVar.f1773b && this.f1772a.equals(aVar.f1772a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f1772a.hashCode() * 31) + (this.f1773b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f1771a.equals(((e) obj).f1771a);
    }

    public final int hashCode() {
        return this.f1771a.hashCode();
    }
}
