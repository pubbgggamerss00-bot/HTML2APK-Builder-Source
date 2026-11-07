package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u extends n0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16414l;

    public u(String str, InlineClassDescriptorKt$InlinePrimitiveDescriptor$1 inlineClassDescriptorKt$InlinePrimitiveDescriptor$1) {
        super(str, inlineClassDescriptorKt$InlinePrimitiveDescriptor$1, 1);
        this.f16414l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, pg.j] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, pg.j] */
    @Override // kotlinx.serialization.internal.n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            bi.f fVar = (bi.f) obj;
            if (kotlin.jvm.internal.r.a(this.f16388a, fVar.a())) {
                u uVar = (u) obj;
                if (uVar.f16414l && Arrays.equals((bi.f[]) this.f16397j.getValue(), (bi.f[]) uVar.f16397j.getValue())) {
                    int iE = fVar.e();
                    int i10 = this.f16390c;
                    if (i10 == iE) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (kotlin.jvm.internal.r.a(h(i11).a(), fVar.h(i11).a()) && kotlin.jvm.internal.r.a(h(i11).getKind(), fVar.h(i11).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.n0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // bi.f
    public final boolean isInline() {
        return this.f16414l;
    }
}
