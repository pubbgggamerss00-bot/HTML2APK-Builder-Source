package mh;

import androidx.room.z0;
import d0.f0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f18252d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18253a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18254b;

    /* renamed from: c, reason: collision with root package name */
    public final b f18255c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18256a;

        static {
            a aVar = new a();
            if (!f0.b("  ") && !f0.b("") && !f0.b("")) {
                f0.b("");
            }
            f18256a = aVar;
        }

        public final void a(StringBuilder sb, String str) {
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            z0.a(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f18257b = new b();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18258a = true;

        public b() {
            if (f0.b("")) {
                return;
            }
            f0.b("");
        }

        public final void a(StringBuilder sb, String str) {
            z0.a(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        a aVar = a.f18256a;
        b bVar = b.f18257b;
        f18252d = new e(false, aVar, bVar);
        new e(true, aVar, bVar);
    }

    public e(boolean z10, a bytes, b number) {
        kotlin.jvm.internal.r.e(bytes, "bytes");
        kotlin.jvm.internal.r.e(number, "number");
        this.f18253a = z10;
        this.f18254b = bytes;
        this.f18255c = number;
    }

    public final String toString() {
        StringBuilder sbA = k1.q.a("HexFormat(\n    upperCase = ");
        sbA.append(this.f18253a);
        sbA.append(",\n    bytes = BytesHexFormat(\n");
        this.f18254b.a(sbA, "        ");
        sbA.append('\n');
        sbA.append("    ),");
        sbA.append('\n');
        sbA.append("    number = NumberHexFormat(");
        sbA.append('\n');
        this.f18255c.a(sbA, "        ");
        sbA.append('\n');
        sbA.append("    )");
        sbA.append('\n');
        sbA.append(")");
        return sbA.toString();
    }
}
