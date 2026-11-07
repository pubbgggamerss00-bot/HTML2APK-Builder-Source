package we;

import b.o;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f31493a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f31494b;

    /* renamed from: c, reason: collision with root package name */
    public final a f31495c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31496a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f31497b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f31498c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f31499d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f31500e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f31501f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f31502g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f31503h;

        /* renamed from: j, reason: collision with root package name */
        public static final a f31504j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f31505k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f31506l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f31507m;

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ a[] f31508n;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("STRING", 1);
            f31496a = aVar2;
            a aVar3 = new a("NAME", 2);
            f31497b = aVar3;
            a aVar4 = new a("LITERAL", 3);
            f31498c = aVar4;
            a aVar5 = new a("REAL", 4);
            f31499d = aVar5;
            a aVar6 = new a("INTEGER", 5);
            f31500e = aVar6;
            a aVar7 = new a("START_ARRAY", 6);
            f31501f = aVar7;
            a aVar8 = new a("END_ARRAY", 7);
            f31502g = aVar8;
            a aVar9 = new a("START_PROC", 8);
            f31503h = aVar9;
            a aVar10 = new a("END_PROC", 9);
            f31504j = aVar10;
            a aVar11 = new a("START_DICT", 10);
            f31505k = aVar11;
            a aVar12 = new a("END_DICT", 11);
            f31506l = aVar12;
            a aVar13 = new a("CHARSTRING", 12);
            f31507m = aVar13;
            f31508n = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f31508n.clone();
        }
    }

    public b(String str, a aVar) {
        this.f31493a = str;
        this.f31495c = aVar;
    }

    public final int a() {
        return (int) Float.parseFloat(this.f31493a);
    }

    public final String toString() {
        a aVar = a.f31507m;
        a aVar2 = this.f31495c;
        if (aVar2 == aVar) {
            return x0.a.a(new StringBuilder("Token[kind=CHARSTRING, data="), this.f31494b.length, " bytes]");
        }
        StringBuilder sb = new StringBuilder("Token[kind=");
        sb.append(aVar2);
        sb.append(", text=");
        return o.a(sb, this.f31493a, "]");
    }

    public b(char c10, a aVar) {
        this.f31493a = Character.toString(c10);
        this.f31495c = aVar;
    }

    public b(byte[] bArr) {
        this.f31494b = bArr;
        this.f31495c = a.f31507m;
    }
}
