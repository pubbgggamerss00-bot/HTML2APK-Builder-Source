package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class m implements l<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16949a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f16950b;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    public enum d extends m {
        public d() {
            super("NOT_NULL", 3);
        }

        @Override // lc.l
        public final boolean apply(Object obj) {
            return obj != null;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.notNull()";
        }
    }

    static {
        m mVar = new m() { // from class: lc.m.a
            @Override // lc.l
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        };
        m mVar2 = new m() { // from class: lc.m.b
            @Override // lc.l
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        };
        m mVar3 = new m() { // from class: lc.m.c
            @Override // lc.l
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        };
        d dVar = new d();
        f16949a = dVar;
        f16950b = new m[]{mVar, mVar2, mVar3, dVar};
    }

    public m() {
        throw null;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f16950b.clone();
    }
}
