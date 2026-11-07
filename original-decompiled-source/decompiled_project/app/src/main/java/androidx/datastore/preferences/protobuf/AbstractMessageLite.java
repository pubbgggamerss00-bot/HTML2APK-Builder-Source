package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.m;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t3 : iterable) {
                if (t3 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t3);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static v1 newUninitializedMessageException(MessageLite messageLite) {
            return new v1();
        }

        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo67clone();

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder, androidx.datastore.preferences.protobuf.w0
        public abstract /* synthetic */ boolean isInitialized();

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new a(inputStream, k.x(i10, inputStream)), tVar);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(k kVar, t tVar) throws IOException;

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws e0 {
            try {
                k.a aVarH = k.h(bArr, i10, i11, false);
                mergeFrom((k) aVarH);
                aVarH.a(0);
                return this;
            } catch (e0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e11);
            }
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = d0.f2005a;
            iterable.getClass();
            if (!(iterable instanceof j0)) {
                if (iterable instanceof i1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((j0) iterable).getUnderlyingElements();
            j0 j0Var = (j0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (j0Var.size() - size) + " is null.";
                    for (int size2 = j0Var.size() - 1; size2 >= size; size2--) {
                        j0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof j) {
                    j0Var.z();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    j.c(0, bArr.length, bArr);
                    j0Var.z();
                } else {
                    j0Var.add((String) obj);
                }
            }
        }

        public static final class a extends FilterInputStream {

            /* renamed from: a, reason: collision with root package name */
            public int f1768a;

            public a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f1768a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.f1768a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f1768a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f1768a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j10) throws IOException {
                int iSkip = (int) super.skip(Math.min(j10, this.f1768a));
                if (iSkip >= 0) {
                    this.f1768a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f1768a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f1768a -= i13;
                }
                return i13;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, t.b());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, t tVar) throws e0 {
            try {
                k.a aVarH = k.h(bArr, i10, i11, false);
                mergeFrom((k) aVarH, tVar);
                aVarH.a(0);
                return this;
            } catch (e0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(k kVar) throws IOException {
            return (BuilderType) mergeFrom(kVar, t.b());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(j jVar) throws e0 {
            try {
                k kVarI = jVar.i();
                mergeFrom(kVarI);
                kVarI.a(0);
                return this;
            } catch (e0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(j jVar, t tVar) throws e0 {
            try {
                k kVarI = jVar.i();
                mergeFrom(kVarI, tVar);
                kVarI.a(0);
                return this;
            } catch (e0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr) throws e0 {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, t tVar) throws e0 {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, tVar);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            k kVarI = k.i(inputStream);
            mergeFrom(kVarI);
            kVarI.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(InputStream inputStream, t tVar) throws IOException {
            k kVarI = k.i(inputStream);
            mergeFrom(kVarI, tVar);
            kVarI.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return (BuilderType) internalMergeFrom((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Builder.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(j jVar) throws IllegalArgumentException {
        if (!jVar.g()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(o1 o1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iA = o1Var.a(this);
        setMemoizedSerializedSize(iA);
        return iA;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite, androidx.datastore.preferences.protobuf.w0
    public abstract /* synthetic */ boolean isInitialized();

    public v1 newUninitializedMessageException() {
        return new v1();
    }

    public void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = m.f2085b;
            m.b bVar = new m.b(bArr, serializedSize);
            writeTo(bVar);
            if (bVar.G() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public j toByteString() {
        try {
            int serializedSize = getSerializedSize();
            j.f fVar = j.f2038b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = m.f2085b;
            m.b bVar = new m.b(bArr, serializedSize);
            writeTo(bVar);
            if (bVar.G() == 0) {
                return new j.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iH = m.h(serializedSize) + serializedSize;
        if (iH > 4096) {
            iH = 4096;
        }
        m.d dVar = new m.d(outputStream, iH);
        dVar.D(serializedSize);
        writeTo(dVar);
        if (dVar.f2090f > 0) {
            dVar.L();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = m.f2085b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        m.d dVar = new m.d(outputStream, serializedSize);
        writeTo(dVar);
        if (dVar.f2090f > 0) {
            dVar.L();
        }
    }
}
