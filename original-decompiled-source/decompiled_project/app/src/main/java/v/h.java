package v;

import androidx.compose.foundation.gestures.i;
import v.o1;

/* loaded from: classes.dex */
public final class h implements z {

    /* renamed from: a, reason: collision with root package name */
    public s.y<Float> f29889a;

    /* renamed from: b, reason: collision with root package name */
    public final i.b f29890b;

    public h() {
        throw null;
    }

    public h(s.y yVar) {
        i.b bVar = androidx.compose.foundation.gestures.i.f903c;
        this.f29889a = yVar;
        this.f29890b = bVar;
    }

    @Override // v.z
    public final Object a(o1.a aVar, float f10, tg.e eVar) {
        return ph.h.e(this.f29890b, new g(f10, this, aVar, null), eVar);
    }
}
