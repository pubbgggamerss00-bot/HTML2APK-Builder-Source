package d0;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.s implements eh.l<Map<String, ? extends List<? extends Object>>, r1> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.i f7277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.d f7278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(g1.i iVar, g1.e eVar) {
        super(1);
        this.f7277a = iVar;
        this.f7278b = eVar;
    }

    @Override // eh.l
    public final r1 invoke(Map<String, ? extends List<? extends Object>> map) {
        return new r1(this.f7277a, map, this.f7278b);
    }
}
