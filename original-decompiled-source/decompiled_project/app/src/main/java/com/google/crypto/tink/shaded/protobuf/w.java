package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.w.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.f6737f;

    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0072a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageType f6807a;

        /* renamed from: b, reason: collision with root package name */
        public MessageType f6808b;

        public a(MessageType messagetype) {
            this.f6807a = messagetype;
            if (messagetype.n()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f6808b = (MessageType) messagetype.q();
        }

        public static <MessageType> void f(MessageType messagetype, MessageType messagetype2) {
            c1 c1Var = c1.f6638c;
            c1Var.getClass();
            c1Var.a(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
        }

        public final MessageType b() {
            MessageType messagetype = (MessageType) buildPartial();
            messagetype.getClass();
            if (w.m(messagetype, true)) {
                return messagetype;
            }
            throw new m1();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MessageType buildPartial() {
            if (!this.f6808b.n()) {
                return this.f6808b;
            }
            MessageType messagetype = this.f6808b;
            messagetype.getClass();
            c1 c1Var = c1.f6638c;
            c1Var.getClass();
            c1Var.a(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.o();
            return this.f6808b;
        }

        @Override // 
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final BuilderType clone() {
            BuilderType buildertype = (BuilderType) this.f6807a.newBuilderForType();
            buildertype.f6808b = (MessageType) buildPartial();
            return buildertype;
        }

        public final void e() {
            if (this.f6808b.n()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f6807a.q();
            f(messagetype, this.f6808b);
            this.f6808b = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public w getDefaultInstanceForType() {
            return this.f6807a;
        }
    }

    public static class b<T extends w<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements q0 {
        protected s<d> extensions = s.f6757d;

        @Override // com.google.crypto.tink.shaded.protobuf.w, com.google.crypto.tink.shaded.protobuf.q0
        public final /* bridge */ /* synthetic */ w getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w, com.google.crypto.tink.shaded.protobuf.p0
        public final /* bridge */ /* synthetic */ a newBuilderForType() {
            return newBuilderForType();
        }
    }

    public static final class d implements s.a<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s.a
        public final u1 getLiteJavaType() {
            throw null;
        }
    }

    public static class e<ContainingType extends p0, Type> extends c5.p {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f6809a;

        /* renamed from: b, reason: collision with root package name */
        public static final f f6810b;

        /* renamed from: c, reason: collision with root package name */
        public static final f f6811c;

        /* renamed from: d, reason: collision with root package name */
        public static final f f6812d;

        /* renamed from: e, reason: collision with root package name */
        public static final f f6813e;

        /* renamed from: f, reason: collision with root package name */
        public static final f f6814f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ f[] f6815g;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            f6809a = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            f6810b = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            f6811c = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            f6812d = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            f6813e = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            f6814f = fVar6;
            f6815g = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f("GET_PARSER", 6)};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f6815g.clone();
        }
    }

    public static void g(w wVar) throws z {
        if (!m(wVar, true)) {
            throw new z(new m1().getMessage());
        }
    }

    public static <T extends w<?, ?>> T j(Class<T> cls) throws ClassNotFoundException {
        T t3 = (T) defaultInstanceMap.get(cls);
        if (t3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t3 != null) {
            return t3;
        }
        T t10 = (T) ((w) r1.b(cls)).getDefaultInstanceForType();
        if (t10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t10);
        return t10;
    }

    public static Object l(Method method, w wVar, Object... objArr) {
        try {
            return method.invoke(wVar, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends w<T, ?>> boolean m(T t3, boolean z10) {
        byte bByteValue = ((Byte) t3.i(f.f6809a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        c1 c1Var = c1.f6638c;
        c1Var.getClass();
        boolean zIsInitialized = c1Var.a(t3.getClass()).isInitialized(t3);
        if (z10) {
            t3.i(f.f6810b);
        }
        return zIsInitialized;
    }

    public static <T extends w<T, ?>> T r(T t3, h hVar, o oVar) throws z {
        i.a aVarG = hVar.g();
        T t10 = (T) s(t3, aVarG, oVar);
        aVarG.a(0);
        g(t10);
        return t10;
    }

    public static <T extends w<T, ?>> T s(T t3, i iVar, o oVar) throws z {
        T t10 = (T) t3.q();
        try {
            c1 c1Var = c1.f6638c;
            c1Var.getClass();
            g1 g1VarA = c1Var.a(t10.getClass());
            j jVar = iVar.f6681d;
            if (jVar == null) {
                jVar = new j(iVar);
            }
            g1VarA.f(t10, jVar, oVar);
            g1VarA.makeImmutable(t10);
            return t10;
        } catch (m1 e10) {
            throw new z(e10.getMessage());
        } catch (z e11) {
            if (e11.f6822a) {
                throw new z(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof z) {
                throw ((z) e12.getCause());
            }
            throw new z(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof z) {
                throw ((z) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends w<?, ?>> void t(Class<T> cls, T t3) {
        t3.o();
        defaultInstanceMap.put(cls, t3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final void a(k kVar) throws IOException {
        c1 c1Var = c1.f6638c;
        c1Var.getClass();
        g1 g1VarA = c1Var.a(getClass());
        l lVar = kVar.f6722a;
        if (lVar == null) {
            lVar = new l(kVar);
        }
        g1VarA.d(this, lVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int b() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int c(g1 g1Var) {
        int iE;
        int iE2;
        if (n()) {
            if (g1Var == null) {
                c1 c1Var = c1.f6638c;
                c1Var.getClass();
                iE2 = c1Var.a(getClass()).e(this);
            } else {
                iE2 = g1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(j2.y.a(iE2, "serialized size must be non-negative, was "));
        }
        if (b() != Integer.MAX_VALUE) {
            return b();
        }
        if (g1Var == null) {
            c1 c1Var2 = c1.f6638c;
            c1Var2.getClass();
            iE = c1Var2.a(getClass()).e(this);
        } else {
            iE = g1Var.e(this);
        }
        e(iE);
        return iE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void e(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(j2.y.a(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c1 c1Var = c1.f6638c;
        c1Var.getClass();
        return c1Var.a(getClass()).a(this, (w) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final int getSerializedSize() {
        return c(null);
    }

    public final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType h() {
        return (BuilderType) i(f.f6813e);
    }

    public final int hashCode() {
        if (n()) {
            c1 c1Var = c1.f6638c;
            c1Var.getClass();
            return c1Var.a(getClass()).b(this);
        }
        if (this.memoizedHashCode == 0) {
            c1 c1Var2 = c1.f6638c;
            c1Var2.getClass();
            this.memoizedHashCode = c1Var2.a(getClass()).b(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(f fVar);

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) i(f.f6814f);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) i(f.f6813e);
    }

    public final MessageType q() {
        return (MessageType) i(f.f6812d);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = r0.f6748a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        r0.c(this, sb, 0);
        return sb.toString();
    }

    public final BuilderType u() {
        BuilderType buildertype = (BuilderType) i(f.f6813e);
        if (!buildertype.f6807a.equals(this)) {
            buildertype.e();
            a.f(buildertype.f6808b, this);
        }
        return buildertype;
    }
}
