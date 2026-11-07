package androidx.savedstate.serialization.serializers;

import ah.p;
import android.util.SparseArray;
import bi.f;
import ci.d;
import ci.e;
import e9.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.n0;
import pg.j;
import pg.k;
import zh.b;
import zh.g;

/* loaded from: classes.dex */
public final class SparseArraySerializer<T> implements b<SparseArray<T>> {
    private final f descriptor;
    private final b<SparseArraySurrogate<T>> surrogateSerializer;

    @g
    public static final class SparseArraySurrogate<T> {
        public static final a Companion = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final j<b<Object>>[] f3105c = {w0.a(k.f21466a, new g6.a(0)), null};

        /* renamed from: d, reason: collision with root package name */
        public static final n0 f3106d;

        /* renamed from: a, reason: collision with root package name */
        public final List<Integer> f3107a;

        /* renamed from: b, reason: collision with root package name */
        public final List<T> f3108b;

        public static final class a {
            public final <T> b<SparseArraySurrogate<T>> serializer(b<T> typeSerial0) {
                r.e(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }
        }

        static {
            n0 n0Var = new n0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            n0Var.j("keys", false);
            n0Var.j("values", false);
            f3106d = n0Var;
        }

        public /* synthetic */ SparseArraySurrogate(int i10, List list, List list2) {
            if (3 != (i10 & 3)) {
                p.e(i10, 3, f3106d);
                throw null;
            }
            this.f3107a = list;
            this.f3108b = list2;
        }

        public SparseArraySurrogate(ArrayList arrayList, ArrayList arrayList2) {
            this.f3107a = arrayList;
            this.f3108b = arrayList2;
        }
    }

    public SparseArraySerializer(b<T> elementSerializer) {
        r.e(elementSerializer, "elementSerializer");
        b<SparseArraySurrogate<T>> bVarSerializer = SparseArraySurrogate.Companion.serializer(elementSerializer);
        this.surrogateSerializer = bVarSerializer;
        this.descriptor = bVarSerializer.getDescriptor();
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public SparseArray<T> deserialize(d decoder) {
        r.e(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.q(this.surrogateSerializer);
        List<Integer> list = sparseArraySurrogate.f3107a;
        int size = list.size();
        List<T> list2 = sparseArraySurrogate.f3108b;
        if (size != list2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<T> sparseArray = new SparseArray<>(list.size());
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            sparseArray.append(list.get(i10).intValue(), list2.get(i10));
        }
        return sparseArray;
    }

    @Override // zh.i
    public void serialize(e encoder, SparseArray<T> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(value.keyAt(i10)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(value.valueAt(i11));
        }
        encoder.J(this.surrogateSerializer, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
