package s;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0<T> implements a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f23899a;

    public static final class a<T> extends j2.b {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a((Float) aVar.f14647a, (Float) this.f14647a) && kotlin.jvm.internal.r.a((b0) aVar.f14648b, (b0) this.f14648b);
        }

        public final int hashCode() {
            Float f10 = (Float) this.f14647a;
            return ((b0) this.f14648b).hashCode() + androidx.datastore.preferences.protobuf.a1.a(0, (f10 != null ? f10.hashCode() : 0) * 31, 31);
        }
    }

    public static final class b<T> extends r0<T, a<T>> {
        public final a a(int i10, Float f10) {
            c0 c0Var = d0.f23706d;
            a aVar = new a();
            aVar.f14647a = f10;
            aVar.f14648b = c0Var;
            this.f23907b.h(i10, aVar);
            return aVar;
        }
    }

    public q0(b<T> bVar) {
        this.f23899a = bVar;
    }

    @Override // s.a0, s.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends s> z2<V> a(n2<T, V> n2Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i10;
        b<T> bVar = this.f23899a;
        p.i iVar = bVar.f23907b;
        p.x xVar = new p.x(iVar.f20647e + 2);
        p.y yVar = new p.y(iVar.f20647e);
        int[] iArr3 = iVar.f20644b;
        Object[] objArr3 = iVar.f20645c;
        long[] jArr = iVar.f20643a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            i10 = i12;
                            a aVar = (a) objArr3[i15];
                            xVar.a(i16);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            yVar.h(i16, new y2((s) n2Var.a().invoke((Float) aVar.f14647a), (b0) aVar.f14648b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        iArr3 = iArr2;
                        i12 = i10;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!iVar.a(0)) {
            int i17 = xVar.f20751b;
            if (i17 < 0) {
                q.d.b("Index must be between 0 and size");
                throw null;
            }
            xVar.b(i17 + 1);
            int[] iArr4 = xVar.f20750a;
            int i18 = xVar.f20751b;
            if (i18 != 0) {
                qg.m.d(1, iArr4, 0, i18, iArr4);
            }
            iArr4[0] = 0;
            xVar.f20751b++;
        }
        if (!iVar.a(bVar.f23906a)) {
            xVar.a(bVar.f23906a);
        }
        int i19 = xVar.f20751b;
        if (i19 != 0) {
            int[] iArr5 = xVar.f20750a;
            kotlin.jvm.internal.r.e(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i19);
        }
        return new z2<>(xVar, yVar, bVar.f23906a, d0.f23706d);
    }
}
