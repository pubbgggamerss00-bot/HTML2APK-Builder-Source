package l7;

import g7.t;
import hi.x;
import java.nio.ByteBuffer;
import l7.k;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f16742a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16743b;

    public static final class a implements k.a<ByteBuffer> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            return new d((ByteBuffer) obj, mVar);
        }
    }

    public d(ByteBuffer byteBuffer, w7.m mVar) {
        this.f16742a = byteBuffer;
        this.f16743b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        ByteBuffer byteBuffer = this.f16742a;
        return new p(new j7.t(x.b(new e(byteBuffer)), this.f16743b.f31406f, new j7.d(byteBuffer)), null, j7.f.f15221b);
    }
}
