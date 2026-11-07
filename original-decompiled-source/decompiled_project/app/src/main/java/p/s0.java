package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public abstract class s0<E> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20712a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20713b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f20714c;

    /* renamed from: d, reason: collision with root package name */
    public int f20715d;

    /* renamed from: e, reason: collision with root package name */
    public int f20716e;

    /* renamed from: f, reason: collision with root package name */
    public int f20717f;

    /* renamed from: g, reason: collision with root package name */
    public int f20718g;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<E, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s0<E> f20719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0<E> s0Var) {
            super(1);
            this.f20719a = s0Var;
        }

        @Override // eh.l
        public final CharSequence invoke(Object obj) {
            return obj == this.f20719a ? "(this)" : String.valueOf(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & CertificateBody.profileType;
        int i12 = this.f20717f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f20712a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.r.a(this.f20713b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (s0Var.f20718g != this.f20718g) {
            return false;
        }
        Object[] objArr = this.f20713b;
        long[] jArr = this.f20712a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !s0Var.a(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.f20717f * 31) + this.f20718g;
        Object[] objArr = this.f20713b;
        long[] jArr = this.f20712a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!kotlin.jvm.internal.r.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iHashCode;
    }

    public final String toString() {
        a aVar = new a(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f20713b;
        long[] jArr = this.f20714c;
        int i10 = this.f20716e;
        int i11 = 0;
        while (true) {
            if (i10 == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) aVar.invoke(obj));
            i11++;
            i10 = i12;
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
