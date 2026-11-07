package l9;

import android.content.Context;
import i0.u2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 {

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f16870a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16871b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16872c;

        public c(String str, int i10, int i11) {
            this.f16870a = str;
            this.f16871b = i10;
            this.f16872c = i11;
        }

        public final String a() {
            return this.f16870a + " unbalanced brackets/braces: " + this.f16871b + " open, " + this.f16872c + " closed.";
        }
    }

    public static c a(String str, String str2) {
        int i10 = 0;
        int i11 = 0;
        Character chValueOf = null;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (chValueOf != null) {
                if (cCharAt == chValueOf.charValue() && (i12 <= 0 || str.charAt(i12 - 1) != '\\')) {
                    chValueOf = null;
                }
            } else if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                chValueOf = Character.valueOf(cCharAt);
            } else if (cCharAt == '{') {
                i10++;
            } else if (cCharAt == '}') {
                i11++;
            }
        }
        if (i10 != i11) {
            return new c(str2, i10, i11);
        }
        return null;
    }

    public static String b(long j10) {
        if (j10 >= 1048576) {
            return String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1048576.0d)}, 1));
        }
        if (j10 >= 1024) {
            return String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1024.0d)}, 1));
        }
        return j10 + " B";
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<a> f16869a;

        public b(List<a> issues) {
            kotlin.jvm.internal.r.e(issues, "issues");
            this.f16869a = issues;
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f16869a) {
                if (((a) obj).f16862a == a.EnumC0170a.f16866a) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final ArrayList b() {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f16869a) {
                if (((a) obj).f16862a == a.EnumC0170a.f16867b) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.r.a(this.f16869a, ((b) obj).f16869a);
        }

        public final int hashCode() {
            return this.f16869a.hashCode();
        }

        public final String toString() {
            return "Result(issues=" + this.f16869a + ")";
        }

        public b() {
            this(qg.z.f22752a);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC0170a f16862a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16863b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f16864c;

        /* renamed from: d, reason: collision with root package name */
        public final List<Object> f16865d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: l9.p0$a$a, reason: collision with other inner class name */
        public static final class EnumC0170a {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC0170a f16866a;

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0170a f16867b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ EnumC0170a[] f16868c;

            static {
                EnumC0170a enumC0170a = new EnumC0170a("ERROR", 0);
                f16866a = enumC0170a;
                EnumC0170a enumC0170a2 = new EnumC0170a("WARNING", 1);
                f16867b = enumC0170a2;
                EnumC0170a[] enumC0170aArr = {enumC0170a, enumC0170a2};
                f16868c = enumC0170aArr;
                u2.e(enumC0170aArr);
            }

            public EnumC0170a() {
                throw null;
            }

            public static EnumC0170a valueOf(String str) {
                return (EnumC0170a) Enum.valueOf(EnumC0170a.class, str);
            }

            public static EnumC0170a[] values() {
                return (EnumC0170a[]) f16868c.clone();
            }
        }

        public a(EnumC0170a enumC0170a, String message, Integer num, List<? extends Object> list) {
            kotlin.jvm.internal.r.e(message, "message");
            this.f16862a = enumC0170a;
            this.f16863b = message;
            this.f16864c = num;
            this.f16865d = list;
        }

        public final String a(Context context) {
            kotlin.jvm.internal.r.e(context, "context");
            Integer num = this.f16864c;
            if (num == null) {
                return this.f16863b;
            }
            int iIntValue = num.intValue();
            Object[] array = this.f16865d.toArray(new Object[0]);
            String string = context.getString(iIntValue, Arrays.copyOf(array, array.length));
            kotlin.jvm.internal.r.b(string);
            return string;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16862a == aVar.f16862a && kotlin.jvm.internal.r.a(this.f16863b, aVar.f16863b) && kotlin.jvm.internal.r.a(this.f16864c, aVar.f16864c) && kotlin.jvm.internal.r.a(this.f16865d, aVar.f16865d);
        }

        public final int hashCode() {
            int iA = l0.k.a(this.f16862a.hashCode() * 31, 31, this.f16863b);
            Integer num = this.f16864c;
            return this.f16865d.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Issue(severity=" + this.f16862a + ", message=" + this.f16863b + ", resId=" + this.f16864c + ", resArgs=" + this.f16865d + ")";
        }

        public /* synthetic */ a(EnumC0170a enumC0170a, String str, Integer num, int i10) {
            this(enumC0170a, str, (i10 & 4) != 0 ? null : num, qg.z.f22752a);
        }
    }
}
