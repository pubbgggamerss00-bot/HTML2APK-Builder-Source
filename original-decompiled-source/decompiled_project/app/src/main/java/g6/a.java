package g6;

import bg.b;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11476a;

    @Override // eh.a
    public final Object invoke() {
        switch (this.f11476a) {
            case 0:
                return new ArrayListSerializer(IntSerializer.INSTANCE);
            case 1:
                return f0.f21461a;
            default:
                return b.h(Boolean.FALSE);
        }
    }
}
