package nc;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class l0 implements lc.e<Map.Entry<?, ?>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18719a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l0[] f18720b;

    public enum a extends l0 {
        public a() {
            super("KEY", 0);
        }

        @Override // lc.e
        public final Object apply(Map.Entry<?, ?> entry) {
            return entry.getKey();
        }
    }

    static {
        a aVar = new a();
        f18719a = aVar;
        f18720b = new l0[]{aVar, new l0() { // from class: nc.l0.b
            @Override // lc.e
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }};
    }

    public l0() {
        throw null;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f18720b.clone();
    }
}
