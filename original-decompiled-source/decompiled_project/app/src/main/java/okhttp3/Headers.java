package okhttp3;

import f3.f;
import fh.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import okhttp3.internal.Util;
import pg.n;

/* loaded from: classes2.dex */
public final class Headers implements Iterable<n<? extends String, ? extends String>>, a {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f19250b = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final String[] f19251a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19252a = new ArrayList(20);

        public final void a(String name, String value) {
            r.e(name, "name");
            r.e(value, "value");
            ArrayList arrayList = this.f19252a;
            arrayList.add(name);
            arrayList.add(x.W(value).toString());
        }

        public final Headers b() {
            return new Headers((String[]) this.f19252a.toArray(new String[0]));
        }

        public final void c(String name) {
            r.e(name, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f19252a;
                if (i10 >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb.append(Util.p(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public static Headers c(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i11] = x.W(str).toString();
            }
            int iD = b6.n.d(0, strArr2.length - 1, 2);
            if (iD >= 0) {
                while (true) {
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    a(str2);
                    b(str3, str2);
                    if (i10 == iD) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr2);
        }

        private Companion() {
        }
    }

    public Headers(String[] strArr) {
        this.f19251a = strArr;
    }

    public final String c(String name) {
        r.e(name, "name");
        f19250b.getClass();
        String[] strArr = this.f19251a;
        int length = strArr.length - 2;
        int iD = b6.n.d(length, 0, -2);
        if (iD > length) {
            return null;
        }
        while (!t.j(name, strArr[length], true)) {
            if (length == iD) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String e(int i10) {
        return this.f19251a[i10 * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f19251a, ((Headers) obj).f19251a);
        }
        return false;
    }

    public final Builder f() {
        Builder builder = new Builder();
        qg.t.q(builder.f19252a, this.f19251a);
        return builder;
    }

    public final String g(int i10) {
        return this.f19251a[(i10 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19251a);
    }

    @Override // java.lang.Iterable
    public final Iterator<n<? extends String, ? extends String>> iterator() {
        int size = size();
        n[] nVarArr = new n[size];
        for (int i10 = 0; i10 < size; i10++) {
            nVarArr[i10] = new n(e(i10), g(i10));
        }
        return f.e(nVarArr);
    }

    public final int size() {
        return this.f19251a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            String strG = g(i10);
            sb.append(strE);
            sb.append(": ");
            if (Util.p(strE)) {
                strG = "██";
            }
            sb.append(strG);
            sb.append("\n");
        }
        String string = sb.toString();
        r.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
