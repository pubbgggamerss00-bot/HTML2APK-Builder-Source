package c7;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import t6.e;

/* loaded from: classes.dex */
public final class m0 {
    public static final LinkedHashSet a(byte[] bytes) throws IOException {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.r.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int i10 = objectInputStream.readInt();
                for (int i11 = 0; i11 < i10; i11++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z10 = objectInputStream.readBoolean();
                    kotlin.jvm.internal.r.d(uri, "uri");
                    linkedHashSet.add(new e.a(z10, uri));
                }
                pg.f0 f0Var = pg.f0.f21461a;
                objectInputStream.close();
                pg.f0 f0Var2 = pg.f0.f21461a;
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final t6.a b(int i10) {
        if (i10 == 0) {
            return t6.a.f27986a;
        }
        if (i10 == 1) {
            return t6.a.f27987b;
        }
        throw new IllegalArgumentException(ad.b.b(i10, "Could not convert ", " to BackoffPolicy"));
    }

    public static final t6.t c(int i10) {
        if (i10 == 0) {
            return t6.t.f28052a;
        }
        if (i10 == 1) {
            return t6.t.f28053b;
        }
        if (i10 == 2) {
            return t6.t.f28054c;
        }
        if (i10 == 3) {
            return t6.t.f28055d;
        }
        if (i10 == 4) {
            return t6.t.f28056e;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(ad.b.b(i10, "Could not convert ", " to NetworkType"));
        }
        return t6.t.f28057f;
    }

    public static final t6.b0 d(int i10) {
        if (i10 == 0) {
            return t6.b0.f27989a;
        }
        if (i10 == 1) {
            return t6.b0.f27990b;
        }
        throw new IllegalArgumentException(ad.b.b(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final t6.c0 e(int i10) {
        if (i10 == 0) {
            return t6.c0.f27994a;
        }
        if (i10 == 1) {
            return t6.c0.f27995b;
        }
        if (i10 == 2) {
            return t6.c0.f27996c;
        }
        if (i10 == 3) {
            return t6.c0.f27997d;
        }
        if (i10 == 4) {
            return t6.c0.f27998e;
        }
        if (i10 == 5) {
            return t6.c0.f27999f;
        }
        throw new IllegalArgumentException(ad.b.b(i10, "Could not convert ", " to State"));
    }

    public static final int f(t6.c0 state) {
        kotlin.jvm.internal.r.e(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new pg.l();
                    }
                }
            }
        }
        return i10;
    }

    public static final d7.o g(byte[] bytes) throws IOException {
        kotlin.jvm.internal.r.e(bytes, "bytes");
        if (bytes.length == 0) {
            return new d7.o(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                d7.o oVarA = d7.l.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return oVarA;
            } finally {
            }
        } finally {
        }
    }
}
