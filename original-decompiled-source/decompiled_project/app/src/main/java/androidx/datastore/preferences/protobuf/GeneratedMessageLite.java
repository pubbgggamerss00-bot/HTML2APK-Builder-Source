package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.b2;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected x1 unknownFields = x1.f2170f;

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        public Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (messagetype.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            k1 k1Var = k1.f2075c;
            k1Var.getClass();
            k1Var.a(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) newMutableInstance();
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder, androidx.datastore.preferences.protobuf.w0
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((Builder<MessageType, BuilderType>) messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo67clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = (MessageType) buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, t tVar) throws e0 {
            copyOnWrite();
            try {
                k1 k1Var = k1.f2075c;
                MessageType messagetype = this.instance;
                k1Var.getClass();
                k1Var.a(messagetype.getClass()).f(this.instance, bArr, i10, i10 + i11, new d.a(tVar));
                return this;
            } catch (e0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw e0.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws e0 {
            return (BuilderType) mergeFrom(bArr, i10, i11, t.b());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(k kVar, t tVar) throws IOException {
            copyOnWrite();
            try {
                k1 k1Var = k1.f2075c;
                MessageType messagetype = this.instance;
                k1Var.getClass();
                o1 o1VarA = k1Var.a(messagetype.getClass());
                MessageType messagetype2 = this.instance;
                l lVar = kVar.f2051d;
                if (lVar == null) {
                    lVar = new l(kVar);
                }
                o1VarA.e(messagetype2, lVar, tVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        private x<b> ensureExtensionsAreMutable() {
            x<b> xVar = ((ExtendableMessage) this.instance).extensions;
            if (!xVar.f2167b) {
                return xVar;
            }
            x xVarB = xVar.clone();
            ((ExtendableMessage) this.instance).extensions = xVarB;
            return xVarB;
        }

        private void verifyExtensionContainingType(c<MessageType, ?> cVar) {
            if (cVar.f1921a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(r<MessageType, List<Type>> rVar, Type type) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().a(cVarCheckIsLite.f1924d, cVarCheckIsLite.b(type));
            return this;
        }

        public final BuilderType clearExtension(r<MessageType, ?> rVar) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            copyOnWrite();
            x<b> xVarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            b bVar = cVarCheckIsLite.f1924d;
            q1 q1Var = xVarEnsureExtensionsAreMutable.f2166a;
            q1Var.remove(bVar);
            if (q1Var.isEmpty()) {
                xVarEnsureExtensionsAreMutable.f2168c = false;
            }
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            MessageType messagetype = this.instance;
            if (((ExtendableMessage) messagetype).extensions != x.f2165d) {
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(r<MessageType, Type> rVar) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(rVar);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(r<MessageType, List<Type>> rVar) {
            return ((ExtendableMessage) this.instance).getExtensionCount(rVar);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(r<MessageType, Type> rVar) {
            return ((ExtendableMessage) this.instance).hasExtension(rVar);
        }

        public void internalSetExtensionSet(x<b> xVar) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = xVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> BuilderType setExtension(r<MessageType, Type> rVar, Type type) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            copyOnWrite();
            x<b> xVarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            b bVar = cVarCheckIsLite.f1924d;
            if (!bVar.f1919c) {
                type = (Type) cVarCheckIsLite.b(type);
            } else if (bVar.f1918b.f1976a == b2.b.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) type).iterator();
                while (it.hasNext()) {
                    arrayList.add(cVarCheckIsLite.b(it.next()));
                }
                type = arrayList;
            }
            xVarEnsureExtensionsAreMutable.p(bVar, type);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(r<MessageType, List<Type>> rVar, int i10) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(rVar, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.m();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(r<MessageType, List<Type>> rVar, int i10, Type type) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            copyOnWrite();
            x<b> xVarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
            b bVar = cVarCheckIsLite.f1924d;
            Object objB = cVarCheckIsLite.b(type);
            xVarEnsureExtensionsAreMutable.getClass();
            if (bVar.f1919c) {
                Object objF = xVarEnsureExtensionsAreMutable.f(bVar);
                if (objF != null) {
                    x.q(bVar, objB);
                    ((List) objF).set(i10, objB);
                    return this;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        <Type> Type getExtension(r<MessageType, Type> rVar);

        <Type> Type getExtension(r<MessageType, List<Type>> rVar, int i10);

        <Type> int getExtensionCount(r<MessageType, List<Type>> rVar);

        <Type> boolean hasExtension(r<MessageType, Type> rVar);

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    public static class a<T extends GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.a<T> {
    }

    public static final class b implements x.a<b> {

        /* renamed from: a, reason: collision with root package name */
        public final int f1917a;

        /* renamed from: b, reason: collision with root package name */
        public final b2.a f1918b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1919c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1920d;

        public b(d0.d<?> dVar, int i10, b2.a aVar, boolean z10, boolean z11) {
            this.f1917a = i10;
            this.f1918b = aVar;
            this.f1919c = z10;
            this.f1920d = z11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f1917a - ((b) obj).f1917a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.x.a
        public final Builder e0(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((Builder) messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.x.a
        public final b2.b getLiteJavaType() {
            return this.f1918b.f1976a;
        }

        @Override // androidx.datastore.preferences.protobuf.x.a
        public final b2.a getLiteType() {
            return this.f1918b;
        }

        @Override // androidx.datastore.preferences.protobuf.x.a
        public final int getNumber() {
            return this.f1917a;
        }

        @Override // androidx.datastore.preferences.protobuf.x.a
        public final boolean isPacked() {
            return this.f1920d;
        }

        @Override // androidx.datastore.preferences.protobuf.x.a
        public final boolean isRepeated() {
            return this.f1919c;
        }
    }

    public static class c<ContainingType extends MessageLite, Type> extends r<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final ContainingType f1921a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f1922b;

        /* renamed from: c, reason: collision with root package name */
        public final MessageLite f1923c;

        /* renamed from: d, reason: collision with root package name */
        public final b f1924d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(MessageLite messageLite, Object obj, MessageLite messageLite2, b bVar) {
            if (messageLite == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (bVar.f1918b == b2.a.f1973e && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f1921a = messageLite;
            this.f1922b = obj;
            this.f1923c = messageLite2;
            this.f1924d = bVar;
        }

        public final Object a(Object obj) {
            if (this.f1924d.f1918b.f1976a != b2.b.ENUM) {
                return obj;
            }
            ((Integer) obj).intValue();
            throw null;
        }

        public final Object b(Object obj) {
            return this.f1924d.f1918b.f1976a == b2.b.ENUM ? Integer.valueOf(((d0.c) obj).getNumber()) : obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1925a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f1926b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f1927c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f1928d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f1929e;

        /* renamed from: f, reason: collision with root package name */
        public static final d f1930f;

        /* renamed from: g, reason: collision with root package name */
        public static final d f1931g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ d[] f1932h;

        static {
            d dVar = new d("GET_MEMOIZED_IS_INITIALIZED", 0);
            f1925a = dVar;
            d dVar2 = new d("SET_MEMOIZED_IS_INITIALIZED", 1);
            f1926b = dVar2;
            d dVar3 = new d("BUILD_MESSAGE_INFO", 2);
            f1927c = dVar3;
            d dVar4 = new d("NEW_MUTABLE_INSTANCE", 3);
            f1928d = dVar4;
            d dVar5 = new d("NEW_BUILDER", 4);
            f1929e = dVar5;
            d dVar6 = new d("GET_DEFAULT_INSTANCE", 5);
            f1930f = dVar6;
            d dVar7 = new d("GET_PARSER", 6);
            f1931g = dVar7;
            f1932h = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) java.lang.Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f1932h.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>, T> c<MessageType, T> checkIsLite(r<MessageType, T> rVar) {
        rVar.getClass();
        return (c) rVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t3) throws e0 {
        if (t3 == null || t3.isInitialized()) {
            return t3;
        }
        v1 v1VarNewUninitializedMessageException = t3.newUninitializedMessageException();
        v1VarNewUninitializedMessageException.getClass();
        throw new e0(v1VarNewUninitializedMessageException.getMessage());
    }

    private int computeSerializedSize(o1<?> o1Var) {
        if (o1Var != null) {
            return o1Var.a(this);
        }
        k1 k1Var = k1.f2075c;
        k1Var.getClass();
        return k1Var.a(getClass()).a(this);
    }

    public static d0.a emptyBooleanList() {
        return f.f2010d;
    }

    public static d0.b emptyDoubleList() {
        return q.f2130d;
    }

    public static d0.f emptyFloatList() {
        return a0.f1948d;
    }

    public static d0.g emptyIntList() {
        return c0.f1993d;
    }

    public static d0.i emptyLongList() {
        return n0.f2102d;
    }

    public static <E> d0.j<E> emptyProtobufList() {
        return l1.f2082d;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == x1.f2170f) {
            this.unknownFields = new x1();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
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
        T t10 = (T) ((GeneratedMessageLite) z1.b(cls)).getDefaultInstanceForType();
        if (t10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t10);
        return t10;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
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

    public static d0.g mutableCopy(d0.g gVar) {
        c0 c0Var = (c0) gVar;
        int i10 = c0Var.f1995c;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new c0(Arrays.copyOf(c0Var.f1994b, i11), c0Var.f1995c, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new m1(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> c<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, d0.d<?> dVar, int i10, b2.a aVar, boolean z10, Class cls) {
        return new c<>(containingtype, Collections.EMPTY_LIST, messageLite, new b(dVar, i10, aVar, true, z10));
    }

    public static <ContainingType extends MessageLite, Type> c<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, d0.d<?> dVar, int i10, b2.a aVar, Class cls) {
        return new c<>(containingtype, type, messageLite, new b(dVar, i10, aVar, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t3, InputStream inputStream) throws e0 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t3, inputStream, t.b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, ByteBuffer byteBuffer, t tVar) throws e0 {
        k kVarH;
        if (byteBuffer.hasArray()) {
            kVarH = k.h(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && z1.f2187d) {
            kVarH = new k.c(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            kVarH = k.h(bArr, 0, iRemaining, true);
        }
        return (T) checkMessageInitialized(parseFrom(t3, kVarH, tVar));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t3, InputStream inputStream, t tVar) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            k kVarI = k.i(new AbstractMessageLite.Builder.a(inputStream, k.x(i10, inputStream)));
            T t10 = (T) parsePartialFrom(t3, kVarI, tVar);
            kVarI.a(0);
            return t10;
        } catch (e0 e10) {
            if (e10.f2009a) {
                throw new e0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new e0(e11.getMessage(), e11);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t3, k kVar, t tVar) throws e0 {
        T t10 = (T) t3.newMutableInstance();
        try {
            k1 k1Var = k1.f2075c;
            k1Var.getClass();
            o1 o1VarA = k1Var.a(t10.getClass());
            l lVar = kVar.f2051d;
            if (lVar == null) {
                lVar = new l(kVar);
            }
            o1VarA.e(t10, lVar, tVar);
            o1VarA.makeImmutable(t10);
            return t10;
        } catch (e0 e10) {
            if (e10.f2009a) {
                throw new e0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (v1 e11) {
            throw new e0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof e0) {
                throw ((e0) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t3) {
        t3.markImmutable();
        defaultInstanceMap.put(cls, t3);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(d.f1927c);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        k1 k1Var = k1.f2075c;
        k1Var.getClass();
        return k1Var.a(getClass()).b(this);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(d.f1929e);
    }

    public Object dynamicMethod(d dVar, Object obj) {
        return dynamicMethod(dVar, obj, null);
    }

    public abstract Object dynamicMethod(d dVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k1 k1Var = k1.f2075c;
        k1Var.getClass();
        return k1Var.a(getClass()).d(this, (GeneratedMessageLite) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final h1<MessageType> getParserForType() {
        return (h1) dynamicMethod(d.f1931g);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public int getSerializedSize(o1 o1Var) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(o1Var);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new IllegalStateException(j2.y.a(iComputeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(o1Var);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite, androidx.datastore.preferences.protobuf.MessageLite, androidx.datastore.preferences.protobuf.w0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        k1 k1Var = k1.f2075c;
        k1Var.getClass();
        k1Var.a(getClass()).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, j jVar) {
        ensureUnknownFieldsInitialized();
        x1 x1Var = this.unknownFields;
        x1Var.a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        x1Var.f((i10 << 3) | 2, jVar);
    }

    public final void mergeUnknownFields(x1 x1Var) {
        this.unknownFields = x1.e(this.unknownFields, x1Var);
    }

    public void mergeVarintField(int i10, int i11) {
        ensureUnknownFieldsInitialized();
        x1 x1Var = this.unknownFields;
        x1Var.a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        x1Var.f(i10 << 3, Long.valueOf(i11));
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(d.f1928d);
    }

    public boolean parseUnknownField(int i10, k kVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.d(i10, kVar);
    }

    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public void setMemoizedSerializedSize(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(j2.y.a(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = x0.f2169a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        x0.c(this, sb, 0);
        return sb.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(m mVar) throws IOException {
        k1 k1Var = k1.f2075c;
        k1Var.getClass();
        o1 o1VarA = k1Var.a(getClass());
        n nVar = mVar.f2087a;
        if (nVar == null) {
            nVar = new n(mVar);
        }
        o1VarA.c(this, nVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t3, boolean z10) {
        byte bByteValue = ((Byte) t3.dynamicMethod(d.f1925a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        k1 k1Var = k1.f2075c;
        k1Var.getClass();
        boolean zIsInitialized = k1Var.a(t3.getClass()).isInitialized(t3);
        if (z10) {
            t3.dynamicMethod(d.f1926b, zIsInitialized ? t3 : null);
        }
        return zIsInitialized;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((Builder) messagetype);
    }

    public Object dynamicMethod(d dVar) {
        return dynamicMethod(dVar, null, null);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite, androidx.datastore.preferences.protobuf.MessageLite
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(d.f1930f);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(d.f1929e);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((Builder) dynamicMethod(d.f1929e)).mergeFrom((Builder) this);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t3, InputStream inputStream, t tVar) throws e0 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t3, inputStream, tVar));
    }

    public static d0.i mutableCopy(d0.i iVar) {
        n0 n0Var = (n0) iVar;
        int i10 = n0Var.f2104c;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new n0(Arrays.copyOf(n0Var.f2103b, i11), n0Var.f2104c, true);
        }
        throw new IllegalArgumentException();
    }

    public static d0.f mutableCopy(d0.f fVar) {
        a0 a0Var = (a0) fVar;
        int i10 = a0Var.f1950c;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new a0(Arrays.copyOf(a0Var.f1949b, i11), a0Var.f1950c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, ByteBuffer byteBuffer) throws e0 {
        return (T) parseFrom(t3, byteBuffer, t.b());
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected x<b> extensions = x.f2165d;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<b, Object>> f1916a;

            public a(ExtendableMessage extendableMessage) {
                Iterator itL = extendableMessage.extensions.l();
                this.f1916a = itL;
                if (itL.hasNext()) {
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(k kVar, c<?, ?> cVar, t tVar, int i10) throws IOException {
            parseExtension(kVar, tVar, cVar, (i10 << 3) | 2, i10);
        }

        private void mergeMessageSetExtensionFromBytes(j jVar, t tVar, c<?, ?> cVar) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.f(cVar.f1924d);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = cVar.f1923c.newBuilderForType();
            }
            builder.mergeFrom(jVar, tVar);
            ensureExtensionsAreMutable().p(cVar.f1924d, cVar.b(builder.build()));
        }

        private <MessageType extends MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, k kVar, t tVar) throws IOException {
            int iF = 0;
            j.f fVarM = null;
            c cVarA = null;
            while (true) {
                int iE = kVar.E();
                if (iE == 0) {
                    break;
                }
                if (iE == 16) {
                    iF = kVar.F();
                    if (iF != 0) {
                        cVarA = tVar.a(iF, messagetype);
                    }
                } else if (iE == 26) {
                    if (iF == 0 || cVarA == null) {
                        fVarM = kVar.m();
                    } else {
                        eagerlyMergeMessageSetExtension(kVar, cVarA, tVar, iF);
                        fVarM = null;
                    }
                } else if (!kVar.H(iE)) {
                    break;
                }
            }
            kVar.a(12);
            if (fVarM == null || iF == 0) {
                return;
            }
            if (cVarA != null) {
                mergeMessageSetExtensionFromBytes(fVarM, tVar, cVarA);
            } else {
                mergeLengthDelimitedField(iF, fVarM);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean parseExtension(k kVar, t tVar, c<?, ?> cVar, int i10, int i11) throws IOException {
            boolean z10;
            Object objBuild;
            MessageLite messageLite;
            int i12 = i10 & 7;
            boolean z11 = false;
            if (cVar == null) {
                z10 = false;
                z11 = true;
            } else {
                b bVar = cVar.f1924d;
                b2.a aVar = bVar.f1918b;
                x<?> xVar = x.f2165d;
                if (i12 == aVar.f1977b) {
                    z10 = false;
                } else if (bVar.f1919c && aVar.a() && i12 == 2) {
                    z10 = true;
                }
            }
            if (z11) {
                return parseUnknownField(i10, kVar);
            }
            ensureExtensionsAreMutable();
            MessageLite.Builder builderNewBuilderForType = null;
            b2.c.a aVar2 = b2.c.f1989a;
            if (z10) {
                int iK = kVar.k(kVar.w());
                b bVar2 = cVar.f1924d;
                if (bVar2.f1918b != b2.a.f1974f) {
                    while (kVar.e() > 0) {
                        b2.a aVar3 = bVar2.f1918b;
                        x<?> xVar2 = x.f2165d;
                        this.extensions.a(bVar2, b2.a(kVar, aVar3, aVar2));
                    }
                } else if (kVar.e() > 0) {
                    kVar.o();
                    throw null;
                }
                kVar.j(iK);
                return true;
            }
            b bVar3 = cVar.f1924d;
            int iOrdinal = bVar3.f1918b.f1976a.ordinal();
            if (iOrdinal == 7) {
                kVar.o();
                throw null;
            }
            if (iOrdinal != 8) {
                b2.a aVar4 = bVar3.f1918b;
                x<?> xVar3 = x.f2165d;
                objBuild = b2.a(kVar, aVar4, aVar2);
            } else {
                if (!bVar3.f1919c && (messageLite = (MessageLite) this.extensions.f(bVar3)) != null) {
                    builderNewBuilderForType = messageLite.toBuilder();
                }
                if (builderNewBuilderForType == null) {
                    builderNewBuilderForType = cVar.f1923c.newBuilderForType();
                }
                if (bVar3.f1918b == b2.a.f1972d) {
                    kVar.s(bVar3.f1917a, builderNewBuilderForType, tVar);
                } else {
                    kVar.v(builderNewBuilderForType, tVar);
                }
                objBuild = builderNewBuilderForType.build();
            }
            if (bVar3.f1919c) {
                this.extensions.a(bVar3, cVar.b(objBuild));
                return true;
            }
            this.extensions.p(bVar3, cVar.b(objBuild));
            return true;
        }

        private void verifyExtensionContainingType(c<MessageType, ?> cVar) {
            if (cVar.f1921a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public x<b> ensureExtensionsAreMutable() {
            x<b> xVar = this.extensions;
            if (xVar.f2167b) {
                this.extensions = xVar.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.j();
        }

        public int extensionsSerializedSize() {
            return this.extensions.i();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.g();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.AbstractMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(r<MessageType, Type> rVar) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            Type type = (Type) this.extensions.f(cVarCheckIsLite.f1924d);
            if (type == null) {
                return cVarCheckIsLite.f1922b;
            }
            b bVar = cVarCheckIsLite.f1924d;
            if (!bVar.f1919c) {
                return (Type) cVarCheckIsLite.a(type);
            }
            if (bVar.f1918b.f1976a != b2.b.ENUM) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r12.add(cVarCheckIsLite.a(it.next()));
            }
            return r12;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(r<MessageType, List<Type>> rVar) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            x<b> xVar = this.extensions;
            b bVar = cVarCheckIsLite.f1924d;
            xVar.getClass();
            if (!bVar.f1919c) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = xVar.f(bVar);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(r<MessageType, Type> rVar) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            x<b> xVar = this.extensions;
            b bVar = cVarCheckIsLite.f1924d;
            xVar.getClass();
            if (bVar.f1919c) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return xVar.f2166a.get(bVar) != null;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            x<b> xVar = this.extensions;
            if (xVar.f2167b) {
                this.extensions = xVar.clone();
            }
            this.extensions.n(messagetype.extensions);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this);
        }

        public <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, k kVar, t tVar, int i10) throws IOException {
            int i11 = i10 >>> 3;
            return parseExtension(kVar, tVar, tVar.a(i11, messagetype), i10, i11);
        }

        public <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, k kVar, t tVar, int i10) throws IOException {
            if (i10 != 11) {
                return (i10 & 7) == 2 ? parseUnknownField(messagetype, kVar, tVar, i10) : kVar.H(i10);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, kVar, tVar);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return toBuilder();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(r<MessageType, List<Type>> rVar, int i10) {
            c<MessageType, ?> cVarCheckIsLite = GeneratedMessageLite.checkIsLite(rVar);
            verifyExtensionContainingType(cVarCheckIsLite);
            x<b> xVar = this.extensions;
            b bVar = cVarCheckIsLite.f1924d;
            xVar.getClass();
            if (bVar.f1919c) {
                Object objF = xVar.f(bVar);
                if (objF != null) {
                    return (Type) cVarCheckIsLite.a(((List) objF).get(i10));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static d0.b mutableCopy(d0.b bVar) {
        q qVar = (q) bVar;
        int i10 = qVar.f2132c;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new q(Arrays.copyOf(qVar.f2131b, i11), qVar.f2132c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, j jVar) throws e0 {
        return (T) checkMessageInitialized(parseFrom(t3, jVar, t.b()));
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, j jVar, t tVar) throws e0 {
        return (T) checkMessageInitialized(parsePartialFrom(t3, jVar, tVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, byte[] bArr) throws e0 {
        return (T) checkMessageInitialized(parsePartialFrom(t3, bArr, 0, bArr.length, t.b()));
    }

    public static d0.a mutableCopy(d0.a aVar) {
        f fVar = (f) aVar;
        int i10 = fVar.f2012c;
        int i11 = i10 == 0 ? 10 : i10 * 2;
        if (i11 >= i10) {
            return new f(Arrays.copyOf(fVar.f2011b, i11), fVar.f2012c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, byte[] bArr, t tVar) throws e0 {
        return (T) checkMessageInitialized(parsePartialFrom(t3, bArr, 0, bArr.length, tVar));
    }

    public static <E> d0.j<E> mutableCopy(d0.j<E> jVar) {
        int size = jVar.size();
        return jVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, InputStream inputStream) throws e0 {
        return (T) checkMessageInitialized(parsePartialFrom(t3, k.i(inputStream), t.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t3, byte[] bArr, int i10, int i11, t tVar) throws e0 {
        if (i11 == 0) {
            return t3;
        }
        T t10 = (T) t3.newMutableInstance();
        try {
            k1 k1Var = k1.f2075c;
            k1Var.getClass();
            o1 o1VarA = k1Var.a(t10.getClass());
            o1VarA.f(t10, bArr, i10, i10 + i11, new d.a(tVar));
            o1VarA.makeImmutable(t10);
            return t10;
        } catch (e0 e10) {
            if (e10.f2009a) {
                throw new e0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (v1 e11) {
            throw new e0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw e0.g();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, InputStream inputStream, t tVar) throws e0 {
        return (T) checkMessageInitialized(parsePartialFrom(t3, k.i(inputStream), tVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, k kVar) throws e0 {
        return (T) parseFrom(t3, kVar, t.b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t3, k kVar, t tVar) throws e0 {
        return (T) checkMessageInitialized(parsePartialFrom(t3, kVar, tVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t3, k kVar) throws e0 {
        return (T) parsePartialFrom(t3, kVar, t.b());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t3, j jVar, t tVar) throws e0 {
        k kVarI = jVar.i();
        T t10 = (T) parsePartialFrom(t3, kVarI, tVar);
        kVarI.a(0);
        return t10;
    }
}
