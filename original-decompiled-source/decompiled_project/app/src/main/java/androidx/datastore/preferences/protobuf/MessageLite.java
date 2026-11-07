package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface MessageLite extends w0 {

    public interface Builder extends w0, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        /* renamed from: clone */
        Builder mo67clone();

        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, t tVar) throws IOException;

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(j jVar) throws e0;

        Builder mergeFrom(j jVar, t tVar) throws e0;

        Builder mergeFrom(k kVar) throws IOException;

        Builder mergeFrom(k kVar, t tVar) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, t tVar) throws IOException;

        Builder mergeFrom(byte[] bArr) throws e0;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws e0;

        Builder mergeFrom(byte[] bArr, int i10, int i11, t tVar) throws e0;

        Builder mergeFrom(byte[] bArr, t tVar) throws e0;
    }

    /* synthetic */ MessageLite getDefaultInstanceForType();

    h1<? extends MessageLite> getParserForType();

    int getSerializedSize();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    j toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(m mVar) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
