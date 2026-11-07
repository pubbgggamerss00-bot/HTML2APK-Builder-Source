package h8;

import androidx.datastore.preferences.protobuf.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mh.x;

/* loaded from: classes.dex */
public final class i {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f12406a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12407b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f12408c;

        public a(int i10, String text, ArrayList arrayList) {
            kotlin.jvm.internal.r.e(text, "text");
            this.f12406a = text;
            this.f12407b = i10;
            this.f12408c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f12406a, aVar.f12406a) && this.f12407b == aVar.f12407b && this.f12408c.equals(aVar.f12408c);
        }

        public final int hashCode() {
            return this.f12408c.hashCode() + a1.a(this.f12407b, this.f12406a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f12407b, "Outcome(text=", this.f12406a, ", applied=", ", failed=");
            sbA.append(this.f12408c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static a a(String source, List list) {
        kotlin.jvm.internal.r.e(source, "source");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            w wVar = (w) it.next();
            String str = wVar.f12488a;
            int iY = x.y(source, str, 0, false, 6);
            if (str.length() != 0 && iY >= 0 && x.y(source, wVar.f12488a, iY + 1, false, 4) < 0) {
                String strSubstring = source.substring(0, iY);
                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                String str2 = wVar.f12489b;
                String strSubstring2 = source.substring(str.length() + iY);
                kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
                source = k3.b.a(strSubstring, str2, strSubstring2);
                i10++;
            } else {
                arrayList.add(wVar);
            }
        }
        return new a(i10, source, arrayList);
    }
}
