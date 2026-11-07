package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0072a;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.p0;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0072a<MessageType, BuilderType>> implements p0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0072a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0072a<MessageType, BuilderType>> implements p0.a {
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c(g1 g1Var) {
        int iB = b();
        if (iB != -1) {
            return iB;
        }
        int iE = g1Var.e(this);
        e(iE);
        return iE;
    }

    public final String d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void e(int i10) {
        throw new UnsupportedOperationException();
    }

    public final h.f f() {
        try {
            int iC = ((w) this).c(null);
            h.f fVar = h.f6665b;
            byte[] bArr = new byte[iC];
            Logger logger = k.f6720b;
            k.a aVar = new k.a(bArr, iC);
            ((w) this).a(aVar);
            if (aVar.m0() == 0) {
                return new h.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(d("ByteString"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final byte[] toByteArray() {
        try {
            int iC = ((w) this).c(null);
            byte[] bArr = new byte[iC];
            Logger logger = k.f6720b;
            k.a aVar = new k.a(bArr, iC);
            ((w) this).a(aVar);
            if (aVar.m0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(d("byte array"), e10);
        }
    }
}
