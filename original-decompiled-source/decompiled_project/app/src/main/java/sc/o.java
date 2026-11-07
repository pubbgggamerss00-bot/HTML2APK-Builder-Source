package sc;

import ed.f0;
import ed.i0;
import ed.o0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class o<P> {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<c, List<b<P>>> f24815a;

    /* renamed from: b, reason: collision with root package name */
    public final b<P> f24816b;

    /* renamed from: c, reason: collision with root package name */
    public final cd.a f24817c;

    public static class a<P> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<P> f24818a;

        /* renamed from: c, reason: collision with root package name */
        public b<P> f24820c;

        /* renamed from: b, reason: collision with root package name */
        public ConcurrentHashMap f24819b = new ConcurrentHashMap();

        /* renamed from: d, reason: collision with root package name */
        public cd.a f24821d = cd.a.f5394b;

        public a(Class cls) {
            this.f24818a = cls;
        }

        public final void a(Object obj, Object obj2, i0.b bVar, boolean z10) throws GeneralSecurityException {
            byte[] bArrArray;
            if (this.f24819b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (bVar.D() != f0.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            ConcurrentHashMap concurrentHashMap = this.f24819b;
            Integer numValueOf = Integer.valueOf(bVar.B());
            if (bVar.C() == o0.RAW) {
                numValueOf = null;
            }
            ci.a aVarA = zc.j.f35015b.a(zc.s.a(bVar.A().B(), bVar.A().C(), bVar.A().A(), bVar.C(), numValueOf));
            int iOrdinal = bVar.C().ordinal();
            if (iOrdinal == 1) {
                bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.B()).array();
            } else if (iOrdinal == 2) {
                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.B()).array();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.B()).array();
            } else {
                bArrArray = sc.b.f24795a;
            }
            b<P> bVar2 = new b<>(obj, obj2, bArrArray, bVar.D(), bVar.C(), bVar.B(), bVar.A().B(), aVarA);
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar2);
            byte[] bArr = bVar2.f24824c;
            c cVar = new c(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
            List list = (List) concurrentHashMap.put(cVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(bVar2);
                concurrentHashMap.put(cVar, Collections.unmodifiableList(arrayList2));
            }
            if (z10) {
                if (this.f24820c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f24820c = bVar2;
            }
        }
    }

    public static final class b<P> {

        /* renamed from: a, reason: collision with root package name */
        public final P f24822a;

        /* renamed from: b, reason: collision with root package name */
        public final P f24823b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f24824c;

        /* renamed from: d, reason: collision with root package name */
        public final f0 f24825d;

        /* renamed from: e, reason: collision with root package name */
        public final o0 f24826e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24827f;

        /* renamed from: g, reason: collision with root package name */
        public final String f24828g;

        /* renamed from: h, reason: collision with root package name */
        public final ci.a f24829h;

        public b(P p10, P p11, byte[] bArr, f0 f0Var, o0 o0Var, int i10, String str, ci.a aVar) {
            this.f24822a = p10;
            this.f24823b = p11;
            this.f24824c = Arrays.copyOf(bArr, bArr.length);
            this.f24825d = f0Var;
            this.f24826e = o0Var;
            this.f24827f = i10;
            this.f24828g = str;
            this.f24829h = aVar;
        }
    }

    public static class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f24830a;

        public c(byte[] bArr) {
            this.f24830a = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            byte[] bArr = this.f24830a;
            int length = bArr.length;
            byte[] bArr2 = cVar2.f24830a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = cVar2.f24830a[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.f24830a, ((c) obj).f24830a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f24830a);
        }

        public final String toString() {
            return gd.m.b(this.f24830a);
        }
    }

    public o(ConcurrentMap concurrentMap, b bVar, cd.a aVar, Class cls) {
        this.f24815a = concurrentMap;
        this.f24816b = bVar;
        this.f24817c = aVar;
    }

    public final List<b<P>> a(byte[] bArr) {
        List<b<P>> list = this.f24815a.get(new c(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
