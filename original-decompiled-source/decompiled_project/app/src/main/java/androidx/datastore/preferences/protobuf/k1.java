package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f2075c = new k1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2077b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final o0 f2076a = new o0();

    public final <T> o1<T> a(Class<T> cls) {
        u<?> uVar;
        o1<T> o1VarX;
        Class<?> cls2;
        d0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2077b;
        o1<T> o1Var = (o1) concurrentHashMap.get(cls);
        if (o1Var != null) {
            return o1Var;
        }
        o0 o0Var = this.f2076a;
        o0Var.getClass();
        Class<?> cls3 = p1.f2127a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = p1.f2127a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        u0 u0VarMessageInfoFor = o0Var.f2106a.messageInfoFor(cls);
        if (u0VarMessageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                o1VarX = new c1<>(p1.f2129c, w.f2163a, u0VarMessageInfoFor.getDefaultInstance());
            } else {
                w1<?, ?> w1Var = p1.f2128b;
                u<?> uVar2 = w.f2164b;
                if (uVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                o1VarX = new c1<>(w1Var, uVar2, u0VarMessageInfoFor.getDefaultInstance());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            e1 e1Var = f1.f2014b;
            l0 l0Var = m0.f2096b;
            y1 y1Var = p1.f2129c;
            v vVar = u0VarMessageInfoFor.getSyntax().ordinal() != 1 ? w.f2163a : null;
            s0 s0Var = t0.f2156b;
            if (!(u0VarMessageInfoFor instanceof m1)) {
                int[] iArr = b1.f1954p;
                throw null;
            }
            o1VarX = b1.x((m1) u0VarMessageInfoFor, e1Var, l0Var, y1Var, vVar, s0Var);
        } else {
            d1 d1Var = f1.f2013a;
            k0 k0Var = m0.f2095a;
            w1<?, ?> w1Var2 = p1.f2128b;
            if (u0VarMessageInfoFor.getSyntax().ordinal() != 1) {
                u<?> uVar3 = w.f2164b;
                if (uVar3 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                uVar = uVar3;
            } else {
                uVar = null;
            }
            r0 r0Var = t0.f2155a;
            if (!(u0VarMessageInfoFor instanceof m1)) {
                int[] iArr2 = b1.f1954p;
                throw null;
            }
            o1VarX = b1.x((m1) u0VarMessageInfoFor, d1Var, k0Var, w1Var2, uVar, r0Var);
        }
        o1<T> o1Var2 = (o1) concurrentHashMap.putIfAbsent(cls, o1VarX);
        return o1Var2 != null ? o1Var2 : o1VarX;
    }
}
