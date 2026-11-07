package androidx.savedstate.serialization.serializers;

import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import bi.f;
import ci.c;
import ci.e;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.n0;
import pg.d;
import pg.j;
import zh.b;
import zh.q;

@d
/* loaded from: classes.dex */
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements GeneratedSerializer<SparseArraySerializer.SparseArraySurrogate<T>> {
    private final f descriptor;
    private final /* synthetic */ b<?> typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        n0 n0Var = new n0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        n0Var.j("keys", false);
        n0Var.j("values", false);
        this.descriptor = n0Var;
    }

    private final /* synthetic */ b getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] childSerializers() {
        return new b[]{SparseArraySerializer.SparseArraySurrogate.f3105c[0].getValue(), new ArrayListSerializer(this.typeSerial0)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(ci.d decoder) {
        r.e(decoder, "decoder");
        f fVar = this.descriptor;
        ci.b bVarC = decoder.c(fVar);
        j<b<Object>>[] jVarArr = SparseArraySerializer.SparseArraySurrogate.f3105c;
        List list = null;
        boolean z10 = true;
        int i10 = 0;
        List list2 = null;
        while (z10) {
            int iG = bVarC.g(fVar);
            if (iG == -1) {
                z10 = false;
            } else if (iG == 0) {
                list = (List) bVarC.u(fVar, 0, jVarArr[0].getValue(), list);
                i10 |= 1;
            } else {
                if (iG != 1) {
                    throw new q(iG);
                }
                list2 = (List) bVarC.u(fVar, 1, new ArrayListSerializer(this.typeSerial0), list2);
                i10 |= 2;
            }
        }
        bVarC.b(fVar);
        return new SparseArraySerializer.SparseArraySurrogate<>(i10, list, list2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
    public final f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
    public final void serialize(e encoder, SparseArraySerializer.SparseArraySurrogate<T> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        f fVar = this.descriptor;
        c cVarC = encoder.c(fVar);
        b<?> bVar = this.typeSerial0;
        cVarC.y(fVar, 0, SparseArraySerializer.SparseArraySurrogate.f3105c[0].getValue(), value.f3107a);
        cVarC.y(fVar, 1, new ArrayListSerializer(bVar), value.f3108b);
        cVarC.b(fVar);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(b<T> typeSerial0) {
        this();
        r.e(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
