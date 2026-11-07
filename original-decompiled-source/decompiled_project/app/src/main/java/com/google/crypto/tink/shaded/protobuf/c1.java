package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f6638c = new c1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6640b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6639a = new h0();

    public final <T> g1<T> a(Class<T> cls) {
        g1<T> g1VarY;
        Class<?> cls2;
        y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f6640b;
        g1<T> g1Var = (g1) concurrentHashMap.get(cls);
        if (g1Var != null) {
            return g1Var;
        }
        h0 h0Var = this.f6639a;
        h0Var.getClass();
        Class<?> cls3 = h1.f6674a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = h1.f6674a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        n0 n0VarMessageInfoFor = h0Var.f6672a.messageInfoFor(cls);
        if (!n0VarMessageInfoFor.isMessageSetWireFormat()) {
            boolean zIsAssignableFrom = w.class.isAssignableFrom(cls);
            b1 b1Var = b1.f6632a;
            if (zIsAssignableFrom) {
                g1VarY = n0VarMessageInfoFor.getSyntax() == b1Var ? u0.y(n0VarMessageInfoFor, y0.f6821b, f0.f6658b, h1.f6677d, r.f6746a, m0.f6730b) : u0.y(n0VarMessageInfoFor, y0.f6821b, f0.f6658b, h1.f6677d, null, m0.f6730b);
            } else if (n0VarMessageInfoFor.getSyntax() == b1Var) {
                w0 w0Var = y0.f6820a;
                f0.a aVar = f0.f6657a;
                n1<?, ?> n1Var = h1.f6675b;
                p<?> pVar = r.f6747b;
                if (pVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                g1VarY = u0.y(n0VarMessageInfoFor, w0Var, aVar, n1Var, pVar, m0.f6729a);
            } else {
                g1VarY = u0.y(n0VarMessageInfoFor, y0.f6820a, f0.f6657a, h1.f6676c, null, m0.f6729a);
            }
        } else if (w.class.isAssignableFrom(cls)) {
            g1VarY = new v0<>(h1.f6677d, r.f6746a, n0VarMessageInfoFor.getDefaultInstance());
        } else {
            n1<?, ?> n1Var2 = h1.f6675b;
            p<?> pVar2 = r.f6747b;
            if (pVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            g1VarY = new v0<>(n1Var2, pVar2, n0VarMessageInfoFor.getDefaultInstance());
        }
        g1<T> g1Var2 = (g1) concurrentHashMap.putIfAbsent(cls, g1VarY);
        return g1Var2 != null ? g1Var2 : g1VarY;
    }
}
