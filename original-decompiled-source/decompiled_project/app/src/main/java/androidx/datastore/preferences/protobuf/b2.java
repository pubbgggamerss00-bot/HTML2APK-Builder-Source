package androidx.datastore.preferences.protobuf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b2 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final C0027a f1971c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f1972d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f1973e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f1974f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a[] f1975g;

        /* renamed from: a, reason: collision with root package name */
        public final b f1976a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1977b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        /* JADX INFO: Fake field, exist only in values array */
        a EF1;

        /* JADX INFO: Fake field, exist only in values array */
        a EF2;

        /* renamed from: androidx.datastore.preferences.protobuf.b2$a$a, reason: collision with other inner class name */
        public enum C0027a extends a {
        }

        public enum b extends a {
            @Override // androidx.datastore.preferences.protobuf.b2.a
            public final boolean a() {
                return false;
            }
        }

        public enum c extends a {
            @Override // androidx.datastore.preferences.protobuf.b2.a
            public final boolean a() {
                return false;
            }
        }

        public enum d extends a {
            @Override // androidx.datastore.preferences.protobuf.b2.a
            public final boolean a() {
                return false;
            }
        }

        static {
            a aVar = new a("DOUBLE", 0, b.DOUBLE, 1);
            a aVar2 = new a("FLOAT", 1, b.FLOAT, 5);
            b bVar = b.LONG;
            a aVar3 = new a("INT64", 2, bVar, 0);
            a aVar4 = new a("UINT64", 3, bVar, 0);
            b bVar2 = b.INT;
            a aVar5 = new a("INT32", 4, bVar2, 0);
            a aVar6 = new a("FIXED64", 5, bVar, 1);
            a aVar7 = new a("FIXED32", 6, bVar2, 5);
            a aVar8 = new a("BOOL", 7, b.BOOLEAN, 0);
            C0027a c0027a = new C0027a("STRING", 8, b.STRING, 2);
            f1971c = c0027a;
            b bVar3 = b.MESSAGE;
            b bVar4 = new b("GROUP", 9, bVar3, 3);
            f1972d = bVar4;
            c cVar = new c("MESSAGE", 10, bVar3, 2);
            f1973e = cVar;
            d dVar = new d("BYTES", 11, b.BYTE_STRING, 2);
            a aVar9 = new a("UINT32", 12, bVar2, 0);
            a aVar10 = new a("ENUM", 13, b.ENUM, 0);
            f1974f = aVar10;
            f1975g = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, c0027a, bVar4, cVar, dVar, aVar9, aVar10, new a("SFIXED32", 14, bVar2, 5), new a("SFIXED64", 15, bVar, 1), new a("SINT32", 16, bVar2, 0), new a("SINT64", 17, bVar, 0)};
        }

        public a(String str, int i10, b bVar, int i11) {
            this.f1976a = bVar;
            this.f1977b = i11;
        }

        public static a valueOf(String str) {
            return (a) java.lang.Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1975g.clone();
        }

        public boolean a() {
            return !(this instanceof C0027a);
        }
    }

    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(j.f2038b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        public final Object f1988a;

        b(Serializable serializable) {
            this.f1988a = serializable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1989a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f1990b;

        public enum a extends c {
            public a() {
                super("LOOSE", 0);
            }

            @Override // androidx.datastore.preferences.protobuf.b2.c
            public final Object a(k kVar) throws IOException {
                return kVar.C();
            }
        }

        public enum b extends c {
            public b() {
                super("STRICT", 1);
            }

            @Override // androidx.datastore.preferences.protobuf.b2.c
            public final Object a(k kVar) throws IOException {
                return kVar.D();
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.b2$c$c, reason: collision with other inner class name */
        public enum C0028c extends c {
            public C0028c() {
                super("LAZY", 2);
            }

            @Override // androidx.datastore.preferences.protobuf.b2.c
            public final Object a(k kVar) throws IOException {
                return kVar.m();
            }
        }

        static {
            a aVar = new a();
            f1989a = aVar;
            f1990b = new c[]{aVar, new b(), new C0028c()};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) java.lang.Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f1990b.clone();
        }

        public abstract Object a(k kVar) throws IOException;
    }

    public static Object a(k kVar, a aVar, c cVar) throws IOException {
        switch (aVar.ordinal()) {
            case 0:
                return Double.valueOf(kVar.n());
            case 1:
                return Float.valueOf(kVar.r());
            case 2:
                return Long.valueOf(kVar.u());
            case 3:
                return Long.valueOf(kVar.G());
            case 4:
                return Integer.valueOf(kVar.t());
            case 5:
                return Long.valueOf(kVar.q());
            case 6:
                return Integer.valueOf(kVar.p());
            case 7:
                return Boolean.valueOf(kVar.l());
            case 8:
                return cVar.a(kVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return kVar.m();
            case 12:
                return Integer.valueOf(kVar.F());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(kVar.y());
            case 15:
                return Long.valueOf(kVar.z());
            case 16:
                return Integer.valueOf(kVar.A());
            case 17:
                return Long.valueOf(kVar.B());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
