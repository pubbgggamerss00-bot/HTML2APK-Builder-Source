package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2005a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2006b;

    public interface a extends j<Boolean> {
    }

    public interface b extends j<Double> {
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
        T findValueByNumber(int i10);
    }

    public interface e {
        boolean isInRange(int i10);
    }

    public interface f extends j<Float> {
    }

    public interface g extends j<Integer> {
    }

    public static class h<T> extends AbstractList<T> {

        /* renamed from: a, reason: collision with root package name */
        public final g f2007a;

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f2008b;

        public interface a<T> {
        }

        public h(g gVar, a<T> aVar) {
            this.f2007a = gVar;
            this.f2008b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i10) {
            int i11 = ((c0) this.f2007a).getInt(i10);
            ((DescriptorProtos$FieldOptions.a) this.f2008b).getClass();
            T t3 = (T) DescriptorProtos$FieldOptions.e.a(i11);
            return t3 == null ? (T) DescriptorProtos$FieldOptions.e.TARGET_TYPE_UNKNOWN : t3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return ((c0) this.f2007a).f1995c;
        }
    }

    public interface i extends j<Long> {
    }

    public interface j<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        j<E> mutableCopyWithCapacity(int i10);
    }

    static {
        Charset.forName("US-ASCII");
        f2005a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2006b = bArr;
        ByteBuffer.wrap(bArr);
        k.h(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
