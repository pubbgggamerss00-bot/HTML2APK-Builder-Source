package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface g1<T> {
    boolean a(w wVar, w wVar2);

    int b(w wVar);

    void c(T t3, byte[] bArr, int i10, int i11, e.a aVar) throws IOException;

    void d(T t3, v1 v1Var) throws IOException;

    int e(a aVar);

    void f(Object obj, j jVar, o oVar) throws IOException;

    boolean isInitialized(T t3);

    void makeImmutable(T t3);

    void mergeFrom(T t3, T t10);

    T newInstance();
}
